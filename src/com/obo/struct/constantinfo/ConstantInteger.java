package com.obo.struct.constantinfo;

import com.obo.read.U2;
import com.obo.read.U4;

import java.io.InputStream;

/**
 * Created by obo on 2017/5/9.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class ConstantInteger extends ConstantInfo {
    public int value;
    public ConstantInteger(short tag) {
        super(tag);
    }

    @Override
    public void read(InputStream inputStream) {
        value = U4.readInt(inputStream);
    }
}
