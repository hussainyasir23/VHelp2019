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
        Intent departmentsIntent = new Intent(HomeActivity.this,departments.class);
        startActivity(departmentsIntent);
    }

    public void library(View view) {
        Intent libraryIntent = new Intent(HomeActivity.this,library.class);
        startActivity(libraryIntent);
    }

    public void transport(View view) {
        Intent transportIntent = new Intent(HomeActivity.this,transport.class);
        startActivity(transportIntent);
    }

    public void contactus(View view) {
        Intent conIntent = new Intent(HomeActivity.this,contactus.class);
        startActivity(conIntent);
    }

    public void aboutus(View view) {
        Intent aboutIntent = new Intent(HomeActivity.this,aboutus.class);
        startActivity(aboutIntent);
    }
}
