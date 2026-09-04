package loops;

public class MultTable {
    /*
        Welcome! In this module, you will be writing the code to create a multiplication table generator. 

        Please follow the prompts below, and write your code in the allotted sections. 
        When you are finished, run your code by clicking the triangle on the top-right corner.
    */
    public static void main(String[] args) {
        // 1. We will begin by choosing the first number to multiply. Create a variable with a number from 1 to 10. 
        // ---- BEGIN CODE ----

        ////int randomNum = (int) (Math.random() * 11);
        int num = 7;

        // ---- END CODE ----


        // 2. Print the variable doubled (ie. "__ x 2 = __") 
        // ---- BEGIN CODE ----

        // int result2 = num * 2;




        // ---- END CODE ----


        // 3. Now do this for tripled, quadrupled, so on, until "__ x 10 = __"
        // ---- BEGIN CODE ----

        // int result3 = num * 3;
        // int result4 = num * 4;
        // int result5 = num * 5;
        // int result6 = num * 6;
        // int result7 = num * 7;
        // int result8 = num * 8;
        // int result9 = num * 9;
        // int result10 = num * 10;

        // System.out.println(result2 + "\n" + result3 + "\n" + result4 + "\n" + result5 + "\n" + result6 + "\n" + result7 + "\n" + result8 + "\n" + result9 + "\n" + result10);

        for (int i = 1; i <= 10; i++) {
            System.out.println();
        }

        // ---- END CODE ----


        // 3. Modify your code from above to print the multiplication problems from 1 through 10 
        // using a for loop instead.
        // Use the below scaffolding as a helper: 
        // 
        // for (int i = __; i < __; __) {
        //     System.out.println(__); 
        // }


        // 4. Modify your program so that it prints a multiplication table for a different number.

        // 5. Modify your program so that the first number also varies from 1 to 10. You should get all the possible combinations
        //    of multiplications from 1 to 10. 
        // (Hint: what happens if you move one for loop inside another?)
    }
}
