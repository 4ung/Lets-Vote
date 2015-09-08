package com.letsvote.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.letsvote.R;

/**
 * Created by Toe Lie on 9/6/2015.
 */
public class PotentialPartyListFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_potential_party_list, container, false);

        return rootView;
    }
}
