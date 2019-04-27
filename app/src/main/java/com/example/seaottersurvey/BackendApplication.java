package com.example.seaottersurvey;

import android.app.Application;

import com.backendless.Backendless;

public class BackendApplication extends Application {

    public static final String APPLICATION_ID = "582DDCD3-AD61-06A7-FFEB-F8FB678C7300";
    public static final String API_KEY = "4362344F-FC26-DC1C-FF42-DFAB46053E00";
    public static final String SERVER_URL = "https://api.backendless.com";

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(), APPLICATION_ID, API_KEY);
    }
}
