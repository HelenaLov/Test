package Test;

public class TestEngineer {
    public TestEngineer(String n, int a) {
        age = a;
        engeineerName = n;
    }

    public TestEngineer() {

    }

    String engeineerName = "Jack";
    int age = 45;

    public void printName() {
        System.out.println("Name of this guy is" + engeineerName);
    }
}
