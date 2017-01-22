package com.tutorials.hp.spinnerimgtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Spacecraft> spacecrafts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sp= (Spinner) findViewById(R.id.sp);
        getData();
        sp.setAdapter(new CustomAdapter(this,spacecrafts));

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, spacecrafts.get(i).getName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }

    private ArrayList getData()
    {
        spacecrafts=new ArrayList<>();

        Spacecraft s=new Spacecraft();
        s.setName("Pioneer");
        s.setPropellant("Chemical Energy");
        s.setImage(R.drawable.pioneer);
        spacecrafts.add(s);

        s=new Spacecraft();
        s.setName("Spitzer");
        s.setPropellant("Warp Drive");
        s.setImage(R.drawable.spitzer);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("Enterprise");
        s.setPropellant("Anti Matter");
        s.setImage(R.drawable.enterprise);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("Hubble");
        s.setPropellant("Laser Beam");
        s.setImage(R.drawable.hubble);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("Voyager");
        s.setPropellant("Solar Energy");
        s.setImage(R.drawable.voyager);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("Kepler");
        s.setPropellant("Solar Energy");
        s.setImage(R.drawable.kepler);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("Rosetter");
        s.setPropellant("Nuclear Energy");
        s.setImage(R.drawable.rosetta);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("WMAP");
        s.setPropellant("Nuclear Energy");
        s.setImage(R.drawable.wmap);
        spacecrafts.add(s);


        s=new Spacecraft();
        s.setName("Columbia");
        s.setPropellant("Chemical Energy");
        s.setImage(R.drawable.columbia);
        spacecrafts.add(s);

        return spacecrafts;
    }


}
