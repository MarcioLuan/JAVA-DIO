import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 1;
        while (opcao != 0){
            System.out.println("Informe 3 valores separados por - ");
            var valores = scanner.next();
            transformarJson(valores);



            System.out.println("Deseja informar outro valor?\n1 - Sim \n0 - Não");
            opcao = scanner.nextInt();

        }
    }

    public static void transformarJson(String valores){
        valores = valores.trim();
        int indice_primeiro_hifen = valores.indexOf("-");
        int indice_segundo_item = valores.lastIndexOf("-");

        String campo = valores.substring(0, indice_primeiro_hifen);
        String valor = valores.substring(indice_primeiro_hifen + 1, indice_segundo_item);
        String tipo = valores.substring(indice_segundo_item + 1);

        String valorJson;

        if (tipo.equals("string")) {
            valorJson = "\"" + valor + "\"";
        } else if (tipo.equals("int") || tipo.equals("double")) {
            valorJson = valor;
        } else if (tipo.equals("boolean")) {
            valorJson = valor.toLowerCase();
        } else {
            System.out.println("Tipo inválido!");
            return;
        }

        String json = String.format("""
                "%s" : %s
                """, campo, valorJson);
        System.out.println(json);

    }

}