package com.example.sunil.tabcolfrageg;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void fragmentChange(View view){

        Fragment frag;

        if(view == findViewById(R.id.bt_frag1)){

            frag=new FragmentONE();
            android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragmentplace, frag);
            ft.commit();
        }
        if(view == findViewById(R.id.bt_frag2)){

            frag=new FragmentTWO();
            android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.fragmentplace, frag);
            ft.commit();

        }

    }
}
