package com.video.xiamikan.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class AnimationUrlEntity implements Serializable {
    private long id;
    private long am_id;
    private int am_url_type;
    private String am_url;
    private String am_url_info;
    private Timestamp am_url_updatetime;

    public long getId() {
        return id;
    }

    public long getAm_id() {
        return am_id;
    }

    public int getAm_url_type() {
        return am_url_type;
    }

    public String getAm_url() {
        return am_url;
    }

    public String getAm_url_info() {
        return am_url_info;
    }

    public Timestamp getAm_url_updatetime() {
        return am_url_updatetime;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAm_id(long am_id) {
        this.am_id = am_id;
    }

    public void setAm_url_type(int am_url_type) {
        this.am_url_type = am_url_type;
    }

    public void setAm_url(String am_url) {
        this.am_url = am_url;
    }

    public void setAm_url_info(String am_url_info) {
        this.am_url_info = am_url_info;
    }

    public void setAm_url_updatetime(Timestamp am_url_updatetime) {
        this.am_url_updatetime = am_url_updatetime;
    }

    @Override
    public String toString() {
        return "AnimationUrlEntity{" +
                "id=" + id +
                ", am_id=" + am_id +
                ", am_url_type=" + am_url_type +
                ", am_url='" + am_url + '\'' +
                ", am_url_info='" + am_url_info + '\'' +
                ", am_url_updatetime=" + am_url_updatetime +
                '}';
    }
}
