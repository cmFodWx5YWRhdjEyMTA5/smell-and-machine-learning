// isComment
package org.geometerplus.fbreader.network.atom;

import org.geometerplus.zlibrary.core.xml.ZLStringMap;

public interface isClassOrIsInterface<MetadataType extends ATOMFeedMetadata, EntryType extends ATOMEntry> {

    void isMethod();

    // isComment
    boolean isMethod(MetadataType isParameter, boolean isParameter);

    // isComment
    boolean isMethod(EntryType isParameter);

    void isMethod();

    MetadataType isMethod(ZLStringMap isParameter);

    EntryType isMethod(ZLStringMap isParameter);

    ATOMLink isMethod(ZLStringMap isParameter);
}
