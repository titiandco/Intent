package org.robot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button buttonclick = (Button)findViewById(R.id.button1);
		Button buttonclick2 = (Button)findViewById(R.id.button2);
		
		buttonclick.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// use Intent
				
				Intent intent1= new Intent(MainActivity.this, SecondActivity.class);
				Intent intent2= new Intent(MainActivity.this, ThirdActivity.class);
				startActivity(intent1);
				startActivity(intent2);
			}
		});
	}
}
