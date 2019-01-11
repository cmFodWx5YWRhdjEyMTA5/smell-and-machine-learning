// isComment
package net.healeys.trie;

import com.serwylo.lexica.lang.Language;
import java.io.IOException;
import java.io.InputStream;

public interface isClassOrIsInterface<T extends Trie> {

    /**
     * isComment
     */
    T isMethod(InputStream isParameter, TransitionMap isParameter, Language isParameter) throws IOException;
}
