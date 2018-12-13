# Embedded Web UI Tutorial

This repository contains a set of example projects that demonstrate some concepts on embedding a web-based user interface as a view in an existing native client application. It specifically uses these technologies:
- [Vue](https://vuejs.org/) for the web application itself
- [UIWebView](https://developer.apple.com/documentation/uikit/uiwebview) for iOS and macOS
- [WebView](https://developer.android.com/reference/android/webkit/WebView) on Android
- [TBD]() on Windows

Most of the general coding paradigms should seem similar across the different platforms, and this project should help get your started with different frontend technologies and native WebViews that are not directly covered here.

## Repository Organization
In an effort to keep organization reference-oriented the per-platform projects and the common web app are not held in a top-level directory, but instead live in their own branches. They are:
- *web-app* - the common web app source code
- *mac-app* - the macOS example app
- *windows-app* - the Windows example app
- *android-app* - the Android example app
- *ios-app* - the iOS example app

To keep the material build-system-agnostic, each of the platform branches has a full copy of the pre-built web app.
