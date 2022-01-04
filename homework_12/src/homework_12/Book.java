package homework_12;

public class Book implements Comparable<Object> {
    private String id;
    private String name;
    private int prince;
    private String publisher;

    public Book() {
    }

    public Book(String id, String name, int prince, String publisher) {
        this.id = id;
        this.name = name;
        this.prince = prince;
        this.publisher = publisher;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrince() {
        return this.prince;
    }

    public void setPrince(int prince) {
        this.prince = prince;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.prince + " " + this.publisher;
    }

    public int compareTo(Object o) {
        if (!(o instanceof Book))
            throw new RuntimeException("不是Book对象");
        Book p = (Book) o;
        return this.id.compareToIgnoreCase(p.getId());
    }
}

