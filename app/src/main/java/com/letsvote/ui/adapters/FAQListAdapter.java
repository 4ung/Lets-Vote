package com.letsvote.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.letsvote.R;
import com.letsvote.model.FAQItem;
import com.letsvote.model.PartyItem;

import java.util.ArrayList;

/**
 * Created by Admin on 9/9/15.
 */
public class FAQListAdapter extends RecyclerView.Adapter<FAQListAdapter.FAQAdapterViewHolder>{

    private ArrayList<FAQItem> mFAQList;
    final private Context mContext;
    final private FAQAdapterOnClickHandler mClickHandler;

    /**
     * Cache of the children views for a FAQ list item.
     */
    public class FAQAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public final TextView mFAQQuestoinTextView;
        public final TextView mFAQAnswerTextView;

        public FAQAdapterViewHolder(View view) {
            super(view);
            mFAQQuestoinTextView = (TextView) view.findViewById(R.id.list_item_faq_list_question);
            mFAQAnswerTextView = (TextView) view.findViewById(R.id.list_item_faq_list_answer);

            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            int adapterPosition = getAdapterPosition();
            FAQItem item = mFAQList.get(adapterPosition);

            mClickHandler.onClick(item.getId(), this);

        }
    }

    public static interface FAQAdapterOnClickHandler {
        void onClick(String partyId, FAQAdapterViewHolder vh);
    }

    public FAQListAdapter(Context context, FAQAdapterOnClickHandler dh, ArrayList<FAQItem> faqList) {
        mContext = context;
        mClickHandler = dh;
        mFAQList = faqList;
    }

    @Override
    public FAQAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        if ( viewGroup instanceof RecyclerView ) {

            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_faq_list, viewGroup, false);
            //view.setFocusable(true);

            return new FAQAdapterViewHolder(view);

        } else {
            throw new RuntimeException("Not bound to RecyclerView");
        }
    }

    @Override
    public void onBindViewHolder(FAQAdapterViewHolder vh, int position) {
        //partyAdapterViewHolder.mPartyNameTextView.setText("Party#" + position+1);

        FAQItem item = mFAQList.get(position);

        vh.mFAQQuestoinTextView.setText("Q: " + item.getQuestion());
        vh.mFAQAnswerTextView.setText("A: " + item.getAnswer());

    }

    @Override
    public int getItemCount() {
        return mFAQList.size();
    }

}
