package com.android.room.database.service.serviceImpl;

import android.content.Context;

import com.android.room.database.db.AppDatabase;
import com.android.room.database.db.dao.EmployeeDao;
import com.android.room.database.db.entity.Employee;
import com.android.room.database.service.UserService;

import java.util.List;

/**
 * Created by dinakar.maurya on 25-01-2018.
 */

/**
 * writing my own impls
 */
public class UserServiceImpl implements UserService {

    private EmployeeDao userDao;

    public UserServiceImpl(Context context) {
        userDao = AppDatabase.getInstance(context).userDao();
    }

    @Override
    public List<Employee> getAll() {
        return userDao.getAll();
    }

    @Override
    public void insertAll(Employee... employees) {
        userDao.insertAll(employees);
    }

    @Override
    public List<Employee> getEmployeeBySite(int siteID) {
       return userDao.findBooksBorrowedByName(siteID);
    }
}
