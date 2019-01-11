// isComment
package au.id.micolous.metrodroid.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.Calendar;
import au.id.micolous.metrodroid.card.desfire.DesfireApplication;
import au.id.micolous.metrodroid.card.desfire.DesfireCard;
import au.id.micolous.metrodroid.card.desfire.files.DesfireFile;
import au.id.micolous.metrodroid.transit.TransitData;
import au.id.micolous.metrodroid.transit.TransitIdentity;
import au.id.micolous.metrodroid.transit.serialonly.MykiTransitData;
import au.id.micolous.metrodroid.util.Utils;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

@RunWith(JUnit4.class)
public class isClassOrIsInterface {

    private DesfireCard isMethod(String isParameter) {
        byte[] isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        DesfireFile isVariable = isNameExpr.isMethod(isIntegerConstant, null, isNameExpr);
        DesfireApplication isVariable = new DesfireApplication(isNameExpr.isFieldAccessExpr, new DesfireFile[] { isNameExpr });
        DesfireApplication isVariable = new DesfireApplication(isNameExpr.isFieldAccessExpr, new DesfireFile[] {});
        return new DesfireCard(new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, isNameExpr.isMethod(), null, new DesfireApplication[] { isNameExpr, isNameExpr });
    }

    @Test
    public void isMethod() {
        // isComment
        DesfireCard isVariable = isMethod("isStringConstant");
        // isComment
        TransitIdentity isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod());
        // isComment
        TransitData isVariable = isNameExpr.isMethod();
        isMethod("isStringConstant", isNameExpr instanceof MykiTransitData);
        MykiTransitData isVariable = (MykiTransitData) isNameExpr;
        isMethod("isStringConstant", isNameExpr.isMethod());
    }
}
