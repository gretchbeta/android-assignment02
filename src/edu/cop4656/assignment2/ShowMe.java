package edu.cop4656.assignment2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class ShowMe extends Activity implements View.OnClickListener {
	
	Button btn;
	ImageView img;
	int clicks;
	
	boolean is_nole;
	boolean is_start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_me);
        
        // Grab widget references
        btn = (Button)findViewById(R.id.the_button);
        img = (ImageView)findViewById(R.id.the_image);
        
        // Set up click listener
        btn.setOnClickListener(this);
        
        // Go!
        init();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.show_me, menu);
        return true;
    }
    
    public void init() {
    	// Set initial states
    	clicks = 0;
    	is_start = true;
    	is_nole = true;
    	
    	// Set initial resources
    	img.setImageDrawable(getResources().getDrawable(R.drawable.nole_1));
    	btn.setText(getResources().getText(R.string.btn_showgator));
    }
    
    public void next() {
    	// Handle intro case
    	if (is_start) {
    		is_nole = false;
    		is_start = false;
    		img.setImageDrawable(getResources().getDrawable(R.drawable.gator_1));
    		btn.setText(getResources().getText(R.string.btn_shownole));
    		return;
    	}
    	
    	// Loop
    	if (is_nole) {
    		is_nole = false;
    		img.setImageDrawable(getResources().getDrawable(R.drawable.gator_2));
    		btn.setText(getResources().getText(R.string.btn_shownole));
    	} else {
    		is_nole = true;
    		img.setImageDrawable(getResources().getDrawable(R.drawable.nole_2));
    		btn.setText(getResources().getText(R.string.btn_showgator));
    	}
    }
    
    @Override
    public void onClick(View view) {
    	clicks++;
    	next();
    }
    
}
