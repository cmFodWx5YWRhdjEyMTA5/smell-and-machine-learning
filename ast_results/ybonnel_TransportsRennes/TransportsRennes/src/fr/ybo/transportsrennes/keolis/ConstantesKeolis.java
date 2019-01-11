// isComment
package fr.ybo.transportsrennes.keolis;

import java.util.ArrayList;
import java.util.List;
import fr.ybo.transportscommun.donnees.modele.Arret;
import fr.ybo.transportscommun.donnees.modele.ArretFavori;
import fr.ybo.transportscommun.donnees.modele.ArretRoute;
import fr.ybo.transportscommun.donnees.modele.Bounds;
import fr.ybo.transportscommun.donnees.modele.Calendrier;
import fr.ybo.transportscommun.donnees.modele.CalendrierException;
import fr.ybo.transportscommun.donnees.modele.DernierMiseAJour;
import fr.ybo.transportscommun.donnees.modele.Direction;
import fr.ybo.transportscommun.donnees.modele.GroupeFavori;
import fr.ybo.transportscommun.donnees.modele.Horaire;
import fr.ybo.transportscommun.donnees.modele.Ligne;
import fr.ybo.transportscommun.donnees.modele.Notification;
import fr.ybo.transportscommun.donnees.modele.Trajet;
import fr.ybo.transportscommun.donnees.modele.VeloFavori;
import fr.ybo.transportsrennes.database.modele.AlertBdd;

public final class isClassOrIsInterface {

    public static final List<Class<?>> isVariable = new ArrayList<Class<?>>(isIntegerConstant);

    static {
        isNameExpr.isMethod(Arret.class);
        isNameExpr.isMethod(Calendrier.class);
        isNameExpr.isMethod(CalendrierException.class);
        isNameExpr.isMethod(DernierMiseAJour.class);
        isNameExpr.isMethod(Ligne.class);
        isNameExpr.isMethod(Horaire.class);
        isNameExpr.isMethod(ArretFavori.class);
        isNameExpr.isMethod(ArretRoute.class);
        isNameExpr.isMethod(VeloFavori.class);
        isNameExpr.isMethod(Trajet.class);
        isNameExpr.isMethod(Direction.class);
        isNameExpr.isMethod(GroupeFavori.class);
        isNameExpr.isMethod(Notification.class);
        isNameExpr.isMethod(AlertBdd.class);
        isNameExpr.isMethod(Bounds.class);
    }

    private isConstructor() {
    }
}
