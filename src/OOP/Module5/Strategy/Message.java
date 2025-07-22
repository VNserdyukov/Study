package OOP.Module5.Strategy;

public class Message {
    private String text;
    private Editing editWay;

    public Message(String text) {
        this.text = text;
        this.editWay = new NoEditing();
    }

    public void setEditWay(Editing editWay) {
        this.editWay = editWay;
    }

    public void print() {
        String editedText = editWay.edit(text);
        System.out.println(editedText);
    }
}