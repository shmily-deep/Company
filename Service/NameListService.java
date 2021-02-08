package Service;

import Domain.*;

import static Service.Data.*;

public class NameListService {
    private Employee employees[];

    public NameListService() {
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            Double bonus;
            int stock;
            switch (type) {
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case Data.PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case Data.DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case Data.ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
            }
        }
    }

    private Equipment createEquipment(int index) {
        int type = Integer.parseInt(EQUIPMENTS[index][0]);
        String model = EQUIPMENTS[index][1];
        switch (type){
            case PC:
                return new PC(model,EQUIPMENTS[index][2]);
            case NOTEBOOK:
                return new NoteBook(model,Double.parseDouble(EQUIPMENTS[index][2]));
            case PRINTER:
                return new Printer(model,EQUIPMENTS[index][2]);

        }
        return null;

    }


    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException{
        for(int i=0;i<employees.length;i++){
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }
}
