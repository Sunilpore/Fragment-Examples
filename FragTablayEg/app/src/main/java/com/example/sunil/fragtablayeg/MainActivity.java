package com.example.sunil.fragtablayeg;

import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements Tab1.OnFragmentInteractionListener, Tab2.OnFragmentInteractionListener, Tab3.OnFragmentInteractionListener{

   /* Toolbar tlbar;*/
    TabLayout tablay;
    ViewPager viewPager;
    PagerAdapter adapter;

    @SuppressWarnings("deprecation")

    public static final String tag="MyTag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*tlbar= (Toolbar) findViewById(R.id.Toolbar);
        setSupportActionBar(tlbar);*/

        tablay= (TabLayout) findViewById(R.id.Tablayout);
        tablay.addTab(tablay.newTab().setText("Tab 1"));
        tablay.addTab(tablay.newTab().setText("Tab 2"));
        tablay.addTab(tablay.newTab().setText("Tab 3"));
        tablay.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager= (ViewPager) findViewById(R.id.pager);

       // Log.d(tag,"TabCount:"+tablay.getTabCount());

        adapter=new PagerAdapter(getSupportFragmentManager(), tablay.getTabCount());  //tablay.getTabCount() will return no. of Tabs in TabLayout
        viewPager.setAdapter(adapter);

        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablay));


        tablay.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
