package com.obo.struct.constantinfo;

import com.obo.read.U8;

import java.io.InputStream;

/**
 * Created by obo on 2017/5/9.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class ConstantLong extends ConstantInfo {
    public long value;

    public ConstantLong(){super();}
    public ConstantLong(short tag) {
        super(tag);
    }

    @Override
    public void read(InputStream inputStream) {
        value = U8.readLong(inputStream);
    }
}
