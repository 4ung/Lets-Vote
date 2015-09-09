package com.letsvote.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.letsvote.R;
import com.letsvote.model.PartyItem;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Toe Lie on 9/6/2015.
 */
public class PartyListAdapter extends RecyclerView.Adapter<PartyListAdapter.PartyAdapterViewHolder> {

    private List<PartyItem> mPartyList;
    final private Context mContext;
    final private PartyAdapterOnClickHandler mClickHandler;

    /**
     * Cache of the children views for a party list item.
     */
    public class PartyAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final ImageView mPartyFlagImageView;
        public final TextView mPartyNameTextView;
        public final TextView mRegionTextView;
        public final Button mViewPolicyButton;
        public final Button mContactButton;

        public PartyAdapterViewHolder(View view) {
            super(view);
            mPartyFlagImageView = (ImageView) view.findViewById(R.id.list_item_party_list_image_view_party_flag);
            mPartyNameTextView = (TextView) view.findViewById(R.id.list_item_party_list_text_view_party_name);
            mRegionTextView = (TextView) view.findViewById(R.id.list_item_party_list_text_view_region);
            mViewPolicyButton = (Button) view.findViewById(R.id.list_item_party_list_button_view_policy);
            mContactButton = (Button) view.findViewById(R.id.list_item_party_list_button_contact);

            view.setOnClickListener(this);
            mViewPolicyButton.setOnClickListener(this);
            mContactButton.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            int adapterPosition = getAdapterPosition();
            PartyItem partyItem = mPartyList.get(adapterPosition);

            if(v instanceof Button) {
                if(v.getId() == R.id.list_item_party_list_button_view_policy) {
                    mClickHandler.onViewPolicyClick(partyItem.getId(), this);
                }else if(v.getId() == R.id.list_item_party_list_button_contact){
                    mClickHandler.onContactClick(partyItem.getId(), this);
                }
            }else {
                mClickHandler.onClick(partyItem.getId(), this);
            }
        }
    }

    public static interface PartyAdapterOnClickHandler {
        void onClick(String partyId, PartyAdapterViewHolder vh);
        void onViewPolicyClick(String partyId, PartyAdapterViewHolder vh);
        void onContactClick(String partyId, PartyAdapterViewHolder vh);
    }

    public PartyListAdapter(Context context, PartyAdapterOnClickHandler dh, List<PartyItem> partyList) {
        mContext = context;
        mClickHandler = dh;
        mPartyList = partyList;
    }


    @Override
    public PartyAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        if ( viewGroup instanceof RecyclerView ) {

            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_party_list, viewGroup, false);
            view.setFocusable(true);

            return new PartyAdapterViewHolder(view);

        } else {
            throw new RuntimeException("Not bound to RecyclerView");
        }
    }

    @Override
    public void onBindViewHolder(PartyAdapterViewHolder vh, int position) {

        PartyItem item = mPartyList.get(position);

        Picasso.with(mContext).load(item.getPartyFlag()).into(vh.mPartyFlagImageView);

        vh.mPartyNameTextView.setText(item.getPartyName());
        vh.mRegionTextView.setText(item.getRegion());
    }

    @Override
    public int getItemCount() {
        return mPartyList.size();
    }


}
