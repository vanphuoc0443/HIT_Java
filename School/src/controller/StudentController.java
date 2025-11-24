package controller;

import constant.Constant;
import model.Student;
import service.StudentService;
import utils.InputUtils;

import java.util.Scanner;


public class StudentController {
    private StudentService service;
    public StudentController(StudentService service) {
        this.service = service;
    }
    public void addStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println(Constant.MSG_INPUT_NAME);
        System.out.println(Constant.MSG_INPUT_AGE);
        System.out.println(Constant.MSG_INPUT_CLASS);
        String name = InputUtils.readString();
        int age = sc.nextInt();
        String className = sc.nextLine();
        Student student = new Student(name,age,className);
    }

    public void deleteStudent(){

    }
}


