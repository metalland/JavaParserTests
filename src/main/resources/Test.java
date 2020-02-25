
public class Employee {

    private String name;
    private int age;

    //basic constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    /**
     * This method returns greeting with age and name
     */
    public void greeting() {
        //This line prints greeting
        System.out.println("Hello! My name is " + this.name + " and I am " + this.age);
    }
}