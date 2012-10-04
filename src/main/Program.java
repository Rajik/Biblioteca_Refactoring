package main;
import java.util.*;
import java.io.*;

public class Program {
    private static ArrayList<Command> commands=new ArrayList<Command>();

    public static void main(String[] args) {

        commands.add(new PrintBooksCommand());
        commands.add(new CheckOutBooksCommand());
        commands.add(new CheckCardOperation());
        commands.add(new PrintMoviesCommand());
        commands.add(new LoginCommand());


        while (true) {
            System.out.println("**********************************************************");
            System.out.println("* Welcome to The Bangalore Public Library System - Biblioteca *");
            System.out.println("**********************************************************");
            System.out.println("*                Menu                                    *");
            System.out.println("*         =====================                          *");
            System.out.println("*         1. List Book Catalog                           *");
            System.out.println("*         2. Check out Book                              *");
            System.out.println("*         3. Check Library Number                        *");
            System.out.println("*         4. Movie Listing                               *");
            System.out.println("*         5. Login                                       *");
            System.out.println("*         9. Exit                                        *");
            System.out.println("**********************************************************");
            System.out.println("Your Selection: ");

            InputStreamReader inputStream = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(inputStream);
            int choice = 0;
            try {
                String value = reader.readLine();
                choice = Integer.parseInt(value);
            } catch (Exception e) {
                // Do you know what numbers are!!!
                System.out.println("Enter a valid integer!!");
            }

            if(choice==9)
            {
                System.out.println("Quitting....");
                break;
            }
            try
            {
                commands.get(choice-1).execute();
            }
            catch(Exception e)
            {
                System.out.print("Enter a valid choice!!\n");
            }

        }
    }
}
