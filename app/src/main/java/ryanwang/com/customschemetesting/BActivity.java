package ryanwang.com.customschemetesting;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsIntent;
import android.view.View;
import android.widget.Button;

public class BActivity extends Activity {

	private Button buttonOpenCActivityByCustomTab;

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bactivity_layout);
		buttonOpenCActivityByCustomTab = (Button) findViewById(R.id.button_open_c_activity);
		buttonOpenCActivityByCustomTab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
				CustomTabsIntent customTabsIntent = builder.build();
				customTabsIntent.intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_CLEAR_TASK);
				customTabsIntent.launchUrl(BActivity.this, Uri.parse("http://192.168.12.194:8000"));
			}
		});
	}
}
