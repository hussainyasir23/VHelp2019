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
        Intent bintent=new Intent(transport.this,bhelandp.class);
        startActivity(bintent);
    }

    public void balanagar(View view) {
        Intent baintent=new Intent(transport.this,balanagar.class);
        startActivity(baintent);
    }

    public void medchal(View view) {
        Intent mintent=new Intent(transport.this,medchal.class);
        startActivity(mintent);
    }

    public void secundrabad(View view) {
        Intent sintent=new Intent(transport.this,secundrabad.class);
        startActivity(sintent);
    }

    public void lothukunta(View view) {
    }

    public void sangareddy(View view) {
    }

    public void mdkandgjl(View view) {
        Intent mgintent=new Intent(transport.this,mdkandgjl.class);
        startActivity(mgintent);
    }
}
