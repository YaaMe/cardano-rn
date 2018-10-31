
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNCardanoLibModule extends ReactContextBaseJavaModule {
    static {
        System.loadLibrary("cardano_c");
    }
    private final ReactApplicationContext reactContext;

    public RNCardanoLibModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNCardanoLib";
    }
    private static native String greeting(String pattern);
    @ReactMethod
    public void show(String message, Callback cb) {
        cb.invoke(message);
    }
    @ReactMethod
    public void invokeRustGreeting(String message, Callback cb) {
        cb.invoke(greeting(message));
    }
}
