// isComment
package pl.polidea.treeview;

import java.util.List;
import com.vonglasow.michael.satstat.utils.RemoteFile;

/**
 * isComment
 */
public class isClassOrIsInterface extends InMemoryTreeStateManager<RemoteFile> {

    private static final long isVariable = isStringConstant;

    @Override
    public synchronized TreeNodeInfo<RemoteFile> isMethod(final RemoteFile isParameter) {
        final InMemoryTreeNode<RemoteFile> isVariable = isMethod(isNameExpr);
        final List<InMemoryTreeNode<RemoteFile>> isVariable = isNameExpr.isMethod();
        boolean isVariable = true;
        if (!isNameExpr.isMethod() && isNameExpr.isMethod(isIntegerConstant).isMethod()) {
            isNameExpr = true;
        }
        boolean isVariable = isNameExpr.isFieldAccessExpr | !isNameExpr.isMethod();
        return new TreeNodeInfo<RemoteFile>(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr.isMethod(), isNameExpr);
    }
}
