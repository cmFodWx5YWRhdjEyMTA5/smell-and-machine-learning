// isComment
package org.geometerplus.zlibrary.ui.j2me.library;

import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.*;

public class isClassOrIsInterface extends MIDlet {

    /*isComment*/
    /*isComment*/
    private boolean isVariable;

    public void isMethod() {
        if (!isNameExpr) {
            new ZLJ2MELibrary().isMethod(this);
            isNameExpr = true;
        }
    }

    public void isMethod(boolean isParameter) {
        isMethod();
    }

    public void isMethod() {
    }
}
