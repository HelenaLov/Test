package UnitJava;

import org.testng.annotations.Test;

public class Person {

    @Test
    public void doit() {
        System.out.println("Hello, my name is" + name + ".My age is " + age + ".And my speciality is " + speciality);
        System.out.println();

        Engineer engineerProgrammer = new Engineer("Jacky", 18);
        System.out.println(engineerProgrammer.engeineerName + ":" + engineerProgrammer.age);

        Engineer engineerQA = new Engineer("Amanda", 30);
        System.out.println(engineerQA.engeineerName + ":" + engineerQA.age);

        Engineer engineerSantechnic = new Engineer("Ihor", 55);
        System.out.println(engineerSantechnic.engeineerName + ":" + engineerSantechnic.age);

        Engineer defaultEngineer = new Engineer();
    }

    int age = 20;
    String name = "Daryna";
    String speciality = "Automation";
}
