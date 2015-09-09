package com.letsvote.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.letsvote.R;
import com.letsvote.model.CandidateItem;

import java.util.ArrayList;

/**
 * Created by Admin on 9/9/15.
 */
public class CandidateListAdapter extends RecyclerView.Adapter<CandidateListAdapter.CandidateAdapterViewHolder> {

    private ArrayList<CandidateItem> mCandidateList;
    final private Context mContext;
    final private CandidateAdapterOnClickHandler mClickHandler;

    /**
     * Cache of the children views for a party list item.
     */
    public class CandidateAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView mCandidateNameTextView;
        public final Button mViewPolicyButton;
        public final Button mContactButton;

        public CandidateAdapterViewHolder(View view) {
            super(view);
            mCandidateNameTextView = (TextView) view.findViewById(R.id.list_item_party_list_text_view_party_name);
            mViewPolicyButton = (Button) view.findViewById(R.id.list_item_party_list_button_view_policy);
            mContactButton = (Button) view.findViewById(R.id.list_item_party_list_button_contact);

            view.setOnClickListener(this);
            mViewPolicyButton.setOnClickListener(this);
            mContactButton.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            int adapterPosition = getAdapterPosition();
            CandidateItem item = mCandidateList.get(adapterPosition);

            if(v instanceof Button) {
                if(v.getId() == R.id.list_item_party_list_button_view_policy) {
                    mClickHandler.onViewPolicyClick(item.getId(), this);
                }else if(v.getId() == R.id.list_item_party_list_button_contact){
                    mClickHandler.onContactClick(item.getId(), this);
                }
            }else {
                mClickHandler.onClick(item.getId(), this);
            }
        }
    }


    public static interface CandidateAdapterOnClickHandler {
        void onClick(String partyId, CandidateAdapterViewHolder vh);
        void onViewPolicyClick(String partyId, CandidateAdapterViewHolder vh);
        void onContactClick(String partyId, CandidateAdapterViewHolder vh);
    }

    public CandidateListAdapter(Context context, CandidateAdapterOnClickHandler dh, ArrayList<CandidateItem> candidatelist) {
        mContext = context;
        mClickHandler = dh;
        mCandidateList = candidatelist;
    }


    @Override
    public CandidateAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        if ( viewGroup instanceof RecyclerView ) {

            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_party_list, viewGroup, false);
            //view.setFocusable(true);
            return new CandidateAdapterViewHolder(view);

        } else {
            throw new RuntimeException("Not bound to RecyclerView");
        }
    }

    @Override
    public void onBindViewHolder(CandidateAdapterViewHolder vh, int position) {
        //partyAdapterViewHolder.mPartyNameTextView.setText("Party#" + position+1);
        CandidateItem item = mCandidateList.get(position);
        vh.mCandidateNameTextView.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return mCandidateList.size();
    }

}
