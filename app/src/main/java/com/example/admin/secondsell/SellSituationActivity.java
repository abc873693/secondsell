package com.example.admin.secondsell;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SellSituationActivity extends ParentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_situation);
        CreateNavigation();
    }
}
