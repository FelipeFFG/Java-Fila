public class main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.add_valor(2);
        fila.add_valor(2);
        fila.add_valor(2);
        fila.add_valor(2);
        fila.add_valor(2);

        fila.print();

        fila.cheia();


        System.out.println("--------------------------------");

        fila.retirar_valor();
        fila.retirar_valor();


        fila.print();
        fila.cheia();
    }
}
