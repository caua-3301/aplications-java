import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.printf("Informe quantas pessoas serão adicionadas: %n");

        int quantidade = sc.nextInt();

        PeopleData[] pessoas = new PeopleData[quantidade];

        for (int conter = 0; conter < quantidade; conter++) {
            System.out.printf("Informe respectivamente o sexo e a altura da %dº pessoa: %n", conter+1);
            pessoas[conter] = new PeopleData(sc.next().charAt(0), sc.nextDouble());
        }

        for (int conter = 0; conter < quantidade; conter++) {
            String output = String.format("%d Pessoa - sexo: %c, altura %.2f",conter+1, pessoas[conter].getGenero(), pessoas[conter].getAltura());
            System.out.println(output);
        }
    }
}