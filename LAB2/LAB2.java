import java.util.*;
public class LAB2{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER THE NO OF NAMES YOU WANT TO ENETER");
        int n= Integer.parseInt(obj.nextLine());
        String[] name = new String[n];
        System.out.println("PROGRAM STARTS");
        System.out.println("ENTER YOUR CHOICE");
        char choice;
        do{
            System.out.println("\n 1.ENTER NAME \n 2.SEARCH NAME \n 3.REMOVE NAME \n 4. ALL NAMES ");
            int ch= Integer.parseInt(obj.nextLine());
            switch(ch){
                
                case 1:
                System.out.println("ENETER THE NAME");
                for(int i=0; i<n; i++){
                    name[i] = obj.nextLine();
                }
                break;

                case 2:
                System.out.println("ENTER THE NAME TO SEARCH");
                String sname =obj.nextLine();
                for(int i=0; i<n; i++){
                    if (name[i].equalsIgnoreCase(sname)) {
                        System.out.println("Name found at index " + i);
                        System.out.println("NAME IS:"+name[i]);
                    }
                }
                break;

                case 3:
                int index = 0;
                System.out.println("ENTER NAME TO REMOVE A NAME");
                String rname =obj.nextLine();
                for(int i=0; i<n; i++){
                    if (name[i].equalsIgnoreCase(rname)) {
                        index = i;
                        break;
                      }
                    }
                    if (index == -1) {
                      System.out.println("Name not found");
                    } else {
                        for (int i = index; i < n - 1; i++) {
                        name[i] = name[i + 1];
                        }
                        n--;
                        System.out.println("Name removed successfully");
                        }
                break;

                case 4:
                System.out.println("ALL NAMES ");
                for(int i=0; i<n; i++){
                    System.out.println(name[i]);
                }
                break;
            }
            System.out.println("If you want to continue press(Y/y)");
            System.out.println("EXIT press any key");
            choice = obj.nextLine().charAt(0);
        }while (choice=='Y'|| choice=='y');
    }
}