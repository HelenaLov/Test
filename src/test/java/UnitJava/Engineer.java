package UnitJava;

public class Engineer {
    public Engineer(String n, int a) {
        age = a;
        engeineerName = n;
    }

    public Engineer() {

    }

    String engeineerName = "Jack";
    int age = 45;

    public void printName() {
        System.out.println("Name of this guy is" + engeineerName);
    }

}
