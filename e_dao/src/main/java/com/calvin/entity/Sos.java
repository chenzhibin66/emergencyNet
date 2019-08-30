package com.calvin.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author Calvin
 * @Description:
 */
public class Sos {
    private String sosPeople;
    private int message;
    private double longitude;
    private double latitude;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm")
    private Date  postTime;

    private DisasterPeople poster;


    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public DisasterPeople getPoster() {
        return poster;
    }

    public void setPoster(DisasterPeople poster) {
        this.poster = poster;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getSosPeople() {
        return sosPeople;
    }

    public void setSosPeople(String sosPeople) {
        this.sosPeople = sosPeople;
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
}
