package com.example.v_help2019;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class departments extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);
    }

    public void bsh(View view) {
        Intent bshintent=new Intent(departments.this,bsh.class);
        startActivity(bshintent);
    }

    public void cse(View view) {
        Intent cseintent=new Intent(departments.this,cse.class);
        startActivity(cseintent);
    }

    public void ece(View view) {
        Intent eceintent=new Intent(departments.this,ece.class);
        startActivity(eceintent);
    }

    public void eee(View view) {
        Intent eeeintent=new Intent(departments.this,eee.class);
        startActivity(eeeintent);
    }

    public void mech(View view) {
        Intent mechintent=new Intent(departments.this,mech.class);
        startActivity(mechintent);
    }

    public void civil(View view) {
        Intent civilintent=new Intent(departments.this,civil.class);
        startActivity(civilintent);
    }

    public void it(View view) {
        Intent itintent=new Intent(departments.this,it.class);
        startActivity(itintent);
    }

    public void bme(View view) {
        Intent bmeintent=new Intent(departments.this,bme.class);
        startActivity(bmeintent);
    }

    public void phe(View view) {
        Intent pheintent=new Intent(departments.this,phe.class);
        startActivity(pheintent);
    }

    public void mba(View view) {
        Intent mbaintent=new Intent(departments.this,mba.class);
        startActivity(mbaintent);
    }
}
