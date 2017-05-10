package com.obo.read;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by obo on 2017/5/8.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class U1 {
    public static short read(InputStream inputStream) {
        byte[] bytes = new byte[1];
        try {
            inputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        short value = (short) (bytes[0] & 0xFF);
        return value;
    }
}