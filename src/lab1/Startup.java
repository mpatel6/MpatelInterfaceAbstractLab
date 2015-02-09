/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Ankita
 */
public class Startup {
    
     public static void main(String[] args) {
         
          Course[] course = { new AdvancedJavaCourse("Advanced Java", "152-135",4.0), 
                               new IntroJavaCourse("Java Programming", "152-134",3.0), 
                               new IntroToProgrammingCourse("Intro to Programing","152-107",2.0) };
     
               
         ((AdvancedJavaCourse)course[0]).setPrerequisite("152-134");
         ((IntroJavaCourse)course[1]).setPrerequisite("152-107");
         
         for(Course a: course){
             
         
         System.out.println("Course Name: "+"\t" + a.getCourseName());
         System.out.println("Course Number: " +"\t"+ a.getCourseNumber());
         System.out.println("Course Credits: "+a.getCredits()+"\n");
         
        // Prerequisite method is only present in select sub classes and will give cast exception. 
        // This shows that using Liskov principle (using abstract type to represent subclass objects) cannot access methods present in subclass.
        // This can be solved if we can identify the object class and cast is accordingly
        // System.out.println(((AdvancedJavaCourse)a).getPrerequisite());
         
     }
         
      System.out.println("Prerequisite for "+course[0].getCourseName()+" is "+((AdvancedJavaCourse)course[0]).getPrerequisite());
     
      
      /* The good thing about this architecture is that it allows common properties to be defined in 
      the super class. It also allows us to add concrete method without breaking the code. The bad thing
      is that there is a risk of inheriting poor quality code and inheriting unnecessary methods.
      */
     }
}
