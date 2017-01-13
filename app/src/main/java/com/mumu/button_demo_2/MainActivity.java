package com.mumu.button_demo_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    private Button btu_1,btu_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btu_1 = (Button) findViewById(R.id.button1);
        btu_2 = (Button) findViewById(R.id.button2);
        btu_1.setOnClickListener((View.OnClickListener) this);
        btu_2.setOnClickListener((View.OnClickListener) this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                Intent intent1 = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent1);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
