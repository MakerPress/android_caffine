(ns HelloActivity
  (:gen-class :extends android.app.Activity
              :exposes-methods {onCreate superOnCreate})
  (:import android.widget.TextView))

(defn -onCreate [this bundle]
  (doto this
    (.superOnCreate bundle)
    (.setContentView
      (doto (TextView. this)
        (.setText "Hello, Android!")))))
