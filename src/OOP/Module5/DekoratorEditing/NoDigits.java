package OOP.Module5.DekoratorEditing;

public class NoDigits extends MessageDecorator {
    private Message message;

    public NoDigits() {
    }

    public NoDigits(Message message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message.getMessage().replaceAll("\\d", "");
    }
}