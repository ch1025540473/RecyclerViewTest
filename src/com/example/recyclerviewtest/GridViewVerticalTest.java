/**   
 * @Title: GridViewHorizontalTest.java 
 * @Package com.example.recyclerviewtest 
 * @Description: TODO
 * @author SilentKnight || happychinapc[at]gmail[dot]com   
 * @date 2015 2015年1月22日 下午3:49:08 
 * @version V1.0.0   
 */
package com.example.recyclerviewtest;

import com.example.recyclerviewtest.adapter.MyRVAdapter;
import com.example.recyclerviewtest.util.Utils;

import android.os.Bundle;
import android.support.v17.leanback.widget.VerticalGridView;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;

/**
 * @ClassName: GridViewHorizontalTest
 * @Description: TODO
 * @author SilentKnight || happychinapc@gmail.com
 * @date 2015年1月22日 下午3:49:08
 * 
 */
public class GridViewVerticalTest extends ActionBarActivity {
	private VerticalGridView gvVertical;

	/*
	 * (non-avadoc) <p>Title: onCreate</p> <p>Description: </p>
	 * 
	 * @params @param savedInstanceState
	 * 
	 * @overrided @see
	 * android.support.v7.app.ActionBarActivity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.grid_view_vertical_layout);
		gvVertical = (VerticalGridView) findViewById(R.id.v17_vertical_gridview);
		gvVertical.setLayoutManager(new LinearLayoutManager(this));
		gvVertical.setAdapter(new MyRVAdapter(this, Utils.generateDataSet()));
	}
}
