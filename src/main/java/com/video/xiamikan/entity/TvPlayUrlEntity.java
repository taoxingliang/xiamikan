package com.video.xiamikan.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class TvPlayUrlEntity implements Serializable {
    private long id;
    private long tv_id;
    private int tv_index;
    private int tv_url_type;
    private String tv_url;
    private String tv_url_info;
    private Timestamp tv_url_updatetime;

    public void setId(long id) {
        this.id = id;
    }

    public void setTv_id(long tv_id) {
        this.tv_id = tv_id;
    }

    public void setTv_index(int tv_index) {
        this.tv_index = tv_index;
    }

    public void setTv_url_type(int tv_url_type) {
        this.tv_url_type = tv_url_type;
    }

    public void setTv_url(String tv_url) {
        this.tv_url = tv_url;
    }

    public void setTv_url_info(String tv_url_info) {
        this.tv_url_info = tv_url_info;
    }

    public void setTv_url_updatetime(Timestamp tv_url_updatetime) {
        this.tv_url_updatetime = tv_url_updatetime;
    }

    public long getId() {
        return id;
    }

    public long getTv_id() {
        return tv_id;
    }

    public int getTv_index() {
        return tv_index;
    }

    public int getTv_url_type() {
        return tv_url_type;
    }

    public String getTv_url() {
        return tv_url;
    }

    public String getTv_url_info() {
        return tv_url_info;
    }

    public Timestamp getTv_url_updatetime() {
        return tv_url_updatetime;
    }

    @Override
    public String toString() {
        return "TvPlayUrlEntity{" +
                "id=" + id +
                ", tv_id=" + tv_id +
                ", tv_index=" + tv_index +
                ", tv_url_type=" + tv_url_type +
                ", tv_url='" + tv_url + '\'' +
                ", tv_url_info='" + tv_url_info + '\'' +
                ", tv_url_updatetime=" + tv_url_updatetime +
                '}';
    }
}
