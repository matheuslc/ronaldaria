package main.java.Library;

import main.java.Item.Item;
import main.java.User.User;

public class BookStorage {
    Item[] items = new Item[30];
    int index = 0;

    public void addItem(User user, Item item) throws Error {
        if (!user.getType().equals("admin")) {
            throw new Error("Apenas usuários do tipo admin podem cadastrar itens");
        }

        this.items[this.index] = item;
        this.index++;
    }

    public void locate(User user, Item item) throws Error {
        if (item.isLocated()) {
            throw new Error("Livro já locado");
        }

        item.setLocatedUser(user);
        item.locate();
    }

    public void delocate(Item item) {
        item.dealocate();
    }


    public Item getItem(int code) throws Error {
        for (int i = 0; i < this.index; i++) {
            if (this.items[i].getCode() == code) {
                return this.items[i];
            }
        }

        throw new Error("Este item não existe.");
    }

    public void listItems() {
        if (this.items.length > 0) {
            for (int i = 0; i < this.index; i++) {
                System.out.println("Título: " +  this.items[i].getTitle() + "\n Código: " + this.items[i].getCode());
            }
        } else {
            System.out.println("Nenhum item cadastrado ainda");
        }
    }
}
