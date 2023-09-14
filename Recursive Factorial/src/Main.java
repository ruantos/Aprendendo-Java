public class Main {
    public static void main(String[] args){
        int number = 5;
        int factor = factorial(number);
        System.out.println(factor);

    }
    static int factorial(int n){
        if(n < 2){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
