public class switchStament {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";
        switch (colorModeSelected) {
            case "light" :
                System.out.println("Selecionaste light");
                break;
            case "Dark" :
                System.out.println("selecionaste dark");
                break;
            default:
                System.out.println("no selecionaste modo");
        }
        String mode = "dark";
       final var s = (mode == "dark" )? "dark" : "light";
        System.out.println(s);
    }
}

