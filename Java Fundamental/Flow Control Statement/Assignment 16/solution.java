/**
 *  Write a program to print * in Floyds format (using for and while loop)
 *    *
 *    *  *
 *    *  *   *
 */

class solution{
    public static void main(String[] args) {
        int n = 5;
        System.out.print("By Using For Loop");
        for(int i = 0 ; i < n ; i++){
            for(int j = 0; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("By Using For and While Loop");

        for (int i = 0; i < n; i++) {
            int j = 0;
            while(j < i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }

    }
}