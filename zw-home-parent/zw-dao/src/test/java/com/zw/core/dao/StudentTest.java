package com.zw.core.dao;

import com.zw.core.model.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by zha on 2017/7/7.
 */
public class StudentTest {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("A", 20L));
        students.add(new Student("B", 10L));
        students.add(new Student("C", 30L));

        Collections.sort(students);

        System.out.println("students = " + students);

    }

}
