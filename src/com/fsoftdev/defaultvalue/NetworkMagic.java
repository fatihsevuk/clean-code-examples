package com.fsoftdev.defaultvalue;

public class NetworkMagic {

    private String networkAddressFromHardware;

    public NetworkMagic() {

    }

    public String getIpAddress() {
        return getNetworkAddressFromHardware();
    }

    public String getNetworkAddressFromHardware() {
        if(networkAddressFromHardware==null) {
            networkAddressFromHardware="127.0.0.1";
        }

        return networkAddressFromHardware;
    }

}
