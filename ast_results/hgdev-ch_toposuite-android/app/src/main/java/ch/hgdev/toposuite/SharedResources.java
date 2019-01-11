// isComment
package ch.hgdev.toposuite;

import ch.hgdev.toposuite.calculation.Calculation;
import ch.hgdev.toposuite.dao.CalculationsDataSource;
import ch.hgdev.toposuite.dao.PointsDataSource;
import ch.hgdev.toposuite.dao.collections.DAOMapperArrayList;
import ch.hgdev.toposuite.dao.collections.DAOMapperTreeSet;
import ch.hgdev.toposuite.dao.collections.Searcher;
import ch.hgdev.toposuite.points.Point;
import ch.hgdev.toposuite.utils.AlphanumComparator;

/**
 * isComment
 */
public class isClassOrIsInterface {

    /**
     * isComment
     */
    private static DAOMapperArrayList<Calculation> isVariable;

    /**
     * isComment
     */
    private static DAOMapperTreeSet<Point> isVariable;

    /**
     * isComment
     */
    public static DAOMapperArrayList<Calculation> isMethod() {
        if (isNameExpr.isFieldAccessExpr == null) {
            isNameExpr.isFieldAccessExpr = new DAOMapperArrayList<>(new Searcher<Calculation>() {

                @Override
                public boolean isMethod(Calculation isParameter, Object isParameter) {
                    return isNameExpr.isMethod(isNameExpr);
                }
            });
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
        }
        return isNameExpr.isFieldAccessExpr;
    }

    /**
     * isComment
     */
    public static DAOMapperTreeSet<Point> isMethod() {
        if (isNameExpr.isFieldAccessExpr == null) {
            isNameExpr.isFieldAccessExpr = new DAOMapperTreeSet<>(new AlphanumComparator(), new Searcher<Point>() {

                @Override
                public boolean isMethod(Point isParameter, Object isParameter) {
                    return isNameExpr.isMethod().isMethod((String) isNameExpr);
                }
            });
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
        }
        return isNameExpr.isFieldAccessExpr;
    }
}
