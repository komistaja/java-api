package hello;

public class Hello {

    private final long number;
    private final String content;

    public Hello(long id, String content) {
        this.number = id;
        this.content = content;
    }

    public long getNumber() {
        return number;
    }

    public String getContent() {
        return content;
    }
}
