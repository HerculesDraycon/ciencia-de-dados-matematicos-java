/*As leis de De Morgan afirmam que a expressão !(condição1 && condição2)
é logicamente equivalente à expressão(!condição1 || !condição2). Além
disso, a expressão !(condição1|| condição2) é logicamente equivalente à
expressão (!condição1&& !condição2). Os itens a, b, c e d a seguir serão
utilizados para provar as leis a partir de um algoritmo em Java e então suas
respectivas expressões correspondentes irão retornar o mesmo valor lógico.
a) !(x < 5) && !(y >= 7)
b) !(a == b) || !(g != 5)
c) !((x <= 8) && (y > 4))
d) !((i > 4) || (j <= 6))  */

public class Leis_De_Morgan {
    public static void main(String[] args) {
        
        letraa();
        letrab();
        letrac();
        letrad();

    }

    public static void letraa(){

        int x = 6, y = 2;

        if(!(x<5) && !(y>=7)){
            System.out.println("true.");
        }
        if(!(x<5 || y>=7)){
            System.out.println("true.");
        } else {
            System.out.println("false.");
        }

    }

    public static void letrab(){

        int a = 8, b = 17, g = 5;

        if(!(a == b) || !(g!=5)){
            System.out.println("true.");
        }

        if(!(a==b && g!=5)){
            System.out.println("true.");
        } else {
            System.out.println("false.");
        }

    }

    public static void letrac(){

        int x = 10, y = 0;

        if(!(x<=8 && y>4)){
            System.out.println("true.");
        }

        if(!(x<=8) || !(y>4)){
            System.out.println("true.");
        } else {
            System.out.println("false.");
        }

    }

    public static void letrad(){

        int i = 1, j = 12;

        if(!(i>4 || j<=6)){
            System.out.println("true.");
        }

        if(!(i>4) && !(j<=6)){
            System.out.println("true.");
        } else {
            System.out.println("false.");
        }

    }
}
