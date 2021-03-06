package com.youzan.titan.sample.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.youzan.titan.TitanAdapter;
import com.youzan.titan.sample.R;

/**
 * Created by monster on 16/3/14.
 */
public class AnimAdapter extends TitanAdapter<String> {
    private final LayoutInflater mLayoutInflater;
    private final Context mContext;

    public AnimAdapter(Context context) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    protected RecyclerView.ViewHolder createVHolder(ViewGroup parent, int viewType) {
        return new NormalTextViewHolder(mLayoutInflater.inflate(R.layout.item_text, parent, false));
    }

    @Override
    protected void showItemView(RecyclerView.ViewHolder holder, int position) {
        ((NormalTextViewHolder) holder).mTextView.setText(mData.get(position));
    }

    @Override
    public long getAdapterItemId(int position) {
        return 0;
    }

    public static class NormalTextViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        NormalTextViewHolder(View view) {
            super(view);
            mTextView = (TextView) view.findViewById(R.id.text_view);
        }
    }
}
