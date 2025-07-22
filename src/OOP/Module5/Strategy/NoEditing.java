package OOP.Module5.Strategy;

public class NoEditing implements Editing {
    @Override
    public String edit(String text) {
        return text;
    }
}