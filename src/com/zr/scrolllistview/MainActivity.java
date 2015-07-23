package com.zr.scrolllistview;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private MyListView mListView;
	private MyAdapter adapter;
	private ArrayList<String> mDatas;

	private LinearLayout mLayout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
	}

	private void init() {
		mListView = (MyListView) findViewById(R.id.list);
		mDatas = new ArrayList<String>();
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		mDatas.add("position");
		adapter = new MyAdapter(MainActivity.this, mDatas);
		// mListView.addHeaderView(LayoutInflater.from(this).inflate(R.layout.list_header,
		// mListView, false));
		// mListView.addFooterView(LayoutInflater.from(this).inflate(R.layout.list_footer,
		// mListView, false));
		mListView.setAdapter(adapter);

		mLayout = (LinearLayout) findViewById(R.id.layout_certification);
		mLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(MainActivity.this, "点击", 3000).show();
			}
		});
	}
}
