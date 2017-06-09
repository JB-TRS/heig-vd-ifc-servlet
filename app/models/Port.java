package models;

import java.util.*;

import play.data.format.*;
import play.data.validation.*;


/**
 * Class d'objet Port
 * Contient les informations propre à un port
 */
public class Port {

    String name;
    Long in;
    Long out;

    public String getName()  {
        return name;
    }

    public Long getIn()  {
        return in;
    }

    public Long getOut()  {
        return out;
    }


    public void setName(String deviceName) {
        name = deviceName;
    }

    public void setIn(Long deviceIn) {
        in = deviceIn;
    }

    public void setOut(Long deviceOut) {
        out = deviceOut;
    }

}