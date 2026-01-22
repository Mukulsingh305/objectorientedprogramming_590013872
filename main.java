 import java.util.Scanner;
class Main {
    int sum = 0;
    int[] arr = new int[5];
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Main as = new Main();

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            as.arr[i] = s.nextInt();
            as.sum +=as.arr[i];
            
            
        }

       System.out.println("Sum of array:"+as.sum);
    s.close();
    }
}