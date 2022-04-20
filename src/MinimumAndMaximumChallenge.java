import java.util.Scanner;

public class MinimumAndMaximumChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 2147483647;
        int max = -2147483648;
        //boolean first = true;

        while(true) {

            System.out.println("Enter number:");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();

           /*     if(first){
                    first = false;
                    min = number;
                    max = number;
                }*/

                if(number < min){
                    min = number;
                }

                if(number > max){
                    max = number;
                }

            } else {
                break;

            }
            scanner.nextLine();
        }
            System.out.println("Minimum number: " + min + ", Maximum number: " + max);
            scanner.close();
        }
    }


