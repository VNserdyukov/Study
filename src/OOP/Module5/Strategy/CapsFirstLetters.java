package OOP.Module5.Strategy;

public class CapsFirstLetters implements Editing {
    @Override
    public String edit(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i]) && (i == 0 || chars[i - 1] == ' ')) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        return new String(chars);

    }
}