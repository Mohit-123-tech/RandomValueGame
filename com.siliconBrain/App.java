
import java.util.Scanner;


class game {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNum = (int)(Math.random()*100);
        int userNum = 0;
        System.out.println("\n ========={ Random Value Guess Game Developer Silicon Brain }========= \n\n");
        
        do {
            System.out.println("Enter a number [1 to 100] in range :");
            userNum = sc.nextInt();
            
    
            if(randomNum == userNum) {
                System.out.println("\n\n***[ WooHoo  You Are Winner ]***\n");
                break;
            }
            else if(randomNum < userNum) {
                System.out.println("###--{ Your Number Is So Bigger }--###");
            }
            else {
                System.out.println("###--{ Your Number Is Son Smoller }--###");
            }
        } while(randomNum >= 0);
	    System.out.println("___________________________\n");
        System.out.println("| The Random Value Is : |\n");
        System.out.println(randomNum);
        sc.close();
    }
}
