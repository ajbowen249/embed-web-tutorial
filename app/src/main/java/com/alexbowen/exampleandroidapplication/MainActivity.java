package com.alexbowen.exampleandroidapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity
{
    private WebView webView;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        webView = findViewById( R.id.webView );

        webView.setWebChromeClient( new WebChromeClient()
        {
            public boolean onConsoleMessage( ConsoleMessage cm )
            {
                Log.d( "WebView", cm.message() );
                return true;
            }
        } );


        webView.clearCache( true );
        webView.clearHistory();
        webView.getSettings().setJavaScriptEnabled( true );
        webView.setWebContentsDebuggingEnabled(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically( true );
        webView.getSettings().setAllowFileAccessFromFileURLs( true );
        webView.getSettings().setAllowUniversalAccessFromFileURLs( true );
        webView.getSettings().setDatabaseEnabled( true );
        webView.getSettings().setDomStorageEnabled( true );
        webView.setWebViewClient( new WebViewClient()
        {
            @Override
            public boolean shouldOverrideUrlLoading( WebView view, WebResourceRequest request )
            {
                if ( request.getUrl().toString().startsWith( "file:///android_asset" ) )
                {
                    // This is our local app, so do not override; let the WebView load the page
                    view.loadUrl( request.getUrl().toString() );
                    return false;
                }
                // Otherwise, the link is not for a page on our app, so launch another Activity that handles URLs
                Intent intent = new Intent( Intent.ACTION_VIEW, request.getUrl() );
                startActivity( intent );
                return true;
            }
        } );

        webView.loadUrl( "file:///android_asset/www/index.html" );
    }
}
