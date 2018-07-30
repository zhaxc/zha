package com.zw.mongo.geo;

/**
 * Created by zha on 2017/8/11.
 */
public class Point {

    private double lng;
    private double lat;

    public Point() {
    }

    public Point(double lng, double lat) {
        this.lng = lng;
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}
