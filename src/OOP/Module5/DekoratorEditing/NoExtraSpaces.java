package OOP.Module5.DekoratorEditing;

public class NoExtraSpaces extends MessageDecorator {
    public NoExtraSpaces(Message message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message.getMessage().trim().replaceAll("\\s+", " ");
    }
}