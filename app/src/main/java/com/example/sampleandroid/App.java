package com.example.sampleandroid;
import sdk.pendo.io.*;
import android.app.Application;

//package com.example.sdktest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import sdk.pendo.io.Pendo;

public class App extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Random rand = new Random();
        int visitor = rand.nextInt();
        String key = "eyJhbGciOiJSUzI1NiIsImtpZCI6IiIsInR5cCI6IkpXVCJ9.eyJkYXRhY2VudGVyIjoidXMiLCJrZXkiOiJjYjM5YjJjNzExOWUxY2RjYTk0ZDAzNGYyNThmMzc0NWMxMTVhZThlMDhhNWFiMDI2OWJjMjgzMGVjMGEyNmRlZGU1MzA1Nzc0MDk4ZWE0MWZjY2UxZjU3MWU1MjM2YmI0MWMzMDgxNWE0MzQ1YmQ4M2E0MDkzMTJlYjA3YjM1ZTNmZTgzZDIwZTVhODk4MTkyNTEzYTRkYzkxNzc5ZjNiLmEyZDZlN2I4ZTI2ODcyYzFlMjhiN2QzNmZmYTJhZjQ0LmVmYWZjNTI1OGZkYmZlMDZkNjg0MzY5MWEyOWE3NDNkZjQyNTE3ZDI0YTRhODYxODFjNmZkODYzMGEzZDBmOTUifQ.KHmog2QYSeBlniztkSf5UHfHHpSAt7bsSPSULoROXHHxIGl6IKWOUNMc9NoRuj0o9YYlQEB7yqnDQg8LjnMTIE01jiYi8wzanrNXAxSFDDAMM2xqxNRlHKEFTzxFwRyelydOzJ5DECWJPMhphJcsc3kHq-11KRY6q9dC4vihi54";


        Pendo.PendoInitParams initParams = new Pendo.PendoInitParams().setVisitorId("Nikola Tesla" + visitor).setAccountId("BetterThanYou");
        initParams.setPendoOptions(new Pendo.PendoOptions.Builder().setEnvironmentDebugOnly("DEV").build());
        Pendo.initSDK(
                this,
                key,
                initParams);
    }
}