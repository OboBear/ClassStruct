package com.obo;

import com.obo.read.U2;
import com.obo.read.U4;
import com.obo.struct.ClassFile;
import com.obo.struct.ConstantPool;

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
        classFile.magic = U4.read(inputStream);
        System.out.println("magic number:" + Long.toHexString(classFile.magic));
        classFile.minorVersion = U2.read(inputStream);
        System.out.println("minor version:" + Integer.toHexString(classFile.minorVersion));
        classFile.majorVersion = U2.read(inputStream);
        System.out.println("major version:" + Integer.toHexString(classFile.majorVersion));

        // Read content pool
        int contentPoolCount = U2.read(inputStream);
        classFile.constantPool = new ConstantPool(contentPoolCount);
        classFile.constantPool.read(inputStream);
        //  Access flag
        classFile.accessFlag = U2.read(inputStream);
        classFile.thisClass = U2.read(inputStream);
        classFile.superClass = U2.read(inputStream);
        classFile.interfaceCount = U2.read(inputStream);
        
        System.out.println("");

    }
}
