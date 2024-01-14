import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for(int i =1; i<=5;i++){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            double result = 0;
            switch (num2){
                case(0):
                    System.out.println("Деление на ноль");
                    continue;
                default:
                    result=num1/num2;

            }
            System.out.println(result);


        }
    }
}
