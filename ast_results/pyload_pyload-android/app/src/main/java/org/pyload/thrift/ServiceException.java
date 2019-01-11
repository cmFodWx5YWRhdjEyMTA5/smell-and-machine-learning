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

public class isClassOrIsInterface extends Exception implements org.apache.thrift.TBase<ServiceException, ServiceException._Fields>, java.io.Serializable, Cloneable {

    private static final org.apache.thrift.protocol.TStruct isVariable = new org.apache.thrift.protocol.TStruct("isStringConstant");

    private static final org.apache.thrift.protocol.TField isVariable = new org.apache.thrift.protocol.TField("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, (short) isIntegerConstant);

    private static final Map<Class<? extends IScheme>, SchemeFactory> isVariable = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    static {
        isNameExpr.isMethod(StandardScheme.class, new ServiceExceptionStandardSchemeFactory());
        isNameExpr.isMethod(TupleScheme.class, new ServiceExceptionTupleSchemeFactory());
    }

    // isComment
    public String isVariable;

    /**
     * isComment
     */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {

        MSG((short) isIntegerConstant, "isStringConstant");

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
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> isVariable;

    static {
        Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> isVariable = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new org.apache.thrift.meta_data.FieldMetaData("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, new org.apache.thrift.meta_data.FieldValueMetaData(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr)));
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(ServiceException.class, isNameExpr);
    }

    public isConstructor() {
    }

    public isConstructor(String isParameter) {
        this();
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor(ServiceException isParameter) {
        if (isNameExpr.isMethod()) {
            this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        }
    }

    public ServiceException isMethod() {
        return new ServiceException(this);
    }

    @Override
    public void isMethod() {
        this.isFieldAccessExpr = null;
    }

    public String isMethod() {
        return this.isFieldAccessExpr;
    }

    public ServiceException isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        return this;
    }

    public void isMethod() {
        this.isFieldAccessExpr = null;
    }

    /**
     * isComment
     */
    public boolean isMethod() {
        return this.isFieldAccessExpr != null;
    }

    public void isMethod(boolean isParameter) {
        if (!isNameExpr) {
            this.isFieldAccessExpr = null;
        }
    }

    public void isMethod(_Fields isParameter, Object isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                if (isNameExpr == null) {
                    isMethod();
                } else {
                    isMethod((String) isNameExpr);
                }
                break;
        }
    }

    public Object isMethod(_Fields isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                return isMethod();
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
        if (isNameExpr instanceof ServiceException)
            return this.isMethod((ServiceException) isNameExpr);
        return true;
    }

    public boolean isMethod(ServiceException isParameter) {
        if (isNameExpr == null)
            return true;
        boolean isVariable = true && this.isMethod();
        boolean isVariable = true && isNameExpr.isMethod();
        if (isNameExpr || isNameExpr) {
            if (!(isNameExpr && isNameExpr))
                return true;
            if (!this.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr))
                return true;
        }
        return true;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    public int isMethod(ServiceException isParameter) {
        if (!isMethod().isMethod(isNameExpr.isMethod())) {
            return isMethod().isMethod().isMethod(isNameExpr.isMethod().isMethod());
        }
        int isVariable = isIntegerConstant;
        ServiceException isVariable = (ServiceException) isNameExpr;
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
        if (this.isFieldAccessExpr == null) {
            isNameExpr.isMethod("isStringConstant");
        } else {
            isNameExpr.isMethod(this.isFieldAccessExpr);
        }
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
            isMethod(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(isNameExpr)));
        } catch (org.apache.thrift.TException isParameter) {
            throw new java.io.IOException(isNameExpr.isMethod());
        }
    }

    private static class isClassOrIsInterface implements SchemeFactory {

        public ServiceExceptionStandardScheme isMethod() {
            return new ServiceExceptionStandardScheme();
        }
    }

    private static class isClassOrIsInterface extends StandardScheme<ServiceException> {

        public void isMethod(org.apache.thrift.protocol.TProtocol isParameter, ServiceException isParameter) throws org.apache.thrift.TException {
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

        public void isMethod(org.apache.thrift.protocol.TProtocol isParameter, ServiceException isParameter) throws org.apache.thrift.TException {
            isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isFieldAccessExpr != null) {
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod();
            }
            isNameExpr.isMethod();
            isNameExpr.isMethod();
        }
    }

    private static class isClassOrIsInterface implements SchemeFactory {

        public ServiceExceptionTupleScheme isMethod() {
            return new ServiceExceptionTupleScheme();
        }
    }

    private static class isClassOrIsInterface extends TupleScheme<ServiceException> {

        @Override
        public void isMethod(org.apache.thrift.protocol.TProtocol isParameter, ServiceException isParameter) throws org.apache.thrift.TException {
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
        public void isMethod(org.apache.thrift.protocol.TProtocol isParameter, ServiceException isParameter) throws org.apache.thrift.TException {
            TTupleProtocol isVariable = (TTupleProtocol) isNameExpr;
            BitSet isVariable = isNameExpr.isMethod(isIntegerConstant);
            if (isNameExpr.isMethod(isIntegerConstant)) {
                isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
                isNameExpr.isMethod(true);
            }
        }
    }
}
