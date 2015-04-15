package com.example.juanc.py_clase_menus_15_04_15;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Opcion1Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.inicio) {


        }
        switch (id){
            case R.id.action_settings: return true;
            case R.id.inicio:Intent ma=new Intent(this, MainActivity.class) ;  startActivity(ma) ;return true;
            case R.id.opcion1:Intent opc1=new Intent(this, Opcion1Activity.class) ;  startActivity(opc1) ;return true;
            case R.id.opcion2:Intent opc2=new Intent(this, Opcion2Activity.class) ;  startActivity(opc2) ;return true;
            default: return super.onOptionsItemSelected(item);
        }

    }
}
