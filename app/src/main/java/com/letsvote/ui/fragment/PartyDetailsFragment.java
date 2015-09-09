package com.letsvote.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.letsvote.R;
import com.letsvote.model.PartyItem;

import java.util.List;


public class PartyDetailsFragment extends Fragment {
    public static final String EXTRA_PARTY_ID = "com.letsvote.ui.fragment.PartyDetailsFragment_partyId";

    private TextView mPartyNameTextView;
    private TextView mAbbreviationTextView;
    private TextView mLeadershipTextView;
    private TextView mChairmanTextView;
    private TextView mEstablishmentDateTextView;
    private TextView mMemberCountTextView;
    private TextView mRegionTextView;
    private TextView mHeadquartersTextView;
    private TextView mContactTextView;

    private String mPartyId;
    private PartyItem mPartyItem;

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
        View rootView = inflater.inflate(R.layout.fragment_party_details, container, false);
        init(rootView);

        return rootView;
    }

    private void init(View rootView){

        mPartyNameTextView = (TextView) rootView.findViewById(R.id.party_details_text_view_party_name);
        mAbbreviationTextView = (TextView) rootView.findViewById(R.id.party_details_text_view_abbreviation);
        mLeadershipTextView = (TextView) rootView.findViewById(R.id.party_details_text_view_leader_ship);
        mChairmanTextView = (TextView) rootView.findViewById(R.id.party_details_text_view_chairman);
        mEstablishmentDateTextView = (TextView) rootView.findViewById(R.id.party_details_text_view_establishment_date);
        mMemberCountTextView = (TextView) rootView.findViewById(R.id.party_details_text_view_member_count);
        mRegionTextView = (TextView) rootView.findViewById(R.id.party_details_text_view_region);
        mHeadquartersTextView = (TextView) rootView.findViewById(R.id.party_details_text_view_headquarters);
        mContactTextView = (TextView) rootView.findViewById(R.id.party_details_text_view_contact);

        updateViews();
    }

    private void updateViews(){
        mPartyNameTextView.setText(mPartyItem.getPartyName());

        // if abb exist, show abb, otherwise, hide
        if(TextUtils.isEmpty(mPartyItem.getAbbreviation())){
            mAbbreviationTextView.setText(mPartyItem.getAbbreviation());
            mAbbreviationTextView.setVisibility(View.VISIBLE);
        }

        // leadership
        List<String> leaderships = mPartyItem.getLeadership();
        String leaderShipStr = "";
        for(int i=0; i<leaderships.size(); i++){
            leaderShipStr += leaderships.get(i);
            if(i < leaderships.size()) leaderShipStr += "\n";
        }
        mLeadershipTextView.setText(leaderShipStr);

        // chairman
        List<String> chairmen = mPartyItem.getChairman();
        String chairmanStr = "";
        for(int i=0; i<chairmen.size(); i++){
            chairmanStr += chairmen.get(i);
            if(i < chairmen.size()) chairmanStr += "\n";
        }
        mChairmanTextView.setText(chairmanStr);


        mEstablishmentDateTextView.setText(mPartyItem.getEstablishmentDate());
        mMemberCountTextView.setText(mPartyItem.getMemberCount());
        mRegionTextView.setText(mPartyItem.getRegion());
        mHeadquartersTextView.setText(mPartyItem.getHeadquarters());

        // contact
        List<String> contacts = mPartyItem.getContact();
        String contactsStr = "";
        for(int i=0; i<contacts.size(); i++){
            contactsStr += contacts.get(i);
            if(i < contacts.size()) contactsStr += "\n";
        }
        mContactTextView.setText(contactsStr);
    }

}
