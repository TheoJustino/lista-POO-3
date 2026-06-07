    import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Exercício 1
        int nota = 8;
        Integer notaobj = nota;
        System.out.println(nota); 
        System.out.println(notaobj); 
        System.out.println(notaobj.getClass().getSimpleName());

        // Exercício 2
        // Integer x = null;
        // int y = x;
        // System.out.println(y);
        /*  
        O código acima lança uma NullPointerException, 
        pois o Java tenta fazer um unboxing (converter 
        integer para int) um objeto Integer que é nulo
        e primitivos não podem ser nulos.
        */

        // Exercício 3
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); 
        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d); 
        System.out.println(c.equals(d));
        /*
        O operador == compara referências, não valores. 
        Para Integer, quando os valores estão entre -128 e 127, 
        o Java reutiliza objetos (cache), então a comparação 
        com == retorna true. Para valores fora desse intervalo, 
        novos objetos são criados, e == retorna false.
        Porém, o método equals() compara os valores, 
        então c.equals(d) retorna true.
        */

        // Exercício 4
        BigDecimal produto = new BigDecimal("49.90");
        BigDecimal total = produto.multiply(new BigDecimal("3")).multiply(new BigDecimal("0.95"));
        System.out.println("Total: R$" + total);
    }
}
