import java.util.*;
public class LAB1{
    public static void main(String[] args) {
        Scanner object1=new Scanner(System.in);
        System.out.print("ENTER THE NAME:");
        String name = object1.nextLine();
        System.out.print("ENTER STATE:");
        String state = object1.nextLine();
        System.out.print("ENTER THE GENDER(m/f):");
        Character gender = object1.nextLine().charAt(0);
        System.out.print("ENTER THE CLASS:");
        String clas = object1.nextLine();
        System.out.print("ENTER THE AGE:");
        int age = object1.nextInt();
        System.out.print("ENTER REGNO:");
        int roll = object1.nextInt();
        System.out.println("NAME:"+name);
        System.out.println("AGE:"+age);
        System.out.println("GENDER:"+gender);
        System.out.println("REGNO:"+roll);
        System.out.println("CLASS:"+clas);
        System.out.println("STATE:"+state);
        if(gender=='m') {
            System.out.println("\n GENDER IS MALE");
            
        }
        else{
            System.out.println("\nGENDER IS FEMALE");
        }

        switch (state) {
            case "Jammu and Kashmir":
            case "Delhi":
                System.out.println("The student is from the northern states of India.");
                break;
            case "Kerala":
            case "Karnataka":
            case "Tamil Nadu":
                System.out.println("The student is from the southern states of India.");
                break;
            case "Bihar":
            case "Jharkhand":
                System.out.println("The student is from the eastern states of India.");
                break;
            case "Haryana":
            case "Punjab":
                System.out.println("The student is from the western states of India.");
                break;
            default:
                System.out.println("Invalid region.");
                break;
        }

    }
}
