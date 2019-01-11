// isComment
package org.emdev.common.xml;

import org.emdev.common.xml.tags.XmlTag;

public interface isClassOrIsInterface {

    boolean isMethod(XmlTag isParameter);

    void isMethod(final XmlTag isParameter, final String... isParameter);

    boolean isMethod();

    void isMethod(final TextProvider isParameter, final int isParameter, final int isParameter);

    void isMethod(final XmlTag isParameter);
}
