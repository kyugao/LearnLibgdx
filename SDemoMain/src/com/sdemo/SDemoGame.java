package com.sdemo;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.VertexAttribute;
import com.badlogic.gdx.graphics.VertexAttributes.Usage;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class SDemoGame implements ApplicationListener {
	private Mesh trangleMesh;

	public void create() {
		if (trangleMesh == null) {
            trangleMesh = new Mesh(true, 3, 3, 
                    new VertexAttribute(Usage.Position, 3, "a_position"));
                    
            trangleMesh.setVertices(new float[] { -0.5f, -0.5f, 0,
                                            0.5f, -0.5f, 0,
                                            0, 0.5f, 0 });
                                        
            trangleMesh.setIndices(new short[] { 0, 1, 2 });
        }
	}

	public void render() {
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT); // This cryptic line clears
													// the screen.
		trangleMesh.render(GL10.GL_TRIANGLES, 0, 3);
	}

	public void resize(int width, int height) {
	}

	public void pause() {
	}

	public void resume() {
	}

	public void dispose() {
	}
}