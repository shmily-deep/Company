package Domain;

public class PC implements Equipment {
    private String moudle; // 机器型号
    private String display; //

    public PC() {
    }

    public PC(String moudle, String display) {
        this.moudle = moudle;
        this.display = display;
    }

    public String getMoudle() {
        return moudle;
    }

    public void setMoudle(String moudle) {
        this.moudle = moudle;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDscription() {
        return moudle + "(" + display + ")";
    }
}
