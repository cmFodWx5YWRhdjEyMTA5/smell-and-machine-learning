// isComment
package org.transdroid.core.gui.remoterss.data;

import android.os.Parcelable;
import org.transdroid.core.gui.lists.SimpleListItem;
import java.util.Date;
import java.util.List;

/**
 * isComment
 */
public abstract class isClassOrIsInterface implements Parcelable, SimpleListItem {

    protected int isVariable;

    protected String isVariable;

    protected String isVariable;

    protected long isVariable;

    protected List<RemoteRssItem> isVariable;

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }

    public Date isMethod() {
        return new Date(isNameExpr);
    }

    public List<RemoteRssItem> isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return isNameExpr;
    }
}
