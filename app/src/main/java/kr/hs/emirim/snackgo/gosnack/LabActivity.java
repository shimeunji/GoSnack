package kr.hs.emirim.snackgo.gosnack;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.buttontest.R;

/**
 * Created by 내컴퓨터 on 2016-06-09.
 */
public class LabActivity extends ActionBarActivity{
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab);
        WebView WebView01 = (WebView) findViewById(R.id.webView);
        WebView01.setWebViewClient(new WebViewClient());

        WebSettings webSettings = WebView01.getSettings();
        webSettings.setJavaScriptEnabled(true);

        WebView01.loadUrl("https://www.facebook.com/snackgwaza/?fref=ts");
    }
}
