package com.pattern.creational.prototype;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/3/30
 * [email]    :     kingjavip@gmail.com
 */
public class ShallowRobot implements Cloneable{
    private String name;

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    private Battery battery;

    public ShallowRobot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShallowRobot clone()  {
        Object object;
        try {
            object=super.clone();
            return (ShallowRobot)object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("不支持clone");
            return null;
        }
    }
}
