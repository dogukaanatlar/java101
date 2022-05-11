public class Employee {
    String name;
    double salary;
    int workHours, hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void run() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - tax() + bonus()));
        System.out.println("Toplam Maaş : " + (this.salary + raiseSalary()));
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            return  0;
        }
    }

    double bonus() {
        if (this.workHours > 40) {
            return  (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        if (this.hireYear <= 9) {
            return this.salary * 0.05;
        } else if (this.hireYear <= 19) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.15;
        }
    }
}