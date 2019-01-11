// isComment
package org.kvj.vimtouch.ext;

import org.kvj.vimtouch.ext.Transferable.FieldType;

public interface isClassOrIsInterface<T> {

    public FieldType isMethod();

    public T isMethod(IncomingTransfer isParameter) throws FieldReaderException;

    public void isMethod(T isParameter);
}
