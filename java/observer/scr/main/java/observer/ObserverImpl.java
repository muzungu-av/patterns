package observer;

public class ObserverImpl implements Observer {

    private String name;
    private String message;

    public ObserverImpl(String name) {
        this.name = name;
        this.message = "";
    }

    @Override
    public void update(Integer value) {
        message = "(" + this.name + ") Got a new value - " + value;
        System.out.println(this.message);
    }

    public String getMessage() {
        return message;
    }
}
