package OOP.Module5.DekoratorEditing;

public class CapitalLetters extends MessageDecorator {
    private Message message;

    public CapitalLetters() {
    }

    public CapitalLetters(Message message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message.getMessage().toUpperCase();
    }
}