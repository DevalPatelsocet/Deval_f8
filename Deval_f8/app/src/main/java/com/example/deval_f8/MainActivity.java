package com.example.deval_f8;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        invokeVLDN receiver = new invokeVLDN();
        registerMediaButtonEventReceiver(receiver);

    }

    private void registerMediaButtonEventReceiver(invokeVLDN receiver)
    {

    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        int action = event.getAction();
        int keyCode = event.getKeyCode();
        int count=event.getRepeatCount();
        switch (keyCode) {
//            case KeyEvent.KEYCODE_VOLUME_UP:
//                if (action == KeyEvent.ACTION_DOWN) {
//                    textView=findViewById(R.id.textView);
//                    textView.setText("DEVAL_UP");
//                }
//                return true;
            case KeyEvent.KEYCODE_VOLUME_DOWN:
                if (action == KeyEvent.ACTION_DOWN && count==3) {
                    textView=findViewById(R.id.textView);
                    textView.setText("YOU PRESSED THE BUTTON 3 TIMES");
                }
                return true;
            default:
                return super.dispatchKeyEvent(event);
        }
    }

//    @Override
//    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event)
//    {
//        int count=event.getRepeatCount();
//        int action = event.getAction();
//        keyCode = event.getKeyCode();
//
//        if (action == KeyEvent.KEYCODE_VOLUME_DOWN && count==3)
//        {
//            textView=findViewById(R.id.textView);
//            textView.setText("DEVAL_3");
//
//        }
//
//
//
//        return super.onKeyMultiple(keyCode, repeatCount, event);
//
//    }
}