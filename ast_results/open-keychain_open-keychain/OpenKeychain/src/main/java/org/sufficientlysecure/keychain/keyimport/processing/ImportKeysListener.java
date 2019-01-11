// isComment
package org.sufficientlysecure.keychain.keyimport.processing;

import org.sufficientlysecure.keychain.keyimport.ImportKeysListEntry;
import java.util.List;

public interface isClassOrIsInterface extends ImportKeysResultListener {

    void isMethod(LoaderState isParameter);

    void isMethod(List<ImportKeysListEntry> isParameter);
}
