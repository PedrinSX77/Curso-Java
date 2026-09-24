package Section12.StringBuilder.entities;

public class Comment {
    private String text;

    // Constructor
    public Comment(){}
    public Comment(String text){
        this.text = text;
    }

    // Getters and Setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
