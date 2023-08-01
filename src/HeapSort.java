import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];
        Random random = new Random();
        for (int i = 0; i < number; i++){
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void heapSort(int[] array){
        int len = array.length;
        for (int i = len / 2 -1; i >= 0; i--) {
            heapify(array, len, i);
            
        }

        for(int i = len - 1; i > 0;i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int len, int i){
        int largest = i;
        int left = i * 2 + 1;
        int right = i * 2 + 2;

        if (left < len && array[left] > array[largest])
            largest = left;
    
        if (right < len && array[right] > array[largest])
            largest = right;    

        if (largest != i){
            int a = array[i];
            array[i] = array[largest];
            array[largest] = a;
            heapify(array, len, largest);
        }

        }
}



