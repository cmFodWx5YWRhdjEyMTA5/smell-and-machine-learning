// isComment
package au.id.micolous.metrodroid.xml;

import au.id.micolous.metrodroid.card.Card;
import au.id.micolous.metrodroid.card.CardType;
import au.id.micolous.metrodroid.card.iso7816.ISO7816Card;
import au.id.micolous.metrodroid.card.cepascompat.CEPASCard;
import au.id.micolous.metrodroid.card.classic.ClassicCard;
import au.id.micolous.metrodroid.card.desfire.DesfireCard;
import au.id.micolous.metrodroid.card.felica.FelicaCard;
import au.id.micolous.metrodroid.card.ultralight.UltralightCard;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

public class isClassOrIsInterface implements Converter<Card> {

    private final Serializer isVariable;

    public isConstructor(Serializer isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public Card isMethod(InputNode isParameter) throws Exception {
        CardType isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant").isMethod());
        switch(isNameExpr) {
            case isNameExpr:
                return isNameExpr.isMethod(DesfireCard.class, isNameExpr);
            case isNameExpr:
                return isNameExpr.isMethod(CEPASCard.class, isNameExpr);
            case isNameExpr:
                return isNameExpr.isMethod(FelicaCard.class, isNameExpr);
            case isNameExpr:
                return isNameExpr.isMethod(ClassicCard.class, isNameExpr);
            case isNameExpr:
                return isNameExpr.isMethod(UltralightCard.class, isNameExpr);
            case isNameExpr:
                return isNameExpr.isMethod(ISO7816Card.class, isNameExpr);
            default:
                throw new UnsupportedOperationException("isStringConstant" + isNameExpr);
        }
    }

    @Override
    public void isMethod(OutputNode isParameter, Card isParameter) throws Exception {
        throw new SkippableRegistryStrategy.SkipException();
    }
}
