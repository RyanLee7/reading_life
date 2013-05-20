package com.ryan.reading.ui.base;

import com.ryan.reading.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class BaseActivity extends Activity {

	private static final String LOGTAG = "BaseActivity";
	private static final boolean DEBUG_MODE = true;

	public void onCreate(Bundle savedInstanceState) {

		if (DEBUG_MODE) {
			Log.v(LOGTAG, "onCreate()");
		}
		super.onCreate(savedInstanceState);

	}

	@Override
	protected void onPause() {
		if (DEBUG_MODE) {
			Log.v(LOGTAG, "onPause()");
		}
		super.onPause();
	}

	@Override
	protected void onRestart() {
		if (DEBUG_MODE) {
			Log.v(LOGTAG, "onRestart()");
		}
		super.onRestart();
	}

	@Override
	protected void onResume() {
		if (DEBUG_MODE) {
			Log.v(LOGTAG, "onResume()");
		}
		super.onResume();
	}

	@Override
	protected void onStart() {
		if (DEBUG_MODE) {
			Log.v(LOGTAG, "onStart()");
		}
		super.onStart();
	}

	@Override
	protected void onStop() {
		if (DEBUG_MODE) {
			Log.v(LOGTAG, "onStop()");
		}
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		if (DEBUG_MODE) {
			Log.v(LOGTAG, "onDestroy()");
		}
		super.onDestroy();
	}

	/**
	 * 
	 */
	public void Animfinish() {
		super.finish();
		overridePendingTransition(R.anim.push_right_in, R.anim.push_right_out);
	}
}
