package com.obo.read;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by obo on 2017/5/8.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class U4 {
    public static long read(InputStream inputStream) {
        byte[] bytes = new byte[4];
        try {
            inputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long num = 0;
        for (int i= 0; i < bytes.length; i++) {
            num <<= 8;
            num |= (bytes[i] & 0xff);
        }
        return num;
    }

    public static int readInt(InputStream inputStream) {
        byte[] bytes = new byte[4];
        return Integer.parseInt(new String(bytes));
    }
}