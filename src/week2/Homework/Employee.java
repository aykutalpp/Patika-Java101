package week2.Homework;

public class Employee {
    String name;
    double salary = 0;
    int workHours = 0;
    int hireYear = 0;
    double taxAmount = 0;
    int bonus = 0;
    double incAmo;
    double netSalary;

    Employee (String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    void tax (){
        if (salary<1000){
            taxAmount = 0;
        }else {
            taxAmount = (salary*3)/100;
        }
    }
    void bonus (){
        if (workHours>40){
            bonus = (workHours-40)*30;
        }else bonus = 0;
    }
    void raiseSalary(){
        if (2021-hireYear < 10){
            incAmo = salary * 5/100;
        } else if (2021-hireYear >= 10 && 2021-hireYear <= 20) {
            incAmo = salary * 10/100;
        }else incAmo = salary * 15/100;
    }

    void printEmployee (){
        netSalary = salary - taxAmount + bonus;
        System.out.println("Name : " + this.name + "\nSalary = " + this.salary +
                "\nWorkHours = "+ this.workHours + "\nHire Year = "+this.hireYear +
                "\nBonus = " + this.bonus + "\nTax = "+ this.taxAmount + "\nSalary increase amount = " + this.incAmo +
                "\nNet salary = "+ this.netSalary + "\nSalary with salary increase = " + (this.netSalary + this.incAmo));
    }


}
