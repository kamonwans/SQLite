package com.example.kamonwan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private UserTABLE objUserTABLE;
    private OrderTABLE objOrderTABLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        objUserTABLE = new UserTABLE(this);
        objOrderTABLE = new OrderTABLE(this);
    }
}
