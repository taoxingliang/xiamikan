package com.video.xiamikan.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class FilmUrlEntity implements Serializable {
    private long id;
    private long film_id;
    private int film_url_type;
    private String film_url;
    private String film_url_info;
    private Timestamp film_url_updatetime;

    public void setId(long id) {
        this.id = id;
    }

    public void setFilm_id(long film_id) {
        this.film_id = film_id;
    }

    public void setFilm_url_type(int film_url_type) {
        this.film_url_type = film_url_type;
    }

    public void setFilm_url(String film_url) {
        this.film_url = film_url;
    }

    public void setFilm_url_info(String film_url_info) {
        this.film_url_info = film_url_info;
    }

    public void setFilm_url_updatetime(Timestamp film_url_updatetime) {
        this.film_url_updatetime = film_url_updatetime;
    }

    public long getId() {
        return id;
    }

    public long getFilm_id() {
        return film_id;
    }

    public int getFilm_url_type() {
        return film_url_type;
    }

    public String getFilm_url() {
        return film_url;
    }

    public String getFilm_url_info() {
        return film_url_info;
    }

    public Timestamp getFilm_url_updatetime() {
        return film_url_updatetime;
    }

    @Override
    public String toString() {
        return "FilmUrlEntity{" +
                "id=" + id +
                ", film_id=" + film_id +
                ", film_url_type=" + film_url_type +
                ", film_url='" + film_url + '\'' +
                ", film_url_info='" + film_url_info + '\'' +
                ", film_url_updatetime=" + film_url_updatetime +
                '}';
    }
}
