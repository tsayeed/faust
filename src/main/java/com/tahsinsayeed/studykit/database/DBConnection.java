package com.tahsinsayeed.studykit.database;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.tahsinsayeed.studykit.model.*;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static final String url = "jdbc:hsqldb:file:testdb";

    private static  DBConnection INSTANCE = null;

    private  ConnectionSource connectionSource;

    private DBConnection(){
        try {
            connectionSource = new JdbcConnectionSource(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DBConnection getInstance(){
        if (INSTANCE == null){
            INSTANCE = new DBConnection();
        }

        return INSTANCE;
    }

    public ConnectionSource getConnectionSource(){
        return connectionSource;
    }


































    /*
    public int delete(Attendance row)
    public int delete(Object... parameters)
    public int deleteAll()
    public int deleteAll(Collection<Attendance> rows)
    public int deleteAllBatch(Collection<Attendance> rows)
    public int insert(Attendance row)
    public int insertAll(Collection<Attendance> rows)
    public int insertAllBatch(Collection<Attendance> rows)
    public int save(Attendance row)
    public int saveAll(Collection<Attendance> rows)
    public Attendance select(Object... primaryKeys)
    public List<Attendance> selectAll()
    public List<Attendance> selectAllCustom(String customSql, Object... parameters)
    public List<Attendance> selectAllWhere(String whereConditionName, Object... parameters)
    public List<Attendance> selectAllWhereOrdered(String whereConditionName, String orderByName, Object... parameters)
    public Attendance selectAvg(String expression)
    public Attendance selectCount(String expression, String whereConditionName, Object... parameters)
    public Attendance selectCount(String expression)
    public Attendance selectCustom(String customSql, Object... parameters)
    public Attendance selectMax(String expression, String whereConditionName, Object... parameters)
    public Attendance selectMax(String expression)
    public Attendance selectMin(String expression, String whereConditionName, Object... parameters)
    public Attendance selectMin(String expression)
    public Attendance selectSum(String expression, String whereConditionName, Object... parameters)
    public Attendance selectSum(String expression)
    public Attendance selectWhere(String whereConditionName, Object... parameters)
    public int update(Attendance row)
    public int updateAll(Collection<Attendance> rows)
    public int updateAllBatch(Collection<Attendance> rows)
     */



}
