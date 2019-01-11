// isComment
package cgeo.geocaching.address;

import cgeo.geocaching.location.Geopoint;
import cgeo.geocaching.utils.AndroidRxUtils;
import cgeo.geocaching.utils.Log;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.support.annotation.NonNull;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import org.apache.commons.collections4.CollectionUtils;

public class isClassOrIsInterface {

    private final Geocoder isVariable;

    public isConstructor(final Context isParameter) {
        isNameExpr = new Geocoder(isNameExpr, isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    public Observable<Address> isMethod(@NonNull final String isParameter) {
        if (!isNameExpr.isMethod()) {
            return isNameExpr.isMethod(new RuntimeException("isStringConstant"));
        }
        return isNameExpr.isMethod(new Callable<ObservableSource<? extends Address>>() {

            @Override
            public Observable<Address> isMethod() {
                try {
                    return isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant));
                } catch (final Exception isParameter) {
                    isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod());
                    return isNameExpr.isMethod(isNameExpr);
                }
            }
        }).isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public Single<Address> isMethod(@NonNull final Geopoint isParameter) {
        if (!isNameExpr.isMethod()) {
            return isNameExpr.isMethod(new RuntimeException("isStringConstant"));
        }
        return isNameExpr.isMethod(new Callable<Observable<Address>>() {

            @Override
            public Observable<Address> isMethod() {
                try {
                    return isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isIntegerConstant));
                } catch (final Exception isParameter) {
                    isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod());
                    return isNameExpr.isMethod(isNameExpr);
                }
            }
        }).isMethod(isNameExpr.isFieldAccessExpr).isMethod();
    }

    private static Observable<Address> isMethod(final List<Address> isParameter) {
        return isNameExpr.isMethod(isNameExpr) ? isNameExpr.<Address>isMethod(new RuntimeException("isStringConstant")) : isNameExpr.isMethod(isNameExpr);
    }
}
