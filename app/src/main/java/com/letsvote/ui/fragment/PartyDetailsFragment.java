package com.letsvote.ui.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.letsvote.R;


public class PartyDetailsFragment extends Fragment {
    public static final String EXTRA_PARTY_ID = "com.letsvote.ui.fragment.PartyDetailsFragment_partyId";

    private String mPartyId;

    public PartyDetailsFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPartyId = getArguments().getString(EXTRA_PARTY_ID);
    }

    public static PartyDetailsFragment newInstance(String partyId){
        PartyDetailsFragment fragment = new PartyDetailsFragment();
        Bundle args = new Bundle();
        args.putString(EXTRA_PARTY_ID, partyId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_party_details, container, false);
    }
}
