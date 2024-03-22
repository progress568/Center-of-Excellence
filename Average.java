import java.util.Scanner;

class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int n1 = sc.nextInt();
        System.out.println("Enter number2");
        int n2 = sc.nextInt();
        System.out.println("Enter number3");
        int n3 = sc.nextInt();
        System.out.println("Enter number4");
        int n4 = sc.nextInt();
        System.out.println("Average of four numbers");
        int n = n1 + n2 + n3 + n4;
        double avg= (double) n / 4;
        System.out.println("average of four numbers"+avg);  
    }
}