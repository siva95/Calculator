package com.example.sivaprakasam.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et;
    String append ;
    String dummy;
    float num1,num2,res;
    char op;
    void init()
    {
        et=(EditText)findViewById(R.id.editText);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView tv=(TextView)findViewById(R.id.textView);
        tv.setSelected(true);
        FloatingActionButton fab = (FloatingActionButton)
                findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action",
                        Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void one(View v)
    {
        init();
        dummy=et.getText().toString();
        dummy=dummy.concat("1");
        et.setText(dummy);
    }
    public void two(View v)
    {
        init();
        dummy=et.getText().toString();
        dummy=dummy.concat("2");
        et.setText(dummy);
    }
    public void three(View v)
    {
        init();
        dummy=et.getText().toString();
        dummy=dummy.concat("3");
        et.setText(dummy);
    }
    public void four(View v)
    {
        init();
        dummy=et.getText().toString();
        dummy=dummy.concat("4");
        et.setText(dummy);
    }
    public void five(View v)
    {
        init();
        dummy=et.getText().toString();
        dummy=dummy.concat("5");
        et.setText(dummy);
    }
    public void six(View v)
    {
        init();
        dummy=et.getText().toString();
        dummy=dummy.concat("6");
        et.setText(dummy);
    }
    public void seven(View v)
    {
        init();
        dummy=et.getText().toString();
        dummy=dummy.concat("7");
        et.setText(dummy);
    }
    public void eight(View v)
    {
        init();
        dummy=et.getText().toString();
        dummy=dummy.concat("8");
        et.setText(dummy);
    }
    public void nine(View v)
    {
        init();
        dummy=et.getText().toString();
        dummy=dummy.concat("9");
        et.setText(dummy);
    }
    public void dec(View v) {
        init();
        dummy = et.getText().toString();
        if (!dummy.contains(".")) {
            dummy = dummy.concat(".");
            et.setText(dummy);
        }
        else //there shdnt be more than one .
        {
            et.setText(dummy);
        }
    }
    public void add(View v)
    {
        init();
        dummy = et.getText().toString();
        num1=Float.parseFloat(dummy);
        op='+';
        et.setText(" ");
    }
    public void sub(View v)
    {
        init();
        dummy = et.getText().toString();
        num1=Float.parseFloat(dummy);
        op='-';
        et.setText(" ");
    }
    public void mul(View v)
    {
        init();
        dummy = et.getText().toString();
        num1=Float.parseFloat(dummy);
        op='*';
        et.setText(" ");
    }
    public void div(View v)
    {
        init();
        dummy = et.getText().toString();
        num1=Float.parseFloat(dummy);
        op='/';
        et.setText(" ");
    }
    public void mod(View v)
    {
        init();
        dummy = et.getText().toString();
        num1=Float.parseFloat(dummy);
        op='%';
        et.setText(" ");
    }
    public void eq(View v) {
        init();
        if (num1== -1)//means there is no first operator
        {
//just put whats there is in the dummy
            dummy = et.getText().toString();
            et.setText(dummy);
        } else {
            dummy = et.getText().toString();
            num2 = Float.parseFloat(dummy);
            switch (op) {
                case '+':
                    res = num1 + num2;
                    break;
                case '-':
                    res = num1 - num2;
                    break;
                case '*':
                    res = num1 * num2;
                    break;
                case '/':
                    res = num1 / num2;
                    break;
                case '%':
                    res = num1 % (int) num2;
                    break;
            }
            String ans = Float.toString(res);
            et.setText(ans);
            num1 = -1;
            num2 = -1;
        }
    }
    public void zero(View v)
    {
        init();
        dummy=et.getText().toString();
        dummy=dummy.concat("0");
        if(dummy.charAt(0)=='0'&&(!dummy.contains(".")))
        {
            dummy=dummy.substring(1);
        }
        et.setText(dummy);
    }
    public void del(View v) {
        init();
        dummy = et.getText().toString();
        int length = dummy.length();
        if (length == 0) {
            dummy = Integer.toString(0);
        } else {
            dummy = dummy.substring(0, length - 1);
            et.setText(dummy);
        }
    }
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
}

