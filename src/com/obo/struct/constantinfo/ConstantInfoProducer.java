package com.obo.struct.constantinfo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by obo on 2017/5/10.
 * Email:obo1993@gmail.com
 * Git:https://github.com/OboBear
 * Blog:http://blog.csdn.net/leilba
 */
public class ConstantInfoProducer {

    private static Map<Short, Class> constantInfoClass = new HashMap<>();
    static {
        constantInfoClass.put(ConstantInfo.CONSTANT_Class, ConstantClass.class);
        constantInfoClass.put(ConstantInfo.CONSTANT_Double, ConstantDouble.class);
        constantInfoClass.put(ConstantInfo.CONSTANT_Fieldref, ConstantFieldRef.class);
        constantInfoClass.put(ConstantInfo.CONSTANT_Float, ConstantFloat.class);
        constantInfoClass.put(ConstantInfo.CONSTANT_Integer, ConstantInteger.class);
        constantInfoClass.put(ConstantInfo.CONSTANT_InterfaceMethodref, ConstantInterfaceMethodRef.class);
        constantInfoClass.put(ConstantInfo.CONSTANT_Long, ConstantLong.class);
        constantInfoClass.put(ConstantInfo.CONSTANT_Methodref, ConstantMethodRef.class);
        constantInfoClass.put(ConstantInfo.CONSTANT_NameAndType, ConstantNameAndType.class);
        constantInfoClass.put(ConstantInfo.CONSTANT_String, ConstantString.class);
        constantInfoClass.put(ConstantInfo.CONSTANT_Utf8, ConstantUtf8.class);
    }

    public static ConstantInfo produce(short tag) {
        Class constantClass = constantInfoClass.get(tag);
        try {
            ConstantInfo constantInfo = (ConstantInfo) constantClass.newInstance();
            return constantInfo;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
