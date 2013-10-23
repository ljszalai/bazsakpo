package com.comuv.szalai.bazsakpo;

import java.util.Random;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private Random random;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		random = new Random();
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onBtnGo(View view) {
		String NLine = System.getProperty("line.separator");
		String[] gepVal = {"K", "P", "O", "X"};
		EditText editText = (EditText) findViewById(R.id.eBet);
		String jatekos = editText.getText().toString().substring(0, 1).toUpperCase();
		int kocka = random.nextInt(3);
		String gep = gepVal[kocka];
		String status = "A gép választása: " + gep + "," + NLine + "a játékos választása: " + jatekos + "." 
				+ NLine + "Ezúttal nem nyert senki. (0:0)";
		TextView tw = (TextView) findViewById(R.id.twStatus);
		tw.setText(status.toCharArray(), 0, status.length());
	}

}
