package com.example.notepad;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;



public class AddNoteActivity extends Activity {
	
	public static ArrayList<String> notesItems = new ArrayList<String>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_note);
		
		Button backButton = (Button)findViewById(R.id.backButton);
		
		backButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		Button addButton = (Button)findViewById(R.id.addButton);
		
		addButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				TextView title = (TextView)findViewById(R.id.editText1);
				notesItems.add(title.getText().toString());
			}
		});
	}

}
