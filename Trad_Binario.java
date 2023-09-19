/*O programa rebe um número inteiro que contém somente 0's e 1's
(isto é, um número inteiro binário) e imprime seu equivalente decimal.
Fazendo uma tradução direta baseada em Álgebra Booleana*/

import java.util.Scanner;
public class Trad_Binario {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int binarymark = 2, ac = 0;
        
        System.out.println("Digite o número binário que deseja traduzir.");
        int binary = input.nextInt();

        while(binary>0){

            if(binary%10 == 0){
                binary/=10;
                binarymark *= 2;
            } else {
                ac += binarymark;
                binarymark *= 2;
                binary/=10;
            }

        }

        System.out.println("O número binário que você escolheu é "+ac/2+" em decimais.");
        input.close();

    }
}
