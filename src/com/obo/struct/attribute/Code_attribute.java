package com.obo.struct.attribute;

import com.obo.read.U2;
import com.obo.read.U4;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by obo on 2017/5/14.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class Code_attribute extends Attribute {

    public int max_stack;  // U2
    public int max_locals;  // U2
    public int code_length; // U4
    public byte code[];    // U1
    public int exception_table_length; // U2
    public Exception_table exception_table[];
    public int attributes_count; // U2
    public Attribute attributeInfo[];

    public void read(InputStream inputStream) {
        max_stack = U2.read(inputStream);
        max_locals = U2.read(inputStream);
        code_length = U4.readInt(inputStream);
        code = new byte[code_length];
        try {
            inputStream.read(code);
        } catch (IOException e) {
            e.printStackTrace();
        }
        exception_table_length = U2.read(inputStream);
        exception_table = new Exception_table[exception_table_length];
        for (int i = 0; i < exception_table_length; i++) {
            exception_table[i] = new Exception_table();
        }
        attributes_count = U2.read(inputStream);
        attributeInfo = new Attribute[attributes_count];
    }

}
