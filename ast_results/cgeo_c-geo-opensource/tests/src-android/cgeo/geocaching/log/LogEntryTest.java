// isComment
package cgeo.geocaching.log;

import static org.assertj.core.api.Java6Assertions.assertThat;
import cgeo.CGeoTestCase;
import cgeo.geocaching.CgeoApplication;
import cgeo.geocaching.R;
import cgeo.geocaching.models.Image;
import cgeo.geocaching.settings.Settings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface extends CGeoTestCase {

    public static void isMethod() {
        final LogEntry isVariable = new LogEntry.Builder().isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod();
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant");
    }

    public static void isMethod() {
        final LogEntry isVariable = new LogEntry.Builder().isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod();
        final LogEntry isVariable = new LogEntry.Builder().isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod();
        isMethod(isNameExpr).isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    public static void isMethod() {
        final Image isVariable = isNameExpr.isFieldAccessExpr;
        final LogEntry isVariable = new LogEntry.Builder().isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        final Image isVariable = new Image.Builder().isMethod("isStringConstant").isMethod();
        final LogEntry isVariable = new LogEntry.Builder().isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod(isNameExpr);
    }

    public static void isMethod() {
        final String isVariable = "isStringConstant" + isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        LogEntry isVariable = new LogEntry.Builder().isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final Image isVariable = new Image.Builder().isMethod("isStringConstant").isMethod();
        isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        final Image isVariable = new Image.Builder().isMethod("isStringConstant").isMethod();
        isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
        final Image isVariable = new Image.Builder().isMethod("isStringConstant").isMethod();
        isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        final String isVariable = "isStringConstant";
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }

    public static void isMethod() {
        final Boolean isVariable = isNameExpr.isMethod();
        final LogEntry isVariable = new LogEntry.Builder().isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod();
        final LogEntry isVariable = new LogEntry.Builder().isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod();
        final LogEntry isVariable = new LogEntry.Builder().isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod();
        final LogEntry isVariable = new LogEntry.Builder().isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod();
        isNameExpr.isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isNameExpr.isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
    }

    public static void isMethod() {
        final LogEntry isVariable = new LogEntry.Builder().isMethod("isStringConstant").isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod();
        final LogEntry isVariable = new LogEntry.Builder().isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod();
        final LogEntry isVariable = new LogEntry.Builder().isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod();
        isMethod(isNameExpr.isMethod()).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod();
    }

    public static void isMethod() {
        final LogEntry isVariable = new LogEntry.Builder().isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod();
        final LogEntry isVariable = new LogEntry.Builder().isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod();
        final List<LogEntry> isVariable = new ArrayList<>(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, isNameExpr);
    }
}
