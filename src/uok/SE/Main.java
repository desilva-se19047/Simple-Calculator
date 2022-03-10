package uok.SE;

import java.util.Scanner;

public class Main {

    public static int getSum(int x,int y) {
        int tot = x+y;
        return tot;
    }
    public static int getDeff(int x,int y){
        int diff = x-y;
        return diff;
    }
    public static int getMulti(int x,int y){
        int multi = x*y;
        return multi;
    }
    public static int getDivid(int x,int y){
        int divid = (x/y);
        return divid;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Hello!");
        System.out.println();
        System.out.println("For Exit Enter 0 and For continue Enter Any Number!!!");
        System.out.print("Press your choice : ");
        int e = input.nextInt();
        System.out.println();
        while (e != 0) {
            System.out.println("What Do You want to calculate?");
            System.out.println();
            System.out.println("Press num 1 for sum");
            System.out.println("Press num 2 for diff");
            System.out.println("Press num 3 for multi");
            System.out.println("Press num 4 for divid");
            System.out.println();
            System.out.print("Press your option: ");
            int o = input.nextInt();
            while (o != 1 && o != 2 && o != 3 && o != 4) {
                System.out.println("please Press valid option!!! ");
                System.out.print("Press your option: ");
                o = input.nextInt();
            }

            System.out.println();
            System.out.print("Enter 1st Number : ");
            int x = input.nextInt();
            System.out.print("Enter 2nd Number : ");
            int y = input.nextInt();
            System.out.println();

            switch (o) {
                case (1):
                    int temp1 = getSum(x, y);
                    System.out.println("Sum is : " + temp1);
                    break;
                case (2):
                    int temp2 = getDeff(x, y);
                    System.out.println("Difference is : " + temp2);
                    break;
                case (3):
                    int temp3 = getMulti(x, y);
                    System.out.println("Multiplication is : " + temp3);
                    break;
                default:
                    int temp4 = getDivid(x, y);
                    System.out.println("Divide is : " + temp4);
            }

            System.out.println();
            System.out.println("For Exit Enter 0 and For continue Enter Any Number!!!");
            System.out.print("Press your choice : ");
            e = input.nextInt();

        }
    }
}
