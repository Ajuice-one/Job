package com.bawei.data_resource.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 14:25
 * 用途：
 */
class GiftBean {
    @Id(autoincrement = true)
    private long myid;
    public long getMyid() {
        return myid;
    }

    public void setMyid(long myid) {
        this.myid = myid;
    }
    private int id;
    private String giftname;
    private String giftpath;
    private int price;

    @Generated(hash = 1893582791)
    public GiftBean(long myid, int id, String giftname, String giftpath,
            int price) {
        this.myid = myid;
        this.id = id;
        this.giftname = giftname;
        this.giftpath = giftpath;
        this.price = price;
    }

    @Generated(hash = 184047530)
    public GiftBean() {
    }

    @Override
    public String toString() {
        return "GiftBean{" +
                "id=" + id +
                ", giftname='" + giftname + '\'' +
                ", giftpath='" + giftpath + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGiftname() {
        return giftname;
    }

    public void setGiftname(String giftname) {
        this.giftname = giftname;
    }

    public String getGiftpath() {
        return giftpath;
    }

    public void setGiftpath(String giftpath) {
        this.giftpath = giftpath;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
