public class Forbreak2 {
    public static void main(String[] args) {
        for (int contador = 1; contador <= 10; contador ++){
            System.out.println("El valor de contador es :"+ contador);
            if (contador ==5) {
                break;
            }
        }
    }
}
