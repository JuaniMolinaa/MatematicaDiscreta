package convertirbinario;

import java.util.Scanner;

public class ConvertirBinario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //pide el numero binario de 16 digitos
        System.out.println("Ingrese un número binario de 16 dígitos:");
        String numeroBinario = scanner.nextLine();
        if (numeroBinario.length() != 16) {
            System.out.println("El número debe ser de 16 dígitos");
        } else {
            // Convierte el número binario a decimal
            int numDecimal = Integer.parseInt(numeroBinario, 2);

            // Convierte el número decimal a octal y a hexadecimal
            String numOctal = Integer.toOctalString(numDecimal);
            String numHexadecimal = Integer.toHexString(numDecimal);

            //Muestra los resultados
            System.out.println("Número decimal: " + numDecimal);
            System.out.println("Número octal: " + numOctal);
            System.out.println("Número hexadecimal: " + numHexadecimal);
        }

    }

}
