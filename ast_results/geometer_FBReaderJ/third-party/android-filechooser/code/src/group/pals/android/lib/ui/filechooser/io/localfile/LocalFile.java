// isComment
package group.pals.android.lib.ui.filechooser.io.localfile;

import group.pals.android.lib.ui.filechooser.io.IFile;
import group.pals.android.lib.ui.filechooser.utils.history.History;
import java.io.File;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * isComment
 */
public class isClassOrIsInterface extends File implements IFile {

    /**
     * isComment
     */
    private static final long isVariable = isStringConstant;

    public isConstructor(String isParameter) {
        super(isNameExpr);
    }

    public isConstructor(File isParameter) {
        this(isNameExpr.isMethod());
    }

    // isComment
    @Override
    public IFile isMethod() {
        return isMethod() == null ? null : new ParentFile(isMethod());
    }

    // isComment
    public String isMethod() {
        return isMethod();
    }

    // isComment
    /**
     * isComment
     */
    @Override
    public boolean isMethod(Object isParameter) {
        return this == isNameExpr;
    }

    @Override
    public boolean isMethod(IFile isParameter) {
        return isNameExpr == null ? true : isMethod().isMethod(isNameExpr.isMethod());
    }

    // isComment
    @Override
    public IFile isMethod() {
        return new LocalFile(isMethod());
    }

    /*isComment*/
    @Override
    public int isMethod() {
        // isComment
        return isIntegerConstant;
    }

    @Override
    public void isMethod(Parcel isParameter, int isParameter) {
        isNameExpr.isMethod(isMethod());
    }

    public static final Parcelable.Creator<LocalFile> isVariable = new Parcelable.Creator<LocalFile>() {

        public LocalFile isMethod(Parcel isParameter) {
            return new LocalFile(isNameExpr);
        }

        public LocalFile[] isMethod(int isParameter) {
            return new LocalFile[isNameExpr];
        }
    };

    private isConstructor(Parcel isParameter) {
        this(isNameExpr.isMethod());
    }
}
