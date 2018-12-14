class NativeWeb {
    getString() {
        return 'Hello, from the web!';
    }
}

function getNativeInterfaceInstance() {
    if (window.NativeAndroid) {
        return window.NativeAndroid;
    } else {
        return new NativeWeb();
    }
}

const Native = getNativeInterfaceInstance();

export default Native;
