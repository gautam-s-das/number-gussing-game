import java.util.Random;
import java.util.Scanner;

class number_gussing {
    public static void main(String[] args) {
    Random random=new Random();
    Scanner sc=new Scanner(System.in);

    int guess;
    int attempts = 0;
    int min=1;
    int max=100;
    int randomNumber=random.nextInt(min,max+1);
    System.out.println(randomNumber);
    System.out.println("Number Guessing Game");
    System.out.printf("Guess a number between %d-%d\n",min , max);
    
    do{
        System.out.println("Enter your guess:");
        guess=sc.nextInt();
        attempts++;

        if(guess<randomNumber){
            System.out.println("Too low! Try Again.");
        }
        else if(guess>randomNumber){
            System.out.println("Too high! Try Again.");
        }
        else{
            System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
        }
    }while(guess!=randomNumber);
    sc.close();
}
    }