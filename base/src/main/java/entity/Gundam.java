package main.java.entity;

import java.util.LinkedList;

/**
 * Created by pig on 2020/1/3.
 */
public class Gundam {

    private String name;
    private String type;
    private String belong;
    private double bodyWeight;
    private double fullWeight;

    public Gundam() {

    }

    public Gundam(String name, String type, String belong, double bodyWeight, double fullWeight) {
        this.name = name;
        this.type = type;
        this.belong = belong;
        this.bodyWeight = bodyWeight;
        this.fullWeight = fullWeight;
    }

    public LinkedList<Gundam> getList() {
        LinkedList<Gundam> list = new LinkedList<>();
        list.add(new Gundam("ν Gundam", "RX-93", "隆德.贝尔", 27.9, 63.0));
        list.add(new Gundam("Hi-ν Gundam", "号\tRX-93-ν-2", "隆德.贝尔", 27.9, 63.0));
        list.add(new Gundam("Sazabi", "MSN-04", "新吉恩", 	30.5, 	71.2));
        list.add(new Gundam("Nightingale", "MSN-04-02", "新吉恩", 	48.2, 	105.7));
        return list;
    }

    @Override
    public String toString() {
        return "Gundam{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", belong='" + belong + '\'' +
                ", bodyWeight=" + bodyWeight +
                ", fullWeight=" + fullWeight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public double getFullWeight() {
        return fullWeight;
    }

    public void setFullWeight(double fullWeight) {
        this.fullWeight = fullWeight;
    }
}
