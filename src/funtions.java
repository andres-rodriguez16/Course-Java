public class funtions {
    public static void main(String[] args) {
        int y = 20;
        // area de un cuadrado
        System.out.println( "el area de un cuadrado es " + cuadradoArea(y));
        // area de una esfera
        System.out.println( "el area de una esfera es " + esferaArea(y));
        // circuloArea
        System.out.println("el area de un circulo es " + circuleArea(y));
        System.out.println(covertToDollar("COP", 8000));

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
    /**
     * Esta funciona especificando su moneda convierte una catidad de dinero a dolares
     * @param quantity cantidad de dinero
     * @param currency Tipo de moneda: solo acepta MX o COP
     * @return quantity cantidad actualizado en dolares
     * */
    public static int covertToDollar (String currency, int quantity) {
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

