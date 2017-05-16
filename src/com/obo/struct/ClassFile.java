package com.obo.struct;

import com.obo.struct.attribute.Attribute;
import com.obo.struct.fieldinfo.FieldInfo;
import com.obo.struct.methodInfo.MethodInfo;

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
    public int[] interfaces;
    public int fieldCount;
    public FieldInfo[] fields;
    public int methodCount;  // U2
    public MethodInfo[] methods;
    public int attributeCount; //U2
    public Attribute []attribute;
}
