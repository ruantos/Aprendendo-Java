import java.util.Scanner;
public class Login {
    void talk(){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = x.nextLine();
        System.out.print("Enter your password: ");
        String password = x.nextLine();
        if(username.equals("jose") && password.equals("maranhao123")){
            System.out.printf("Usuário %s logado com sucesso", username);
        }
        else{
            System.out.println("Usuário ou senha incorreto.");
        }
    }
}
