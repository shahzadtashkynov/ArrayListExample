package org.example;

import java.util.ArrayList;
import java.util.Objects;

class  Student{
    private String name;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, int age, int course,double avgGrade){
        this.name=name;
        this.age=age;
        this.course=course;
        this.avgGrade=avgGrade;
    }

    // overriding the method of to string
    @Override
    public String toString(){
        return "Student("+
                "'name = '" + name + "'," +
                "', age = '" + age +
                "', course = '" + course +
                "', avgGrade = '" + avgGrade+"');";
    }

//    // overriding equals method
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return
                age == student.age &&
                course == student.course &&
                Double.compare(avgGrade, student.avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }

}

public class ArrayListMethods2 {
    public static void main(String [] args){
        System.out.println("ArrayList methods 2");
        //creating Student object
        Student atamurat= new Student("Atamyrat",21,2,4);
        Student dowletbay= new Student("Dowletbay",27,1,3);
        Student amanmyrat= new Student("Amanmyrat",22,0,5);
        Student begmyrat= new Student("Begmyrat",25,2,3);
        Student sarygul = new Student("Sarygul",21,2,4);

        // Arraylist is a shrinkable array and can be automatically resized

        // Creating ArrayList of students;
        ArrayList<Student> sgtuStudents= new ArrayList<>();

        // adding elements to the arraylist
        sgtuStudents.add(atamurat);
        sgtuStudents.add(begmyrat);
        sgtuStudents.add(amanmyrat);
        sgtuStudents.add(dowletbay);

        // displaying the elements of Arraylist
        for (Student st:sgtuStudents){
            System.out.println(st);
        }

        // deleting item in ArrayList
        System.out.println(sgtuStudents);
        Student sarygul1 = new Student("Sarygul",21,2,4);

        sgtuStudents.remove(sarygul1);

        System.out.println(sgtuStudents);
    }
}
