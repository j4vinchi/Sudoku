package com.roostera.dev.sudoku;

/**
 * Created by Javier on 7/29/2015.
 */

import android.os.Bundle;
import android.preference.PreferenceActivity;
public class Prefs extends PreferenceActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}
