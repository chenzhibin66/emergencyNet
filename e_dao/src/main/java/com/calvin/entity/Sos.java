package com.calvin.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Calvin
 * @Description:
 */
public class Sos {
    private int id;
    private double longitude;
    private double latitude;
    private int message;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Sos{" +
                "id=" + id +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", message=" + message +
                '}';
    }
}
