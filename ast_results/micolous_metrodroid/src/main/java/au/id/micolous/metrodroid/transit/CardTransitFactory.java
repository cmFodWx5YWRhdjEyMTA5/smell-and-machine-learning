// isComment
package au.id.micolous.metrodroid.transit;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public interface isClassOrIsInterface<T> {

    @NonNull
    default List<CardInfo> isMethod() {
        return isNameExpr.isMethod();
    }

    TransitIdentity isMethod(@NonNull T isParameter);

    TransitData isMethod(@NonNull T isParameter);

    boolean isMethod(@NonNull T isParameter);
}
