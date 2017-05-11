package com.obo.struct.constantinfo;

import com.obo.read.U2;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by obo on 2017/5/9.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class ConstantUtf8 extends ConstantInfo {

    public int length;
    public String value;

    public ConstantUtf8(){super();}
    public ConstantUtf8(short tag) {
        super(tag);
    }

    @Override
    public void read(InputStream inputStream) {
        length = U2.read(inputStream);
        byte[] bytes = new byte[length];
        try {
            inputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        value = new String(bytes);
    }
}
