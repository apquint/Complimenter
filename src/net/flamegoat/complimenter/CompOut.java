package net.flamegoat.complimenter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CompOut extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		setContentView(R.layout.activity_comp_out);
		
		TextView textview = (TextView) findViewById(R.id.text1);
	    Button button = (Button) findViewById(R.id.button1);

		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		textview.setText(message);
		
		
	    /*// Create the text view
	    TextView textView = new TextView(this);
	    textView.setTextSize(40);
	    textView.setText(message);
	    
	    Button button = new Button(this);
	    button.setText("Main Menu");
		button.setTextColor(Color.parseColor("#ff0000"));
		button.setHeight(75);
	    

	    // Set the text view as the activity layout
	    setContentView(textView);*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.comp_out, menu);
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
	
	public void menuButton(View view)
	{
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}
	
	public void favesButton(View view)
    {
    	Intent intent = new Intent(this, Favorites.class);
	    String comp = "Favorites"; //newComp();
	    //Toast.makeText(MainActivity.this, comp, Toast.LENGTH_LONG).show();
	    if(comp != null)
	    {
	    	startActivity(intent);
	    }
    }
    
    public void settingsButton(View view)
    {
    	Intent intent = new Intent(this, Settings.class);
	    String comp = "Settings"; //newComp();
	    //Toast.makeText(MainActivity.this, comp, Toast.LENGTH_LONG).show();
	    if(comp != null)
	    {
	    	startActivity(intent);
	    }
    }
}
