package com.howtodoinjava.jerseydemo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by Ext-MayukhG on 9/25/2018.
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "users")
public class Users  {

    @XmlAttribute(name = "users")
    private ArrayList<User> users;

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
