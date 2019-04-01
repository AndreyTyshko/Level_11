package ex5;

import java.text.MessageFormat;

public class mainClass {


    public static void main(String[] args) {

//        Worker worker1 = new Worker("Ivan ", "адвокат ", "ivan@bk.ru ", "+7 555 111 11 11 ", 25000, 28);
//        Worker worker2 = new Worker("Vasily ", "адвокат ", "ivan@bk.ru ", "+7 555 222 22 1221 ", 500000, 30);
//        Worker worker3 = new Worker("Georgy ", "адвокат ", "ivan@bk.ru ", "+7 555 333 33 33 ", 850000, 31);
//        Worker worker4 = new Worker("Dmitry ", "адвокат ", "ivan@bk.ru ", "+7 555 444 44 44 ", 350000, 41);
//        Worker worker5 = new Worker("Sergey ", "адвокат ", "ivan@bk.ru ", "+7 555 555 55 55 ", 450000, 45);
//        worker1.info();
//        worker2.info();
//        worker3.info();
//        worker4.info();
//        worker5.info();


        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Ivan ", "адвокат ", "ivan@bk.ru ", "+7 555 111 11 11 ", 25000, 28);
        workers[1] = new Worker("Vasily ", "адвокат ", "ivan@bk.ru ", "+7 555 222 22 1221 ", 500000, 30);
        workers[2] = new Worker("Georgy ", "адвокат ", "ivan@bk.ru ", "+7 555 333 33 33 ", 850000, 31);
        workers[3] = new Worker("Dmitry ", "адвокат ", "ivan@bk.ru ", "+7 555 444 44 44 ", 350000, 41);
        workers[4] = new Worker("Sergey ", "адвокат ", "ivan@bk.ru ", "+7 555 555 55 55 ", 450000, 45);

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].age > 40) {
                workers[i].info();
            }
        }
    }
}
