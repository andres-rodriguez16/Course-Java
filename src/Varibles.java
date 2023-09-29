public class Varibles {
    public static void main(String[] args) {
        int speed;
        speed = 1;
        System.out.println(speed);
        int salary = 20200;
        String employeeName = "Andres";
        System.out.println(employeeName);
            int a = 50;
            int b = 30;
            // presicion
            double c = (double)  a / b;
            System.out.println(c);
            // con el tipo de dato char se utiliza comillas simples
            char n = '1';
            int n1 = n;
        System.out.println(n1);
        short nB = (short) n;
        System.out.println(nB);


        char d = 'z';  // conviertelo a int
        int dR = d;
        int i1 = 250;  ///conviertelo a long y luego de long a short
        long i1R = i1;
        short i1R1 = (short) i1R;
        double i2 = 301.067;  /// conviertelo a long
        long i2R = (long) i2;
        int i3 = 100;//súmale 5000.66  // y conviertelo a float
        float i3R = (float) i3 + 5000.66F;
        int i4 = 737;  // multiplícalo por 100 y conviertelo a byte
        double i5 = 298.638; // divídelo entre 25 y conviertelo a long
    }
}
