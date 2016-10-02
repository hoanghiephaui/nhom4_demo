package com.example.hiep.bai13_2;

/**
 * Created by hiep on 22/09/2016.
 */
public class EmployeeFullTime extends Employee {

    @Override
    public double TinhLuong() { return 500; }
    @Override
    public String toString() {

        return super.toString() +"=>FullTime="+TinhLuong();
    }
}
