package BoostJava.Module5.ReadWords3;

import java.util.ArrayList;

public class Job implements Runnable {
    private Controller controller;
    private ArrayList<String> list = new ArrayList<>();

    public Job(Controller controller) {
        this.controller = controller;
    }

    public ArrayList<String> getList() {
        return list;
    }

    @Override
    public void run() {
            String str = controller.readWord(Thread.currentThread().getName());
            while (str != null) {
                list.add(str);
                str = controller.readWord(Thread.currentThread().getName());
            }
    }

}