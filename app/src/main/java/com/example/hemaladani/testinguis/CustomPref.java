package com.example.hemaladani.testinguis;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;

public class CustomPref extends Preference {

    public CustomPref(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        setLayoutResource(R.layout.list_view_drawable_layout);
    }

    public CustomPref(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setLayoutResource(R.layout.list_view_drawable_layout);
    }

    public CustomPref(Context context, AttributeSet attrs) {
        super(context, attrs);
        setLayoutResource(R.layout.list_view_drawable_layout);
    }

    public CustomPref(Context context) {
        super(context);
        setLayoutResource(R.layout.list_view_drawable_layout);
    }
}
