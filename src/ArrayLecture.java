import java.util.Arrays;

public class ArrayLecture {

    public static void main(String[] args) {
        double[] prices = new double[4];
        final int numberOfSides = 6;

        int[] diceSides = new int[numberOfSides];

        System.out.println("prices.length = " + prices.length);
        System.out.println("diceSides.length = " + diceSides.length);

        System.out.println("diceSides[0] = " + diceSides[0]);

        String[] myBag = {"Snickers", "Reese's", "Brussels Sprouts"};

        System.out.println("myBag.length = " + myBag.length);
//        System.out.println("myBag [1] = " + myBag[1]);

//        for(int i = 0; i < myBag.length; i++){
//            System.out.println(myBag[i]);
//        }

        for (String candy : myBag) {
            System.out.printf("%s is the piece of candy you just pulled out of the bag%n", candy);
            System.out.println();
        }


        String[] anotherBag = new String[12];

        System.out.println("anotherBag[0] = " + anotherBag[0]);
        System.out.println("anotherBag[5] = " + anotherBag[5]);

        Arrays.fill(anotherBag, "Snickers");

        for (String candy : anotherBag) {
            System.out.println(candy);
        }
        System.out.println();

        System.out.println("Arrays.equals(anotherBag, anotherBag) = " + Arrays.equals(anotherBag, anotherBag));

        String[] mybagplusone = Arrays.copyOf(myBag, myBag.length + 1);
        System.out.println("myBag.length = " + myBag.length);
        System.out.println("mybagplustwo.length = " + mybagplusone.length);

        mybagplusone[mybagplusone.length-1] = "skittles";
        for(String candy : mybagplusone){
            System.out.println(candy);
        }

        int[][] matrix = {
                {1, 2, 3}, // array 1
                {4, 5, 6}, // array 2
                {7, 8, 9} // array 3 . . these three arrays are ELEMENTS of the outer array
        };
        for (int[] row : matrix) {
            System.out.println("+---+---+---+");
            System.out.print("| ");
            for (int n : row) {
                System.out.print(n + " | ");
            }
            System.out.println();
        }
        System.out.println("+---+---+---+");


    }

}

