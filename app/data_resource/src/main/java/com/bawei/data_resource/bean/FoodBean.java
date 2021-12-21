package com.bawei.data_resource.bean;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Transient;

@Entity
public
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 14:26
 * 用途：
 */
class FoodBean {
    @Id(autoincrement = true)
    private long myid;
    public long getMyid() {
        return myid;
    }

    public void setMyid(long myid) {
        this.myid = myid;
    }

    @Transient
    private String id;

    private String title;
    private String pic;

    @Transient
    private String collect_num;

    @Transient
    private String food_str;

    @Transient
    private int num;

    @Generated(hash = 1362359980)
    public FoodBean(long myid, String title, String pic) {
        this.myid = myid;
        this.title = title;
        this.pic = pic;
    }

    @Generated(hash = 895705851)
    public FoodBean() {
    }


    @Override
    public String toString() {
        return "FoodBean{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", pic='" + pic + '\'' +
                ", collect_num='" + collect_num + '\'' +
                ", food_str='" + food_str + '\'' +
                ", num=" + num +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getCollect_num() {
        return collect_num;
    }

    public void setCollect_num(String collect_num) {
        this.collect_num = collect_num;
    }

    public String getFood_str() {
        return food_str;
    }

    public void setFood_str(String food_str) {
        this.food_str = food_str;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
