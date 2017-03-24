package com.example.sailik.resumebuilder_24_feb;

import android.app.Application;

import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by saili.k on 24-03-2017.
 */

public class AppController extends Application {
    private GoogleApiClient mGoogleApiClient;

    public void setGoogleApiClient(GoogleApiClient googleApiClient){
        this.mGoogleApiClient = googleApiClient;
    }

    public GoogleApiClient getmGoogleApiClient(){
        return mGoogleApiClient;
    }
}
