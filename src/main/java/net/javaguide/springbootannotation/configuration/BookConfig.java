package net.javaguide.springbootannotation.configuration;

public class BookConfig{
    private int id;
    private String bookName;
    private String desc;

    public BookConfig(int id, String bookName, String desc) {
        this.id = id;
        this.bookName = bookName;
        this.desc = desc;
    }

    public BookConfig() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
