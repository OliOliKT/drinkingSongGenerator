import java.util.Scanner;

public class drinkingSongGenerator {
    // private int N;
    // private String container;
    // private String drink;
    
    // public drinkingSongGenerator(int N, String container, String drink) {
    //     this.N = N;
    //     this.container = container;
    //     this.drink = drink;
    // } 
    public void songGenerator(String input) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String container = " " + input.next() + " ";
        String of = input.next();
        String drink = " " + input.next() + " ";


        // String[] arrayOfInput = input.split(" ", 4);
        // int N = Integer.parseInt(arrayOfInput[0]);
        // String container = arrayOfInput[1].substring(0, arrayOfInput[1].length() - 1);
        // String drink = arrayOfInput[3];

        for (int i = N; i > 0; i--) {
            if (i == 1) {
                System.out.println("One " + container + " of " + drink + " on the wall");
                System.out.println("One " + container + " of " + drink);
                System.out.println("Take one down, pass it around");
                System.out.println("No more " + container + "s of " + drink + " on the wall");
            }
            else if (i == 2) {
                System.out.println(i + " " + container + "s of " + drink + " on the wall");
                System.out.println(i + " " + container + "s of " + drink);
                System.out.println("Take one down, pass it around");
                System.out.println("One " + container + " of " + drink + " on the wall");
                System.out.println();
            }
            else {
                System.out.println(i + " " + container + "s of " + drink + " on the wall");
                System.out.println(i + " " + container + "s of " + drink);
                System.out.println("Take one down, pass it around");
                System.out.println((i - 1) + " " + container + "s of " + drink + " on the wall");
                System.out.println();
            }
        }

    }
    
    // public void Song(int N, String container, String drink) {
    //     for (int i = N; i > 0; i--) {
    //         if (i == 1) {
    //             System.out.println("One " + container + " of " + drink + " on the wall");
    //             System.out.println("One " + container + " of " + drink);
    //             System.out.println("Take one down, pass it around");
    //             System.out.println("No more " + container + "s of " + drink + " on the wall");
    //         }
    //         else if (i == 2) {
    //             System.out.println("One " + container + " of " + drink + " on the wall");
    //             System.out.println("One " + container + " of " + drink);
    //             System.out.println("Take one down, pass it around");
    //             System.out.println("One more " + container + " of " + drink + " on the wall");
    //             System.out.println();
    //         }
    //         else {
    //             System.out.println(i + " " + container + "s of " + drink + " on the wall");
    //             System.out.println(i + " " + container + "s of " + drink);
    //             System.out.println("Take one down, pass it around");
    //             System.out.println((i - 1) + " " + container + "s of " + drink + " on the wall");
    //             System.out.println();
    //         }
    //     }
    // }
}