package main.java;

import main.java.Menu.Menu;
import main.java.Item.Item;
import main.java.Item.ItemFactory;

import java.util.Scanner;

public class Controller {
    public static void main(String [] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        menu.createMenu();

        scanner.nextInt();
    }

    public Item createItem() {
        Scanner scanner = new Scanner(System.in);
        ItemFactory itemFactory = new ItemFactory();

        String itemType;
        String title;
        int code;
        String publishedDate;
        int edition;

        System.out.println("Você está cadastrando um livro (book) ou uma revista (magazine)?");
        itemType = scanner.next();

        System.out.println("Qual o título do livro?");
        title = scanner.next();

        System.out.println("Qual o código do livro?");
        code = scanner.nextInt();

        System.out.println("Qual a data de publicação?");
        publishedDate = scanner.next();

        System.out.println("Qual a edição?");
        edition = scanner.nextInt();

        return itemFactory.createItem(itemType, title, code, publishedDate, edition);

    }


}
