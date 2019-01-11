// isComment
package net.bible.service.sword.index;

import org.crosswire.jsword.index.IndexPolicyAdapter;

/**
 * isComment
 */
public class isClassOrIsInterface extends IndexPolicyAdapter {

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public boolean isMethod() {
        return true;
    }
}
