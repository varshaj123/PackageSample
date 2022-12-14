package com.project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class AndroidBridgeModule extends ReactContextBaseJavaModule {
    ReactApplicationContext reactContext;
    AndroidBridgeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }
    @ReactMethod
    void navigateToExampleActivity(String data) {
        //Toast.makeText(reactContext, "Hi, this is from Android Native!", Toast.LENGTH_SHORT).show();
        ReactApplicationContext context = getReactApplicationContext();
        Intent intent = new Intent(context, FirstPage.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //Create the bundle
        Bundle bundle = new Bundle();
        //Add your data from getFactualResults method to bundle
        bundle.putString("reactData", data);
        //Add the bundle to the intent
        intent.putExtras(bundle);
        context.startActivity(intent);
    }
    @NonNull
    @Override
    public String getName() {
        return "navigateToExampleActivity";
    }
}
