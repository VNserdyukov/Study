package OOP.Module5.DekoratorEditing;

public class NoDigits extends MessageDecorator {
    public NoDigits(Message message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message.getMessage().replaceAll("\\d", "");
    }
}