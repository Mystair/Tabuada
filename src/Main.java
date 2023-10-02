import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, count= 0 , result;
        Scanner in = new Scanner(System.in);
        System.out.println("Informe o número para cálculo da tabuada: ");
        num=in.nextInt();
        for(count=1; count<=10; count++){
            result=num*count;
            System.out.println(+num+ " X " +count + " = " +result);
        }
        System.exit(0);
    }
}