package com.example.first_lab_mobile_security;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    Context context;
    String [] groupMembers;
    LayoutInflater myInflater;

    public MyAdapter(Context contextt, String[] groupMemberss){
        this.context = contextt;
        this.groupMembers = groupMemberss;
        this.myInflater = LayoutInflater.from(contextt);
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = myInflater.inflate(R.layout.list_tile_activity, null);
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(groupMembers[i]);
        return view;
    }

    @Override
    public int getCount() {
        return groupMembers.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


}
