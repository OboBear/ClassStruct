package com.obo.struct.fieldinfo;

import com.obo.read.U1;
import com.obo.read.U2;
import com.obo.read.U4;

import java.io.InputStream;

/**
 * Created by obo on 2017/5/11.
 */
public class AttributeInfo {
    public int attributeNameIndex; // U2
    public int attributeLength; // U4
    public short info[];    // U1[]

    public void read(InputStream inputStream) {
        attributeNameIndex = U2.read(inputStream);
        attributeLength = U4.readInt(inputStream);
        info = new short[attributeLength];
        for (int i = 0; i < attributeLength; i++) {
            info[i] = U1.read(inputStream);
        }
    }
}
