package com.theironyard.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Set up Student list
        List<Student> studentList1 = new ArrayList<Student>();
        List<Student> studentList2 = new ArrayList<Student>();
        List<Student> studentList3 = new ArrayList<Student>();

        Student student1 = new Student("Moonie", "Sanders", 45, 1);
        Student student2 = new Student("Bernie", "Trouble", 67, 1);
        Student student3 = new Student("Chessie", "King", 43, 1);
        Student student4 = new Student("Cassie", "Booshie", 13, 1);
        Student student5 = new Student("Babe", "Sanders", 45, 1);
        Student student6 = new Student("Harold", "Kumar", 89, 1);
        Student student7 = new Student("Kumar", "Ratish", 87, 1);
        Student student8 = new Student("Shoe", "String", 29, 1);
        Student student9 = new Student("Deer", "Malaay", 83, 1);
        Student student10 = new Student("Pickel", "Eater", 26, 1);
        Student student11 = new Student("Wawa", "Bahneilhelm", 40, 1);
        Student student12 = new Student("Hakar", "Store", 35, 1);
        Student student13 = new Student("Farrah", "Petahulangan", 37, 1);
        Student student14 = new Student("Jester", "King", 93, 1);
        Student student15 = new Student("Mariah", "Carey", 50, 1);

        studentList1.add(0, student1);
        studentList1.add(1, student2);
        studentList1.add(2, student3);
        studentList1.add(3, student4);
        studentList1.add(4, student5);
        studentList2.add(0, student6);
        studentList2.add(1, student7);
        studentList2.add(2, student8);
        studentList2.add(3, student9);
        studentList2.add(4, student10);
        studentList3.add(0, student11);
        studentList3.add(1, student12);
        studentList3.add(2, student13);
        studentList3.add(3, student14);
        studentList3.add(4, student15);

        //Set up Teacher list
        List<Teacher> teacherList = new ArrayList<>();

        Teacher teacher1 = new Teacher("Benjamin", "Button", 91, 1);
        Teacher teacher2 = new Teacher("Lucas", "Gershtig", 62, 1);
        Teacher teacher3 = new Teacher("Michael", "Hollingham", 47, 1);

        teacherList.add(0, teacher1);
        teacherList.add(1, teacher2);
        teacherList.add(2, teacher3);

        //Setup a Set for studentList, then Map Teachers to Students.
        Set<Student> studentSet1 = new HashSet<Student>(studentList1);
        Set<Student> studentSet2 = new HashSet<Student>(studentList2);
        Set<Student> studentSet3 = new HashSet<Student>(studentList3);

        // Each Teacher will have 5 different students in a HashSet.
        Map<Teacher, Set<Student>> teacherHashMap = new HashMap<>();

        addStudentToTeacherMap(teacherHashMap, teacherList.get(0), studentSet1);
        addStudentToTeacherMap(teacherHashMap, teacherList.get(1), studentSet2);
        addStudentToTeacherMap(teacherHashMap, teacherList.get(2), studentSet3);


        //Print out the map keys in a for loop (use the keySet() method).
        for (Teacher key : teacherHashMap.keySet()) {
            System.out.println(key);
            System.out.println(teacherHashMap.get(key));
        }


        //Print out the map values in a for loop (use the values() method).
        for (Set studentSet : teacherHashMap.values()) {
            System.out.println(studentSet);
        }

        //Print out the map entries in a for loop (use the entrySet() method).
        for (Map.Entry<Teacher, Set<Student>> entry : teacherHashMap.entrySet()) {
            Teacher t = entry.getKey();
            Set<Student> studs = entry.getValue();
            System.out.println(t);
            System.out.println(studs);
        }
    }

    public static void addStudentToTeacherMap(Map<Teacher, Set<Student>> teacherMap, Teacher teach, Set studSet) {
            //teacherHashMap.put(teacherList.get(0), studentSet1);
            teacherMap.put(teach, studSet);
    }
}
