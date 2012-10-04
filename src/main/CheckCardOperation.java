package main;

class CheckCardOperation extends Command
{
    public void execute()
    {
        System.out.println("\n");
        if (loggedIn()) {

            System.out.println("Your library number is " + savedLibraryNumber);
        } else {

            System.out.println("Please talk to Librarian. Thank you.");
        }
    }

}
