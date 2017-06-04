package com.obo.read;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by obo on 2017/5/9.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class U8 {
    public static long readLong(InputStream inputStream) {
        byte[] bytes = new byte[8];
        try {
            inputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        String longString = new String(bytes);
        long longValue = 0;
        for (int i = 0; i < bytes.length; i++) {
            longValue = longValue<<8;
            longValue += Byte.toUnsignedInt(bytes[i]);
        }
        return longValue;
    }

    public static double readDouble(InputStream inputStream) {
        byte[] bytes = new byte[8];
        try {
            inputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Double.parseDouble(new String(bytes));
    }
}
