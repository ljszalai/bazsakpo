package com.comuv.szalai.bazsakpo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onBtnGo(View view) {
		EditText editText = (EditText) findViewById(R.id.eBet);
		String message = editText.getText().toString();
		TextView tw = (TextView) findViewById(R.id.twStatus);
		tw.setText(message.toCharArray(), 0, message.length());
	}

}
