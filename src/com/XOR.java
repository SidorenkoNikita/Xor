package com;
/**
 * Created by kaval on 18.05.2017.
 */
public class XOR {
    private byte [] key;

    public XOR(String sixtkey) {
        key = new byte[sixtkey.length()];
        for (int i=0; i<sixtkey.length();i++) {
            key[i] = (byte) sixtkey.charAt(i);
        }
    }
    public byte[] shifrovanie(byte text[]) {
        byte result[] = new byte[text.length];
        for (int i=0; i<text.length;i++) {
            result[i] = (byte)(text[i]^key[i%key.length]);
        }
        return result;
    }
}
