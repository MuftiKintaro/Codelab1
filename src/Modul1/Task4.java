package Modul1;


public class Task4 {
    public static int findMin(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}


    /*public static void main(String[] args) {
        int hasil1 = findMin(1, 2, 3);
        System.out.println("Scenario 1: Testing Number 3 with values of a,b,and c being 1,2,and 3 got: " + hasil1);

        int hasil2 = findMin(-1, -2, -3);
        System.out.println("Scenario 2: Testing Number -1  with values of a,b and c being -1,-2,and -3 got: " + hasil2);

        int hasil3 = findMin(0,0,-1);
        System.out.println("Scenario 3: Testing Number 0  with values of a,b and c being 0,0 and 1 got: " + hasil3);
    }
}*/
