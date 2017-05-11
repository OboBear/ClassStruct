package com.obo;

import com.obo.read.U2;
import com.obo.read.U4;
import com.obo.struct.ClassFile;
import com.obo.struct.ConstantPool;
import com.obo.struct.fieldinfo.FieldInfo;
import com.obo.struct.methodInfo.MethodInfo;

import java.io.*;
import java.util.function.DoubleToLongFunction;

/**
 * Created by obo on 2017/5/4.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class ClassStructure {






    public static void main(String []args) throws FileNotFoundException {
        File file = new File("./Main.class");
        FileInputStream inputStream = new FileInputStream(file);
        ClassFile classFile = new ClassFile();
        // magic number
        classFile.magic = U4.read(inputStream);
        System.out.println("magic number:" + Long.toHexString(classFile.magic));
        // minor version
        classFile.minorVersion = U2.read(inputStream);
        System.out.println("minor version:" + Integer.toHexString(classFile.minorVersion));
        // major version
        classFile.majorVersion = U2.read(inputStream);
        System.out.println("major version:" + Integer.toHexString(classFile.majorVersion));
        // Read content pool
        int contentPoolCount = U2.read(inputStream);
        classFile.constantPool = new ConstantPool(contentPoolCount);
        classFile.constantPool.read(inputStream);
        // Access flag
        classFile.accessFlag = U2.read(inputStream);
        // This class
        classFile.thisClass = U2.read(inputStream);
        // Super class
        classFile.superClass = U2.read(inputStream);
        // interface count
        classFile.interfaceCount = U2.read(inputStream);
        classFile.interfaces = new int[classFile.interfaceCount];
        // interfaces
        for (int i = 0 ; i < classFile.interfaceCount; i ++) {
            classFile.interfaces[i] = U2.read(inputStream);
        }

        // fields_count
        classFile.fieldCount = U2.read(inputStream);
        classFile.fields = new FieldInfo[classFile.fieldCount];
        for (int i = 0; i < classFile.fieldCount; i++) {
            classFile.fields[i] = new FieldInfo();
            classFile.fields[i].read(inputStream);
        }

        classFile.methodCount = U2.read(inputStream);
        classFile.methods = new MethodInfo[classFile.methodCount];
        for (int i = 0; i < classFile.methodCount; i++) {

        }

        System.out.println("");

    }
}
