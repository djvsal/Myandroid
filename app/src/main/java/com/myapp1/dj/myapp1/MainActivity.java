package com.myapp1.dj.myapp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE="com.myapp1.dj.myapp1.MESSAGE" ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//comments nkn
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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

    /** called when clicks the send button  **/
    public void sendMessge(View view){
        Intent intent=new Intent(this,DisplayMessageActivity.class);//creating the intent object ,This uses your current Activity as the context from which to start the Intent, and gives the target class to launch.
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message= editText.getText().toString();//the getText() method get the content inside editText and toString() will convert it to string format.
        intent.putExtra(EXTRA_MESSAGE,message);//Extras are entered as key value pairs so EXTRA_MESSAGE is a key is used to identify a particular value so it can be retrieved and used by another activity.
        startActivity(intent);
    }
}
