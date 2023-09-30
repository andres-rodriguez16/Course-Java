public class SentenceIF {
    public static void main(String[] args) {
        boolean verdadero = true;
        int numFiles = 2;
        if (verdadero) {
            System.out.println("Es verdadero");
            numFiles++;
        } else {
            System.out.println("No es verdadero");
            numFiles--;
        }
        int numFile2 = 0;
        System.out.println(numFiles);
    }
}
