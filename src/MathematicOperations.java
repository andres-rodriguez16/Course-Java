public class MathematicOperations {
    public static void main(String[] args) {
        double  x = 2.1;
        double y = 5.8;
        System.out.println((int) Math.ceil(x));
        System.out.println(Math.floor(y));
        // duevuelve el numero elevado a otro
        System.out.println(Math.pow(2, 5));
        // devuelve el numero mas grande
        System.out.println(Math.max(x, y));
        // devuelve la raiz cuadrada
        System.out.println(Math.sqrt(25));
        // area de un cuadrado
        System.out.println( Math.PI * Math.pow(y, 2));
        // area de una esfera
        System.out.println( 4 * Math.PI * Math.pow(y, 2));
    }
}
