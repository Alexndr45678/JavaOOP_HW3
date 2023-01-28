import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Worker implements Iterator {
    private List worker;

    public Worker() {
        worker = new ArrayList<>();
    }

    public List getWorker() {
        return worker;
    }
    public void addNewWorkers (Object object) {
        worker.add(object);
    }
    int index;
    @Override
    public boolean hasNext() {
        return index < worker.size();
    }

    @Override
    public Object next() {
        return worker.get(index++);
    }
}
