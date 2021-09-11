package com.example.mjawad.imap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class firstfloor extends AppCompatActivity {

    Spinner spinner;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstfloor);
        b1 = (Button) findViewById(R.id.btns);
        spinner = (Spinner) findViewById(R.id.drop);
//
        String[] items = new String[]{ "First Floor","Basement", "Ground Floor" , "Second Floor"};
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
         if(id.equals("Basement"))
        {
            Intent ii = new Intent(this , groundfloor.class);
            startActivity(ii);

        }
        if(id.equals("Second Floor"))
        {

            Intent ii = new Intent(this , secondfloor.class);
            startActivity(ii);

        }
    }
}
