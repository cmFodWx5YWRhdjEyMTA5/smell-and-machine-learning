// isComment
package btools.mapsplitter;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;

/**
 * isComment
 */
public class isClassOrIsInterface extends MapCreatorBase {

    private RelationListener isVariable;

    public isConstructor(RelationListener isParameter) {
        isNameExpr = isNameExpr;
    }

    public void isMethod(File isParameter) throws Exception {
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        DataInputStream isVariable = new DataInputStream(new BufferedInputStream(new FileInputStream(isNameExpr)));
        try {
            for (; ; ) {
                RelationData isVariable = new RelationData(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
            }
        } catch (EOFException isParameter) {
            isNameExpr.isMethod();
        }
        isNameExpr.isMethod(isNameExpr);
    }
}
