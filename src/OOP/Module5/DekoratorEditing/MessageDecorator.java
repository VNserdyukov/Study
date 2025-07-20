package OOP.Module5.DekoratorEditing;

abstract class MessageDecorator extends Message {
    protected Message message;

    public MessageDecorator(Message message) {
        super(message.getMessage());
        this.message = message;
    }

    @Override
    public abstract String getMessage();
}