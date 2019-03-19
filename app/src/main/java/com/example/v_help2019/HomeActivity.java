package com.example.v_help2019;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void principal(View view) {
        Intent principalIntent = new Intent(HomeActivity.this,principal.class);
        startActivity(principalIntent);
    }

    public void departments(View view) {
        Intent departmentsintent = new Intent(HomeActivity.this,departments.class);
        startActivity(departmentsintent);
    }

    public void library(View view) {
        Intent libraryintent = new Intent(HomeActivity.this,library.class);
        startActivity(libraryintent);
    }
}
