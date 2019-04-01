public class ex4_ {

    public static void main(String[] args) {
       // task1(50, 20);
        task2(2,13);


       /* int n = 5;
        int z = 0;*/
    /*    for (int i = 1; i < n; i++) {
            z+=i;
        }
        System.out.println(z);
    }*/


    }

    private static void task2(int a, int b) {
        a= (a/2)*2+1; // превращение в нечетное
        for (int i = a; i <= b ; i+=2) {
            System.out.print(i +" ");
        }

    }

    private static void task1(int begin, int end) {

        for (int i = begin; i >= end; i--) {
            System.out.print(i +" ");
        }

    }
}