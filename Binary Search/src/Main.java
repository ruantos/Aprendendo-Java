public class Main{
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int element = 11;

        int result = binary_search(array, element);
        System.out.println(result);
    }

    static int binary_search(int[] arr, int elem) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = (start + end) /2;
            int guess = arr[mid];
            if(guess < elem) {
                start = mid + 1;
            }
            else if(guess > elem) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    
}
