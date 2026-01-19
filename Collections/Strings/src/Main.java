import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de celular ou telefone sem caracteres: ");
        String numero = scanner.next();
        numero = numero.trim().replaceAll("\\D", "");

        if (numero.length() == 8) {
            String primeirosDigitos = numero.substring(0,4);
            String ultimosDigitos = numero.substring(4);
            imprimir(formatarNumero(primeirosDigitos, ultimosDigitos));


        } else if (numero.length() == 9){
            String primeirosDigitos = numero.substring(0,5);
            String ultimosDigitos = numero.substring(5);

            imprimir(formatarNumero(primeirosDigitos, ultimosDigitos));

        } else if (numero.length() == 10){
            String ddd = numero.substring(0,2);
            String primeirosDigitos = numero.substring(2,6);
            String ultimosDigitos = numero.substring(6);

            imprimir(formatarNumero(ddd, primeirosDigitos, ultimosDigitos));

        } else if (numero.length() == 11){
            String ddd = numero.substring(0,2);
            String primeirosDigitos = numero.substring(2,7);
            String ultimosDigitos = numero.substring(7);
            imprimir(formatarNumero(ddd, primeirosDigitos, ultimosDigitos));
        } else {
            System.out.println("Informe um número válido!");
        }


    }

    public static void imprimir(String numeroFormatado){
        System.out.println("Número: " + numeroFormatado);
    }

    public static String formatarNumero(String ddd, String primeirosDigitos, String ultimosDigitos){
        return String.format("(%s)%s-%s",ddd,primeirosDigitos,ultimosDigitos);
    }

    public static String formatarNumero(String primeirosDigitos, String ultimosDigitos){
        return String.format("%s-%s", primeirosDigitos, ultimosDigitos);
    }

}
