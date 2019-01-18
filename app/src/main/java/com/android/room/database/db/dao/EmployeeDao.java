package com.android.room.database.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.android.room.database.db.entity.Employee;
import com.android.room.database.db.entity.Site;

import java.util.List;

    @Dao
    public interface EmployeeDao {
        @Query("SELECT * FROM employee")
        List<Employee> getAll();

        @Query("SELECT * FROM employee WHERE empolyeeID IN (:employeeIds)")
        List<Employee> loadAllByIds(int[] employeeIds);

        @Query("SELECT * FROM employee WHERE first_name LIKE :first AND "
                + "last_name LIKE :last LIMIT 1")
        Employee findByName(String first, String last);

        @Insert
        void insertAll(Employee... employee);

        @Delete
        void delete(Employee employee);


//        @Query("SELECT * FROM Site INNER JOIN Employee ON Site.siteID = Employee.employeeId WHERE Employee.employeeId IN (:id)")
//        EmployeeSiteModel getEmployessWithSiteID(int id);

        @Query("SELECT * FROM Employee INNER JOIN Site ON site.empolyeeID = Employee.empolyeeID  WHERE Site.siteID=:siteID"
        )
        List<Employee> findBooksBorrowedByName(int siteID);




    }
