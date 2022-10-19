package com.ebebek;
public class Employee {
    String firstname;
    int salary; //Çalışanın maaş
    int workHours; //haftalık çalışma saati
    int hireYear; // İşe başlangıç yılı

    public Employee(String firstname,int salary, int workHours, int hireYear) {
        this.firstname = firstname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() { // Maaşa uygulanan version hesaplayacaktır.
        if (this.salary >= 1000) {
            return 1000 * 0.3;
        }
        return 0.0;
    }
//bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    public int bonus() {
        if (this.workHours >= 40) {
            int a = (this.workHours - 40) * 30;
            return a;
        }
        return 0;
    }

    public int raiseSalary() {
        int year=(2021 - this.hireYear);
        if (year < 10) {
            return (int) (salary*0.05);
        } else if (year>=10 && year<20) {
            return (int) (salary*0.10);}
        else {
            return (int) (salary*0.15);
        }
    }

    public String toString(){
        double total = salary -tax() + bonus() + raiseSalary();
        double tot = salary +bonus() - tax();
        return  "Adı : "+firstname + " \n"+
                "Maaşı : "+ salary + " \n"+
                "Çalışma Saati : "+ workHours+ " \n"+
                "Başlangıç Yılı : "+hireYear + " \n"+
                "Vergi : "+tax() + " \n"+
                "Bonus : "+bonus()+ " \n"+
                "Maaş artışı : "+raiseSalary() + " \n"+
                "Vergi ve Bonuslar ile birlikte maaş : "+tot + " \n"+
                "Toplam Maaş : "+total;

    }


}

/*public String toString(Employee employee){

        double total = salary -tax() + bonus() + raiseSalary();
        double tot = salary +bonus() - tax();
        System.out.println("Adı : "+firstname);
        System.out.println("Soyadı : "+lastname);
        System.out.println("Maaşı : "+ salary);
        System.out.println("Çalışma Saati : "+ workHours);
        System.out.println("Başlangıç Yılı : "+hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maaş artışı : "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : "+tot);
        System.out.println("Toplam Maaş : "+total);

        return null;
    }*/
