import java.util.Arrays;
import java.util.Random;

public class Task3{
    public static void main(String[] args){
        Random random = new Random();
        int[][] array = new int[12][8];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50)+1;
            }
        }
        for (int i = 0; i < array.length; i++,System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
        int rowSum =0, maxRowSum = Integer.MIN_VALUE, maxRowIndex = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rowSum = rowSum +array[i][j];
            }
            if(maxRowSum < rowSum){
                maxRowSum = rowSum;
                maxRowIndex = i;
            }
            rowSum = 0;
        }
        System.out.println("Ответ: "+maxRowIndex);

       //Arrays.stream(newArray).forEach(System.out::println);
    }
}