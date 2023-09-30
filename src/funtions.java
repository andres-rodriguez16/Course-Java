public class funtions {
    public static void main(String[] args) {
        int y = 20;
        // area de un cuadrado
        System.out.println( "el area de un cuadrado es " + cuadradoArea(y));
        // area de una esfera
        System.out.println( "el area de una esfera es " + esferaArea(y));
        // circiloArea
        System.out.println("el area de un circulo es " + circuleArea(y));
        System.out.println(covertToDolar("COP", 8000));
    }
    public static double circuleArea( double r) {
        return Math.PI * Math.pow(r, 2);
    }
    public static double cuadradoArea( double r) {
        return Math.PI * Math.pow(r, 2);
    }
    public static double esferaArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }
    public static int covertToDolar (String currency, int quantity) {
        switch (currency) {
            case "COP":
                 quantity = (int) ((double) quantity * 0.00025);
                 break;
            case "MX" :
             quantity = (int) ((double) quantity * 17.42);
                break;
        }
        return  quantity;
    }
}

