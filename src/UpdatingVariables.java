public class UpdatingVariables {
    public static void main(String[] args) {
        int salaryTotal = 1000;
        int bono = 20;

        salaryTotal+= bono;
        salaryTotal-= 50;
        /*
         2h, una hora equivalent 30$
         alimentacion, se gasto 40
        */
        salaryTotal = salaryTotal + (2*30) - 40;
        System.out.println(salaryTotal);
        String name = "Andrés Rodriguez ";
        name += "Gutierrez";
        System.out.println(name);
    }
}
