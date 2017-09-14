package com.example.hamuj.example;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SaveCallback;
/**
 * Created by hamuj on 9/10/2017.
 */

public class StarterApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
      Parse.enableLocalDatastore(this);

        // Add your initialization code here

        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
                .applicationId("e1bddb95a1988d2eaaf9f47bcda7b8859d804562")
                .clientKey("b0690fede2b32a1848db35c38d60637b170f3320")
                .server("http://ec2-18-220-7-247.us-east-2.compute.amazonaws.com:80/parse/")
                .build()
        );







       // ParseUser.enableAutomaticUser();

        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);

    }
}
