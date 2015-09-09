package com.letsvote.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.letsvote.R;
import com.letsvote.model.PartyItem;
import com.letsvote.ui.activities.PartyDetailsActivity;
import com.letsvote.ui.activities.PolicyActivity;
import com.letsvote.ui.adapters.PartyListAdapter;

import java.util.ArrayList;

/**
 * Created by Toe Lie on 9/6/2015.
 */

/**
 * Encapsulates fetching the party list and displaying it as a {@link android.support.v7.widget.RecyclerView} layout.
 */

public class PartyListFragment extends Fragment {

    private PartyListAdapter mPartyListAdapter;
    private RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_party_list, container, false);

        // Get a reference to the RecyclerView, and attach this adapter to it.
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.party_list_recyclerview);

        // Set the layout manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //View emptyView = rootView.findViewById(R.id.recyclerview_party_empty);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);



        ArrayList<PartyItem> itemlist = new ArrayList<>();

        for(int i=0;i<10;i++){
            PartyItem item = new PartyItem();
            item.setPartyName("Party " + (i+1));
            itemlist.add(item);
        }


        // The PartyListAdapter will take data from a source and
        // use it to populate the RecyclerView it's attached to.
        mPartyListAdapter = new PartyListAdapter(getActivity(), new PartyListAdapter.PartyAdapterOnClickHandler() {
            @Override
            public void onClick(String partyId, PartyListAdapter.PartyAdapterViewHolder vh) {
                Intent policyIntent = new Intent(getActivity(), PartyDetailsActivity.class)
                        .putExtra(PartyDetailsFragment.EXTRA_PARTY_ID, partyId);
                startActivity(policyIntent);
            }

            @Override
            public void onViewPolicyClick(String partyId, PartyListAdapter.PartyAdapterViewHolder vh) {
                Intent policyIntent = new Intent(getActivity(), PolicyActivity.class)
                        .putExtra(PolicyFragment.EXTRA_PARTY_ID, partyId);
                startActivity(policyIntent);
            }

            @Override
            public void onContactClick(String partyId, PartyListAdapter.PartyAdapterViewHolder vh) {
                Toast.makeText(getActivity(), "Contact" + partyId, Toast.LENGTH_SHORT).show();
            }
        }, itemlist);

        // specify an adapter (see also next example)
        mRecyclerView.setAdapter(mPartyListAdapter);

        return rootView;
    }
}
