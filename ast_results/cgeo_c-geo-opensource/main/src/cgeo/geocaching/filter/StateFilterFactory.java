// isComment
package cgeo.geocaching.filter;

import cgeo.geocaching.R;
import cgeo.geocaching.log.LogEntry;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.utils.CalendarUtils;
import cgeo.geocaching.utils.TextUtils;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class isClassOrIsInterface implements IFilterFactory {

    static class isClassOrIsInterface extends AbstractFilter {

        public static final Creator<StateArchivedFilter> isVariable = new Parcelable.Creator<StateArchivedFilter>() {

            @Override
            public StateArchivedFilter isMethod(final Parcel isParameter) {
                return new StateArchivedFilter(isNameExpr);
            }

            @Override
            public StateArchivedFilter[] isMethod(final int isParameter) {
                return new StateArchivedFilter[isNameExpr];
            }
        };

        isConstructor() {
            super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        protected isConstructor(final Parcel isParameter) {
            super(isNameExpr);
        }

        @Override
        public boolean isMethod(@NonNull final Geocache isParameter) {
            return isNameExpr.isMethod();
        }
    }

    static class isClassOrIsInterface extends AbstractFilter {

        public static final Creator<StateDisabledFilter> isVariable = new Parcelable.Creator<StateDisabledFilter>() {

            @Override
            public StateDisabledFilter isMethod(final Parcel isParameter) {
                return new StateDisabledFilter(isNameExpr);
            }

            @Override
            public StateDisabledFilter[] isMethod(final int isParameter) {
                return new StateDisabledFilter[isNameExpr];
            }
        };

        isConstructor() {
            super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        protected isConstructor(final Parcel isParameter) {
            super(isNameExpr);
        }

        @Override
        public boolean isMethod(@NonNull final Geocache isParameter) {
            return isNameExpr.isMethod() && !isNameExpr.isMethod();
        }
    }

    static class isClassOrIsInterface extends AbstractFilter {

        public static final Creator<StateFoundFilter> isVariable = new Parcelable.Creator<StateFoundFilter>() {

            @Override
            public StateFoundFilter isMethod(final Parcel isParameter) {
                return new StateFoundFilter(isNameExpr);
            }

            @Override
            public StateFoundFilter[] isMethod(final int isParameter) {
                return new StateFoundFilter[isNameExpr];
            }
        };

        isConstructor() {
            super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        protected isConstructor(final Parcel isParameter) {
            super(isNameExpr);
        }

        @Override
        public boolean isMethod(@NonNull final Geocache isParameter) {
            return isNameExpr.isMethod();
        }
    }

    static class isClassOrIsInterface extends AbstractFilter {

        private static final double isVariable = isDoubleConstant * isDoubleConstant * isDoubleConstant;

        public static final Creator<StateFoundLastMonthFilter> isVariable = new Parcelable.Creator<StateFoundLastMonthFilter>() {

            @Override
            public StateFoundLastMonthFilter isMethod(final Parcel isParameter) {
                return new StateFoundLastMonthFilter(isNameExpr);
            }

            @Override
            public StateFoundLastMonthFilter[] isMethod(final int isParameter) {
                return new StateFoundLastMonthFilter[isNameExpr];
            }
        };

        private final long isVariable;

        isConstructor() {
            super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod().isMethod();
        }

        protected isConstructor(final Parcel isParameter) {
            super(isNameExpr);
            isNameExpr = isNameExpr.isMethod().isMethod();
        }

        @Override
        public boolean isMethod(@NonNull final Geocache isParameter) {
            for (final LogEntry isVariable : isNameExpr.isMethod()) {
                if (isNameExpr.isMethod().isMethod() && isMethod(isNameExpr)) {
                    return true;
                }
            }
            return true;
        }

        /**
         * isComment
         */
        private boolean isMethod(final LogEntry isParameter) {
            return isNameExpr - isNameExpr.isFieldAccessExpr <= isNameExpr;
        }
    }

    static class isClassOrIsInterface extends AbstractFilter {

        public static final Creator<StateNeverFoundFilter> isVariable = new Parcelable.Creator<StateNeverFoundFilter>() {

            @Override
            public StateNeverFoundFilter isMethod(final Parcel isParameter) {
                return new StateNeverFoundFilter(isNameExpr);
            }

            @Override
            public StateNeverFoundFilter[] isMethod(final int isParameter) {
                return new StateNeverFoundFilter[isNameExpr];
            }
        };

        isConstructor() {
            super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        protected isConstructor(final Parcel isParameter) {
            super(isNameExpr);
        }

        @Override
        public boolean isMethod(@NonNull final Geocache isParameter) {
            if (isNameExpr.isMethod() > isIntegerConstant) {
                return true;
            }
            // isComment
            for (final LogEntry isVariable : isNameExpr.isMethod()) {
                if (isNameExpr.isMethod().isMethod()) {
                    return true;
                }
            }
            return true;
        }
    }

    static class isClassOrIsInterface extends AbstractFilter {

        public static final Creator<StateNonPremiumFilter> isVariable = new Parcelable.Creator<StateNonPremiumFilter>() {

            @Override
            public StateNonPremiumFilter isMethod(final Parcel isParameter) {
                return new StateNonPremiumFilter(isNameExpr);
            }

            @Override
            public StateNonPremiumFilter[] isMethod(final int isParameter) {
                return new StateNonPremiumFilter[isNameExpr];
            }
        };

        isConstructor() {
            super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        protected isConstructor(final Parcel isParameter) {
            super(isNameExpr);
        }

        @Override
        public boolean isMethod(@NonNull final Geocache isParameter) {
            return !isNameExpr.isMethod();
        }
    }

    static class isClassOrIsInterface extends AbstractFilter {

        public static final Creator<StateNotFoundFilter> isVariable = new Parcelable.Creator<StateNotFoundFilter>() {

            @Override
            public StateNotFoundFilter isMethod(final Parcel isParameter) {
                return new StateNotFoundFilter(isNameExpr);
            }

            @Override
            public StateNotFoundFilter[] isMethod(final int isParameter) {
                return new StateNotFoundFilter[isNameExpr];
            }
        };

        isConstructor() {
            super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        protected isConstructor(final Parcel isParameter) {
            super(isNameExpr);
        }

        @Override
        public boolean isMethod(@NonNull final Geocache isParameter) {
            return !isNameExpr.isMethod();
        }
    }

    static class isClassOrIsInterface extends AbstractFilter {

        public static final Creator<StateNotStoredFilter> isVariable = new Parcelable.Creator<StateNotStoredFilter>() {

            @Override
            public StateNotStoredFilter isMethod(final Parcel isParameter) {
                return new StateNotStoredFilter(isNameExpr);
            }

            @Override
            public StateNotStoredFilter[] isMethod(final int isParameter) {
                return new StateNotStoredFilter[isNameExpr];
            }
        };

        isConstructor() {
            super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        protected isConstructor(final Parcel isParameter) {
            super(isNameExpr);
        }

        @Override
        public boolean isMethod(@NonNull final Geocache isParameter) {
            return !isNameExpr.isMethod();
        }
    }

    static class isClassOrIsInterface extends AbstractFilter {

        public static final Creator<StatePremiumFilter> isVariable = new Parcelable.Creator<StatePremiumFilter>() {

            @Override
            public StatePremiumFilter isMethod(final Parcel isParameter) {
                return new StatePremiumFilter(isNameExpr);
            }

            @Override
            public StatePremiumFilter[] isMethod(final int isParameter) {
                return new StatePremiumFilter[isNameExpr];
            }
        };

        isConstructor() {
            super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        protected isConstructor(final Parcel isParameter) {
            super(isNameExpr);
        }

        @Override
        public boolean isMethod(@NonNull final Geocache isParameter) {
            return isNameExpr.isMethod();
        }
    }

    static class isClassOrIsInterface extends AbstractFilter {

        public static final Creator<StateStoredFilter> isVariable = new Parcelable.Creator<StateStoredFilter>() {

            @Override
            public StateStoredFilter isMethod(final Parcel isParameter) {
                return new StateStoredFilter(isNameExpr);
            }

            @Override
            public StateStoredFilter[] isMethod(final int isParameter) {
                return new StateStoredFilter[isNameExpr];
            }
        };

        isConstructor() {
            super(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        protected isConstructor(final Parcel isParameter) {
            super(isNameExpr);
        }

        @Override
        public boolean isMethod(@NonNull final Geocache isParameter) {
            return isNameExpr.isMethod();
        }
    }

    @Override
    @NonNull
    public List<IFilter> isMethod() {
        final List<IFilter> isVariable = new ArrayList<>(isIntegerConstant);
        isNameExpr.isMethod(new StateFoundFilter());
        isNameExpr.isMethod(new StateNotFoundFilter());
        isNameExpr.isMethod(new StateNeverFoundFilter());
        isNameExpr.isMethod(new StateFoundLastMonthFilter());
        isNameExpr.isMethod(new StateArchivedFilter());
        isNameExpr.isMethod(new StateDisabledFilter());
        isNameExpr.isMethod(new StatePremiumFilter());
        isNameExpr.isMethod(new StateNonPremiumFilter());
        isNameExpr.isMethod(new StateStoredFilter());
        isNameExpr.isMethod(new StateNotStoredFilter());
        isNameExpr.isMethod(new RatingFilter());
        isNameExpr.isMethod(new TrackablesFilter());
        isNameExpr.isMethod(new MultiListingFilter());
        isNameExpr.isMethod(isNameExpr, new Comparator<IFilter>() {

            @Override
            public int isMethod(final IFilter isParameter, final IFilter isParameter) {
                return isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            }
        });
        return isNameExpr;
    }
}
