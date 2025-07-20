package OOP.Module5.DekoratorEditing;

public class CapitalLetters extends MessageDecorator {
    public CapitalLetters(Message message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message.getMessage().toUpperCase();
    }
}