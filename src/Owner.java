public class Owner {
    private String name;
    private int age;
    private Director director;

    public Owner(String name, int age, Director director) {
        this.name = name;
        this.age = age;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Owner: " + name + ", age: " + age + ", \n" + director;
    }
}
