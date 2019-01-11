// isComment
package be.digitalia.fosdem.parsers;

import java.io.InputStream;

public interface isClassOrIsInterface<T> {

    T isMethod(InputStream isParameter) throws Exception;
}
