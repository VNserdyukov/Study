package OOP.Module5.Strategy;

public class NoDigits implements Editing {
    @Override
    public String edit(String text) {
        return text.replaceAll("\\d", "");
    }
}
