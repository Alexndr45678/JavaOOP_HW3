public class Director {
    private String name;
    private int age;
    private Deputy deputy;

    public Director(String name, int age, Deputy deputy) {
        this.name = name;
        this.age = age;
        this.deputy = deputy;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Deputy getDeputy() {
        return deputy;
    }

    @Override
    public String toString() {
        return "Director: " + name + ", age: " + age + ", \n" + deputy;
    }
}
