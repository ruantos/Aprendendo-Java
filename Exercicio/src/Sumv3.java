import java.util.Scanner;
public class Sumv3 {
    int talk(){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        String num = x.nextLine();

        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            sum += Character.getNumericValue(num.charAt(i));
        }
        return sum;
    }
}
