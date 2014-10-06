package ru.ifmo.md.lesson4;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        text = (TextView) findViewById(R.id.textView);
    }

    TextView text;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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

    public void equallyClick(View view) {
        CalculationEngine calc = CalculationEngineFactory.defaultEngine();
        try {
            double d = calc.calculate(text.getText().toString());
            String s;
            s = String.valueOf(d);
            text.setText(s);
        } catch (CalculationException e) {
            text.setText("Error "+e.getMessage());
        }
    }

    public void onClickButton(View view) {
        String start = text.getText().toString();
        int position = text.getSelectionStart();
        start = start.substring(0,position)+((Button)view).getText() + start.substring(position);
        text.setText(start);
    }
    public void onClickBack(View view) {
        String start = text.getText().toString();
        if (start.length() > 0) {
            start = start.substring(0, start.length()-1);
        }
        text.setText(start);
    }
}
