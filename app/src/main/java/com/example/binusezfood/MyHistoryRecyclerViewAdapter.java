package com.example.binusezfood;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.binusezfood.Content.HistoryContent;

import java.util.List;

public class MyHistoryRecyclerViewAdapter extends RecyclerView.Adapter<MyHistoryRecyclerViewAdapter.ViewHolder> {

    private final List<HistoryContent.Item> mValues;

    public MyHistoryRecyclerViewAdapter(List<HistoryContent.Item> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_history_block, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mIdView.setText(mValues.get(position).id);
        holder.mContentView.setText("Details: \n"+mValues.get(position).details);
        holder.mPriceView.setText("Price: \n"+Integer.toString(mValues.get(position).total_price));
        holder.mLocationView.setText("Location: \n"+mValues.get(position).location);
        holder.mDateView.setText("Date: \n"+mValues.get(position).date);
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public final TextView mPriceView;
        public final TextView mDateView;
        public final TextView mLocationView;
        public HistoryContent.Item mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView =  view.findViewById(R.id.item_number);
            mContentView =  view.findViewById(R.id.content);
            mPriceView =  view.findViewById(R.id.price);
            mLocationView = view.findViewById(R.id.location);
            mDateView = (TextView) view.findViewById(R.id.date);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}