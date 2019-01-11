// isComment
package cgeo.geocaching.files;

import android.support.annotation.RawRes;
import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import cgeo.geocaching.enumerations.CacheType;
import cgeo.geocaching.location.Geopoint;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.test.AbstractResourceInstrumentationTestCase;
import static cgeo.geocaching.enumerations.CacheSize.MICRO;
import static cgeo.geocaching.enumerations.CacheSize.UNKNOWN;
import static cgeo.geocaching.test.R.raw.gc1bkp3_loc;
import static cgeo.geocaching.test.R.raw.oc5952_loc;
import static cgeo.geocaching.test.R.raw.waymarking_loc;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class isClassOrIsInterface extends AbstractResourceInstrumentationTestCase {

    private List<Geocache> isMethod(@RawRes final int isParameter) throws IOException, ParserException {
        final LocParser isVariable = new LocParser(isMethod());
        Collection<Geocache> isVariable = null;
        final InputStream isVariable = isMethod(isNameExpr);
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr, null);
            isMethod(isNameExpr).isMethod();
            isMethod(isNameExpr).isMethod();
        } finally {
            isNameExpr.isMethod(isNameExpr);
        }
        return new ArrayList<>(isNameExpr);
    }

    public void isMethod() throws IOException, ParserException {
        final List<Geocache> isVariable = isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isIntegerConstant);
        final Geocache isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(new Geopoint(isDoubleConstant, isDoubleConstant));
    }

    public void isMethod() throws IOException, ParserException {
        final List<Geocache> isVariable = isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isIntegerConstant);
        final Geocache isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(new Geopoint(isDoubleConstant, isDoubleConstant));
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    public void isMethod() throws IOException, ParserException {
        final List<Geocache> isVariable = isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isIntegerConstant);
        final Geocache isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(new Geopoint(isDoubleConstant, isDoubleConstant));
        // isComment
        // isComment
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
    }
}
