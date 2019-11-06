package com.lamon.apk_lamon;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter {
    private int numOfTabs;

    PageAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 :
                return new lansia();
            case 1:
                return new heart_rate();
            case 2:
                return new tracking();
            case 3:
                return new activity();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;

    }
}

