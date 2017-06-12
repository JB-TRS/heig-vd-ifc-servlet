package models;

import java.util.*;

import play.data.format.*;
import play.data.validation.*;


/**
 * Class d'objet Device
 * Contient les informations propre à un device
 */
public class Device {

    String name;
    String ipAddress;
    Long id;

    public String getName()  {
        return name;
    }

    public String getIpAddress()  {
        return ipAddress;
    }

    public Long getId() {
        return id;
    }

    public void setName(String deviceName) {
        name = deviceName;
    }

    public void setIpAddress(String deviceIp) {
        ipAddress = deviceIp;
    }

    public void setId(Long deviceId){
        id = deviceId;
    }

}