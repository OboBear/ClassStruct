package com.obo.struct.attribute;

import java.io.InputStream;

/**
 * Created by obo on 2017/5/15.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class ConstantValue_attribute extends Attribute {
    int attribute_name_index; // U2
    int attribute_length; // U4
    int constantvalue_index; //U2

    public void read(InputStream inputStream) {

    }
}
