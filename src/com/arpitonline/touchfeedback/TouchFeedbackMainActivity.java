package com.arpitonline.touchfeedback;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TouchFeedbackMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_touch_feedback_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_touch_feedback_main, menu);
		return true;
	}

}
