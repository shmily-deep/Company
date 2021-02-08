package Domain;

public class NoteBook implements Equipment {
    private String moudle; // 型号
    private Double price; //价格

    public NoteBook() {
    }

    public NoteBook(String moudle, Double price) {
        this.moudle = moudle;
        this.price = price;
    }

    public String getMoudle() {
        return moudle;
    }

    public void setMoudle(String moudle) {
        this.moudle = moudle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String getDscription() {
        return moudle + "(" + price + ")";
    }
}
