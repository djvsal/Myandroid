package com.myapp1.dj.myapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    private static final String TAG="MyFirstApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        // Show the Up button in the action bar.
        getActionBar().setDisplayHomeAsUpEnabled(true);
        //get the message from the intent
        Intent intent =getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        Log.d(TAG,"Got Intent");//You might want to confirm for example that an intent fired by one activity is received by another. You can use Log.d() to do this. You have to first create a TAG in your code and then call Log.d() with the tag
        //create the text view
        TextView textView=new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        //set the text view as the activity layout
        setContentView(textView);
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
