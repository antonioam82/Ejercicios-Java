/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romans;

import java.util.Scanner;

public class Romans 
{
    public static void main(String args[])
   {
      Scanner teclado = new Scanner(System.in);
      System.out.print("Conversion a numeros romanos\n\n");
 
      while ( true )
      {
         System.out.print("Numero: ");
         int numero = teclado.nextInt();
         if ( numero == 0 ) break;
 
         if ( numero > 0 && numero < 4000 )
         {
            String resultado = "";
            for ( int copia = numero, pos = 0; copia > 0; copia /= 10 )
            {
               int digito = copia % 10;
               switch ( pos )
               {
                  case 3:
                     switch ( digito )
                     {
                        case 1: resultado = "M" + resultado; break;
                        case 2: resultado = "MM" + resultado; break;
                        case 3: resultado = "MMM" + resultado; break;
                     }
                     break;
 
                  case 2:
                     switch ( digito )
                     {
                        case 1: resultado = "C" + resultado; break;
                        case 2: resultado = "CC" + resultado; break;
                        case 3: resultado = "CCC" + resultado; break;
                        case 4: resultado = "CD" + resultado; break;
                        case 5: resultado = "D" + resultado; break;
                        case 6: resultado = "DC" + resultado; break;
                        case 7: resultado = "DCC" + resultado; break;
                        case 8: resultado = "DCCC" + resultado; break;
                        case 9: resultado = "CM" + resultado; break;
                     }
                     break;
 
                  case 1:
                     switch ( digito )
                     {
                        case 1: resultado = "X" + resultado; break;
                        case 2: resultado = "XX" + resultado; break;
                        case 3: resultado = "XXX" + resultado; break;
                        case 4: resultado = "XL" + resultado; break;
                        case 5: resultado = "L" + resultado; break;
                        case 6: resultado = "LX" + resultado; break;
                        case 7: resultado = "LXX" + resultado; break;
                        case 8: resultado = "LXXX" + resultado; break;
                        case 9: resultado = "XC" + resultado; break;
                     }
                     break;
 
                  case 0:
                     switch ( digito )
                     {
                        case 1: resultado = "I" + resultado; break;
                        case 2: resultado = "II" + resultado; break;
                        case 3: resultado = "III" + resultado; break;
                        case 4: resultado = "IV" + resultado; break;
                        case 5: resultado = "V" + resultado; break;
                        case 6: resultado = "VI" + resultado; break;
                        case 7: resultado = "VII" + resultado; break;
                        case 8: resultado = "VIII" + resultado; break;
                        case 9: resultado = "IX" + resultado; break;
                     }
                     break;
               }
               ++pos;
            }
            System.out.print(resultado + "\n\n");
         }
         else
            System.err.print("Escriba un numero entre 1 y 3999 inclusive\n\n");
 
      } // while
 
   }
}
