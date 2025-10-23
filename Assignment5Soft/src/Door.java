public class Door {
    private boolean locked = true;
    private boolean open = false;

    public void unlock() {
        locked = false;
        System.out.println("Door unlocked.");
    }

    public void lock() {
        locked = true;
        System.out.println("Door locked.");
    }

    public void open() {
        if (!locked) {
            open = true;
            System.out.println("Door opened. Welcome home!");
        } else {
            System.out.println("Door is locked. Cannot open.");
        }
    }

    public void close() {
        open = false;
        System.out.println("Door closed.");
    }
}
