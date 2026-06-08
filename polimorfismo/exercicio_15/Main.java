package polimorfismo.exercicio_15;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cachorro("Cachorro 1");
        Animal a2 = new Gato("Gato 1");
        Animal a3 = new Cachorro("Cachorro 2");

        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();

        /*
        Os métodos executados são os métodos de Cachorro 
        e Gato. O polimorfismo permite que objetos 
        de diferentes classes (Cachorro e Gato) sejam 
        tratados como objetos da classe base (Animal) 
        e ainda assim executem comportamentos específicos 
        de suas classes. Quando chamamos a função 
        emitirSom() em um objeto do tipo Animal, o Java 
        determina em tempo de execução qual versão do 
        método deve ser chamada, com base no tipo real 
        do objeto (Cachorro ou Gato). Porém, isso apenas
        funciona porque o método emitirSom() está tanto na 
        classe base (Animal) quanto nas classes derivadas 
        (Cachorro e Gato). Se o método emitirSom() não
        estivesse na classe base, o polimorfismo não funcionaria.
        */
    }
}
