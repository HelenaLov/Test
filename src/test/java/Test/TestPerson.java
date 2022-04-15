package Test;

import org.testng.annotations.Test;

public class TestPerson {

    @Test
    public void doit() {
        System.out.println("Hello, my name is" + name + ".My age is " + age + ".And my speciality is " + speciality);
        System.out.println();

        TestEngineer engineerProgrammer = new TestEngineer("Jacky", 18);
        System.out.println(engineerProgrammer.engeineerName + ":" + engineerProgrammer.age);

        TestEngineer engineerQA = new TestEngineer("Amanda", 30);
        System.out.println(engineerQA.engeineerName + ":" + engineerQA.age);

        TestEngineer engineerSantechnic = new TestEngineer("Ihor", 55);
        System.out.println(engineerSantechnic.engeineerName + ":" + engineerSantechnic.age);

        TestEngineer defaultEngineer = new TestEngineer();
    }

    int age = 20;
    String name = "Daryna";
    String speciality = "Automation";
}
