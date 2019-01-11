// isComment
package com.btmura.android.reddit.net;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.JsonReader;
import com.btmura.android.reddit.util.JsonParser;
import java.io.IOException;
import java.text.Collator;
import java.util.Set;
import java.util.TreeSet;

public class isClassOrIsInterface extends JsonParser {

    public final Set<String> isVariable = new TreeSet<String>(isNameExpr.isMethod());

    @Nullable
    String isVariable;

    static SubredditResult isMethod(SubredditResult isParameter, JsonReader isParameter) throws IOException {
        if (isNameExpr == null) {
            isNameExpr = new SubredditResult();
        }
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        this.isFieldAccessExpr = null;
    }

    @Override
    public void isMethod(JsonReader isParameter, int isParameter) throws IOException {
        String isVariable = isMethod(isNameExpr, "isStringConstant");
        if (!isNameExpr.isMethod(isNameExpr)) {
            this.isFieldAccessExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public void isMethod(JsonReader isParameter) throws IOException {
        String isVariable = isMethod(isNameExpr, "isStringConstant");
        if (!isNameExpr.isMethod(isNameExpr)) {
            this.isFieldAccessExpr = isNameExpr;
        }
    }
}
