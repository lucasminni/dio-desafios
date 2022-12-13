import java.util.Scanner;

public class Mjolnir {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt();

        for (int i = 0; i < C; i++){
            String nome = leitor.next();
            int N = leitor.nextInt();
            if (nome.equals("Thor")) System.out.println("Y");
            else if (! nome.equals("Thor") && N < 25000 ) System.out.println(("N1"));
        }
    }
}
