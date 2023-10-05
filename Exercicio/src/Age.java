import java.util.Scanner;
public class Age {
    void talk(){
        Scanner x = new Scanner(System.in);
        System.out.print("Tell me your age: ");
        int son = x.nextInt();
        System.out.print("Tell me your mom's age: ");
        int mom = x.nextInt();
        int diff = mom - son;
        System.out.printf("Minha mãe é %d anos mais velha do que eu.", diff);
    }
}
