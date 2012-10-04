package main;

import java.io.*;

class CheckOutBooksCommand extends Command
{
    InputStreamReader inputStream = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(inputStream);

    public void execute()
    {
        System.out.println(" Please enter the number of the book you wish to checkout: ");
        int i2 = 0;
        try {
            i2 = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            // Do you know what numbers are!!!
            System.out.println("Enter a valid integer!!");

        }
        System.out.println("\n");
        if(i2>=1 && i2<=4)
        {
            System.out.println("Thank You! Enjoy the book.");
        }
        else
        {
            System.out.println("Sorry we don't have that book yet.");
        }
    }
}
