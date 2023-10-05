import java.util.Scanner;
public class Register {

        void talk() {
            Scanner x = new Scanner(System.in);
            System.out.print("Tell me your name: ");
            String name = x.nextLine();
            System.out.print("Tell me your age: ");
            int age = x.nextInt();
            x.nextLine();
            System.out.print("Tell me the city you live: ");
            String city = x.nextLine();

            System.out.print("Olá, meu nome é "+name);
            System.out.print(", sou natural de "+city);
            System.out.println(", tenho "+age+" anos e estou aprendendo a programar.");
        }
}
