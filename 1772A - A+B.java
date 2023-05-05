import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            String operation = sc.next();
            int num1 = Integer.parseInt(String.valueOf(operation.charAt(0)));
            int num2 = Integer.parseInt(String.valueOf(operation.charAt(2)));
            System.out.println(num1+num2);
        }
    }
}