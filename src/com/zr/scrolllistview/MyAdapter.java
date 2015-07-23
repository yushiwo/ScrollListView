package com.zr.scrolllistview;

import java.net.ContentHandler;
import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter{
	
	private Context context;
	private ArrayList<String> mItems;
	private LayoutInflater mInflater;
	

	public MyAdapter(Context context, ArrayList<String> mItems) {
		super();
		this.context = context;
		this.mItems = mItems;
		this.mInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return mItems.size();
	}

	@Override
	public Object getItem(int position) {
		return mItems.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder viewHolder;
		if(convertView == null){
			convertView = this.mInflater.inflate(R.layout.list_item, parent, false);
			viewHolder = new ViewHolder();
			viewHolder.tv = (TextView)convertView.findViewById(R.id.item_content);
			convertView.setTag(viewHolder);
		}else{
			viewHolder = (ViewHolder) convertView.getTag();
		}
		
		viewHolder.tv.setText(mItems.get(position) + position);
		
		return convertView;
	}
	
	static class ViewHolder{
		TextView tv;
	}

}
