package com.svip.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Student_Stream_App {

    public static void main(String[] args) {

        Student vidyadhar=new Student(101,"Vidyadhar",9860007013L,36);
        Student sachin=new Student(102,"sachin",0007013L,35);
        Student mayur=new Student(103,"mayur",146666L,26);

       List<Student> studentList= Arrays.asList(vidyadhar,sachin,mayur);
       Stream<Student> stream=studentList.stream();
      // stream.forEach(System.out::println);
       stream.forEach(student-> System.out.println(student));
    }
}
