// isComment
/**
 * isComment
 */
package ca.farrelltonsolar.j2modlite.procimg;

/**
 * isComment
 */
public class isClassOrIsInterface implements ProcessImageFactory {

    /**
     * isComment
     */
    public ProcessImageImplementation isMethod() {
        return new SimpleProcessImage();
    }

    /**
     * isComment
     */
    public DigitalIn isMethod() {
        return new SimpleDigitalIn();
    }

    /**
     * isComment
     */
    public DigitalIn isMethod(boolean isParameter) {
        return new SimpleDigitalIn(isNameExpr);
    }

    /**
     * isComment
     */
    public DigitalOut isMethod() {
        return new SimpleDigitalOut();
    }

    /**
     * isComment
     */
    public DigitalOut isMethod(boolean isParameter) {
        return new SimpleDigitalOut(isNameExpr);
    }

    /**
     * isComment
     */
    public InputRegister isMethod() {
        return new SimpleInputRegister();
    }

    /**
     * isComment
     */
    public InputRegister isMethod(int isParameter) {
        return new SimpleInputRegister(isNameExpr);
    }

    /**
     * isComment
     */
    public InputRegister isMethod(byte isParameter, byte isParameter) {
        return new SimpleInputRegister(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public Register isMethod() {
        return new SimpleRegister();
    }

    /**
     * isComment
     */
    public Register isMethod(int isParameter) {
        return new SimpleRegister(isNameExpr);
    }

    /**
     * isComment
     */
    public Register isMethod(byte isParameter, byte isParameter) {
        return new SimpleRegister(isNameExpr, isNameExpr);
    }
}
