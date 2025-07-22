package OOP.Module5.Strategy;

public class NoExtraSpaces implements Editing {
    @Override
    public String edit(String text) {
        return text.trim().replaceAll("\\s+", " ");
    }
}