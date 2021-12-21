package com.bawei.database.My.BeanDao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.bawei.data_resource.bean.FoodBean;
import com.bawei.database.My.db.DaoSession;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "FOOD_BEAN".
*/
public class FoodBeanDao extends AbstractDao<FoodBean, Long> {

    public static final String TABLENAME = "FOOD_BEAN";

    /**
     * Properties of entity FoodBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Myid = new Property(0, long.class, "myid", true, "_id");
        public final static Property Title = new Property(1, String.class, "title", false, "TITLE");
        public final static Property Pic = new Property(2, String.class, "pic", false, "PIC");
    }


    public FoodBeanDao(DaoConfig config) {
        super(config);
    }
    
    public FoodBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"FOOD_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ," + // 0: myid
                "\"TITLE\" TEXT," + // 1: title
                "\"PIC\" TEXT);"); // 2: pic
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"FOOD_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, FoodBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getMyid());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String pic = entity.getPic();
        if (pic != null) {
            stmt.bindString(3, pic);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, FoodBean entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getMyid());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(2, title);
        }
 
        String pic = entity.getPic();
        if (pic != null) {
            stmt.bindString(3, pic);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public FoodBean readEntity(Cursor cursor, int offset) {
        FoodBean entity = new FoodBean( //
            cursor.getLong(offset + 0), // myid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // title
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // pic
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, FoodBean entity, int offset) {
        entity.setMyid(cursor.getLong(offset + 0));
        entity.setTitle(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPic(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(FoodBean entity, long rowId) {
        entity.setMyid(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(FoodBean entity) {
        if(entity != null) {
            return entity.getMyid();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(FoodBean entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
