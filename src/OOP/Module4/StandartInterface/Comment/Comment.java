package OOP.Module4.StandartInterface.Comment;

public class Comment implements Comparable<Comment> {
    private String author;
    private String text;
    private int like;

    public Comment(String author, String text, int like) {
        this.author = author;
        this.text = text;
        this.like = like;
    }

    public Comment() {
    }

    public int getLike() {
        return like;
    }

    @Override
    public String toString() {
        return author + '#' + text + '#' + like;
    }

    @Override
    public int compareTo(Comment o) {
        return author.compareTo(o.author);
    }
}
