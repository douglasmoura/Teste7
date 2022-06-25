
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = new ArrayList<Double>();
        System.out.println ("Informe os números:");
        String stringNumero = scanner.nextLine();
        String[] split = stringNumero.split(" ");
        Double media = 0.0;

        for (int i = 0; i < split.length; i++) {

            Double numero = Double.parseDouble(split[i]);
            numbers.add(numero);
            media += numbers.get(i); 
        }
            media = media / numbers.size();
      
        System.out.println ("\nMaior: "+ Collections.max(numbers));
        System.out.println ("\nMenor: "+ Collections.min(numbers));
        System.out.println ("\nMédia: "+ media);

        scanner.close();

    }

}