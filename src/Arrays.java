public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[4];
        String[] daiys = new String[7];
        String[][] cities = new String[4][2];
        String[][] name = new String[2][2];

        androidVersions[0] = "apple pie";
        androidVersions[1] = "Banana bread";
        androidVersions[2] = "cupcake";
        androidVersions[3] = "donut";

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println();
    // [[colombia, medellin],[colombia, bogota], [mexico, ciudad mexico],[ mexico , monterrey]]
        cities[0][0] = "colombia";
        cities[0][1] = "Medellín";
        cities[1][0] = "mexico";
        cities[1][1] = "ciudad de mexico";
        cities[2][0] = "colombia";
        cities[2][1] = "bogota";
        cities[3][0] = "mexico";
        cities[3][1] = "monterrey";
        /*
        for (String androidVersion: androidVersions) {
            System.out.println(androidVersion);
        }
        for (String[] pair: cities) {
            for ( String name: pair) {
                System.out.println(name);
            }
        }

         */
      /*  for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }
       */
    }
}
