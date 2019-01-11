// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.R;
import cgeo.geocaching.models.Geocache;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractFilter implements IFilterFactory {

    public static final Creator<PersonalNoteFilter> isVariable = new Parcelable.Creator<PersonalNoteFilter>() {

        @Override
        public PersonalNoteFilter isMethod(final Parcel isParameter) {
            return new PersonalNoteFilter(isNameExpr);
        }

        @Override
        public PersonalNoteFilter[] isMethod(final int isParameter) {
            return new PersonalNoteFilter[isNameExpr];
        }
    };

    protected isConstructor() {
        super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    protected isConstructor(final Parcel isParameter) {
        super(isNameExpr);
    }

    @Override
    public boolean isMethod(@NonNull final Geocache isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Override
    @NonNull
    public List<IFilter> isMethod() {
        return isNameExpr.<IFilter>isMethod(this);
    }
}
