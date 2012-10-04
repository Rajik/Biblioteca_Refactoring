package main;
import java.io.*;

class LoginCommand extends Command
{
    InputStreamReader inputStream = new InputStreamReader(System.in);
    BufferedReader reader = new BufferedReader(inputStream);

    public void execute()
    {
        clearLogin();
        System.out.println("Enter your library number");
        try {
            String libraryNumber = reader.readLine();
            if (validLibraryNumber(libraryNumber))
            {

                System.out.println("Enter your Password: ");
                String password = reader.readLine();
                if (validPassword(password)) {
                    loggedIn = true;
                    savedLibraryNumber = libraryNumber;
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();

        }
    }

    private boolean validPassword(String password) {
        return "bhaisahab".equals(password);
    }

    private boolean validLibraryNumber(String libraryNumber) {
        return libraryNumber.matches("\\d\\d\\d-\\d\\d\\d\\d");
    }
    private void clearLogin() {
        loggedIn = false;
        savedLibraryNumber = "";
    }

}
