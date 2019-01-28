package com.video.xiamikan.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 对应电影表
 */
public class FilmEntity implements Serializable {

    private Long id;
    private String film_name;//电影名称

    private String film_performer;//电影演员
    private String film_director;//电影导演

    private int film_type;//电影类型：喜剧，嫌疑
    private int film_national_area;//电影国家
    private String  file_poster_url;//电影海报url
    private int film_release_time;//'电影年份：如：2018',
    private int film_length;//'电影长度：分钟，如117',
    private String film_alias;// '电影别名'
    private String IMDb_id;//'IMDb id 或者url',
    private String douban_id;//'豆瓣id 或者url',
    private String film_introduction;// '电影简介',
    private Float douban_level;//'豆瓣评分',
    private int film_subscriber_num;//'订阅人数',
    private Timestamp film_create_time;//'电影创建时间'
    private Timestamp film_update_time;//'电影更新时间'

    public void setId(Long id) {
        this.id = id;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
    }

    public void setFilm_performer(String film_performer) {
        this.film_performer = film_performer;
    }

    public void setFilm_director(String film_director) {
        this.film_director = film_director;
    }

    public void setFilm_type(int film_type) {
        this.film_type = film_type;
    }

    public void setFilm_national_area(int film_national_area) {
        this.film_national_area = film_national_area;
    }

    public void setFile_poster_url(String file_poster_url) {
        this.file_poster_url = file_poster_url;
    }

    public void setFilm_release_time(int film_release_time) {
        this.film_release_time = film_release_time;
    }

    public void setFilm_length(int film_length) {
        this.film_length = film_length;
    }

    public void setFilm_alias(String film_alias) {
        this.film_alias = film_alias;
    }

    public void setIMDb_id(String IMDb_id) {
        this.IMDb_id = IMDb_id;
    }

    public void setDouban_id(String douban_id) {
        this.douban_id = douban_id;
    }

    public void setFilm_introduction(String film_introduction) {
        this.film_introduction = film_introduction;
    }

    public void setDouban_level(Float douban_level) {
        this.douban_level = douban_level;
    }

    public void setFilm_subscriber_num(int film_subscriber_num) {
        this.film_subscriber_num = film_subscriber_num;
    }

    public void setFilm_create_time(Timestamp film_create_time) {
        this.film_create_time = film_create_time;
    }

    public void setFilm_update_time(Timestamp film_update_time) {
        this.film_update_time = film_update_time;
    }

    public Long getId() {
        return id;
    }

    public String getFilm_name() {
        return film_name;
    }

    public String getFilm_performer() {
        return film_performer;
    }

    public String getFilm_director() {
        return film_director;
    }

    public int getFilm_type() {
        return film_type;
    }

    public int getFilm_national_area() {
        return film_national_area;
    }

    public String getFile_poster_url() {
        return file_poster_url;
    }

    public int getFilm_release_time() {
        return film_release_time;
    }

    public int getFilm_length() {
        return film_length;
    }

    public String getFilm_alias() {
        return film_alias;
    }

    public String getIMDb_id() {
        return IMDb_id;
    }

    public String getDouban_id() {
        return douban_id;
    }

    public String getFilm_introduction() {
        return film_introduction;
    }

    public Float getDouban_level() {
        return douban_level;
    }

    public int getFilm_subscriber_num() {
        return film_subscriber_num;
    }

    public Timestamp getFilm_create_time() {
        return film_create_time;
    }

    public Timestamp getFilm_update_time() {
        return film_update_time;
    }

    @Override
    public String toString() {
        return "FilmEntity{" +
                "id=" + id +
                ", film_name='" + film_name + '\'' +
                ", film_performer='" + film_performer + '\'' +
                ", film_director='" + film_director + '\'' +
                ", film_type=" + film_type +
                ", film_national_area=" + film_national_area +
                ", file_poster_url='" + file_poster_url + '\'' +
                ", film_release_time=" + film_release_time +
                ", film_length=" + film_length +
                ", film_alias='" + film_alias + '\'' +
                ", IMDb_id='" + IMDb_id + '\'' +
                ", douban_id='" + douban_id + '\'' +
                ", film_introduction='" + film_introduction + '\'' +
                ", douban_level=" + douban_level +
                ", film_subscriber_num=" + film_subscriber_num +
                ", film_create_time=" + film_create_time +
                ", film_update_time=" + film_update_time +
                '}';
    }
}
