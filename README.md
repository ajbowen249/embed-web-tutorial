# Example Web App
This is the source code for the basic web app that we'll be embedding into the native clients. It is a Vue.js project that builds using [webpack](https://webpack.js.org/) and was initialized with the command `vue init webpack web-app`. Some relevant commands for developing this app are:

- `npm install` - installs NPM packages. Run this on a fresh checkout
- `npm run dev` - runs a development server on localhost:8080. Use this if you want to run the project without embedding it somewhere.
- `npm run build` - compiles the project into a static website that can be served from a standard web server, and puts the output into the `dist` folder.

This is not intended to be a comprehensive Vue tutorial, and Vue was chosen over plain HTML and JavaScript to illustrate the likely scenario where the source code for your web app cannot directly be hosted in an embedded web view.
