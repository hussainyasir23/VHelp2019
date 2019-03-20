package com.example.v_help2019;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class transport extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);
    }

    public void jntu(View view) {
        Intent jntuIntent = new Intent(transport.this,jntu.class);
        startActivity(jntuIntent);
    }

    public void nizampet(View view) {
        Intent nizamIntent = new Intent(transport.this,nizampet.class);
        startActivity(nizamIntent);
    }

    public void miyapur(View view) {
        Intent miyapurIntent = new Intent(transport.this,miyapur.class);
        startActivity(miyapurIntent);
    }

    public void bhelandp(View view) {
    }

    public void balanagar(View view) {
    }

    public void medchal(View view) {
    }

    public void secundrabad(View view) {
    }

    public void lothukunta(View view) {
    }

    public void sangareddy(View view) {
    }

    public void mdkandgjl(View view) {
    }
}
