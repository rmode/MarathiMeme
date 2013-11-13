package com.rmode.marathimeme;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MemeOptionsList extends ListActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_memes);
	    
	    List<String> stringList = new ArrayList<String>();
	    stringList.add("ONE");
	    stringList.add("TWO");
	    stringList.add("THREE");
	    
	    //ListView myListView = (ListView) findViewById(R.id.horizontalScrollNames);
	    //ListView myListView = (ListView) findViewById(R.id.scrollView1);
	    //myListView.setAdapter();
	    
	    
	    ListAdapter memeListAdapter = new ArrayAdapter<String>(this, R.layout.text_view1, stringList);
	    //findViewById(android.R.id.list);
	    setListAdapter(memeListAdapter);

	}
	
}
