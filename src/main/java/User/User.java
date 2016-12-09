package main.java.User;

public class User {
    private int id;
    private String name;
    private String bornDate;
    private String password;
    public String type;
    public String userName;

    public User(String name, String bornDate, String password, String type, String username) {
        this.setName(name);
        this.setBornDate(bornDate);
        this.setPassword(password);
        this.setType(type);
        this.setUserName(username);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public int getId() {
        return this.id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return this.userName;
    }
}
