import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Task2{
    public static void main(String[] args){
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int) Math.round(Math.random()*100);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        int ost = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%10==0){
                ost++;
            }
        }
        int summ =0;
        for (int i = 0; i < array.length; i++) {
            summ+=array[i];
        }
        int summzero = 0;
        for (int i = 0; i < ost; i++){
            summzero+=i;
        }
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("                                                                    ");
        System.out.println("наибольший элемент массива: "+max);
        System.out.println("наибольший элемент массива: "+min);
        System.out.println("количество элементов массива, оканчивающихся на 0: "+ost);
        System.out.println("суммa элементов массива, оканчивающихся на 0: "+summzero);

    }
}