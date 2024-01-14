import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        if(h>=1 && h<=4){
            System.out.println("Малоэтажный дом");
        }
        else if(h>=5 && h<=8){
            System.out.println("Среднеэтажный дом");
        }
        else if(h>=9){
            System.out.println("Высокоэтажный дом");
        }
        else if(h<0){
            System.out.println("error");
        }
    }
}
