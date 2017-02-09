package com.xuyang.helloworld.view;

import com.xuyang.helloworld.R;
import com.xuyang.helloworld.R.layout;
import com.xuyang.helloworld.R.menu;
import com.xuyang.helloworld.presenter.IPresenter;
import com.xuyang.helloworld.presenter.Presenter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity implements IView {
	private TextView tv;
	private IPresenter presenter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.tv);
		presenter = new Presenter(this);
		presenter.getString();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void show(String str) {
		tv.setText(str);
	}

}
