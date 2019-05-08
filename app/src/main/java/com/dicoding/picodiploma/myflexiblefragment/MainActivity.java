package com.dicoding.picodiploma.myflexiblefragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentContainer;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTrasaction = mFragmentManager.beginTransaction();
        HomeFragment mHomeFragment = new HomeFragment();

        Fragment fragment = mFragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName());

        if (!(fragment instanceof HomeFragment)) {
            mFragmentTrasaction.add(R.id.frame_container, mHomeFragment, HomeFragment.class.getSimpleName());
            Log.d("MyFlexibleFragmen", "Fragment name: " + HomeFragment.class.getSimpleName());
            mFragmentTrasaction.commit();
        }


    }
}
