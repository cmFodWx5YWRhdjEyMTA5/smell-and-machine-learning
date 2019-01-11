// isComment
package org.geometerplus.zlibrary.ui.j2me.library;

import java.io.InputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.file.*;
import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Display;
import org.geometerplus.zlibrary.core.library.ZLibrary;
import org.geometerplus.zlibrary.core.view.ZLPaintContext;
import org.geometerplus.zlibrary.core.application.ZLApplication;
import org.geometerplus.zlibrary.core.xml.own.ZLOwnXMLProcessorFactory;
import org.geometerplus.zlibrary.ui.j2me.config.ZLJ2MEConfigManager;
import org.geometerplus.zlibrary.ui.j2me.view.ZLCanvas;
import org.geometerplus.zlibrary.ui.j2me.application.ZLJ2MEApplicationWindow;
import org.geometerplus.zlibrary.ui.j2me.image.ZLJ2MEImageManager;

final class isClassOrIsInterface extends ZLibrary {

    private ZLCanvas isVariable;

    public ZLPaintContext isMethod() {
        return isNameExpr.isMethod();
    }

    protected InputStream isMethod(String isParameter) {
        // isComment
        try {
            FileConnection isVariable = (FileConnection) isNameExpr.isMethod("isStringConstant" + isNameExpr, isNameExpr.isFieldAccessExpr);
            if ((isNameExpr != null) && isNameExpr.isMethod()) {
                return isNameExpr.isMethod();
            }
        } catch (Exception isParameter) {
        }
        return null;
    }

    protected InputStream isMethod(String isParameter) {
        return isMethod().isMethod("isStringConstant" + isNameExpr);
    }

    /*isComment*/
    public void isMethod(String isParameter) {
    // isComment
    }

    void isMethod(MIDlet isParameter) {
        new ZLOwnXMLProcessorFactory();
        new ZLJ2MEConfigManager();
        isMethod();
        new ZLJ2MEImageManager();
        isNameExpr = new ZLCanvas();
        try {
            ZLApplication isVariable = (ZLApplication) isMethod().isMethod();
            new ZLJ2MEApplicationWindow(isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
        } catch (Exception isParameter) {
            isNameExpr.isMethod();
        // isComment
        }
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr);
    }
}
