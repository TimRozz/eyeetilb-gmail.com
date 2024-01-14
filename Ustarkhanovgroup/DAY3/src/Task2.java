
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double result = 0.00;
            switch((int) num2){
                case(0):
                    System.out.println("error");
                    break;
                default:
                    result=num1/num2;
                    System.out.println(result);
            }
            if (num2 == 0){
                break;
            }

        }


    }
}
