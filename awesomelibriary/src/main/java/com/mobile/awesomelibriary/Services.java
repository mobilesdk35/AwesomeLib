package com.mobile.awesomelibriary;

public class Services {

    private static Services mInstance;
    public static Services getInstance(){
        if(mInstance == null) {
            mInstance = new Services();
        }
        return mInstance;
    }

    public CallService getCallService(){
        return new CallService();
    }

}
