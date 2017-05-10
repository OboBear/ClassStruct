package com.obo.struct.constantinfo;

import com.obo.read.U2;

import java.io.InputStream;

/**
 * Created by obo on 2017/5/10.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class ConstantString extends ConstantInfo {
    public int nameIndex;
    public ConstantString(short tag) {
        super(tag);
    }

    @Override
    public void read(InputStream inputStream) {
        nameIndex = U2.read(inputStream);
    }
}
