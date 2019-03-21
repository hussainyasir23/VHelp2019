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
        Intent principalIntent = new Intent(HomeActivity.this, principal.class);
        startActivity(principalIntent);
    }

    public void departments(View view) {
        Intent departmentsIntent = new Intent(HomeActivity.this, departments.class);
        startActivity(departmentsIntent);
    }

    public void library(View view) {
        Intent libraryIntent = new Intent(HomeActivity.this, library.class);
        startActivity(libraryIntent);
    }

    public void transport(View view) {
        Intent transportIntent = new Intent(HomeActivity.this, transport.class);
        startActivity(transportIntent);
    }

    public void contactus(View view) {
        Intent conIntent = new Intent(HomeActivity.this, contactus.class);
        startActivity(conIntent);
    }

    public void aboutus(View view) {
        Intent aboutIntent = new Intent(HomeActivity.this, aboutus.class);
        startActivity(aboutIntent);
    }

    public void sports1(View view) {
        Intent sportIntent = new Intent(HomeActivity.this, sports1.class);
        startActivity(sportIntent);
    }

    public void wellc(View view) {
        Intent wellIntent = new Intent(HomeActivity.this, wellness.class);
        startActivity(wellIntent);
    }

    public void hostel(View view) {
        Intent hostelIntent = new Intent(HomeActivity.this, hostel.class);
        startActivity(hostelIntent);
    }

    public void placement(View view) {
        Intent placeIntent = new Intent(HomeActivity.this, placement.class);
        startActivity(placeIntent);
    }

    public void adminacc(View view) {
        Intent aaaIntent = new Intent(HomeActivity.this, adminacc.class);
        startActivity(aaaIntent);
    }

    public void netit(View view) {
        Intent netIntent = new Intent(HomeActivity.this, networkit.class);
        startActivity(netIntent);
    }

    public void club(View view) {
        Intent clubIntent = new Intent(HomeActivity.this, club.class);
        startActivity(clubIntent);
    }

    public void randd(View view) {
        Intent rdIntent = new Intent(HomeActivity.this, randd.class);
        startActivity(rdIntent);
    }

    public void exam(View view) {
        Intent exaIntent = new Intent(HomeActivity.this, exam.class);
        startActivity(exaIntent);
    }
}
