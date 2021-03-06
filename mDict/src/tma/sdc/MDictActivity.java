package tma.sdc;

import java.io.IOException;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;
import tma.sdc.R;
public class MDictActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.custom_title_1);
//        final TextView leftText = (TextView) findViewById(R.id.left_text);
//        final TextView rightText = (TextView) findViewById(R.id.right_text);
//        leftText.setText("Hello");
//        rightText.setText("Fri");
        
        setDefaultKeyMode(DEFAULT_KEYS_SEARCH_LOCAL);
    }

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inf=this.getMenuInflater();
		inf.inflate(R.menu.mainmenu ,menu);		
		return true;
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onOptionsItemSelected(android.view.MenuItem)
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getItemId()==R.id.mnOptionExit)
		{
			finish();
		}
		else if(item.getItemId()==R.id.mnOptionSearch)
		{
			this.onSearchRequested();
				}
		return super.onOptionsItemSelected(item);
	}
}

