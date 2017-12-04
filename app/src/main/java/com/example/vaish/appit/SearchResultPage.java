package com.example.vaish.appit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SearchResultPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result_page);

        populateListView();
    }

    private void populateListView(){

        //create list of items
        String [] publicPlaces = {"Blue", "Green", "Red", "Purple"};

        //array adapter

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.data_items,publicPlaces);

        ListView list = (ListView)findViewById(R.id.searchResultsPage);
        list.setAdapter(adapter);
    }
}
