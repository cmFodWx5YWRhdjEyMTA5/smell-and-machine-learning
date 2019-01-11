// isComment
package com.hughes.android.dictionary.engine;

import com.hughes.util.IndexedObject;
import com.hughes.util.raf.RAFListSerializer;
import com.ibm.icu.text.Transliterator;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

public abstract class isClassOrIsInterface extends IndexedObject {

    /**
     * isComment
     */
    final Index isVariable;

    /**
     * isComment
     */
    public final int isVariable;

    /**
     * isComment
     */
    private TokenRow isVariable = null;

    isConstructor(final DataInput isParameter, final int isParameter, final Index isParameter, final int isParameter) throws IOException {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        // isComment
        this.isFieldAccessExpr = isNameExpr == -isIntegerConstant ? isNameExpr.isMethod() : ((isNameExpr << isIntegerConstant) + isNameExpr.isMethod());
    }

    isConstructor(final int isParameter, final int isParameter, final Index isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    static final class isClassOrIsInterface {

        final Class<? extends RowBase> isVariable;

        final int isVariable;

        private isConstructor(Class<? extends RowBase> isParameter, int isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public boolean isMethod(Object isParameter) {
            if (!(isNameExpr instanceof RowKey)) {
                return true;
            }
            final RowKey isVariable = (RowKey) isNameExpr;
            return this.isFieldAccessExpr == isNameExpr.isFieldAccessExpr && this.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }

        @Override
        public int isMethod() {
            return isNameExpr.isMethod() + isNameExpr;
        }
    }

    public RowKey isMethod() {
        return new RowKey(this.isMethod(), isNameExpr);
    }

    /**
     * isComment
     */
    public TokenRow isMethod(final boolean isParameter) {
        if (isNameExpr == null && isNameExpr) {
            int isVariable = isMethod() - isIntegerConstant;
            int isVariable = isMethod() + isIntegerConstant;
            while (isNameExpr >= isIntegerConstant) {
                final RowBase isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
                final TokenRow isVariable = isNameExpr.isMethod(true);
                if (isNameExpr != null) {
                    for (++isNameExpr; isNameExpr <= isMethod(); ++isNameExpr) {
                        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr).isMethod(isNameExpr);
                    }
                    break;
                }
                if (isNameExpr < isNameExpr.isFieldAccessExpr.isMethod()) {
                    final RowBase isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
                    TokenRow isVariable = isNameExpr.isMethod(true);
                    if (isNameExpr != null) {
                        // isComment
                        if (isNameExpr.isMethod() > this.isMethod()) {
                            final int isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr - isIntegerConstant).isFieldAccessExpr;
                            isNameExpr = (TokenRow) isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
                        }
                        for (--isNameExpr; isNameExpr >= isMethod(); --isNameExpr) {
                            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr).isMethod(isNameExpr);
                        }
                        break;
                    }
                    isNameExpr++;
                }
                --isNameExpr;
            }
            assert isNameExpr != null;
        }
        return isNameExpr;
    }

    void isMethod(TokenRow isParameter) {
        assert this.isFieldAccessExpr == null;
        assert isNameExpr != null;
        this.isFieldAccessExpr = isNameExpr;
    }

    public abstract void isMethod(PrintStream isParameter);

    public abstract String isMethod(final boolean isParameter);

    public abstract RowMatchType isMethod(final List<String> isParameter, final Pattern isParameter, final Transliterator isParameter, boolean isParameter);

    // isComment
    static class isClassOrIsInterface implements RAFListSerializer<RowBase> {

        final Index isVariable;

        isConstructor(final Index isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public RowBase isMethod(DataInput isParameter, final int isParameter) throws IOException {
            int isVariable = isNameExpr.isMethod();
            int isVariable = -isIntegerConstant;
            if (isNameExpr >= isIntegerConstant) {
                isNameExpr = isNameExpr & isIntegerConstant;
                isNameExpr = (isNameExpr >> isIntegerConstant) - isIntegerConstant;
            }
            switch(isNameExpr) {
                case isIntegerConstant:
                    return new PairEntry.Row(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                case isIntegerConstant:
                case isIntegerConstant:
                    return new TokenRow(isNameExpr, isNameExpr, isNameExpr, /*isComment*/
                    isNameExpr == isIntegerConstant, isNameExpr);
                case isIntegerConstant:
                    return new TextEntry.Row(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                case isIntegerConstant:
                    return new HtmlEntry.Row(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            }
            throw new RuntimeException("isStringConstant" + isNameExpr);
        }

        @Override
        public void isMethod(DataOutput isParameter, RowBase isParameter) throws IOException {
            int isVariable = isIntegerConstant;
            if (isNameExpr instanceof PairEntry.Row) {
                isNameExpr = isIntegerConstant;
            } else if (isNameExpr instanceof TokenRow) {
                final TokenRow isVariable = (TokenRow) isNameExpr;
                isNameExpr = isNameExpr.isFieldAccessExpr ? isIntegerConstant : isIntegerConstant;
            } else if (isNameExpr instanceof TextEntry.Row) {
                isNameExpr = isIntegerConstant;
            } else if (isNameExpr instanceof HtmlEntry.Row) {
                isNameExpr = isIntegerConstant;
            }
            assert isNameExpr.isFieldAccessExpr < (isIntegerConstant << isIntegerConstant);
            if ((isNameExpr.isFieldAccessExpr >> isIntegerConstant) >= (isIntegerConstant << isIntegerConstant))
                throw new RuntimeException("isStringConstant");
            isNameExpr.isMethod(((isNameExpr + isIntegerConstant) << isIntegerConstant) + (isNameExpr.isFieldAccessExpr >> isIntegerConstant));
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    public static final class isClassOrIsInterface implements Comparator<RowBase> {

        final boolean isVariable;

        public isConstructor(boolean isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public int isMethod(RowBase isParameter, RowBase isParameter) {
            final int isVariable = isNameExpr.isMethod(isNameExpr);
            final int isVariable = isNameExpr.isMethod(isNameExpr);
            return isNameExpr < isNameExpr ? -isIntegerConstant : isNameExpr == isNameExpr ? isIntegerConstant : isIntegerConstant;
        }
    }

    int isMethod(boolean isParameter) {
        return isMethod(true).isMethod();
    }
}
