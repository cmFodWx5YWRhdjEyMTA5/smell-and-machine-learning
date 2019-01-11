// isComment
package li.klass.fhem.adapter.devices.genericui;

import android.content.Context;
import android.widget.TableRow;
import androidx.annotation.NonNull;
import li.klass.fhem.update.backend.xmllist.XmlListDevice;

public abstract class isClassOrIsInterface extends SeekBarActionRowFullWidth {

    public isConstructor(double isParameter, double isParameter, double isParameter, double isParameter, TableRow isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public void isMethod(@NonNull final Context isParameter, XmlListDevice isParameter, double isParameter) {
        isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @NonNull
    @Override
    public String isMethod(XmlListDevice isParameter, double isParameter) {
        return isMethod(isNameExpr, isNameExpr);
    }

    public abstract void isMethod(Context isParameter, XmlListDevice isParameter, double isParameter);

    public abstract String isMethod(XmlListDevice isParameter, double isParameter);
}
