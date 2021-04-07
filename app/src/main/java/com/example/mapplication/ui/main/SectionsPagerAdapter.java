package com.example.mapplication.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mapplication.Fragment_10_days;
import com.example.mapplication.Fragment_today;
import com.example.mapplication.Fragment_tomorrow;
import com.example.mapplication.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3};
    private final Context mContext;
    private String city;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void get(String city) {
        this.city = city;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
       // return PlaceholderFragment.newInstance(position + 1);
        Fragment fragment=null;
        switch (position)
        {

            case 0:
                fragment= new Fragment_today();
                break;
            case 1:
                fragment= new Fragment_tomorrow();
                break;
            case 2:
                fragment= new Fragment_10_days();
                break;


        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}