package com.obo.struct.constantinfo;

import java.io.InputStream;

/**
 * Created by obo on 2017/5/8.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public abstract class ConstantInfo {

    public static final short CONSTANT_Utf8 = 1;
    public static final short CONSTANT_Integer = 3;
    public static final short CONSTANT_Float = 4;
    public static final short CONSTANT_Long = 5;
    public static final short CONSTANT_Double = 6;
    public static final short CONSTANT_Class = 7;
    public static final short CONSTANT_String = 8;
    public static final short CONSTANT_Fieldref = 9;
    public static final short CONSTANT_Methodref = 10;
    public static final short CONSTANT_InterfaceMethodref = 11;
    public static final short CONSTANT_NameAndType = 12;
    public static final short CONSTANT_MethodHandle = 15;
    public static final short CONSTANT_MethodType = 16;
    public static final short CONSTANT_InvokeDynamic = 18;

    public short tag;
    public short []info;

    public ConstantInfo(){}
    public ConstantInfo(short tag) {
        this.tag = tag;
    }

    public void setTag(short tag) {
        this.tag = tag;
    }

    public abstract void read(InputStream inputStream);
}
