package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by kaval on 18.04.2017.
 */
public class WorkWithFiles {
    private String key;
    public WorkWithFiles(String key){
        this.key = key;
    }

    public void fayels(String input,String output){
        XOR h = new XOR(key);
        byte [] text;

        try {
            FileInputStream in = new FileInputStream(input);
            FileOutputStream outt = new FileOutputStream(output);
            text = new byte[in.available()];
            int line = 0 ;
            while ((line = in.read(text))!= -1) {
                outt.write(h.shifrovanie(text));
            }
            in.close();
            outt.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
