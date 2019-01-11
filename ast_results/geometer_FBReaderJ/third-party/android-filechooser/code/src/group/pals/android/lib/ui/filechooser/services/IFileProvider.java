// isComment
package group.pals.android.lib.ui.filechooser.services;

import group.pals.android.lib.ui.filechooser.io.IFile;
import group.pals.android.lib.ui.filechooser.io.IFileFilter;
import java.util.List;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    /**
     * isComment
     */
    public static enum SortType {

        /**
         * isComment
         */
        SortByName,
        /**
         * isComment
         */
        SortBySize,
        /**
         * isComment
         */
        SortByDate
    }

    /**
     * isComment
     */
    public static enum SortOrder {

        /**
         * isComment
         */
        Ascending(true),
        /**
         * isComment
         */
        Descending(true);

        final boolean isVariable;

        isConstructor(boolean isParameter) {
            isNameExpr = isNameExpr;
        }

        public boolean isMethod() {
            return isNameExpr;
        }
    }

    /**
     * isComment
     */
    public static enum FilterMode {

        /**
         * isComment
         */
        FilesOnly,
        /**
         * isComment
         */
        DirectoriesOnly,
        /**
         * isComment
         */
        FilesAndDirectories,
        AnyDirectories
    }

    // isComment
    /**
     * isComment
     */
    void isMethod(boolean isParameter);

    /**
     * isComment
     */
    boolean isMethod();

    /**
     * isComment
     */
    void isMethod(String isParameter);

    /**
     * isComment
     */
    String isMethod();

    /**
     * isComment
     */
    void isMethod(FilterMode isParameter);

    /**
     * isComment
     */
    FilterMode isMethod();

    /**
     * isComment
     */
    void isMethod(SortType isParameter);

    /**
     * isComment
     */
    SortType isMethod();

    /**
     * isComment
     */
    void isMethod(SortOrder isParameter);

    /**
     * isComment
     */
    SortOrder isMethod();

    /**
     * isComment
     */
    void isMethod(int isParameter);

    /**
     * isComment
     */
    int isMethod();

    /**
     * isComment
     */
    IFile isMethod();

    /**
     * isComment
     */
    IFile isMethod(String isParameter);

    /**
     * isComment
     */
    IFile[] isMethod(IFile isParameter, boolean[] isParameter) throws Exception;

    /**
     * isComment
     */
    List<IFile> isMethod(IFile isParameter, boolean[] isParameter) throws Exception;

    /**
     * isComment
     */
    List<IFile> isMethod(IFile isParameter) throws Exception;

    /**
     * isComment
     */
    List<IFile> isMethod(IFile isParameter, IFileFilter isParameter);

    /**
     * isComment
     */
    boolean isMethod(IFile isParameter);
}
