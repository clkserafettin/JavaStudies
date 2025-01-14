package Java_101.MaasHesaplayici;

public class Employee {

    String name;
    double salary;
    int workHours;
    int yearOfHire;

    public Employee(String name, int salary, int workHours, int yearOfHire) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.yearOfHire = yearOfHire;
    }

    public double tax() {
        double tax;
        if (this.salary > 1000) {
            tax = this.salary * 0.03;
            return tax;
        }
        if (this.salary < 1000) {
            tax = 0;
            return tax;
        }
        return 0;
    }

    public int bonus() {
        int bonus;
        if (this.workHours > 40) {
            bonus = (this.workHours - 40) * 30;
            return bonus;
        }
        return 0;
    }

    public double raiseSalary() {
        int workingYear = 2021 - yearOfHire;
        double raiseSalary;
        if (workingYear < 10) {
            raiseSalary = this.salary * 0.05;
        } else if (workingYear > 9 && workingYear < 20) {
            raiseSalary = this.salary * 0.10;
        } else {
            raiseSalary = this.salary * 0.15;
        }
        return raiseSalary;
    }

    public String toString() {
        double calculatedTax = tax();
        int calculatedBonus = bonus();
        double calculatedRaise = raiseSalary();
        return "Adı : " + this.name
                + "\nMaaşı : " + this.salary
                + "\nÇalışma Saati : " + this.workHours
                + "\nBaşlangıç Yılı : " + this.yearOfHire
                + "\nVergi : " + tax()
                + "\nBonus : " + bonus()
                + "\nMaaş Artışı : " + raiseSalary()
                + "\nVergi ve Bonuslar ile Birlikte Maaş : " + (this.salary + calculatedBonus - calculatedTax)
                + "\nToplam Maaş : " + (this.salary + calculatedBonus + calculatedRaise - calculatedTax);
    }
}
