import java.util.Scanner;
public class Sumv2 {
    int talk(){
        Scanner x = new Scanner(System.in);

        System.out.print("Where the range begins: ");
        int start = x.nextInt();

        System.out.print("Where the range ends: ");
        int end = x.nextInt();

        int sum = 0;
        for(int i = start; i <= end; i++)
            sum += i;

        return sum;
    }
}
