import java.util.Scanner;

public class madLibs {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
     
    String adj1;
    String noun1;
    String adj2;
    String verb1;
    String adj3;

    System.out.print("Enter an adjective: ");
    adj1 = scanner.nextLine();

    System.out.print("Enter a noun: ");
    noun1 = scanner.nextLine();

    System.out.print("Enter an adjective: ");
    adj2 = scanner.nextLine();

    System.out.print("Enter a verb: ");
    verb1 = scanner.nextLine();

    System.out.print("Enter an adjective: ");
    adj3 = scanner.nextLine();


    System.out.println("Today i went to a " + adj1 + " zoo.");
    System.out.println("in the zoo i saw " + noun1 + ".");
    System.out.println(noun1 + " was " + adj2 + " and " + verb1);
    System.out.println("I was "  + adj3);

    Scanner(close);
  }
}