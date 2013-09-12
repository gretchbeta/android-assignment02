package edu.cop4656.assignment2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.graphics.drawable.Drawable;

public class ShowMe extends Activity implements View.OnClickListener {
	
	Button btn;
	ImageView img;
	Drawable next;

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
    	// Set our flag and pop in the initial image source and button text
    	// next = getResources().getDrawable(R.drawable.nole_1);
    }
    
    @Override
    public void onClick(View view) {
    	
    }
    
}
