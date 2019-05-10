package SolidBadExample;

// Interface Segregation Principle - Bad example
public class SuperWorker implements IWorker {
    @Override
    public void work() { System.out.println("Working much more");
    }

    @Override
    public void eat() {
        System.out.println("Eating in lunch break");
    }
}
