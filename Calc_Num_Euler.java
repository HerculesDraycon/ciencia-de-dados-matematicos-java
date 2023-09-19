/*O programa estima o valor da constante matemática 'e' permitindo o
usuário inserir o número de termos a calcular.
Utilizando a fórmula a seguir: 1 + 1/1! + 1/2! + 1/3! + ... + 1/n!
Por exemplo, na escolha da casa 10 de precisão, o número exibido deve se
aproximar, segundo a fórmula, de 2,718.*/

import java.util.Scanner;
public class Calc_Num_Euler{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float e = 1, ac = 0;

        System.out.println("Qual será o número de termos do cálculo?");
        int termos = input.nextInt();

        do{
            ac = (1/fatorial(termos));
            e+=ac;
            termos--;
        } while(termos>0);

        System.out.println(e);
        
        input.close();

    }

    static float fatorial(float n){

        Scanner input = new Scanner(System.in);
        int fat = 1;

        for(int i=2; i<=n; i++){
            fat = fat*i;
        }

        input.close();
        return fat;

    }

}