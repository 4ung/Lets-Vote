package com.letsvote.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.letsvote.R;

/**
 * Created by Toe Lie on 9/6/2015.
 */
public class PotentialFragment extends Fragment{

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private PotentialSectionsPagerAdapter mPotentialSectionsPagerAdapter;
    private String[] mPotentialTitles;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // initialize data for tabs
        mPotentialTitles = getResources().getStringArray(R.array.potential_tabs);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_potential, container, false);

        mPotentialSectionsPagerAdapter = new PotentialSectionsPagerAdapter(getActivity().getSupportFragmentManager(), mPotentialTitles);
        mViewPager = (ViewPager) rootView.findViewById(R.id.potential_view_pager);
        mViewPager.setAdapter(mPotentialSectionsPagerAdapter);

        mTabLayout = (TabLayout) rootView.findViewById(R.id.potential_tab_layout);
        mTabLayout.setupWithViewPager(mViewPager);

        return rootView;
    }


    public static class PotentialSectionsPagerAdapter extends FragmentPagerAdapter {
        private String[] mPotentialTitles;

        public PotentialSectionsPagerAdapter(FragmentManager fm, String[] potentialTitles) {
            super(fm);
            mPotentialTitles = potentialTitles;
        }

        @Override
        public Fragment getItem(int i) {
            Fragment fragment = null;

            switch (i){
                case 0:
                    fragment = new PotentialPartyListFragment();
                    break;
                case 1:
                    fragment = new PotentialCandidateListFragment();
                    break;
            }

            return fragment;
        }

        @Override
        public int getCount() {
            return mPotentialTitles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mPotentialTitles[position];
        }
    }


}
