package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jsnkrm on 4/5/17.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    private String tabTitles[] = new String[] { "Numbers", "Family", "Colours", "Phrases" };

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
        {
            return new NumbersFragment();
        }
        else if (position == 1)
        {
            return new FamilyFragment();
        }
        else if(position == 2)
        {
            return new ColoursFragment();
        }
        else
        {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }

}
