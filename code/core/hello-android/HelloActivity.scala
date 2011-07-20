package com.decaffeinatedandroid.scala.hello_android

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class HelloActivity extends Activity {
  override def onCreate(savedState: Bundle) {
    super.onCreate(savedState)
    setContentView(
      new TextView(this) {
        setText("Hello, Android!")
      }
    )
  }
}
