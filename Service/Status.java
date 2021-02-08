package Service;

public class Status {

    private final String name;
    private Status(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATON = new Status("VOCATION");
}
