package OOP.Module5.ObserverInforming;

public class MessageInfo {
    private final String sender;
    private final String message;

    public MessageInfo(String sender, String message) {
        this.sender = sender;
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }
}