package ex5;

public class Worker {

    String name;
    String position;
    String eMail;
    String phone;
    int pay;
    int age;

    public Worker(String name, String position, String eMail, String phone, int pay, int age) {
        this.name = name;
        this.position = position;
        this.eMail = eMail;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }



    public void info() {
        System.out.println(" Имя Сотрудника: " + name + " | " + " должность сотрудника: " + position +" | " + " электронная почта: " + eMail +" | " + " Телефон: " + phone +" | " + " Зарплата: " + pay +" | " + " Возраст: " + age);
    }

}
