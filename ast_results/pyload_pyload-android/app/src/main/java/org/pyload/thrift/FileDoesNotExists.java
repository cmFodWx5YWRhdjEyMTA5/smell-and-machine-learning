// isComment
package org.pyload.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class isClassOrIsInterface extends Exception implements org.apache.thrift.TBase<FileDoesNotExists, FileDoesNotExists._Fields>, java.io.Serializable, Cloneable {

    private static final org.apache.thrift.protocol.TStruct isVariable = new org.apache.thrift.protocol.TStruct("isStringConstant");

    private static final org.apache.thrift.protocol.TField isVariable = new org.apache.thrift.protocol.TField("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, (short) isIntegerConstant);

    private static final Map<Class<? extends IScheme>, SchemeFactory> isVariable = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    static {
        isNameExpr.isMethod(StandardScheme.class, new FileDoesNotExistsStandardSchemeFactory());
        isNameExpr.isMethod(TupleScheme.class, new FileDoesNotExistsTupleSchemeFactory());
    }

    // isComment
    public int isVariable;

    /**
     * isComment
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {

        FID((short) isIntegerConstant, "isStringConstant");

        private static final Map<String, _Fields> isVariable = new HashMap<String, _Fields>();

        static {
            for (_Fields isVariable : isNameExpr.isMethod(_Fields.class)) {
                isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
            }
        }

        /**
         * isComment
         */
        public static _Fields isMethod(int isParameter) {
            switch(isNameExpr) {
                case // isComment
                isIntegerConstant:
                    return isNameExpr;
                default:
                    return null;
            }
        }

        /**
         * isComment
         */
        public static _Fields isMethod(int isParameter) {
            _Fields isVariable = isMethod(isNameExpr);
            if (isNameExpr == null)
                throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant");
            return isNameExpr;
        }

        /**
         * isComment
         */
        public static _Fields isMethod(String isParameter) {
            return isNameExpr.isMethod(isNameExpr);
        }

        private final short isVariable;

        private final String isVariable;

        isConstructor(short isParameter, String isParameter) {
            isNameExpr = isNameExpr;
            isNameExpr = isNameExpr;
        }

        public short isMethod() {
            return isNameExpr;
        }

        public String isMethod() {
            return isNameExpr;
        }
    }

    // isComment
    private static final int isVariable = isIntegerConstant;

    private BitSet isVariable = new BitSet(isIntegerConstant);

    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> isVariable;

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> isVariable = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new org.apache.thrift.meta_data.FieldMetaData("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, new org.apache.thrift.meta_data.FieldValueMetaData(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant")));
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(FileDoesNotExists.class, isNameExpr);
    }

    public isConstructor() {
    }

    public isConstructor(int isParameter) {
        this();
        this.isFieldAccessExpr = isNameExpr;
        isMethod(true);
    }

    /**
     * isComment
     */
    public isConstructor(FileDoesNotExists isParameter) {
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
    }

    public FileDoesNotExists isMethod() {
        return new FileDoesNotExists(this);
    }

    @Override
    public void isMethod() {
        isMethod(true);
        this.isFieldAccessExpr = isIntegerConstant;
    }

    public int isMethod() {
        return this.isFieldAccessExpr;
    }

    public FileDoesNotExists isMethod(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isMethod(true);
        return this;
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public boolean isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod(boolean isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    public void isMethod(_Fields isParameter, Object isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                if (isNameExpr == null) {
                    isMethod();
                } else {
                    isMethod((Integer) isNameExpr);
                }
                break;
        }
    }

    public Object isMethod(_Fields isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                return isNameExpr.isMethod(isMethod());
        }
        throw new IllegalStateException();
    }

    /**
     * isComment
     */
    public boolean isMethod(_Fields isParameter) {
        if (isNameExpr == null) {
            throw new IllegalArgumentException();
        }
        switch(isNameExpr) {
            case isNameExpr:
                return isMethod();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr == null)
            return true;
        if (isNameExpr instanceof FileDoesNotExists)
            return this.isMethod((FileDoesNotExists) isNameExpr);
        return true;
    }

    public boolean isMethod(FileDoesNotExists isParameter) {
        if (isNameExpr == null)
            return true;
        boolean isVariable = true;
        boolean isVariable = true;
        if (isNameExpr || isNameExpr) {
            if (!(isNameExpr && isNameExpr))
                return true;
            if (this.isFieldAccessExpr != isNameExpr.isFieldAccessExpr)
                return true;
        }
        return true;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    public int isMethod(FileDoesNotExists isParameter) {
        if (!isMethod().isMethod(isNameExpr.isMethod())) {
            return isMethod().isMethod().isMethod(isNameExpr.isMethod().isMethod());
        }
        int isVariable = isIntegerConstant;
        FileDoesNotExists isVariable = (FileDoesNotExists) isNameExpr;
        isNameExpr = isNameExpr.isMethod(isMethod()).isMethod(isNameExpr.isMethod());
        if (isNameExpr != isIntegerConstant) {
            return isNameExpr;
        }
        if (isMethod()) {
            isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(this.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            if (isNameExpr != isIntegerConstant) {
                return isNameExpr;
            }
        }
        return isIntegerConstant;
    }

    public _Fields isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod(org.apache.thrift.protocol.TProtocol isParameter) throws org.apache.thrift.TException {
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod().isMethod(isNameExpr, this);
    }

    public void isMethod(org.apache.thrift.protocol.TProtocol isParameter) throws org.apache.thrift.TException {
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod().isMethod(isNameExpr, this);
    }

    @Override
    public String isMethod() {
        StringBuilder isVariable = new StringBuilder("isStringConstant");
        boolean isVariable = true;
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(this.isFieldAccessExpr);
        isNameExpr = true;
        isNameExpr.isMethod("isStringConstant");
        return isNameExpr.isMethod();
    }

    public void isMethod() throws org.apache.thrift.TException {
    // isComment
    }

    private void isMethod(java.io.ObjectOutputStream isParameter) throws java.io.IOException {
        try {
            isMethod(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(isNameExpr)));
        } catch (org.apache.thrift.TException isParameter) {
            throw new java.io.IOException(isNameExpr.isMethod());
        }
    }

    private void isMethod(java.io.ObjectInputStream isParameter) throws java.io.IOException, ClassNotFoundException {
        try {
            // isComment
            isNameExpr = new BitSet(isIntegerConstant);
            isMethod(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(isNameExpr)));
        } catch (org.apache.thrift.TException isParameter) {
            throw new java.io.IOException(isNameExpr.isMethod());
        }
    }

    private static class isClassOrIsInterface implements SchemeFactory {

        public FileDoesNotExistsStandardScheme isMethod() {
            return new FileDoesNotExistsStandardScheme();
        }
    }

    private static class isClassOrIsInterface extends StandardScheme<FileDoesNotExists> {

        public void isMethod(org.apache.thrift.protocol.TProtocol isParameter, FileDoesNotExists isParameter) throws org.apache.thrift.TException {
            org.apache.thrift.protocol.TField isVariable;
            isNameExpr.isMethod();
            while (true) {
                isNameExpr = isNameExpr.isMethod();
                if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr) {
                    break;
                }
                switch(isNameExpr.isFieldAccessExpr) {
                    case // isComment
                    isIntegerConstant:
                        if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr) {
                            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
                            isNameExpr.isMethod(true);
                        } else {
                            isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                        }
                        break;
                    default:
                        isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                }
                isNameExpr.isMethod();
            }
            isNameExpr.isMethod();
            // isComment
            isNameExpr.isMethod();
        }

        public void isMethod(org.apache.thrift.protocol.TProtocol isParameter, FileDoesNotExists isParameter) throws org.apache.thrift.TException {
            isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod();
            isNameExpr.isMethod();
            isNameExpr.isMethod();
        }
    }

    private static class isClassOrIsInterface implements SchemeFactory {

        public FileDoesNotExistsTupleScheme isMethod() {
            return new FileDoesNotExistsTupleScheme();
        }
    }

    private static class isClassOrIsInterface extends TupleScheme<FileDoesNotExists> {

        @Override
        public void isMethod(org.apache.thrift.protocol.TProtocol isParameter, FileDoesNotExists isParameter) throws org.apache.thrift.TException {
            TTupleProtocol isVariable = (TTupleProtocol) isNameExpr;
            BitSet isVariable = new BitSet();
            if (isNameExpr.isMethod()) {
                isNameExpr.isMethod(isIntegerConstant);
            }
            isNameExpr.isMethod(isNameExpr, isIntegerConstant);
            if (isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        }

        @Override
        public void isMethod(org.apache.thrift.protocol.TProtocol isParameter, FileDoesNotExists isParameter) throws org.apache.thrift.TException {
            TTupleProtocol isVariable = (TTupleProtocol) isNameExpr;
            BitSet isVariable = isNameExpr.isMethod(isIntegerConstant);
            if (isNameExpr.isMethod(isIntegerConstant)) {
                isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
                isNameExpr.isMethod(true);
            }
        }
    }
}
