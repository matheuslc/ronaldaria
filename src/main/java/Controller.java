package main.java;

import main.java.Menu.Menu;

import java.util.Scanner;

public class Controller {
    public static void main(String [] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        int option;

        menu.createMenu();
        option = scanner.nextInt();

        menu.execute(option);
    }
}
