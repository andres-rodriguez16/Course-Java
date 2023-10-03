import java.util.ArrayList;
public class loopFor {

    public static void main(String[] args) {
        System.out.println(Factorial(3));
        System.out.println(Divisores(28));
        System.out.println(IsNumPerfect(496));
        System.out.println(RaizCuadrada(78));
    }
    public static int Factorial (int f) {
        int result = 1;
        for (int i = 2; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
    public static ArrayList<Integer> Divisores(int n) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1 ; i <= n ; i++) {
            if (n % i == 0) numeros.add(i);
        }
        return numeros;
    }
    public static boolean IsNumPerfect (int n) {
       ArrayList<Integer> divosresTotal = Divisores(n);
        int total= 0;
        for (int num:divosresTotal) {
            total +=num;
        }
        return (total - n == n) ? true : false;
    }
    public static double RaizCuadrada (int n) {
       return Math.sqrt(n);
    }
}
