package com.pattern.creational.prototype;

import java.io.*;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/3/30
 * [email]    :     kingjavip@gmail.com
 */
public class DeepRobot implements Serializable{
    private String name;

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    private Battery battery;

    public DeepRobot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepRobot deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (DeepRobot)ois.readObject();
    }
}
