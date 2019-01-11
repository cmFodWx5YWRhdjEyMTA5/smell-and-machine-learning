// isComment
package uk.org.ngo.squeezer.framework;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends Item implements FilterItem {

    /**
     * isComment
     */
    public abstract String isMethod();

    /**
     * isComment
     */
    public String isMethod() {
        return isMethod() + "isStringConstant" + isMethod();
    }

    @Override
    public String isMethod() {
        return isMethod() + "isStringConstant" + isMethod();
    }
}
