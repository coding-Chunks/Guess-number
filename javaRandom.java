import java.util.Scanner;

public class javaRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do {
            System.out.println("guess my number");
            userNumber = sc.nextInt();
            if (userNumber==myNumber){
                System.out.println("woohoo correct number");
                break;
            } else if (userNumber<myNumber) {
                System.out.println("your number is so small");
            }
            else{
                System.out.println("your number is so larg");
            }
        }
        while(userNumber>=0);
    }
}
