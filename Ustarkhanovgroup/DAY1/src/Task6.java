import java.util.Scanner;
public class Task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        for(int i=1;i<=9;i++){
            System.out.println(i+" x "+ k +" = "+k*i);
        }
    }
}
