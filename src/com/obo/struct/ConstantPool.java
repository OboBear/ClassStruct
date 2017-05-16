package com.obo.struct;

import com.obo.read.U1;
import com.obo.read.U2;
import com.obo.struct.constantinfo.ConstantInfo;
import com.obo.struct.constantinfo.ConstantInfoProducer;
import com.sun.tools.classfile.Code_attribute;

import java.io.InputStream;

/**
 * Created by obo on 2017/5/7.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class ConstantPool {
    public int contantPoolSize;
    public ConstantInfo[] constantInfos;
    public ConstantPool(int contantPoolSize) {
        this.contantPoolSize = contantPoolSize;
        this.constantInfos = new ConstantInfo[contantPoolSize];
    }

    public void read(InputStream inputStream) {
        for (int i = 1; i < contantPoolSize; i++) {
            short tag = U1.read(inputStream);
            constantInfos[i] = ConstantInfoProducer.produce(tag);
            constantInfos[i].read(inputStream);
            if (tag == ConstantInfo.CONSTANT_Double || tag == ConstantInfo.CONSTANT_Long) {
                i++;
            }
        }
    }

    @Override
    public String toString() {
        StringBuffer toString = new StringBuffer();
//        toString.append();
        return super.toString();
    }
}
