package com.example.sunil.fragmenteg;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tablay;
    ViewPager vpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tablay= (TabLayout) findViewById(R.id.lo_tablayout);
        vpager= (ViewPager) findViewById(R.id.lo_pager);

        TabLayout.Tab firsttab=tablay.newTab();
        firsttab.setText("First");
        tablay.addTab(firsttab);

        TabLayout.Tab secondtab=tablay.newTab();
        secondtab.setText("Second");
        tablay.addTab(secondtab);

        TabLayout.Tab thirdtab=tablay.newTab();
        thirdtab.setText("Third");
        tablay.addTab(thirdtab);

       tablay.setupWithViewPager(vpager);

    }
}
