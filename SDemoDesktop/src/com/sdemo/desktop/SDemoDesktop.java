package com.sdemo.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.sdemo.SDemoGame;

public class SDemoDesktop {
	
	public static void main(String[] args) {
		new LwjglApplication(new SDemoGame(), "SDemoGame", 320, 400, false);
	}

}
