package com.example.recyclerviewtest;

import java.util.List;

import com.example.recyclerviewtest.adapter.MyRVAdapter;
import com.example.recyclerviewtest.adapter.MyRVAdapter2;
import com.example.recyclerviewtest.adapter.MyRVAdapter3;
import com.example.recyclerviewtest.util.Utils;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends ActionBarActivity {
	private static final String TAG = MainActivity.class.getSimpleName();

	private RecyclerView rvHorizontal;
	private RecyclerView rvVertical;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rvHorizontal = (RecyclerView) findViewById(R.id.recyclier_view_horizontal);
		rvVertical = (RecyclerView) findViewById(R.id.recyclier_view_vertical);
		List<String> dataSet = Utils.generateDataSet();
		LinearLayoutManager layoutManager = new LinearLayoutManager(this,
				LinearLayout.HORIZONTAL, false);
		rvHorizontal.setLayoutManager(layoutManager);
		layoutManager = new LinearLayoutManager(this, LinearLayout.VERTICAL,
				false);
		rvVertical.setLayoutManager(layoutManager);
		MyRVAdapter adapter = new MyRVAdapter(this, dataSet);
		MyRVAdapter2 adapter2 = new MyRVAdapter2(this, dataSet);
		MyRVAdapter3 adapter3 = new MyRVAdapter3(this, dataSet);
		rvHorizontal.setAdapter(adapter2);
		rvVertical.setAdapter(adapter);
	}

}
