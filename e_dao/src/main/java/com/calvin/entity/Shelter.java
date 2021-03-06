package com.calvin.entity;

/**
 * @author Calvin
 * @Description:
 */
public class Shelter {

    private int sid;
    private String sname;
    private double slongitude;
    private double slatitude;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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

    @Override
    public String toString() {
        return "Shelter{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", slongitude=" + slongitude +
                ", slatitude=" + slatitude +
                '}';
    }
}
