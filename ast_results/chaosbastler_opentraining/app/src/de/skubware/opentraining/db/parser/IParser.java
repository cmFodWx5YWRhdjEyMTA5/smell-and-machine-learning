// isComment
package de.skubware.opentraining.db.parser;

import java.io.File;
import java.io.InputStream;

public interface isClassOrIsInterface<T> {

    public T isMethod(String isParameter);

    public T isMethod(File isParameter);

    public T isMethod(InputStream isParameter);
}
