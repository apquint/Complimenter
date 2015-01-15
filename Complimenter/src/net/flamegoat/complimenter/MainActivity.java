package net.flamegoat.complimenter;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
	public final static String EXTRA_MESSAGE = "net.flamegoat.complimenter.MESSAGE";
	
	public int comps = 0;
	public int favs = 0;
	public int sets = 0;
	
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
        /*case R.id.action_search:
     	   openSearch();
     	   return true;*/
        case R.id.action_settings:
     	   openSettings();
     	   return true;
        /*case R.id.action_toast:
     	   TOAST();
     	   return true;*/
 	   default:
 		   return super.onOptionsItemSelected(item);
     	   
        }
     }

    public void compMe(View view)
    {
    	Intent intent = new Intent(this, CompOut.class);
	    String comp = newComp();
	    if(comp != null)
	    {
	    	comps++;
	    	String message = comp;
	    	intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
	    }
    }
    
    public String chooseComp()
    {
    	String choice = null;
    	Random random = new Random();
	    int num = random.nextInt((10 - 1) + 1) + 1;
	    switch(num)
	    {
	    case 1: choice = "Your voice sounds like a thousand kittens purring"; 	break;
	    case 2: choice = "You are a ray of sunshine"; 							break;
	    case 3: choice = "Your smile is like sugar in lemonade";				break;
	    case 4: choice = "You're beautiful";									break;
	    case 5: choice = "Your parents are proud";								break;
	    case 6: choice = "You are amazing";										break;
	    case 7: choice = "You make the mornings worth it";						break;
	    case 8: choice = "You are loved";										break;
	    case 9: choice = "You smell better than springtime flowers";			break;
	    case 10: choice = "You are sweeter than a chocolate chip cookie";		break;
	    default: chooseComp();													break;
	    }
	    return choice;
    }
    
    public String newComp()
    {
    	String choice = null;
    	Random random = new Random();
	    int num = random.nextInt((100 - 1) + 1) + 1;
	    switch(num)
	    {
	    case 27: newComp(); break;
	    case 36: shiny(); break;
	    case 89: choice = "If you were a piece of bacon, I would eat you. " +
	    		"If not, I would still eat you.";							break;
		default: choice = chooseComp();										break;
	    }
	    return choice;
    }
    
    public String shiny()
    {
    	String choice = null;
    	Random random = new Random();
	    int num = random.nextInt((100 - 1) + 1) + 1;
	    switch(num)
	    {
	    case 36: choice = "I wanna Squirtle on them Jigglypuffs"; break;
	    case 37: choice = "I would love you even if you were a Leafs fan";break;
	    default: newComp();													break;
	    }
	    return choice;
    }
    
    public void favesButton(View view)
    {
    	Intent intent = new Intent(this, Favorites.class);
	    String comp = "Favorites"; //newComp();
	    //Toast.makeText(MainActivity.this, comp, Toast.LENGTH_LONG).show();
	    if(comp != null)
	    {
	    	String message = comp;
	    	intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
	    }
    	favs++;
    }
    
    public void settingsButton(View view)
    {
    	Intent intent = new Intent(this, Settings.class);
	    String comp = "Settings"; //newComp();
	    //Toast.makeText(MainActivity.this, comp, Toast.LENGTH_LONG).show();
	    if(comp != null)
	    {
	    	String message = comp;
	    	intent.putExtra(EXTRA_MESSAGE, message);
	    	startActivity(intent);
	    }
    	sets++;
    }
    
    public static int randInt(int min, int max) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 0) + min;
        //random.nextInt(max - min + 1) + min
        return randomNum;
    }
    
    private void openSearch()
    {
    	Toast.makeText(this, "Search has been pressed", Toast.LENGTH_SHORT).show();
    }
    
    private void openSettings()
    {
    	Toast.makeText(this, "Comps: " + comps + "\nFaves: "
    			+ favs + "\nSettings: " + sets, Toast.LENGTH_SHORT).show();
    }

}
