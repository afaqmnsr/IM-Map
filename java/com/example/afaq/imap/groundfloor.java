package com.example.mjawad.imap;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class groundfloor extends AppCompatActivity  {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");
    Spinner spinner;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_groundfloor);
//        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        b = (Button)findViewById(R.id.btns);
        spinner= findViewById(R.id.drop);
//create a list of items for the spinner.
        String[] items = new String[]{"Basement", "Ground Floor", "First Floor" , "Second Floor"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
        spinner.setAdapter(adapter);

//        spinner = (Spinner) findViewById(R.id.drop);
//        spinner.setOnItemSelectedListener(this);


    }

    public void btea(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementMiscellaneous");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("btea").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#dec983"));
    }

    public void cb12(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementClassrooms");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("b12").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        view.setBackgroundColor(Color.parseColor("#d5f6f7"));
    }

    public void cb13(View view) {

        myRef=FirebaseDatabase.getInstance().getReference().child("BasementClassrooms");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("b13").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#d5f6f7"));
    }

    public void cb14(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementClassrooms");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("b14").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        view.setBackgroundColor(Color.parseColor("#d5f6f7"));
    }

    public void lb3(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementLabs");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("bl3").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#9ede83"));
    }

    public void mb01(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementOffices");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("bu01").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#dec983"));
    }

    public void gl(View view) {

        myRef=FirebaseDatabase.getInstance().getReference().child("BasementLabs");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("generallab").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#9ede83"));
    }

    public void serg(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementMiscellaneous");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("bserg").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#c1a5e8"));
    }

    public void mb02(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementOffices");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("bu02").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#dec983"));
    }

    public void cb1(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementClassrooms");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("b01").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#d5f6f7"));
    }

    public void cb2(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementClassrooms");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("b02").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#d5f6f7"));
    }

    public void cb3(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementClassrooms");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("b03").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#d5f6f7"));
    }

    public void blt4(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementTheaters");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("lt04").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#94abb0"));
    }

    public void cb05(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementClassrooms");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("b05").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#d5f6f7"));
    }

    public void cb06(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementClassrooms");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("b06").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#d5f6f7"));
    }

    public void cb07(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementClassrooms");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("b07").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#d5f6f7"));
    }

    public void bpsr(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementMiscellaneous");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("bphdroom").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#c1a5e8"));
    }

    public void cb10(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementClassrooms");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("b10").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#d5f6f7"));
    }

    public void cb9(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementClassrooms");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("b09").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#d5f6f7"));
    }

    public void cb8(View view) {
        myRef=FirebaseDatabase.getInstance().getReference().child("BasementClassrooms");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String room1 =dataSnapshot.child("b08").getValue().toString();
                Toast.makeText(groundfloor.this, room1, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
        view.setBackgroundColor(Color.parseColor("#d5f6f7"));
    }

    public void wr1(View view) {
        view.setBackgroundColor(Color.parseColor("#78aafa"));
        Toast.makeText(groundfloor.this, "Washrooms", Toast.LENGTH_LONG).show();
    }

    public void wr2(View view) {
        view.setBackgroundColor(Color.parseColor("#78aafa"));
        Toast.makeText(groundfloor.this, "Washrooms", Toast.LENGTH_LONG).show();
    }

    public void wr3(View view) {
        view.setBackgroundColor(Color.parseColor("#78aafa"));
        Toast.makeText(groundfloor.this, "Washrooms", Toast.LENGTH_LONG).show();
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
        if(id.equals("Second Floor"))
        {

            Intent ii = new Intent(this , secondfloor.class);
            startActivity(ii);

        }
    }
}
