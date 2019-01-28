package com.video.xiamikan.entity;

import java.io.Serializable;

/**
 * 对应主页表
 */
public class HomePageEntity implements Serializable {

    private Long id;

    private int category;

    private String categoryName;

    private int priority;

    private Long item1;

    private Long item2;
    private Long item3;
    private Long item4;
    private Long item5;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setItem1(Long item1) {
        this.item1 = item1;
    }

    public void setItem2(Long item2) {
        this.item2 = item2;
    }

    public void setItem3(Long item3) {
        this.item3 = item3;
    }

    public void setItem4(Long item4) {
        this.item4 = item4;
    }

    public void setItem5(Long item5) {
        this.item5 = item5;
    }

    public Long getId() {
        return id;
    }

    public int getCategory() {
        return category;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getPriority() {
        return priority;
    }

    public Long getItem1() {
        return item1;
    }

    public Long getItem2() {
        return item2;
    }

    public Long getItem3() {
        return item3;
    }

    public Long getItem4() {
        return item4;
    }

    public Long getItem5() {
        return item5;
    }

    @Override
    public String toString() {
        return "HomePage{" +
                "id=" + id +
                ", category=" + category +
                ", categoryName='" + categoryName + '\'' +
                ", priority=" + priority +
                ", item1=" + item1 +
                ", item2=" + item2 +
                ", item3=" + item3 +
                ", item4=" + item4 +
                ", item5=" + item5 +
                '}';
    }
}
