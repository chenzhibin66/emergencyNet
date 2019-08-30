package com.calvin.entity;

/**
 * @author Calvin
 * @Description:
 */
public class Shelter {

    private int id;
    private String sname;
    private double slongitude;
    private double slatitude;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getSlongitude() {
        return slongitude;
    }

    public void setSlongitude(double slongitude) {
        this.slongitude = slongitude;
    }

    public double getSlatitude() {
        return slatitude;
    }

    public void setSlatitude(double slatitude) {
        this.slatitude = slatitude;
    }
}
