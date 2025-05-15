import java.util.Scanner;



public class Contador {

    public static void main(String[] args){

        var sc = new Scanner(System.in);
        System.out.print("Primero Numero: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo Numero: ");
        int n2 = sc.nextInt();

        try {
            cont(n1,n2);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("Erro: " + exception.getMessage());
        }


    }

    public static void cont(int n1,int n2) throws ParametrosInvalidosException  {

        if (n1 >= n2) {
            throw new ParametrosInvalidosException();
        } else {
            int con =n2-n1;
            for (int i = 1;i<=con;i++) {
                System.out.println("Imprimindo o número "+i);
            }
        }
    }



}
