package com.sdemo.activity;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.sdemo.SDemoGame;

import android.os.Bundle;

public class SDemoAndroidActivity extends AndroidApplication {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize(new SDemoGame(), false);
    }
}