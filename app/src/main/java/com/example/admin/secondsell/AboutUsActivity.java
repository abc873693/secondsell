package com.example.admin.secondsell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AboutUsActivity extends ParentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        CreateNavigation();
    }
}
