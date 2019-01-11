// isComment
package com.hughes.android.dictionary.engine;

import com.hughes.util.StringUtil;
import com.hughes.util.raf.RAFListSerializerSkippable;
import com.hughes.util.raf.RAFSerializable;
import com.ibm.icu.text.Transliterator;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class isClassOrIsInterface extends AbstractEntry implements RAFSerializable<PairEntry>, Comparable<PairEntry> {

    public final List<Pair> isVariable;

    public isConstructor(final EntrySource isParameter) {
        super(isNameExpr);
        isNameExpr = new ArrayList<>(isIntegerConstant);
    }

    public isConstructor(final EntrySource isParameter, final String isParameter, final String isParameter) {
        this(isNameExpr);
        this.isFieldAccessExpr.isMethod(new Pair(isNameExpr, isNameExpr));
    }

    public isConstructor(final Dictionary isParameter, final DataInput isParameter, final int isParameter) throws IOException {
        super(isNameExpr, isNameExpr, isNameExpr);
        final int isVariable = isNameExpr.isFieldAccessExpr >= isIntegerConstant ? isNameExpr.isMethod(isNameExpr) : isNameExpr.isMethod();
        // isComment
        if (isNameExpr == isIntegerConstant)
            isNameExpr = isNameExpr.isMethod(new Pair(isNameExpr.isMethod(), isNameExpr.isMethod()));
        else {
            isNameExpr = new ArrayList<>(isNameExpr);
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; ++isNameExpr) {
                isNameExpr.isMethod(new Pair(isNameExpr.isMethod(), isNameExpr.isMethod()));
            }
        }
    }

    @Override
    public void isMethod(DataOutput isParameter) throws IOException {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); ++isNameExpr) {
            assert isNameExpr.isMethod(isNameExpr).isFieldAccessExpr.isMethod() > isIntegerConstant;
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isFieldAccessExpr);
        }
    }

    static final class isClassOrIsInterface implements RAFListSerializerSkippable<PairEntry> {

        final Dictionary isVariable;

        isConstructor(Dictionary isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public PairEntry isMethod(DataInput isParameter, int isParameter) throws IOException {
            return new PairEntry(isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public void isMethod(DataInput isParameter, int isParameter) throws IOException {
            final int isVariable;
            if (isNameExpr.isFieldAccessExpr >= isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr);
                isNameExpr = isNameExpr.isMethod(isNameExpr);
            } else {
                isNameExpr.isMethod(isIntegerConstant);
                isNameExpr = isNameExpr.isMethod();
            }
            for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant * isNameExpr; ++isNameExpr) {
                int isVariable = isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr);
            }
        }

        @Override
        public void isMethod(DataOutput isParameter, PairEntry isParameter) throws IOException {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(final Dictionary isParameter) {
        assert isNameExpr == -isIntegerConstant;
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isNameExpr = isNameExpr.isFieldAccessExpr.isMethod() - isIntegerConstant;
    }

    @Override
    public RowBase isMethod(int isParameter, Index isParameter) {
        return new Row(this.isFieldAccessExpr, isNameExpr, isNameExpr);
    }

    public static class isClassOrIsInterface extends RowBase {

        isConstructor(final DataInput isParameter, final int isParameter, final Index isParameter, int isParameter) throws IOException {
            super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        }

        isConstructor(final int isParameter, final int isParameter, final Index isParameter) {
            super(isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public String isMethod() {
            return isMethod(true);
        }

        public PairEntry isMethod() {
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(isNameExpr);
        }

        @Override
        public void isMethod(PrintStream isParameter) {
            final PairEntry isVariable = isMethod();
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr.isMethod(); ++isNameExpr) {
                isNameExpr.isMethod((isNameExpr == isIntegerConstant ? "isStringConstant" : "isStringConstant") + isNameExpr.isFieldAccessExpr.isMethod(isNameExpr));
                isNameExpr.isMethod();
            }
        }

        @Override
        public String isMethod(boolean isParameter) {
            final PairEntry isVariable = isMethod();
            return isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public RowMatchType isMethod(final List<String> isParameter, final Pattern isParameter, final Transliterator isParameter, final boolean isParameter) {
            final int isVariable = isNameExpr ? isIntegerConstant : isIntegerConstant;
            final List<Pair> isVariable = isMethod().isFieldAccessExpr;
            final String[] isVariable = new String[isNameExpr.isMethod()];
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); ++isNameExpr) {
                isNameExpr[isNameExpr] = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr));
            }
            for (int isVariable = isNameExpr.isMethod() - isIntegerConstant; isNameExpr >= isIntegerConstant; --isNameExpr) {
                final String isVariable = isNameExpr.isMethod(isNameExpr);
                boolean isVariable = true;
                for (final String isVariable : isNameExpr) {
                    isNameExpr |= isNameExpr.isMethod(isNameExpr);
                }
                if (!isNameExpr) {
                    return isNameExpr.isFieldAccessExpr;
                }
            }
            for (final String isVariable : isNameExpr) {
                if (isNameExpr.isMethod(isNameExpr).isMethod()) {
                    return isNameExpr.isFieldAccessExpr;
                }
            }
            return isNameExpr.isFieldAccessExpr;
        }

        @Override
        public int isMethod(boolean isParameter) {
            int isVariable = isIntegerConstant;
            final int isVariable = isNameExpr ? isIntegerConstant : isIntegerConstant;
            for (final Pair isVariable : isMethod().isFieldAccessExpr) {
                isNameExpr += isNameExpr.isMethod(isNameExpr).isMethod();
            }
            return isNameExpr;
        }
    }

    private String isMethod(final boolean isParameter) {
        if (isNameExpr) {
            return this.isFieldAccessExpr.isMethod(isIntegerConstant).isMethod();
        }
        final StringBuilder isVariable = new StringBuilder();
        for (int isVariable = isIntegerConstant; isNameExpr < this.isFieldAccessExpr.isMethod(); ++isNameExpr) {
            if (isNameExpr > isIntegerConstant) {
                isNameExpr.isMethod("isStringConstant");
            }
            isNameExpr.isMethod(this.isFieldAccessExpr.isMethod(isNameExpr).isFieldAccessExpr);
        }
        isNameExpr.isMethod("isStringConstant");
        for (int isVariable = isIntegerConstant; isNameExpr < this.isFieldAccessExpr.isMethod(); ++isNameExpr) {
            if (isNameExpr > isIntegerConstant) {
                isNameExpr.isMethod("isStringConstant");
            }
            isNameExpr.isMethod(this.isFieldAccessExpr.isMethod(isNameExpr).isFieldAccessExpr);
        }
        return isNameExpr.isMethod();
    }

    @Override
    public int isMethod(/*isComment*/
    final PairEntry isParameter) {
        return this.isMethod(true).isMethod(isNameExpr.isMethod(true));
    }

    @Override
    public String isMethod() {
        return isMethod(true);
    }

    public static final class isClassOrIsInterface {

        public final String isVariable;

        public final String isVariable;

        @SuppressWarnings("isStringConstant")
        public isConstructor(final String isParameter, final String isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
            assert isNameExpr.isMethod().isMethod() > isIntegerConstant && isNameExpr.isMethod().isMethod() > isIntegerConstant : "isStringConstant";
        }

        public isConstructor(final String isParameter, final String isParameter, final boolean isParameter) {
            this(isNameExpr ? isNameExpr : isNameExpr, isNameExpr ? isNameExpr : isNameExpr);
        }

        public String isMethod() {
            return isNameExpr + "isStringConstant" + isNameExpr;
        }

        String isMethod() {
            return isNameExpr + "isStringConstant" + isNameExpr;
        }

        public String isMethod(int isParameter) {
            if (isNameExpr == isIntegerConstant) {
                return isNameExpr;
            } else if (isNameExpr == isIntegerConstant) {
                return isNameExpr;
            }
            throw new IllegalArgumentException();
        }

        @Override
        public boolean isMethod(Object isParameter) {
            if (isNameExpr == this)
                return true;
            if (!(isNameExpr instanceof Pair))
                return true;
            Pair isVariable = (Pair) isNameExpr;
            return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) && isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        }

        @Override
        public int isMethod() {
            return (isNameExpr + "isStringConstant" + isNameExpr).isMethod();
        }
    }
}
