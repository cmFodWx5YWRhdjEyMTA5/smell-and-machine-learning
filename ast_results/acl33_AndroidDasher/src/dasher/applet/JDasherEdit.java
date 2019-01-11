// isComment
package dasher.applet;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.BadLocationException;
import javax.swing.JTextArea;
import dasher.CDasherInterfaceBase;
import dasher.EditableDocument;

/**
 * isComment
 */
public class isClassOrIsInterface extends JTextArea implements CaretListener, EditableDocument {

    /**
     * isComment
     */
    private dasher.CDasherInterfaceBase isVariable;

    /**
     * isComment
     */
    public isConstructor(int isParameter, int isParameter, dasher.CDasherInterfaceBase isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
        this.isMethod(this);
    }

    /*isComment*/
    public void isMethod(String isParameter, int isParameter) {
        if (this.isMethod() != null) {
            this.isMethod("isStringConstant");
        }
        int isVariable = this.isMethod();
        this.isMethod(isNameExpr, isNameExpr);
        this.isMethod(isNameExpr + isIntegerConstant);
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter, int isParameter) {
        if (!this.isMethod().isMethod("isStringConstant")) {
            if (this.isMethod() != null) {
                this.isMethod("isStringConstant");
            }
            int isVariable = this.isMethod();
            this.isMethod("isStringConstant", isNameExpr - isNameExpr.isMethod(), isNameExpr);
            isMethod(isNameExpr - isNameExpr.isMethod());
        }
    }

    @Override
    public void isMethod(int isParameter) {
        isMethod(isNameExpr + isIntegerConstant);
    }

    /**
     * isComment
     */
    ListIterator<Character> isMethod(final int isParameter) {
        return new ListIterator<Character>() {

            /**
             * isComment
             */
            int isVariable = isNameExpr;

            /**
             * isComment
             */
            public Character isMethod() {
                // isComment
                try {
                    return isMethod(++isNameExpr, isIntegerConstant).isMethod(isIntegerConstant);
                } catch (BadLocationException isParameter) {
                    isNameExpr--;
                    throw new NoSuchElementException();
                }
            }

            public boolean isMethod() {
                return isNameExpr < isMethod().isMethod() - isIntegerConstant;
            }

            public int isMethod() {
                return isNameExpr + isIntegerConstant;
            }

            public Character isMethod() {
                // isComment
                try {
                    return isMethod(isNameExpr--, isIntegerConstant).isMethod(isIntegerConstant);
                } catch (BadLocationException isParameter) {
                    isNameExpr++;
                    throw new NoSuchElementException();
                }
            }

            public boolean isMethod() {
                return isNameExpr >= isIntegerConstant;
            }

            public int isMethod() {
                return isNameExpr;
            }

            public void isMethod(Character isParameter) {
                throw new UnsupportedOperationException();
            }

            public void isMethod() {
                throw new UnsupportedOperationException();
            }

            public void isMethod(Character isParameter) {
                throw new UnsupportedOperationException();
            }
        };
    }

    /**
     * isComment
     */
    public void isMethod(CaretEvent isParameter) {
        isNameExpr.isMethod(isMethod() - isIntegerConstant, true);
    }

    @Override
    public Character isMethod(int isParameter) {
        String isVariable = isMethod();
        if (isNameExpr >= isNameExpr.isMethod())
            return null;
        return isNameExpr.isMethod(isNameExpr);
    }
}
