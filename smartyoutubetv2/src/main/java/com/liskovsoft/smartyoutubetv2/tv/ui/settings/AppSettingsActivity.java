package com.liskovsoft.smartyoutubetv2.tv.ui.settings;

import android.app.Activity;
import android.os.Bundle;
import com.liskovsoft.smartyoutubetv2.tv.R;

public class AppSettingsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_video_settings);
    }
}