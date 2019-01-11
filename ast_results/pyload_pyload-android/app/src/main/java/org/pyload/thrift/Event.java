// isComment
package org.pyload.thrift;

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
import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class isClassOrIsInterface implements TBase<Event, Event._Fields>, java.io.Serializable, Cloneable {

    private static final TStruct isVariable = new TStruct("isStringConstant");

    private static final TField isVariable = new TField("isStringConstant", isNameExpr.isFieldAccessExpr, (short) isIntegerConstant);

    private static final TField isVariable = new TField("isStringConstant", isNameExpr.isFieldAccessExpr, (short) isIntegerConstant);

    private static final TField isVariable = new TField("isStringConstant", isNameExpr.isFieldAccessExpr, (short) isIntegerConstant);

    private static final TField isVariable = new TField("isStringConstant", isNameExpr.isFieldAccessExpr, (short) isIntegerConstant);

    public String isVariable;

    public int isVariable;

    /**
     * isComment
     */
    public ElementType isVariable;

    /**
     * isComment
     */
    public Destination isVariable;

    /**
     * isComment
     */
    public enum _Fields implements TFieldIdEnum {

        EVENT((short) isIntegerConstant, "isStringConstant"),
        ID((short) isIntegerConstant, "isStringConstant"),
        /**
         * isComment
         */
        TYPE((short) isIntegerConstant, "isStringConstant"),
        /**
         * isComment
         */
        DESTINATION((short) isIntegerConstant, "isStringConstant");

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
                case // isComment
                isIntegerConstant:
                    return isNameExpr;
                case // isComment
                isIntegerConstant:
                    return isNameExpr;
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

    public static final Map<_Fields, FieldMetaData> isVariable;

    static {
        Map<_Fields, FieldMetaData> isVariable = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new FieldMetaData("isStringConstant", isNameExpr.isFieldAccessExpr, new FieldValueMetaData(isNameExpr.isFieldAccessExpr)));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new FieldMetaData("isStringConstant", isNameExpr.isFieldAccessExpr, new FieldValueMetaData(isNameExpr.isFieldAccessExpr)));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new FieldMetaData("isStringConstant", isNameExpr.isFieldAccessExpr, new EnumMetaData(isNameExpr.isFieldAccessExpr, ElementType.class)));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new FieldMetaData("isStringConstant", isNameExpr.isFieldAccessExpr, new EnumMetaData(isNameExpr.isFieldAccessExpr, Destination.class)));
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(Event.class, isNameExpr);
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
    public isConstructor(Event isParameter) {
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod()) {
            this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        }
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        if (isNameExpr.isMethod()) {
            this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        }
        if (isNameExpr.isMethod()) {
            this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        }
    }

    public Event isMethod() {
        return new Event(this);
    }

    @Override
    public void isMethod() {
        this.isFieldAccessExpr = null;
        isMethod(true);
        this.isFieldAccessExpr = isIntegerConstant;
        this.isFieldAccessExpr = null;
        this.isFieldAccessExpr = null;
    }

    public String isMethod() {
        return this.isFieldAccessExpr;
    }

    public Event isMethod(String isParameter) {
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

    public int isMethod() {
        return this.isFieldAccessExpr;
    }

    public Event isMethod(int isParameter) {
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

    /**
     * isComment
     */
    public ElementType isMethod() {
        return this.isFieldAccessExpr;
    }

    /**
     * isComment
     */
    public Event isMethod(ElementType isParameter) {
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

    /**
     * isComment
     */
    public Destination isMethod() {
        return this.isFieldAccessExpr;
    }

    /**
     * isComment
     */
    public Event isMethod(Destination isParameter) {
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
            case isNameExpr:
                if (isNameExpr == null) {
                    isMethod();
                } else {
                    isMethod((Integer) isNameExpr);
                }
                break;
            case isNameExpr:
                if (isNameExpr == null) {
                    isMethod();
                } else {
                    isMethod((ElementType) isNameExpr);
                }
                break;
            case isNameExpr:
                if (isNameExpr == null) {
                    isMethod();
                } else {
                    isMethod((Destination) isNameExpr);
                }
                break;
        }
    }

    public Object isMethod(_Fields isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                return isMethod();
            case isNameExpr:
                return new Integer(isMethod());
            case isNameExpr:
                return isMethod();
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
            case isNameExpr:
                return isMethod();
            case isNameExpr:
                return isMethod();
            case isNameExpr:
                return isMethod();
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr == null)
            return true;
        if (isNameExpr instanceof Event)
            return this.isMethod((Event) isNameExpr);
        return true;
    }

    public boolean isMethod(Event isParameter) {
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
        boolean isVariable = true && this.isMethod();
        boolean isVariable = true && isNameExpr.isMethod();
        if (isNameExpr || isNameExpr) {
            if (!(isNameExpr && isNameExpr))
                return true;
            if (this.isFieldAccessExpr != isNameExpr.isFieldAccessExpr)
                return true;
        }
        boolean isVariable = true && this.isMethod();
        boolean isVariable = true && isNameExpr.isMethod();
        if (isNameExpr || isNameExpr) {
            if (!(isNameExpr && isNameExpr))
                return true;
            if (!this.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr))
                return true;
        }
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

    public int isMethod(Event isParameter) {
        if (!isMethod().isMethod(isNameExpr.isMethod())) {
            return isMethod().isMethod().isMethod(isNameExpr.isMethod().isMethod());
        }
        int isVariable = isIntegerConstant;
        Event isVariable = (Event) isNameExpr;
        isNameExpr = isNameExpr.isMethod(isMethod()).isMethod(isNameExpr.isMethod());
        if (isNameExpr != isIntegerConstant) {
            return isNameExpr;
        }
        if (isMethod()) {
            isNameExpr = isNameExpr.isMethod(this.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            if (isNameExpr != isIntegerConstant) {
                return isNameExpr;
            }
        }
        isNameExpr = isNameExpr.isMethod(isMethod()).isMethod(isNameExpr.isMethod());
        if (isNameExpr != isIntegerConstant) {
            return isNameExpr;
        }
        if (isMethod()) {
            isNameExpr = isNameExpr.isMethod(this.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            if (isNameExpr != isIntegerConstant) {
                return isNameExpr;
            }
        }
        isNameExpr = isNameExpr.isMethod(isMethod()).isMethod(isNameExpr.isMethod());
        if (isNameExpr != isIntegerConstant) {
            return isNameExpr;
        }
        if (isMethod()) {
            isNameExpr = isNameExpr.isMethod(this.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            if (isNameExpr != isIntegerConstant) {
                return isNameExpr;
            }
        }
        isNameExpr = isNameExpr.isMethod(isMethod()).isMethod(isNameExpr.isMethod());
        if (isNameExpr != isIntegerConstant) {
            return isNameExpr;
        }
        if (isMethod()) {
            isNameExpr = isNameExpr.isMethod(this.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            if (isNameExpr != isIntegerConstant) {
                return isNameExpr;
            }
        }
        return isIntegerConstant;
    }

    public _Fields isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod(TProtocol isParameter) throws TException {
        TField isVariable;
        isNameExpr.isMethod();
        while (true) {
            isNameExpr = isNameExpr.isMethod();
            if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr) {
                break;
            }
            switch(isNameExpr.isFieldAccessExpr) {
                case // isComment
                isIntegerConstant:
                    if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr) {
                        this.isFieldAccessExpr = isNameExpr.isMethod();
                    } else {
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                    }
                    break;
                case // isComment
                isIntegerConstant:
                    if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr) {
                        this.isFieldAccessExpr = isNameExpr.isMethod();
                        isMethod(true);
                    } else {
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                    }
                    break;
                case // isComment
                isIntegerConstant:
                    if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr) {
                        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr.isMethod());
                    } else {
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                    }
                    break;
                case // isComment
                isIntegerConstant:
                    if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr) {
                        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr.isMethod());
                    } else {
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                    }
                    break;
                default:
                    isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
            }
            isNameExpr.isMethod();
        }
        isNameExpr.isMethod();
        // isComment
        isMethod();
    }

    public void isMethod(TProtocol isParameter) throws TException {
        isMethod();
        isNameExpr.isMethod(isNameExpr);
        if (this.isFieldAccessExpr != null) {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(this.isFieldAccessExpr);
            isNameExpr.isMethod();
        }
        if (isMethod()) {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(this.isFieldAccessExpr);
            isNameExpr.isMethod();
        }
        if (this.isFieldAccessExpr != null) {
            if (isMethod()) {
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(this.isFieldAccessExpr.isMethod());
                isNameExpr.isMethod();
            }
        }
        if (this.isFieldAccessExpr != null) {
            if (isMethod()) {
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(this.isFieldAccessExpr.isMethod());
                isNameExpr.isMethod();
            }
        }
        isNameExpr.isMethod();
        isNameExpr.isMethod();
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
        if (isMethod()) {
            if (!isNameExpr)
                isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(this.isFieldAccessExpr);
            isNameExpr = true;
        }
        if (isMethod()) {
            if (!isNameExpr)
                isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod("isStringConstant");
            if (this.isFieldAccessExpr == null) {
                isNameExpr.isMethod("isStringConstant");
            } else {
                isNameExpr.isMethod(this.isFieldAccessExpr);
            }
            isNameExpr = true;
        }
        if (isMethod()) {
            if (!isNameExpr)
                isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod("isStringConstant");
            if (this.isFieldAccessExpr == null) {
                isNameExpr.isMethod("isStringConstant");
            } else {
                isNameExpr.isMethod(this.isFieldAccessExpr);
            }
            isNameExpr = true;
        }
        isNameExpr.isMethod("isStringConstant");
        return isNameExpr.isMethod();
    }

    public void isMethod() throws TException {
    // isComment
    }
}
