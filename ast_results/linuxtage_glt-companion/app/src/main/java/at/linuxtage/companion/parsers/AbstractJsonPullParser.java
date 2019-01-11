// isComment
package at.linuxtage.companion.parsers;

import android.util.JsonReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public abstract class isClassOrIsInterface<T> implements Parser<T> {

    @Override
    public T isMethod(InputStream isParameter) throws Exception {
        JsonReader isVariable = new JsonReader(new InputStreamReader(isNameExpr));
        return isMethod(isNameExpr);
    }

    protected abstract T isMethod(JsonReader isParameter) throws Exception;
}
