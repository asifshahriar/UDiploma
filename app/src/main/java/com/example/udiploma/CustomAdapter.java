package com.example.udiploma;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class CustomAdapter extends BaseExpandableListAdapter {

    private Context context;
    List<String> headerArray;
    HashMap<String, List<String>> childArray;

    public CustomAdapter() {
    }

    public CustomAdapter(Context context, List<String> headerArray, HashMap<String, List<String>> childArray) {
        this.context = context;
        this.headerArray = headerArray;
        this.childArray = childArray;
    }

    @Override
    public int getGroupCount() {
        return headerArray.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return childArray.get(headerArray.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return headerArray.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return childArray.get(headerArray.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        String headerText = (String) getGroup(groupPosition);
        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.expand_parents,null);
        }
        TextView tv_header = convertView.findViewById(R.id.parent_tvId);
        tv_header.setText(headerText);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        String childText = (String) getChild(groupPosition,childPosition);

        if (convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.expand_child,null);
        }

        TextView tv_child = convertView.findViewById(R.id.child_tvId);
        tv_child.setText(childText);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
