import java.util.ArrayList;
public class loopFor {

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(divosres(25));
    }
    public static int factorial (int f) {
        int result = 1;
        for (int i = 2; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
    public static ArrayList<Integer> divosres(int n) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1 ; i <= n ; i++) {
            if (n % i == 0) numeros.add(i);
        }
        return numeros;
    }
}
