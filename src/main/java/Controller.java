package main.java;

import main.java.Library.BookStorage;
import main.java.Menu.Menu;
import main.java.User.UserRepository;

import java.util.Scanner;

public class Controller {
    public static void main(String [] args) {
        UserRepository userRepository = new UserRepository();
        BookStorage bookStorage = new BookStorage();

        Menu menu = new Menu(userRepository, bookStorage);
        Scanner scanner = new Scanner(System.in);
        int option = 10;

        while (option != 0) {
            menu.createMenu();
            option = scanner.nextInt();
            menu.execute(option);
        }

    }
}
