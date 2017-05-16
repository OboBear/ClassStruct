package com.obo.struct.methodInfo;

import com.obo.read.U2;
import com.obo.struct.attribute.Attribute;

import java.io.InputStream;

/**
 * Created by obo on 2017/5/11.
 */
public class MethodInfo {
    public int accessFlags; // U2
    public int nameIndex;   // U2
    public int descriptionIndex;    // U2
    public int attributeCount;  // U2
    public Attribute attributeInfos[];
    public void read(InputStream inputStream) {
        accessFlags = U2.read(inputStream);
        nameIndex = U2.read(inputStream);
        descriptionIndex = U2.read(inputStream);
        attributeCount = U2.read(inputStream);
        attributeInfos = new Attribute[attributeCount];
        for (int i = 0; i < attributeCount; i++) {
            attributeInfos[i] = new Attribute();
            attributeInfos[i].read(inputStream);
        }
    }
}
