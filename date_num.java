
package javaapplication16;

/**
 *
 * @author Antonio
 */
import javax.swing.JOptionPane;


public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                String f_h;
        String fecha_hora;
        fecha_hora = JOptionPane.showInputDialog(null, "Ingrese la fecha dd/mm/aa y la hora");
        f_h = fecha_hora.replaceAll("/|\\s|:", "");
        int[] digitos = new int[14];
        String cad;
        int ent;
        String binario;
        char[] caracteres = f_h.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            cad = Character.toString(caracteres[i]);
            ent = Integer.parseInt(cad);
            digitos[i] = ent;
        }
        for (int i = 0; i < digitos.length; i++) {
            System.out.print(digitos[i]);
        }
        System.out.println("");
        for (int i = 0; i < digitos.length; i++) {
             binario = Integer.toBinaryString(digitos[i]);
            if (digitos[i] <= 1) {
                System.out.print("000" + binario);
            } else if ((digitos[i] > 1)&&(digitos[i]<4)) {
                System.out.print("00" + binario);
            }else if((digitos[i] >=4)&&((digitos[i] <8))){
                System.out.print("0" + binario);
            }else if(digitos[i]>=8){
                System.out.print(binario);
            }
        }
 
    }
}
