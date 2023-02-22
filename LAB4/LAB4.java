import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class LAB4 {
    static String Name;
    static int accNo;
    static int iBal;
    static Scanner obj = new Scanner(System.in);
    static String[][] transaction = new String[100][4];
    static int iter = 0;

    static String details(){
        System.out.println("Enter your name: ");
        Name = obj.nextLine();
        System.out.println("enter your account number : ");
        accNo = Integer.parseInt(obj.nextLine());
        System.out.println("Enter your initial balance : ");
        iBal = Integer.parseInt(obj.nextLine());
        return Name ;
    }

    static int dep(int deposite){
        iBal += deposite;
        System.out.println("Tansaction successful!");
        // String D_t = Transactions();
        
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        
        iter++;
        
        transaction[iter][0]="Deposit";   // Deposit OR Withdraw
        transaction[iter][1]=""+ deposite; // Deposit Ammount
        transaction[iter][2]=""+ iBal;  // Balance
        transaction[iter][3]=""+dt.format(now);   // date-time
        return iBal;
    }

    static int witd(int withdraw){        
        if(withdraw <= iBal){
            iBal = iBal - withdraw;
            System.out.println("Tansaction successful!");
        }
        else{
            System.out.println("Insufficient balance!");
        }
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        
        iter++;
        
        transaction[iter][0]="Withdraw";   // Deposit OR Withdraw
        transaction[iter][1]=""+withdraw; // Deposit Ammount
        transaction[iter][2]=""+ iBal;  // Balance
        return iBal;
    }

    static void Transactions(int bal){
        System.out.println("Transaction Details:");
        System.out.println("Your current account balance is: "+ iBal);
        System.out.println("Transaction Amount      Balance     Date       Time");
        for(String[] s: transaction){
            if(s[0]==null){
                continue;
            }else{
                System.out.printf("%-12s"+"%-12s"+"%-12s"+"%s\n",s[0],s[1],s[2],s[3]);
            }
        }
        
    }

    static String summary(){
        System.out.println("Your Name : "+Name);
        System.out.println("Your acount number : "+ accNo);
        System.out.println("Your available balance : "+iBal);
        return Name;
    }
    public static void main(String[] args){
        int ch;
        char cn = 'n';
        String det = details();
        do{
            System.out.println("----MENU---- \n 1.Deposite \n 2.Withdraw \n 3.Transaction \n 4.Summary");
            System.out.println("Enter your choice : ");
            ch = Integer.parseInt(obj.nextLine());
            switch(ch){
                case 1 :
                    System.out.println("Enter the amount you want to deposite : ");
                    int deposite = Integer.parseInt(obj.nextLine());
                    int dep = dep(deposite);
                    System.out.println("Your total balance : "+ dep);
                    break;
                case 2 :
                    System.out.println("Enter the amount you want to withdraw : ");
                    int withdraw = Integer.parseInt(obj.nextLine());
                    int total = witd(withdraw);
                    System.out.println("Your total balance : "+ total);
                    break;
                case 3 :
                    System.out.println("Your transaction history : ");
                    Transactions(iBal);
                    break;
                case 4 :
                    System.out.println("Your account summarry : ");
                    String sum = summary();
                    break;
                default :
                    System.out.println("Invalid option, try again!");
            } 
            System.out.println("Enter y to continue, anything else to exit : ");
            cn = obj.nextLine().charAt(0);;
        
        } while(cn == 'y' || cn == 'Y');

    }    
}