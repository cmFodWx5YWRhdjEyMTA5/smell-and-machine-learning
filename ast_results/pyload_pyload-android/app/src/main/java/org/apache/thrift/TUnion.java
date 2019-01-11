// isComment
package org.apache.thrift;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.nio.ByteBuffer;
import org.apache.thrift.TUnion.TUnionStandardScheme;
import org.apache.thrift.protocol.TField;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.protocol.TStruct;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

public abstract class isClassOrIsInterface<T extends TUnion<?, ?>, F extends TFieldIdEnum> implements TBase<T, F> {

    protected Object isVariable;

    protected F isVariable;

    protected isConstructor() {
        isNameExpr = null;
        isNameExpr = null;
    }

    private static final Map<Class<? extends IScheme>, SchemeFactory> isVariable = new HashMap<Class<? extends IScheme>, SchemeFactory>();

    static {
        isNameExpr.isMethod(StandardScheme.class, new TUnionStandardSchemeFactory());
        isNameExpr.isMethod(TupleScheme.class, new TUnionTupleSchemeFactory());
    }

    protected isConstructor(F isParameter, Object isParameter) {
        isMethod(isNameExpr, isNameExpr);
    }

    protected isConstructor(TUnion<T, F> isParameter) {
        if (!isNameExpr.isMethod().isMethod(this.isMethod())) {
            throw new ClassCastException();
        }
        isNameExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr);
    }

    private static Object isMethod(Object isParameter) {
        if (isNameExpr instanceof TBase) {
            return ((TBase) isNameExpr).isMethod();
        } else if (isNameExpr instanceof ByteBuffer) {
            return isNameExpr.isMethod((ByteBuffer) isNameExpr);
        } else if (isNameExpr instanceof List) {
            return isMethod((List) isNameExpr);
        } else if (isNameExpr instanceof Set) {
            return isMethod((Set) isNameExpr);
        } else if (isNameExpr instanceof Map) {
            return isMethod((Map) isNameExpr);
        } else {
            return isNameExpr;
        }
    }

    private static Map isMethod(Map<Object, Object> isParameter) {
        Map isVariable = new HashMap();
        for (Map.Entry<Object, Object> isVariable : isNameExpr.isMethod()) {
            isNameExpr.isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isMethod()));
        }
        return isNameExpr;
    }

    private static Set isMethod(Set isParameter) {
        Set isVariable = new HashSet();
        for (Object isVariable : isNameExpr) {
            isNameExpr.isMethod(isMethod(isNameExpr));
        }
        return isNameExpr;
    }

    private static List isMethod(List isParameter) {
        List isVariable = new ArrayList(isNameExpr.isMethod());
        for (Object isVariable : isNameExpr) {
            isNameExpr.isMethod(isMethod(isNameExpr));
        }
        return isNameExpr;
    }

    public F isMethod() {
        return isNameExpr;
    }

    public Object isMethod() {
        return isNameExpr;
    }

    public Object isMethod(F isParameter) {
        if (isNameExpr != isNameExpr) {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr);
        }
        return isMethod();
    }

    public Object isMethod(int isParameter) {
        return isMethod(isMethod((short) isNameExpr));
    }

    public boolean isMethod() {
        return isNameExpr != null;
    }

    public boolean isMethod(F isParameter) {
        return isNameExpr == isNameExpr;
    }

    public boolean isMethod(int isParameter) {
        return isMethod(isMethod((short) isNameExpr));
    }

    public void isMethod(TProtocol isParameter) throws TException {
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod().isMethod(isNameExpr, this);
    }

    public void isMethod(F isParameter, Object isParameter) {
        isMethod(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    public void isMethod(int isParameter, Object isParameter) {
        isMethod(isMethod((short) isNameExpr), isNameExpr);
    }

    public void isMethod(TProtocol isParameter) throws TException {
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod().isMethod(isNameExpr, this);
    }

    /**
     * isComment
     */
    protected abstract void isMethod(F isParameter, Object isParameter) throws ClassCastException;

    /**
     * isComment
     */
    protected abstract Object isMethod(TProtocol isParameter, TField isParameter) throws TException;

    protected abstract void isMethod(TProtocol isParameter) throws TException;

    protected abstract Object isMethod(TProtocol isParameter, short isParameter) throws TException;

    protected abstract void isMethod(TProtocol isParameter) throws TException;

    protected abstract TStruct isMethod();

    protected abstract TField isMethod(F isParameter);

    protected abstract F isMethod(short isParameter);

    @Override
    public String isMethod() {
        StringBuilder isVariable = new StringBuilder();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(this.isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant");
        if (isMethod() != null) {
            Object isVariable = isMethod();
            isNameExpr.isMethod(isMethod(isMethod()).isFieldAccessExpr);
            isNameExpr.isMethod("isStringConstant");
            if (isNameExpr instanceof ByteBuffer) {
                isNameExpr.isMethod((ByteBuffer) isNameExpr, isNameExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
        }
        isNameExpr.isMethod("isStringConstant");
        return isNameExpr.isMethod();
    }

    public final void isMethod() {
        this.isFieldAccessExpr = null;
        this.isFieldAccessExpr = null;
    }

    private static class isClassOrIsInterface implements SchemeFactory {

        public TUnionStandardScheme isMethod() {
            return new TUnionStandardScheme();
        }
    }

    public static class isClassOrIsInterface extends StandardScheme<TUnion> {

        @Override
        public void isMethod(TProtocol isParameter, TUnion isParameter) throws TException {
            isNameExpr.isFieldAccessExpr = null;
            isNameExpr.isFieldAccessExpr = null;
            isNameExpr.isMethod();
            TField isVariable = isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
            if (isNameExpr.isFieldAccessExpr != null) {
                isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
            isNameExpr.isMethod();
            // isComment
            // isComment
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isMethod();
        }

        @Override
        public void isMethod(TProtocol isParameter, TUnion isParameter) throws TException {
            if (isNameExpr.isMethod() == null || isNameExpr.isMethod() == null) {
                throw new TProtocolException("isStringConstant");
            }
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
            isNameExpr.isMethod();
            isNameExpr.isMethod();
        }
    }

    private static class isClassOrIsInterface implements SchemeFactory {

        public TUnionStandardScheme isMethod() {
            return new TUnionStandardScheme();
        }
    }

    public static class isClassOrIsInterface extends TupleScheme<TUnion> {

        @Override
        public void isMethod(TProtocol isParameter, TUnion isParameter) throws TException {
            isNameExpr.isFieldAccessExpr = null;
            isNameExpr.isFieldAccessExpr = null;
            short isVariable = isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
            if (isNameExpr.isFieldAccessExpr != null) {
                isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
            }
        }

        @Override
        public void isMethod(TProtocol isParameter, TUnion isParameter) throws TException {
            if (isNameExpr.isMethod() == null || isNameExpr.isMethod() == null) {
                throw new TProtocolException("isStringConstant");
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod());
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
