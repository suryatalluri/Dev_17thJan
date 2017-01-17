/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.dev_17thjan.cities;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.util.Objects;

public class ZipsId implements Serializable {

    private Integer zip;
    private String state;
    private String city;
    private String lat;
    private String lng;

    public Integer getZip() {
        return this.zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLat() {
        return this.lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return this.lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zips)) return false;
        final Zips zips = (Zips) o;
        return Objects.equals(getZip(), zips.getZip()) &&
                Objects.equals(getState(), zips.getState()) &&
                Objects.equals(getCity(), zips.getCity()) &&
                Objects.equals(getLat(), zips.getLat()) &&
                Objects.equals(getLng(), zips.getLng());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getZip(),
                getState(),
                getCity(),
                getLat(),
                getLng());
    }
}