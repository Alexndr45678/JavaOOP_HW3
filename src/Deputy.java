public class Deputy {
    private String name;
    private int age;
    private Person person;

    public Deputy(String name, int age, Person person) {
        this.name = name;
        this.age = age;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Deputy: " + name + ", age: " + age + ", \n" + person;
    }
}
