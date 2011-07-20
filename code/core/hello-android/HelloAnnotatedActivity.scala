package com.decaffeinatedandroid.scala.hello_android   // <1>

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class HelloActivity extends Activity {                 // <2>
  override def onCreate(savedState: Bundle) {          // <3>
    super.onCreate(savedState)
    setContentView(                                    // <4>
      new TextView(this) {                             // <5>
        setText("Hello, Android!")                     // <6>
      }
    )
  }
}
