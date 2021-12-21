package com.bawei.database.My.manager;

import android.content.Context;

import com.bawei.data_resource.MyUtil.MyException;
import com.bawei.database.My.db.DaoMaster;
import com.bawei.database.My.db.DaoSession;

import org.greenrobot.greendao.DaoException;

public
/**
 * 作者： 1904A 王天傲
 * 编写时间: 2021/9/25 15:47
 * 用途：
 */
class DBManager {
    private volatile static DBManager dbManager;
    private DaoMaster daoMaster;
    private Context context;
    private DaoSession session;

    public static DBManager getInstance() {
        if (dbManager == null) {
            synchronized (DBManager.class) {
                if (dbManager == null) {
                    dbManager = new DBManager();
                }
            }
        }
        return dbManager;
    }


    public void init(Context context) {
        this.context = context;
    }

    private DBManager() {

    }
    public DaoMaster getDaoMaster(){
        if (context == null) {
            try {
                throw new MyException("没有初始化数据库");
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
        if (daoMaster == null) {
            daoMaster = new DaoMaster(new DaoMaster
                    .DevOpenHelper(context, "database")
                    .getWritableDatabase());
        }
        return daoMaster;
    }

    public DaoSession getDaoSession() {
        if (daoMaster != null && session == null) {
            session = daoMaster.newSession();
        }
        return session;
    }

    public void close() {
        if (session != null) {
            session.clear();
            session = null;
        }
    }
}
