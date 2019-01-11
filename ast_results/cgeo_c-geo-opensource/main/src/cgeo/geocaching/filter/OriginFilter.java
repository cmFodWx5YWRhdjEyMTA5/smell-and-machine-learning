// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.connector.ConnectorFactory;
import cgeo.geocaching.connector.IConnector;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.utils.TextUtils;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class isClassOrIsInterface extends AbstractFilter {

    private final IConnector isVariable;

    public static final Creator<OriginFilter> isVariable = new Parcelable.Creator<OriginFilter>() {

        @Override
        public OriginFilter isMethod(final Parcel isParameter) {
            return new OriginFilter(isNameExpr);
        }

        @Override
        public OriginFilter[] isMethod(final int isParameter) {
            return new OriginFilter[isNameExpr];
        }
    };

    public isConstructor(@NonNull final IConnector isParameter) {
        super(isNameExpr.isMethod());
        this.isFieldAccessExpr = isNameExpr;
    }

    protected isConstructor(final Parcel isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Override
    public final boolean isMethod(@NonNull final Geocache isParameter) {
        return isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod());
    }

    public static final class isClassOrIsInterface implements IFilterFactory {

        @Override
        @NonNull
        public List<IFilter> isMethod() {
            final List<IFilter> isVariable = new ArrayList<>();
            for (final IConnector isVariable : isNameExpr.isMethod()) {
                isNameExpr.isMethod(new OriginFilter(isNameExpr));
            }
            // isComment
            isNameExpr.isMethod(isNameExpr, new Comparator<IFilter>() {

                @Override
                public int isMethod(final IFilter isParameter, final IFilter isParameter) {
                    return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
                }
            });
            return isNameExpr;
        }
    }

    @Override
    public void isMethod(final Parcel isParameter, final int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod());
    }
}
