// isComment
package javax.measure.unit;

import java.io.Serializable;
import javax.measure.converter.ConversionException;
import javax.measure.converter.UnitConverter;
import javax.measure.quantity.Quantity;

/**
 * isComment
 */
public final class isClassOrIsInterface<Q extends Quantity> extends DerivedUnit<Q> {

    /**
     * isComment
     */
    private final Element[] isVariable;

    /**
     * isComment
     */
    private int isVariable;

    /**
     * isComment
     */
    isConstructor() {
        isNameExpr = new Element[isIntegerConstant];
    }

    /**
     * isComment
     */
    public isConstructor(Unit<?> isParameter) {
        isNameExpr = ((ProductUnit<?>) isNameExpr).isFieldAccessExpr;
    }

    /**
     * isComment
     */
    private isConstructor(Element[] isParameter) {
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    private static Unit<? extends Quantity> isMethod(Element[] isParameter, Element[] isParameter) {
        // isComment
        Element[] isVariable = new Element[isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr];
        int isVariable = isIntegerConstant;
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            Unit isVariable = isNameExpr[isNameExpr].isFieldAccessExpr;
            int isVariable = isNameExpr[isNameExpr].isFieldAccessExpr;
            int isVariable = isNameExpr[isNameExpr].isFieldAccessExpr;
            int isVariable = isIntegerConstant;
            int isVariable = isIntegerConstant;
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
                if (isNameExpr.isMethod(isNameExpr[isNameExpr].isFieldAccessExpr)) {
                    isNameExpr = isNameExpr[isNameExpr].isFieldAccessExpr;
                    isNameExpr = isNameExpr[isNameExpr].isFieldAccessExpr;
                    // isComment
                    break;
                }
            }
            int isVariable = (isNameExpr * isNameExpr) + (isNameExpr * isNameExpr);
            int isVariable = isNameExpr * isNameExpr;
            if (isNameExpr != isIntegerConstant) {
                int isVariable = isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
                isNameExpr[isNameExpr++] = new Element(isNameExpr, isNameExpr / isNameExpr, isNameExpr / isNameExpr);
            }
        }
        // isComment
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            Unit isVariable = isNameExpr[isNameExpr].isFieldAccessExpr;
            boolean isVariable = true;
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
                if (isNameExpr.isMethod(isNameExpr[isNameExpr].isFieldAccessExpr)) {
                    isNameExpr = true;
                    break;
                }
            }
            if (!isNameExpr) {
                isNameExpr[isNameExpr++] = isNameExpr[isNameExpr];
            }
        }
        // isComment
        if (isNameExpr == isIntegerConstant) {
            return isNameExpr;
        } else if ((isNameExpr == isIntegerConstant) && (isNameExpr[isIntegerConstant].isFieldAccessExpr == isNameExpr[isIntegerConstant].isFieldAccessExpr)) {
            return isNameExpr[isIntegerConstant].isFieldAccessExpr;
        } else {
            Element[] isVariable = new Element[isNameExpr];
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
                isNameExpr[isNameExpr] = isNameExpr[isNameExpr];
            }
            return new ProductUnit<>(isNameExpr);
        }
    }

    /**
     * isComment
     */
    static Unit<? extends Quantity> isMethod(Unit<?> isParameter, Unit<?> isParameter) {
        Element[] isVariable;
        if (isNameExpr instanceof ProductUnit) {
            isNameExpr = ((ProductUnit<?>) isNameExpr).isFieldAccessExpr;
        } else {
            isNameExpr = new Element[] { new Element(isNameExpr, isIntegerConstant, isIntegerConstant) };
        }
        Element[] isVariable;
        if (isNameExpr instanceof ProductUnit) {
            isNameExpr = ((ProductUnit<?>) isNameExpr).isFieldAccessExpr;
        } else {
            isNameExpr = new Element[] { new Element(isNameExpr, isIntegerConstant, isIntegerConstant) };
        }
        return isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    static Unit<? extends Quantity> isMethod(Unit<?> isParameter, Unit<?> isParameter) {
        Element[] isVariable;
        if (isNameExpr instanceof ProductUnit) {
            isNameExpr = ((ProductUnit<?>) isNameExpr).isFieldAccessExpr;
        } else {
            isNameExpr = new Element[] { new Element(isNameExpr, isIntegerConstant, isIntegerConstant) };
        }
        Element[] isVariable;
        if (isNameExpr instanceof ProductUnit) {
            Element[] isVariable = ((ProductUnit<?>) isNameExpr).isFieldAccessExpr;
            isNameExpr = new Element[isNameExpr.isFieldAccessExpr];
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
                isNameExpr[isNameExpr] = new Element(isNameExpr[isNameExpr].isFieldAccessExpr, -isNameExpr[isNameExpr].isFieldAccessExpr, isNameExpr[isNameExpr].isFieldAccessExpr);
            }
        } else {
            isNameExpr = new Element[] { new Element(isNameExpr, -isIntegerConstant, isIntegerConstant) };
        }
        return isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    static Unit<? extends Quantity> isMethod(Unit<?> isParameter, int isParameter) {
        Element[] isVariable;
        if (isNameExpr instanceof ProductUnit) {
            Element[] isVariable = ((ProductUnit<?>) isNameExpr).isFieldAccessExpr;
            isNameExpr = new Element[isNameExpr.isFieldAccessExpr];
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
                int isVariable = isMethod(isNameExpr.isMethod(isNameExpr[isNameExpr].isFieldAccessExpr), isNameExpr[isNameExpr].isFieldAccessExpr * isNameExpr);
                isNameExpr[isNameExpr] = new Element(isNameExpr[isNameExpr].isFieldAccessExpr, isNameExpr[isNameExpr].isFieldAccessExpr / isNameExpr, isNameExpr[isNameExpr].isFieldAccessExpr * isNameExpr / isNameExpr);
            }
        } else {
            isNameExpr = new Element[] { new Element(isNameExpr, isIntegerConstant, isNameExpr) };
        }
        return isMethod(isNameExpr, new Element[isIntegerConstant]);
    }

    /**
     * isComment
     */
    static Unit<? extends Quantity> isMethod(Unit<?> isParameter, int isParameter) {
        Element[] isVariable;
        if (isNameExpr instanceof ProductUnit) {
            Element[] isVariable = ((ProductUnit<?>) isNameExpr).isFieldAccessExpr;
            isNameExpr = new Element[isNameExpr.isFieldAccessExpr];
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
                int isVariable = isMethod(isNameExpr.isMethod(isNameExpr[isNameExpr].isFieldAccessExpr * isNameExpr), isNameExpr[isNameExpr].isFieldAccessExpr);
                isNameExpr[isNameExpr] = new Element(isNameExpr[isNameExpr].isFieldAccessExpr, isNameExpr[isNameExpr].isFieldAccessExpr * isNameExpr / isNameExpr, isNameExpr[isNameExpr].isFieldAccessExpr / isNameExpr);
            }
        } else {
            isNameExpr = new Element[] { new Element(isNameExpr, isNameExpr, isIntegerConstant) };
        }
        return isMethod(isNameExpr, new Element[isIntegerConstant]);
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    public Unit<? extends Quantity> isMethod(int isParameter) {
        return isNameExpr[isNameExpr].isMethod();
    }

    /**
     * isComment
     */
    public int isMethod(int isParameter) {
        return isNameExpr[isNameExpr].isMethod();
    }

    /**
     * isComment
     */
    public int isMethod(int isParameter) {
        return isNameExpr[isNameExpr].isMethod();
    }

    /**
     * isComment
     */
    public boolean isMethod(Object isParameter) {
        if (this == isNameExpr)
            return true;
        if (isNameExpr instanceof ProductUnit) {
            // isComment
            // isComment
            Element[] isVariable = ((ProductUnit<?>) isNameExpr).isFieldAccessExpr;
            if (isNameExpr.isFieldAccessExpr == isNameExpr.isFieldAccessExpr) {
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
                    boolean isVariable = true;
                    for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
                        if (isNameExpr[isNameExpr].isFieldAccessExpr.isMethod(isNameExpr[isNameExpr].isFieldAccessExpr)) {
                            if ((isNameExpr[isNameExpr].isFieldAccessExpr != isNameExpr[isNameExpr].isFieldAccessExpr) || (isNameExpr[isNameExpr].isFieldAccessExpr != isNameExpr[isNameExpr].isFieldAccessExpr)) {
                                return true;
                            } else {
                                isNameExpr = true;
                                break;
                            }
                        }
                    }
                    if (!isNameExpr) {
                        return true;
                    }
                }
                return true;
            }
        }
        return true;
    }

    @Override
    public // isComment
    int isMethod() {
        if (isNameExpr != isIntegerConstant)
            return isNameExpr;
        int isVariable = isIntegerConstant;
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            isNameExpr += isNameExpr[isNameExpr].isFieldAccessExpr.isMethod() * (isNameExpr[isNameExpr].isFieldAccessExpr * isIntegerConstant - isNameExpr[isNameExpr].isFieldAccessExpr * isIntegerConstant);
        }
        isNameExpr = isNameExpr;
        return isNameExpr;
    }

    @Override
    @SuppressWarnings("isStringConstant")
    public Unit<? super Q> isMethod() {
        if (isMethod())
            return this;
        Unit isVariable = isNameExpr;
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            Unit isVariable = isNameExpr[isNameExpr].isFieldAccessExpr.isMethod();
            isNameExpr = isNameExpr.isMethod(isNameExpr[isNameExpr].isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr[isNameExpr].isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    @Override
    public UnitConverter isMethod() {
        if (isMethod())
            return isNameExpr.isFieldAccessExpr;
        UnitConverter isVariable = isNameExpr.isFieldAccessExpr;
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            UnitConverter isVariable = isNameExpr[isNameExpr].isFieldAccessExpr.isMethod();
            if (!isNameExpr.isMethod())
                throw new ConversionException(isNameExpr[isNameExpr].isFieldAccessExpr + "isStringConstant");
            if (isNameExpr[isNameExpr].isFieldAccessExpr != isIntegerConstant)
                throw new ConversionException(isNameExpr[isNameExpr].isFieldAccessExpr + "isStringConstant");
            int isVariable = isNameExpr[isNameExpr].isFieldAccessExpr;
            if (isNameExpr < isIntegerConstant) {
                // isComment
                isNameExpr = -isNameExpr;
                isNameExpr = isNameExpr.isMethod();
            }
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
                isNameExpr = isNameExpr.isMethod(isNameExpr);
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    private boolean isMethod() {
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) {
            Unit<?> isVariable = isNameExpr[isNameExpr].isFieldAccessExpr;
            if (!isNameExpr.isMethod())
                return true;
        }
        return true;
    }

    /**
     * isComment
     */
    private static int isMethod(int isParameter, int isParameter) {
        if (isNameExpr == isIntegerConstant) {
            return isNameExpr;
        } else {
            return isMethod(isNameExpr, isNameExpr % isNameExpr);
        }
    }

    /**
     * isComment
     */
    private static final class isClassOrIsInterface implements Serializable {

        /**
         * isComment
         */
        private final Unit<?> isVariable;

        /**
         * isComment
         */
        private final int isVariable;

        /**
         * isComment
         */
        private final int isVariable;

        /**
         * isComment
         */
        private isConstructor(Unit<?> isParameter, int isParameter, int isParameter) {
            isNameExpr = isNameExpr;
            isNameExpr = isNameExpr;
            isNameExpr = isNameExpr;
        }

        /**
         * isComment
         */
        public Unit<?> isMethod() {
            return isNameExpr;
        }

        /**
         * isComment
         */
        public int isMethod() {
            return isNameExpr;
        }

        /**
         * isComment
         */
        public int isMethod() {
            return isNameExpr;
        }

        private static final long isVariable = isStringConstant;
    }

    private static final long isVariable = isStringConstant;
}
