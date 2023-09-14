import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
    int[] array = {10,9,8,7,6,5,4,3,2,1,0};
    array = select_sort(array);
    System.out.println(Arrays.toString(array));
    }

    static int find_smallest(int[] arr){
        int smallest = arr[0];
        int smallest_indx = 0;

        for(int i=1; i< arr.length ; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
                smallest_indx = i;
            }
        }
        return smallest_indx;
    }

    static int[] remove(int[] arr, int elem){
        int[] new_arr = new int[arr.length -1];

        for(int i=0; i<arr.length ; i++){
            if(arr[i] != elem) {
                new_arr[i] = arr[i];
            }
        }
        return new_arr;
    }

    static int[] select_sort(int[] arr){
        int[] new_arr = new int[arr.length];
        int smallest;
        int size = arr.length;

        for(int i=0; i< size ;i++){
            smallest = find_smallest(arr);
            new_arr[i] = arr[smallest];
            arr = remove(arr, arr[smallest]);
        }
        return new_arr;
    }
}