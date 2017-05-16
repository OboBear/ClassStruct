package com.obo.struct.attribute;

import com.sun.org.apache.bcel.internal.classfile.LineNumber;

import java.io.InputStream;

/**
 * Created by obo on 2017/5/14.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class LineNumberTable extends Attribute {
    public int attributeNameIndex; // U2
    public int attributeLength; // U4
    public int line_number_table_length; // U2
    public LineNumber line_number_table[];




    @Override
    public void read(InputStream inputStream) {
        super.read(inputStream);
    }
}
