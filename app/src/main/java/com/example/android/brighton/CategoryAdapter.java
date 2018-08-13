package com.example.android.brighton;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides layout for each item based on data source which is a list of Location objects
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new CategoryAdapter object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes
     */
    CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the Fragment that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new DepartmentsFragment();
        } else if (position == 1) {
            return new DiningFragment();
        } else if (position == 2) {
            return new ParksFragment();
        } else {
            return new SchoolsFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * Display name of category in tabs.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.town_departments);
        } else if (position == 1) {
            return mContext.getString(R.string.dining_and_shopping);
        } else if (position == 2) {
            return mContext.getString(R.string.parks);
        } else {
            return mContext.getString(R.string.schools);
        }
    }
}
