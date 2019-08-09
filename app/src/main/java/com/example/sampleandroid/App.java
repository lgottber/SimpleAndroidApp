package com.example.sampleandroid;
import sdk.pendo.io.*;
import android.app.Application;

import java.util.HashMap;
import java.util.Map;

public class App extends Application {
    String appKey = "";
    String visitorId = "Duckies";
    String accountId = "Ducks";
    @Override
    public void onCreate(){
        Pendo.PendoInitParams pendoParams = new Pendo.PendoInitParams();
        pendoParams.setVisitorId(visitorId);
        pendoParams.setAccountId(accountId);

//send Visitor Level Data
        Map<String, String> userData = new HashMap<>();
        userData.put("age", "27");
        userData.put("country", "USA");
        pendoParams.setUserData(userData);

//send Account Level Data
        Map<String, String> accountData = new HashMap<>();
        accountData.put("Tier", "1");
        accountData.put("Size", "Enterprise");
        pendoParams.setAccountData(accountData);


        Pendo.initSDK(
                this,
                appKey,
                pendoParams);   // call initSDK with initParams as a fourth parameter (this can be `null`).
    }
}
