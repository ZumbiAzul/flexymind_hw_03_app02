package com.flexymind.hw03app02;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;

public class Flexymind_hw_03_app02Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btn = new Button(this);
        LayoutParams btnParam = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        LinearLayout linLayout = (LinearLayout)findViewById(R.id.lin);
        btn.setText("Button");
        linLayout.addView(btn, btnParam);
    }
}