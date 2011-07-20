package com.decaffeinatedandroid.scala.hello_android

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

public class HelloActivity extends Activity {
  @Override
  public void onCreate(Bundle savedState) {
    super.onCreate(savedState);
    TextView textView = new TextView(this);
    textView.setText("Hello, Android!");
    setContentView(textView);
  }
}
