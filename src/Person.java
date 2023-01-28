import java.util.Iterator;

public class Person implements Iterator <String> {
    private String name;
    private int age;
    private int wages;

    public Person(String name, int age, int wages) {
        this.name = name;
        this.age = age;
        this.wages = wages;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWages() {
        return wages;
    }

    @Override
    public String toString() {
        return String.format("Person: %s, age: %d, wages: %d",name, age, wages);
    }
    int index;

    @Override
    public boolean hasNext() {
        return index ++ < 3;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                return String.format("Name: %s", name);
            case 2:
                return String.format("Age: %s", age);
            case 3:
                return String.format("Wages: %s", wages);
        }
        return name;
    }
}
