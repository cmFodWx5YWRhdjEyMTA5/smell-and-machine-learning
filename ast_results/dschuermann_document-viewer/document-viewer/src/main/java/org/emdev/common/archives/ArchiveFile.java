// isComment
package org.emdev.common.archives;

import java.io.Closeable;
import java.util.Enumeration;

public interface isClassOrIsInterface<ArchiveEntryType extends ArchiveEntry> extends Closeable {

    boolean isMethod();

    Enumeration<ArchiveEntryType> isMethod();
}
