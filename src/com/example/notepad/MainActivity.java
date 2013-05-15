package com.example.notepad;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, AddNoteActivity.notesItems);
		
		//Get reference to the listview
		ListView lv = (ListView)findViewById(R.id.notesList);
		lv.setAdapter(aa);

		Button addButton = (Button)findViewById(R.id.newButton);
		addButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getBaseContext(), AddNoteActivity.class);
				startActivity(intent);	
			}
		});
	}

}
