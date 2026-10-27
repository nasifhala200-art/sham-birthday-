package com.hala.shambirthday;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.graphics.Color;
import android.view.View;
public class MainActivity extends Activity {
 @Override protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  getWindow().setStatusBarColor(Color.rgb(20,18,34));
  getWindow().setNavigationBarColor(Color.rgb(20,18,34));
  WebView w = new WebView(this); w.setBackgroundColor(Color.rgb(20,18,34));
  WebSettings s=w.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(false);
  w.setOverScrollMode(View.OVER_SCROLL_NEVER); setContentView(w); w.loadUrl("file:///android_asset/index.html");
 }
}
