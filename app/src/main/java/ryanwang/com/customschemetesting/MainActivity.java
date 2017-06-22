package ryanwang.com.customschemetesting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

	private Button buttonOpenBActivity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		buttonOpenBActivity = (Button) findViewById(R.id.button_open_b_activity);
		buttonOpenBActivity.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, BActivity.class));
			}
		});
	}
}
