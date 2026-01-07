import java.util.Scanner;
public class Game {
    public static void main(String args[]){
        int secretno = 49;
        int maxattempts = 5;
        int guess;
        boolean guessed=false;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=maxattempts; i++){
            System.out.println("Enter your guess:");
            guess = sc.nextInt();
            System.out.println("Attempt no:"+i);
            if(guess==secretno){
                System.out.println("Guessed Correctly:"+guess);
                guessed=true;
                break;
            }
            else if(guess>secretno){
                System.out.println("High");
            }
            else{ 
                System.out.println("Low");
            }
        }
        if(!guessed){
            System.out.println("Attempts over Game Over");
        }
        Scanner.close();
    }
}
/*creating no guessing game
        secret no = 42
        user gets max 5 attempts
        give hints"to high or low
        if guessed print attemots
        if failed reveal secret no */
