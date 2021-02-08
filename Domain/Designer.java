package Domain;

public class Designer extends Programmer {
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, Double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getDetailsForTeam() {
        return getNumberId() + "/" + getId() + "\t" + getName() + "\t" +
                getAge() + "\t\t" + getSalary() + "\t设计师\t" + getBonus();
    }

    @Override
    public String toString() { // 想要调用爷爷类的toString,重写一个方法保存信息。
        return getDetails() + "\t设计师\t" + getStatus().getName() + "\t" + bonus + "\t\t\t" + getEquipment().getDscription();
    }
}
