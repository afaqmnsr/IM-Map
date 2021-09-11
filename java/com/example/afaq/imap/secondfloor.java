package com.example.mjawad.imap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class secondfloor extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondfloor);
        spinner = (Spinner) findViewById(R.id.drop);
        String[] items = new String[]{"Second Floor","Basement", "Ground Floor", "First Floor" };
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
        spinner.setAdapter(adapter);
//        spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
    }



    public void btns(View view) {
        String id= spinner.getSelectedItem().toString();

        if(id.equals("Ground Floor"))
        {
            Intent ii = new Intent(this , ground2.class);
            startActivity(ii);

        }
        if(id.equals("First Floor"))
        {
            Intent ii = new Intent(this , firstfloor.class);
            startActivity(ii);

        }
        if(id.equals("Basement"))
        {
            Intent ii = new Intent(this , groundfloor.class);
            startActivity(ii);

        }
    }
}
