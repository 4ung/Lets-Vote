package com.letsvote.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.letsvote.R;
import com.letsvote.model.FAQItem;
import com.letsvote.ui.activities.PartyDetailsActivity;
import com.letsvote.ui.adapters.FAQListAdapter;

import java.util.ArrayList;

/**
 * Created by Admin on 9/9/15.
 */
public class FAQListFragment extends Fragment{

    private FAQListAdapter mFAQListAdapter;
    private RecyclerView mRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_faq_list, container, false);

        // Get a reference to the RecyclerView, and attach this adapter to it.
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.faq_list_recyclerview);

        // Set the layout manager
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        //View emptyView = rootView.findViewById(R.id.recyclerview_party_empty);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);



        ArrayList<FAQItem> itemlist = new ArrayList<>();

        for(int i=0;i<10;i++){
            FAQItem item = new FAQItem();
            item.setQuestion("Et officiis qui provident similique.");
            item.setAnswer("Culpa aut blanditiis accusamus veniam recusandae voluptatem. Quam itaque numquam debitis laudantium numquam in sint. Dicta et deserunt et ea maiores autem quis.");
            itemlist.add(item);
        }


        // The PartyListAdapter will take data from a source and
        // use it to populate the RecyclerView it's attached to.
        mFAQListAdapter = new FAQListAdapter(getActivity(), new FAQListAdapter.FAQAdapterOnClickHandler() {
            @Override
            public void onClick(String partyId, FAQListAdapter.FAQAdapterViewHolder vh) {
                /*Intent policyIntent = new Intent(getActivity(), PartyDetailsActivity.class)
                        .putExtra(PartyDetailsFragment.EXTRA_PARTY_ID, partyId);
                startActivity(policyIntent);*/
            }

        }, itemlist);

        // specify an adapter (see also next example)
        mRecyclerView.setAdapter(mFAQListAdapter);

        return rootView;
    }
}
