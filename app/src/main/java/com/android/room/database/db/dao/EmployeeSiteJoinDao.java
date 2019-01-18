package com.android.room.database.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.android.room.database.db.entity.Employee;
import com.android.room.database.db.entity.EmployeeSite;
import com.android.room.database.db.entity.Site;

import java.util.List;

@Dao
public interface EmployeeSiteJoinDao {
    @Insert
    void insert(EmployeeSite employeeSite);

    @Insert
    void insertAll(EmployeeSite... employeeSites);

//    @Query("SELECT * FROM employee INNER JOIN employee_site_join ON employee.empolyeeID=employee_site_join.empolyeeID WHERE employee_site_join.siteId=:siteID")
//    List<Employee> getEmployeeBySite(final int siteID);
}