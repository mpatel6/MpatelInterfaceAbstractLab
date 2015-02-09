/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Ankita
 */
public class Startup {

    public static void main(String[] args) {

        Course[] courses = {new AdvancedJavaCourse("Advanced Java", "152-135", 4.0),
            new IntroJavaCourse("Java Programming", "152-134", 3.0),
            new IntroToProgrammingCourse("Intro to Programing", "152-107", 2.0)};

        ((AdvancedJavaCourse) courses[0]).setPrerequisites("152-134");
        ((AdvancedJavaCourse) courses[0]).setPrerequisites("152-107");

        for (Course a : courses) {

            System.out.println("Course Name: " + "\t" + a.getCourseName());
            System.out.println("Course Number: " + "\t" + a.getCourseNumber());
            System.out.println("Course Credits: " + a.getCredits() + "\n");

        }
        
// Liskov substitution is not useful to access methods that are not declared in superclass and are specific to a subclass
/* The good thing about this architecture is that it enforces a contract that all subclasses must implement, no risk of
        inheriting poor quality code. The bad thig is that eventhough there are commom properties and methods between 
        sub classes they all must be re-declared and implemented.
        */
    }
}
