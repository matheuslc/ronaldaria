package Menu;

import java.util.Scanner;
import Item.Book;
import Item.Magazine;

public class Menu {
    public void createMenu() {
        System.out.println("1 - Criar usuário");
        System.out.println("2 - Entrar com usuário");
        System.out.println("3 - Cadastrar livro");
        System.out.println("4 - Locar livro");
        System.out.println("5 - Devolver livro");
        System.out.println("6 - Cadastrar revista");
        System.out.println("7 - Locar revista");
        System.out.println("8 - Devolver revista");
        System.out.println("6 - Ver se um item já está locado");
    }

    public void execute(int option) {
        switch (option) {
            case 3:
                this.createBook();
                break;
            case 4:
                this.createMagazine();
        }
    }

    private Book createBook() {
        String title;
        String publishedDate;
        String author;
        int code;
        int edition;

        Scanner scanner = new Scanner(System.in);

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

        return new Book(title, code, publishedDate, edition, author);
    }

    private Magazine createMagazine() {
        String title;
        String publishedDate;
        int code;
        int edition;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o título do livro?");
        title = scanner.next();

        System.out.println("Qual o código do livro?");
        code = scanner.nextInt();

        System.out.println("Qual a data de publicação?");
        publishedDate = scanner.next();

        System.out.println("Qual a edição?");
        edition = scanner.nextInt();

        return new Magazine(title, code, publishedDate, edition);
    }
}
