// isComment
package org.geometerplus.fbreader.library;

import java.util.List;
import org.geometerplus.fbreader.book.IBookCollection;
import org.geometerplus.fbreader.fbreader.options.SyncOptions;
import org.geometerplus.fbreader.formats.PluginCollection;
import org.geometerplus.fbreader.tree.FBTree;

public class isClassOrIsInterface extends LibraryTree {

    public isConstructor(IBookCollection isParameter, PluginCollection isParameter) {
        super(isNameExpr, isNameExpr);
        // isComment
        new FavoritesTree(this);
        new RecentBooksTree(this);
        new AuthorListTree(this);
        new TitleListTree(this);
        new SeriesListTree(this);
        new TagListTree(this);
        if (new SyncOptions().isFieldAccessExpr.isMethod()) {
            new SyncTree(this);
        }
        new FileFirstLevelTree(this);
    }

    public LibraryTree isMethod(LibraryTree.Key isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        if (isNameExpr.isFieldAccessExpr == null) {
            return isNameExpr.isFieldAccessExpr.isMethod(isMethod().isFieldAccessExpr) ? this : null;
        }
        final LibraryTree isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        return isNameExpr != null ? (LibraryTree) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) : null;
    }

    public SearchResultsTree isMethod() {
        return (SearchResultsTree) isMethod(isNameExpr.isFieldAccessExpr);
    }

    public SearchResultsTree isMethod(String isParameter) {
        final int isVariable;
        final List<FBTree> isVariable = isMethod();
        if (isNameExpr.isMethod()) {
            isNameExpr = isIntegerConstant;
        } else {
            isNameExpr = isNameExpr.isMethod(isIntegerConstant) instanceof ExternalViewTree ? isIntegerConstant : isIntegerConstant;
        }
        return new SearchResultsTree(this, isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
    }

    @Override
    public String isMethod() {
        return isMethod().isMethod();
    }

    @Override
    public String isMethod() {
        return isMethod().isMethod();
    }

    @Override
    protected String isMethod() {
        return "isStringConstant";
    }
}
