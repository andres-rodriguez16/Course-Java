public class whileLoop {
   static boolean isTrueOnLight = false
           ;
    public static void main(String[] args) {
        turnOnOffLight();
        /* int flag = 0;
        while (isTrueOnLight && flag <= 20) {
            sos();
            System.out.println(flag);
            flag++;
        }
         */
        if ( isTrueOnLight) {
            for (int i = 0;  i <= 20 ; i++) {
                sos();
            }
        }
    }
    public static void sos() {
        System.out.println(". . ._ _ _ . . .");
    }
    public static boolean turnOnOffLight () {
       return  isTrueOnLight = (isTrueOnLight) ? false : true;

    }
}
