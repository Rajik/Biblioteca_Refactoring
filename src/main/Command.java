package main;

abstract class Command
{
    protected static boolean loggedIn = false;
    protected static String savedLibraryNumber = "";
    abstract public void execute();
    public boolean loggedIn() {
        return loggedIn;
    }
}
