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
}
