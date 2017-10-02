package com.tahsinsayeed.studykit.repository;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.tahsinsayeed.studykit.database.DBConnection;
import com.tahsinsayeed.studykit.model.Schedule;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

/**
 * Created by IMON on 9/1/2017.
 */
public class ScheduleRepository implements Repository<Schedule>  {

    private Dao<Schedule, String> scheduleDao;
    private final DBConnection connection;
    public ScheduleRepository(DBConnection connection){
        this.connection = connection;
        ConnectionSource connectionSource = connection.getConnectionSource();
        try {
            scheduleDao = DaoManager.createDao(connectionSource, Schedule.class);
        } catch (SQLException e) {

            e.printStackTrace();

        }
    }

    public ScheduleRepository() {
        this(DBConnection.getInstance());
    }


    @Override
    public Schedule get(String id) {

        try {
            return scheduleDao.queryForId(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Schedule> getAll() {
        try {
            return scheduleDao.queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public void save(Schedule objectToSave) {
        try {
            scheduleDao.create(objectToSave);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Schedule objectToUpdate) {
        try {
            scheduleDao.update(objectToUpdate);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Schedule objectToDelete) {
        try {
            scheduleDao.delete(objectToDelete);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}