// isComment
package fr.ybo.transportscommun.donnees;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import fr.ybo.transportscommun.donnees.modele.Arret;
import fr.ybo.transportscommun.donnees.modele.ArretRoute;
import fr.ybo.transportscommun.donnees.modele.Calendrier;
import fr.ybo.transportscommun.donnees.modele.CalendrierException;
import fr.ybo.transportscommun.donnees.modele.DernierMiseAJour;
import fr.ybo.transportscommun.donnees.modele.Direction;
import fr.ybo.transportscommun.donnees.modele.Horaire;
import fr.ybo.transportscommun.donnees.modele.Ligne;
import fr.ybo.transportscommun.donnees.modele.Trajet;

public final class isClassOrIsInterface {

    public static final Collection<Class<?>> isVariable = new ArrayList<Class<?>>(isIntegerConstant);

    static {
        isNameExpr.isMethod(Arret.class);
        isNameExpr.isMethod(Calendrier.class);
        isNameExpr.isMethod(CalendrierException.class);
        isNameExpr.isMethod(DernierMiseAJour.class);
        isNameExpr.isMethod(Ligne.class);
        isNameExpr.isMethod(ArretRoute.class);
        isNameExpr.isMethod(Trajet.class);
        isNameExpr.isMethod(Direction.class);
    }

    public static final List<Class<?>> isVariable = new ArrayList<Class<?>>(isIntegerConstant);

    static {
        isNameExpr.isMethod(Arret.class);
        isNameExpr.isMethod(ArretRoute.class);
        isNameExpr.isMethod(Calendrier.class);
        isNameExpr.isMethod(CalendrierException.class);
        isNameExpr.isMethod(Horaire.class);
        isNameExpr.isMethod(Ligne.class);
        isNameExpr.isMethod(Trajet.class);
        isNameExpr.isMethod(Direction.class);
    }

    private isConstructor() {
    }
}
