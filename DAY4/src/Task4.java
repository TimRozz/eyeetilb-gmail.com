import java.util.*;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;


import static java.util.Collections.max;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000) - 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int first = 0;
        int second = 0;
        int third = 0;
        Set<Integer> newSet = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            newSet.add(array[i]);
        }
        for(Integer i: newSet){
            if(i > first){
                second  = first;
                first = i;
            }
            else if(i > second){
                third = second;
                second = i;
            }
            else if(i > third){
                third = i;
            }


        }
        System.out.println();
        int[] arrayMAX = {first,second,third};
        System.out.print("Тройка с максимальной суммой: ");
        for (int i = 0; i < arrayMAX.length; i++) {
            System.out.print(arrayMAX[i]+" ");
        }
        System.out.println();
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            maxIndex = array[i]> array[maxIndex] ? i : maxIndex;
        }
        System.out.println("Сумма всех макс чисел: "+ (first+second+third));
        System.out.println("Индекс максимального числа: "+maxIndex);
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);
//        int max = Arrays.stream(array).max().getAsInt();
////        int max2 = Arrays.stream(array).max().getAsInt();
//
//        System.out.println();
//        System.out.println("Max is: " + max);
//        List<Integer> list1 = new ArrayList(Arrays.asList(array));
//        System.out.print("3 max value: ");
//        System.out.println(printMax(list1,3,false));
    }

}
