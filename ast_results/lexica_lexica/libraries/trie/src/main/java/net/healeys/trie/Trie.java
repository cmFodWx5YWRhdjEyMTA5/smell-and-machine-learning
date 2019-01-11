// isComment
package net.healeys.trie;

import com.serwylo.lexica.lang.Language;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

public abstract class isClassOrIsInterface implements WordFilter {

    protected Language isVariable;

    public isConstructor(Language isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public abstract void isMethod(String isParameter);

    public abstract boolean isMethod(String isParameter);

    public abstract void isMethod(OutputStream isParameter) throws IOException;

    public abstract Map<String, Solution> isMethod(TransitionMap isParameter, WordFilter isParameter);
}
