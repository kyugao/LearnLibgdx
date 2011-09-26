package com.sdemo;

import com.badlogic.gdx.Game;
import com.sdemo.screen.GameMainScreen;

public class SDemoGame extends Game {

	@Override
	public void create() {
		// TODO Auto-generated method stub
		this.setScreen(new GameMainScreen());
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		super.render();
	}
}