package main.java.Menu;

import java.util.Scanner;
import main.java.Item.Book;
import main.java.Item.Magazine;
import main.java.Library.BookStorage;
import main.java.User.User;
import main.java.User.UserRepository;
import main.java.Item.Item;

public class Menu {
    private UserRepository userRepository;
    private BookStorage bookStorage;

    public Menu(UserRepository userRepository, BookStorage bookStorage) {
        this.userRepository = userRepository;
        this.bookStorage = bookStorage;
    }

    public void createMenu() {
        System.out.println("1 - Criar usuário");
        System.out.println("3 - Cadastrar livro");
        System.out.println("4 - Locar livro");
        System.out.println("5 - Devolver livro");
        System.out.println("6 - Cadastrar revista");
        System.out.println("7 - Locar revista");
        System.out.println("8 - Devolver revista");
        System.out.println("6 - Ver se um item já está locado");
        System.out.println("9 - Listar itens");
    }

    public void execute(int option) {
        switch (option) {
            case 1:
                this.createUser();
                break;
            case 3:
                this.createBook();
                break;
            case 4:
                this.locate();
                break;
            case 6:
                this.createMagazine();
                break;
            case 9:
                this.listItems();
                break;
        }
    }

    public void listItems() {
        this.bookStorage.listItems();
    }

    public void locate() {
        Scanner scanner = new Scanner(System.in);
        String name;
        int code;

        System.out.println("Qual o nome de seu usuário que irá locar o item?");
        name = scanner.nextLine();

        try {
            User user = this.userRepository.getUser(name);

            System.out.println(user.getUserName());

            System.out.println("Qual o código do item?");
            code = scanner.nextInt();

            Item item = this.bookStorage.getItem(code);
            this.bookStorage.locate(user, item);

        } catch (Error error) {
            System.out.println(error);

            this.locate();
        }
    }

    public void createUser() {
        String name;
        String bornDate;
        String password;
        String type;
        String username;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome de seu usuário");
        name = scanner.nextLine();

        System.out.println("Qual o username que será usado?");
        username = scanner.nextLine();

        System.out.println("Qual a data de nascimento dd/mm/yyyy?");
        bornDate = scanner.nextLine();

        System.out.println("Qual a senha?");
        password = scanner.nextLine();

        System.out.println("Qual o tipo de usuário? admin, client");
        type = scanner.nextLine();

        User user = new User(name, bornDate, password, type, username);

        this.userRepository.AddUser(user);

    }

    private void createBook() {
        String title;
        String publishedDate;
        String author;
        String userName;
        int code;
        int edition;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome de usuário?");
        userName = scanner.nextLine();

        System.out.println("Qual o título do livro?");
        title = scanner.nextLine();

        System.out.println("Qual o código do livro?");
        code = scanner.nextInt();

        System.out.println("Qual a data de publicação?");
        publishedDate = scanner.nextLine();

        System.out.println("Qual a edição?");
        edition = scanner.nextInt();

        System.out.println("Qual o autor?");
        author = scanner.nextLine();

        try {
            User user = this.userRepository.getUser(userName);
            Item item = new Book(title, code, publishedDate, edition, author);
            this.bookStorage.addItem(user, item);
        } catch (Error error) {

        }
    }

    private void createMagazine() {
        String title;
        String publishedDate;
        String userName;
        int code;
        int edition;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome de usuário");
        userName = scanner.nextLine();

        System.out.println("Qual o título do livro?");
        title = scanner.nextLine();

        System.out.println("Qual o código do livro?");
        code = scanner.nextInt();

        System.out.println("Qual a data de publicação?");
        publishedDate = scanner.next();

        System.out.println("Qual a edição?");
        edition = scanner.nextInt();

        User user = this.userRepository.getUser(userName);
        Item item = new Magazine(title, code, publishedDate, edition);
        this.bookStorage.addItem(user, item);
    }
}
