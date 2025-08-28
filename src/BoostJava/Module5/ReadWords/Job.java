package BoostJava.Module5.ReadWords;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Job implements Runnable {
    private BufferedReader br;
    private ArrayList<String> list = new ArrayList<>();

    public Job(BufferedReader br) {
        this.br = br;
    }

    public ArrayList<String> getList() {
        return list;
    }

    @Override
    public void run() {

        try {
            String str = br.readLine();
            while(str != null){
                list.add(str);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                str = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
