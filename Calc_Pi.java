/*O programa calcula o valor de 'Pi' a partir da fórmula de série infinita.
Que é: Pi = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
A escolha de um número 'n' determina quantos termos fracionários serão
utilizados na série para o cálculo. Quanto mais termos forem escolhidos,
mais precisão será garantida no cálculo de 'Pi'.
*/

import java.util.Scanner;
public class Calc_Pi{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos termos da série serão calculados?");
        int n = input.nextInt();

        System.out.println("Valor de 'pi' calculado: "+calcpi(n));

        input.close();
        
    }

    public static double calcpi(int n){

        int increaser = 1, sigchange = 1;
        double clutch, som = 0;

        for(int i=1; i<=n; i++){
            clutch = (double) 1/increaser*sigchange;
            som += clutch;
            increaser += 2;
            sigchange *= -1;
        }

        return som*4;

    }
}