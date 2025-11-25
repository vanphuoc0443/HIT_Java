package com.model;

public class Tester extends  Employee implements IWorkable{
    private int bugsDetectedCount;

    public Tester() {
        super();
    }

    public Tester(String name, int age, double basicSalary, Device device, int bugsDetectedCount) {
        super(name, age, basicSalary, device);
        this.bugsDetectedCount = bugsDetectedCount;
    }

    public int getBugsDetectedCount() {
        return bugsDetectedCount;
    }

    public void setBugsDetectedCount(int bugsDetectedCount) {
        this.bugsDetectedCount = bugsDetectedCount;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + BASE_SALARY_RATE * bugsDetectedCount;
    }

    @Override
    public void work() {

    }

    @Override
    public String toString() {
        return "Tester{" +
                "bugsDetectedCount=" + bugsDetectedCount +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", basicSalary=" + basicSalary +
                ", device=" + device +
                ", BASE_SALARY_RATE=" + BASE_SALARY_RATE +
                '}';
    }
}
