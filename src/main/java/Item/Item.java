package main.java.Item;

import main.java.User.User;

public abstract class Item {
    private String title;
    private int code;
    private String publishedDate;
    private int edition;
    private boolean allocated;
    private User locatedUser;
    private boolean isLocated = false;

    public Item(String title, int code, String publishedDate, int edition) {
        this.title = title;
        this.code = code;
        this.publishedDate = publishedDate;
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(Integer edition) {
        this.edition = edition;
    }

    public boolean isAllocated() {
        return allocated;
    }

    public void setAllocated(boolean allocated) {
        this.allocated = allocated;
    }

    public void setLocatedUser(User user) {
        this.locatedUser = user;
    }

    public User getLocatedUser() {
        return this.locatedUser;
    }

    public void locate() {
       this.isLocated = true;
    }

    public void dealocate() {
        this.isLocated = false;
    }

    public boolean isLocated() {
        return this.isLocated;
    }
}
