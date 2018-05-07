package com.restuibu.emir.mtttahsin.util;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

import com.restuibu.emir.mtttahsin.activity.MainActivity;

public class Helper {
    public static void hideActionBar(AppCompatActivity activity) {
        ActionBar actionBar = activity.getSupportActionBar();
        actionBar.hide();
    }
}
