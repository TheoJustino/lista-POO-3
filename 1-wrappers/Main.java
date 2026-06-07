public class Main {
    public static void main(String[] args) {
        // Exercício 1
        int nota = 8;
        Integer notaobj = nota;
        System.out.println(nota); 
        System.out.println(notaobj); 
        System.out.println(notaobj.getClass().getSimpleName());

        // Exercício 2
        Integer x = null;
        int y = x;
        System.out.println(y);
        /*  
        O código acima lança uma NullPointerException, 
        pois o Java tenta fazer um unboxing (converter 
        integer para int) um objeto Integer que é nulo
        e primitivos não podem ser nulos.
        */
    }
}
