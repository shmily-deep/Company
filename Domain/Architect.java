package Domain;

public class Architect extends Designer {
    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, Double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String getDetailsForTeam() {
        return getNumberId() + "/" + getId() + "\t\t" + getName() + "\t" +
                getAge() + "\t\t" + getSalary() + "\t架构师\t" + getBonus() + "\t" + getStock();
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus().getName() + "\t" +
                getBonus() + "\t"+stock+"\t" + getEquipment().getDscription();
    }
}
