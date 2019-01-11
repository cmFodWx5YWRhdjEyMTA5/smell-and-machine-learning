// isComment
package au.id.micolous.metrodroid.card.cepascompat;

import au.id.micolous.metrodroid.card.Card;
import au.id.micolous.metrodroid.transit.TransitData;
import au.id.micolous.metrodroid.transit.TransitIdentity;
import au.id.micolous.metrodroid.transit.ezlinkcompat.EZLinkCompatTransitData;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
import java.util.List;

// isComment
@Root(name = "isStringConstant")
public class isClassOrIsInterface extends Card {

    @ElementList(name = "isStringConstant")
    private List<CEPASCompatPurse> isVariable;

    @ElementList(name = "isStringConstant")
    private List<CEPASCompatHistory> isVariable;

    private isConstructor() {
    /*isComment*/
    }

    @Override
    public TransitIdentity isMethod() {
        return isNameExpr.isMethod(this);
    }

    @Override
    public TransitData isMethod() {
        return new EZLinkCompatTransitData(this);
    }

    public CEPASCompatPurse isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public CEPASCompatHistory isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }
}
