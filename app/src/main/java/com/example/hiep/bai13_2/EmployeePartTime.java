package com.example.hiep.bai13_2;

/**
 * Created by hiep on 22/09/2016.
 */
public class EmployeePartTime extends Employee {
    @Override
    public double TinhLuong() {
        return 150;
    }
    @Override
    public String toString() {
        return super.toString() +" =>PartTime="+TinhLuong();
    }

}
