package com.obo.struct.attribute;

import com.obo.read.U1;
import com.obo.read.U2;
import com.obo.read.U4;

import java.io.InputStream;

/**
 * Created by obo on 2017/5/11.
 */
public class Attribute {

    public static final String AnnotationDefault = "AnnotationDefault";
    public static final String BootstrapMethods = "BootstrapMethods";
    public static final String CharacterRangeTable = "CharacterRangeTable";
    public static final String Code = "Code";
    public static final String ConstantValue = "ConstantValue_attribute";
    public static final String CompilationID = "CompilationID";
    public static final String Deprecated = "Deprecated";
    public static final String EnclosingMethod = "EnclosingMethod";
    public static final String Exceptions = "Exceptions";
    public static final String InnerClasses = "InnerClasses";
    public static final String LineNumberTable = "LineNumberTable";
    public static final String LocalVariableTable = "LocalVariableTable";
    public static final String LocalVariableTypeTable = "LocalVariableTypeTable";
    public static final String MethodParameters = "MethodParameters";
    public static final String RuntimeVisibleAnnotations = "RuntimeVisibleAnnotations";
    public static final String RuntimeInvisibleAnnotations = "RuntimeInvisibleAnnotations";
    public static final String RuntimeVisibleParameterAnnotations = "RuntimeVisibleParameterAnnotations";
    public static final String RuntimeInvisibleParameterAnnotations = "RuntimeInvisibleParameterAnnotations";
    public static final String RuntimeVisibleTypeAnnotations = "RuntimeVisibleTypeAnnotations";
    public static final String RuntimeInvisibleTypeAnnotations = "RuntimeInvisibleTypeAnnotations";
    public static final String Signature = "Signature";
    public static final String SourceDebugExtension = "SourceDebugExtension";
    public static final String SourceFile = "SourceFile";
    public static final String SourceID = "SourceID";
    public static final String StackMap = "StackMap";
    public static final String StackMapTable = "StackMapTable";
    public static final String Synthetic = "Synthetic";

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
