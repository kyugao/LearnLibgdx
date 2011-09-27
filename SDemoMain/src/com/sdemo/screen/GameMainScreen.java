package com.sdemo.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.loaders.wavefront.ObjLoader;
import com.badlogic.gdx.graphics.g3d.model.still.StillModel;

public class GameMainScreen implements Screen {

	/** the background texture **/
	private Texture backgroundTexture;
	/** perspective camera **/
	private PerspectiveCamera camera;

	private StillModel model;

	public GameMainScreen() {
		super();
		camera = new PerspectiveCamera(67, Gdx.graphics.getWidth(),
				Gdx.graphics.getHeight());

		FileHandle file = Gdx.files.internal("objs/obj.obj");
		ObjLoader loader = new ObjLoader();
		model = loader.loadObj(file, true);
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		GL10 gl = Gdx.gl10;
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
		gl.glViewport(0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

		gl.glDisable(GL10.GL_DITHER);
		gl.glEnable(GL10.GL_DEPTH_TEST);
		gl.glEnable(GL10.GL_CULL_FACE);

		setLighting(gl);

		camera.position.set(0, 0, 0); // camera, sometimes you can treat is as
										// your eyes, here set the eyes
										// position.
		camera.direction.set(0, 0, -1); // the sight direction
		camera.update();
		camera.apply(gl);

		gl.glPushMatrix();
		gl.glTranslatef(0, -10, -10);// location of the model which be rendered
										// next
		model.render();
		gl.glPopMatrix();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		backgroundTexture.dispose();
		model.dispose();
	}

	float[] direction = { 1, 0.5f, 0, 0 };

	private void setLighting(GL10 gl) {
		gl.glEnable(GL10.GL_LIGHTING);
		gl.glEnable(GL10.GL_LIGHT0);
		gl.glLightfv(GL10.GL_LIGHT0, GL10.GL_POSITION, direction, 0);
		gl.glEnable(GL10.GL_COLOR_MATERIAL);
	}

}
