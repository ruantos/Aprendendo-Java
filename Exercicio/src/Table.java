import java.util.Scanner;
public class Table {
    void talk() {
        Scanner x = new Scanner(System.in);
        System.out.print("Choose a number: ");
        int num = x.nextInt();
        for(int i = 10;i  >= 1; i--){
            System.out.printf("%d x %d = %d\n", num, i, (num*i));
        }
    }
}
