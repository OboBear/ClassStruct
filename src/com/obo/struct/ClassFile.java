package com.obo.struct;

/**
 * Created by obo on 2017/5/7.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class ClassFile {
    public long magic;
    public int minorVersion;
    public int majorVersion;
    public ConstantPool constantPool;
    public int accessFlag;
    public int thisClass;
    public int superClass;
    public int interfaceCount;
    public String[] interfaces;
    public int fieldCount;
//    public MemberInfo[] fields;
    public int methodCount;
//    public MemberInfo[] methods;
}
