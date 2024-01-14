import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]= (int) Math.round(Math.random()*10);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("                              ");
        System.out.println("Длина массива: "+n);
        int kolvo=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>8){
                kolvo++;
            }
        }
        int odin = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==1){
                odin++;
            }
        }
        int chetnoe = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                chetnoe++;
            }
        }
        int nechetnoe = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==1){
                nechetnoe++;
            }
        }
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ+=array[i];
        }
        System.out.println("Количество чисел больше 8: "+kolvo);
        System.out.println("Количество чисел равных 1: "+odin);
        System.out.println("Количество четных чисел: "+chetnoe);
        System.out.println("Количество нечетных чисел: "+nechetnoe);
        System.out.println("Сумма всех элементов массива: "+summ);
        }
    }
