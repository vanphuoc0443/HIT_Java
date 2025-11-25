package com.model;

public class Developer extends Employee implements IDebuggable, IWorkable{
    private int overtimeHours;

    public Developer(String name, int age, double basicSalary, Device device, int overtimeHours) {
        super(name, age, basicSalary, device);
        this.overtimeHours = overtimeHours;
    }

    public Developer() {
        super();
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + BASE_SALARY_RATE * overtimeHours;
    }

    @Override
    public void fixBug() {

    }

    @Override
    public void work() {

    }

    @Override
    public String toString() {
        return "Developer{" +
                "overtimeHours=" + overtimeHours +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", basicSalary=" + basicSalary +
                ", device=" + device +
                ", BASE_SALARY_RATE=" + BASE_SALARY_RATE +
                '}';
    }
}
