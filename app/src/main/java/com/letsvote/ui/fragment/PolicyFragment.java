package com.letsvote.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.letsvote.R;

public class PolicyFragment extends Fragment {

    public static final String EXTRA_PARTY_ID = "com.letsvote.ui.fragment.PolicyFragment_partyId";

    private String mPartyId;

    public PolicyFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPartyId = getArguments().getString(EXTRA_PARTY_ID);

        //TODO: delete
        Toast.makeText(getActivity(), "PartyId: " + mPartyId, Toast.LENGTH_SHORT).show();
    }

    public static PolicyFragment newInstance(String partyId){
        PolicyFragment fragment = new PolicyFragment();
        Bundle args = new Bundle();
        args.putString(EXTRA_PARTY_ID, partyId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_policy, container, false);
    }
}
