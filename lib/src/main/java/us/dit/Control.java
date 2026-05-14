
/**mi nombre y apellidos */

package us.dit;

public class Control {

    public static void main(String[] args) {
        System.out.println(esPalindromo("Anita lava la tina"));
    }

    public static boolean esPalindromo(String texto) {
        texto = texto.toLowerCase().replace(" ", "");
        String invertido = new StringBuilder(texto).reverse().toString();
        return texto.equals(invertido);
    }
}

