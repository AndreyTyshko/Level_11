import java.lang.reflect.Array;
import java.util.Arrays;

public class ex2 {

    public static void main(String[] args) {
        task1();
        task2(0);
        task3();
        task4();
        task5();
        task6();

    }

    private static void task6() {
        System.out.println();
        System.out.println("Задание №6");
        int sum1 = 0;
        int sum2 = 0;
        int [] arr = {1, 1, 1, 1, 2, 2};
        for (int i = 0; i <arr.length ; i++ ) {

            sum1 += arr[i];
            sum2 = arr[i]+ arr[i] +1;
            System.out.print(sum1+ " ");
            System.out.print(sum2 + " ");
            System.out.println(sum2 == sum1);
        }
//        for (int j = arr.length -1; j >=0; j--) {
//            sum2 += arr[j];
//        }


//        System.out.println(sum2);
    }

    private static void task5() {
        System.out.println();
        System.out.println("Задание №5*");
        int [] arr = {-20, 5, 3, 2, 11, 5, 5, 25, 4, 8, 9, 1};
        int numMin = arr [0];
        int numMax = arr [0];
        int arrIndexMin =0;
        int arrIndexMax =0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] <= numMin) {
                numMin = arr[i];
                 arrIndexMin =i ;
            }
            if (arr[i] >= numMax) {
                numMax = arr[i];
                arrIndexMax = i;

            }
        }

        System.out.println("Элемент № " + arrIndexMin +  " массива с минимальным значением = " + numMin);
        System.out.println("Элемент № " + arrIndexMax +  " массива с максимальным значением = " + numMax);
    }

    private static void task4() {
        System.out.println();
        System.out.println("Задание 4");
        int [][] arr = new int [10][10];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (i==j){
                    arr [i][j] = 1;
                }
                if (i==(arr.length-1)-j){
                    arr [i][j] = 1;
                }
                System.out.print(arr [i][j]+" ");
            }
            System.out.println();
        }


    }

    private static void task3() {
        System.out.println();
        System.out.println("Задание 3");
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] <6){
                arr [i] = arr [i]*2;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void task2(int z) {
        System.out.println();
        System.out.println("Задание 2");
        int[] arr = new int[8];
        for (int i = 0; i <arr.length ; i++) {
            arr [i] = z;
            z += 3;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void task1() {
        System.out.println();
        System.out.println("Задание 1");
        int [] arr =  {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == 1)
            {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
