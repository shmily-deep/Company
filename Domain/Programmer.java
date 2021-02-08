package Domain;

import Service.Status;

public class Programmer extends Employee {
    private int numberId;
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, Double salary,Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getNumberId() {
        return numberId;
    }

    public void setNumberId(int numberId) {
        this.numberId = numberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
    public String getDetailsForTeam(){
        return numberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t\t" + getSalary() + "\t程序员";
    }

    @Override
    public String toString() {
        return super.toString() + "\t程序员\t" +status.getName() + "\t\t\t\t\t" + equipment.getDscription();
    }
}
