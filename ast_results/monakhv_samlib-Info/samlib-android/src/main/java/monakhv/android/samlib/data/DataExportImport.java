// isComment
package monakhv.android.samlib.data;

import android.content.Context;
import java.io.File;
import monakhv.samlib.data.AbstractDataExportImport;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractDataExportImport {

    private Context isVariable;

    public isConstructor(SettingsHelper isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr.isMethod();
    }

    @Override
    public File isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }
}
