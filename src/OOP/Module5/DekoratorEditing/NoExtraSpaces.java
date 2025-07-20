package OOP.Module5.DekoratorEditing;

public class NoExtraSpaces extends MessageDecorator {
    private Message message;

    public NoExtraSpaces() {
    }

    public NoExtraSpaces(Message message) {
       this.message = message;
    }

    @Override
    public String getMessage() {
        return message.getMessage().trim().replaceAll("\\s+", " ");
    }
}