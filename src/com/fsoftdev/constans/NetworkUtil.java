package com.fsoftdev.constans;

public class NetworkUtil {

    private static final int NETWORK_ON = 1;
    private static final int MAX_CONNECTION = 100;

    public boolean isNetworkingTurnedOnDirty(int networkingState) {
        boolean isNetworkingTurnedOn = false;

        if(networkingState == 1) {
            isNetworkingTurnedOn=true;
        }

        return isNetworkingTurnedOn;
    }


    public boolean isNetworkingTurnedOnClean(int networkingState) {
        boolean isNetworkingTurnedOn = false;

        if(networkingState == NETWORK_ON) {
            isNetworkingTurnedOn=true;
        }

        return isNetworkingTurnedOn;
    }


    public boolean hasTooManyConnectionOnSystemDirty(int connectionCount) {
        boolean isTooManyConnection=false;

        if(connectionCount>100) {
            isTooManyConnection=true;
        }
        return isTooManyConnection;
    }


    public boolean hasTooManyConnectionOnSystemClean(int connectionCount) {
        boolean isTooManyConnection=false;

        if(connectionCount>MAX_CONNECTION) {
            isTooManyConnection=true;
        }
        return isTooManyConnection;
    }
}
