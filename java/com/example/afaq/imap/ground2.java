package com.example.mjawad.imap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ground2 extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ground2);


        spinner = (Spinner) findViewById(R.id.drop);
        String[] items = new String[]{ "Ground Floor","Basement", "First Floor" , "Second Floor"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
        spinner.setAdapter(adapter);
//        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
    }


    public void btns(View view) {
        String id= spinner.getSelectedItem().toString();

        if(id.equals("Basement"))
        {
            Intent ii = new Intent(this , groundfloor.class);
            startActivity(ii);

        }
        if(id.equals("First Floor"))
        {
            Intent ii = new Intent(this , firstfloor.class);
            startActivity(ii);

        }
        if(id.equals("Second Floor"))
        {

            Intent ii = new Intent(this , secondfloor.class);
            startActivity(ii);

        }
    }
}
