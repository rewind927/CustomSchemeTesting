package ryanwang.com.customschemetesting;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class CActivity extends Activity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cactivity_main);

		if (getIntent() != null && getIntent().getData() != null) {
			Toast.makeText(CActivity.this, "get data: " + getIntent().getData().toString() + ", finish this activity after 5s", Toast.LENGTH_SHORT).show();
			Handler handler = new Handler();
			handler.postDelayed(new Runnable() {
				@Override
				public void run() {
					Toast.makeText(CActivity.this, "finish this activity", Toast.LENGTH_SHORT).show();
					finish();
				}
			},5000);
		}
	}
}
