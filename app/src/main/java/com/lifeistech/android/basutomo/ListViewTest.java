package com.lifeistech.android.basutomo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fukai on 16/02/19.
 */
public class ListViewTest extends Activity implements View.OnClickListener {

    static final String TAG = "ListViewTest";

    ListView listView;
    Button addButton;
    View showButton;

    static List<String>dataList = new ArrayList<String>();
    static ArrayAdapter<String>adapter;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
        setAdapters();

        showButton = findViewById(R.id.button1);
        showButton.setOnClickListener(this);
    }

    protected void findViews(){
        listView = (ListView)findViewById(R.id.listView1);
        addButton = (Button)findViewById(R.id.button1);
    }

    protected void setListeners(){
        addButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button1:
                addItem();
                break;
        }
    }

    protected void setAdapters(){
        adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                dataList);
        listView.setAdapter(adapter);
    }

    protected void addItem(){
        adapter.add("Hello");

    }

}
