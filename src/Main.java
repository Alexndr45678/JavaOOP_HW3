import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();

        Person person = new Person("James", 23, 2000);
        Deputy dep = new Deputy("Leo", 41, person);
        Director dir = new Director("Mark", 46, dep);
        Owner owner = new Owner("Alexandr", 50, dir);


        worker.addNewWorkers(owner);
        System.out.println(owner + "\n");
        worker.addNewWorkers(dir);
        System.out.println(dir + "\n");
        worker.addNewWorkers(dep);
        System.out.println(dep + "\n");
        worker.addNewWorkers(person);
        System.out.println(person + "\n");

//        Iterator people = worker;
//        while (people.hasNext()){
//            System.out.println(people.next());
//        }
    }
}