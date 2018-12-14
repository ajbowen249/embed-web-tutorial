package com.alexbowen.exampleandroidapplication;

import android.webkit.JavascriptInterface;

/*
 This class implements the "Native" class from our Web App.
 */
public class NativeAndroid
{
    @JavascriptInterface
    public String getString()
    {
        return "This came from some Java on Android.";
    }
}
