package main.java.User;

public class UserRepository {
    private User[] users = new User[30];
    private int index = 0;

    public User getUser(String userName) throws Error {
        for (int i = 0; i < this.index; i++) {
            if (this.users[i].getUserName().equals(userName)) {
                return this.users[i];
            }
        }

        throw new Error("Usuário não encontrado");
    }

    public void AddUser(User user) {
        this.users[this.index] = user;
        this.index++;
    }
}
