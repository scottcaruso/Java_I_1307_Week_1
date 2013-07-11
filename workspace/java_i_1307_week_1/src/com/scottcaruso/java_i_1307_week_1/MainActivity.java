/*
 * Project java_i_1307_week_1
 * 
 * Package com.scottcaruso.java_i_1307_week_1
 * 
 * Author Scott Caruso
 * 
 * Date Jul 10, 2013
 */

package com.scottcaruso.java_i_1307_week_1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

// TODO: Auto-generated Javadoc

public class MainActivity extends Activity {
	
	LinearLayout ll;
	LinearLayout.LayoutParams lp;

    /* (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        ll.setLayoutParams(lp);
        
        
        //Create and display a TextView
        TextView tv = new TextView(this);
        tv.setText("This is an example TextView.");
        
        ll.addView(tv);
        
        EditText et = new EditText(this);
        et.setHint("Type something here.");
        //ll.addView(et);
        
        Button b = new Button(this);
        b.setText("Click Me!");
        //ll.addView(b);
        
        LinearLayout form = new LinearLayout(this);
        form.setOrientation(LinearLayout.HORIZONTAL);
        form.setLayoutParams(lp);
        
        form.addView(et);
        form.addView(b);
        
        ll.addView(form);
    
        setContentView(ll);
    }

    /* (non-Javadoc)
     * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
