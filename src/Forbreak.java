public class Forbreak {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 10; contador++){
            System.out.println("El valor del contador es :" + contador );
            if (contador == 5 ) {
                break;
            }
        }

    }
}
