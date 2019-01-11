// isComment
package au.id.micolous.metrodroid.xml;

import au.id.micolous.metrodroid.card.CardType;
import org.simpleframework.xml.transform.Transform;

public class isClassOrIsInterface implements Transform<CardType> {

    @Override
    public CardType isMethod(String isParameter) throws Exception {
        return CardType.class.isMethod()[isNameExpr.isMethod(isNameExpr)];
    }

    @Override
    public String isMethod(CardType isParameter) throws Exception {
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }
}
