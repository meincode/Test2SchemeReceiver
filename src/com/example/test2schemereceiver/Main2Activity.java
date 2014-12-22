package com.example.test2schemereceiver;

import com.example.test2schemereceiver.R;

import android.support.v7.app.ActionBarActivity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Main2Activity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		
		Uri uri = getIntent().getData();
		if(uri !=null){
			String ci = uri.getQueryParameter( "ci" )==null ? "" : uri.getQueryParameter( "ci" );
			Log.d( "ci : ", ci );	
			String desc = getBaseContext().getString(R.string.main2_description) + " ci[" +ci +"]";
			//Toast.makeText(getBaseContext(), getBaseContext().getString(R.string.main2_description), Toast.LENGTH_SHORT).show();		
			Toast.makeText(getBaseContext(), desc, Toast.LENGTH_SHORT).show();
		}else{
			Toast.makeText(getBaseContext(), "uri is null", Toast.LENGTH_SHORT).show();
		}		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main2, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
