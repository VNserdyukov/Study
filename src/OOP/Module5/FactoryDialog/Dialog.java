package OOP.Module5.FactoryDialog;

abstract class Dialog {
    public void renderWindow() {
        System.out.println("Рисуем окно диалога");
        Button button = createButton();
        button.render();
    }

    public abstract Button createButton();
}
