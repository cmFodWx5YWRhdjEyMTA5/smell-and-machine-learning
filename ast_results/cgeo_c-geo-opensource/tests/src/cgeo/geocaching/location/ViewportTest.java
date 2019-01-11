// isComment
package cgeo.geocaching.location;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import org.junit.Test;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import cgeo.geocaching.models.ICoordinates;
import static cgeo.geocaching.location.Viewport.containing;
import static java.util.Collections.singleton;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class isClassOrIsInterface {

    @NonNull
    private static final Viewport isVariable = new Viewport(new Geopoint(-isDoubleConstant, -isDoubleConstant), new Geopoint(isDoubleConstant, isDoubleConstant));

    private static void isMethod(final Viewport isParameter) {
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(new Geopoint(isDoubleConstant, isDoubleConstant));
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(new Geopoint(isDoubleConstant, isDoubleConstant));
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(new Geopoint(-isDoubleConstant, -isDoubleConstant));
    }

    @Test
    public void isMethod() {
        isMethod(new Viewport(new Geopoint(-isDoubleConstant, -isDoubleConstant), new Geopoint(isDoubleConstant, isDoubleConstant)));
        isMethod(new Viewport(new Geopoint(isDoubleConstant, isDoubleConstant), new Geopoint(-isDoubleConstant, -isDoubleConstant)));
        isMethod(new Viewport(new Geopoint(-isDoubleConstant, isDoubleConstant), new Geopoint(isDoubleConstant, -isDoubleConstant)));
        isMethod(new Viewport(new Geopoint(isDoubleConstant, -isDoubleConstant), new Geopoint(-isDoubleConstant, isDoubleConstant)));
    }

    @Test
    public void isMethod() {
        isMethod(new Viewport(new Geopoint(isDoubleConstant, isDoubleConstant), isDoubleConstant, isDoubleConstant));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod()).isMethod(-isDoubleConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod()).isMethod(-isDoubleConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(new Geopoint(-isDoubleConstant, -isDoubleConstant))).isMethod();
        isMethod(isNameExpr.isMethod(new Geopoint(isDoubleConstant, isDoubleConstant))).isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod();
        isMethod(isNameExpr.isMethod(new Geopoint(-isDoubleConstant, -isDoubleConstant))).isMethod();
        isMethod(isNameExpr.isMethod(new Geopoint(isDoubleConstant, isDoubleConstant))).isMethod();
    }

    @SuppressLint("isStringConstant")
    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(null).isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant").isMethod()).isMethod("isStringConstant");
        Locale isVariable = null;
        try {
            isNameExpr = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            // isComment
            isMethod(isNameExpr.isMethod("isStringConstant", isDoubleConstant)).isMethod("isStringConstant");
            isMethod(isNameExpr.isMethod("isStringConstant").isMethod()).isMethod("isStringConstant");
        } finally {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isNameExpr);
        isMethod(new Viewport(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(new Viewport(new Geopoint(isDoubleConstant, isDoubleConstant), isDoubleConstant, isDoubleConstant))).isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(isDoubleConstant)).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isDoubleConstant)).isMethod(new Viewport(new Geopoint(-isDoubleConstant, -isDoubleConstant), new Geopoint(isDoubleConstant, isDoubleConstant)));
        isMethod(isNameExpr.isMethod(isDoubleConstant)).isMethod(new Viewport(new Geopoint(isDoubleConstant, -isDoubleConstant), new Geopoint(isDoubleConstant, isDoubleConstant)));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isDoubleConstant))).isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isDoubleConstant))).isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isMethod((ICoordinates) null))).isMethod();
        final Set<Geopoint> isVariable = new HashSet<>();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isMethod(isNameExpr)).isMethod(new Viewport(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isMethod(isNameExpr)).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isMethod(isNameExpr)).isMethod(isNameExpr);
    }
}
