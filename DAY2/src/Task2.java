import java.util.Scanner;
public class Task2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int b = scanner.nextInt();
        for(int i =a;i<=b;i++){
            if(i%10!=0 && i%5==0){
                System.out.print(i+" ");
            }
        }
    }
}
     //       if (i % 10 != 0 && i % 5 == 0)
