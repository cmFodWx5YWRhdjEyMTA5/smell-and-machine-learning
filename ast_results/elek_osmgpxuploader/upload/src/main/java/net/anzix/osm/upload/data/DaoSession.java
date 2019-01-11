// isComment
package net.anzix.osm.upload.data;

import android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;
import net.anzix.osm.upload.data.Source;
import net.anzix.osm.upload.data.Gpx;
import net.anzix.osm.upload.data.SourceDao;
import net.anzix.osm.upload.data.GpxDao;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractDaoSession {

    private final DaoConfig isVariable;

    private final DaoConfig isVariable;

    private final SourceDao isVariable;

    private final GpxDao isVariable;

    public isConstructor(SQLiteDatabase isParameter, IdentityScopeType isParameter, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig> isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod(SourceDao.class).isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(GpxDao.class).isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = new SourceDao(isNameExpr, this);
        isNameExpr = new GpxDao(isNameExpr, this);
        isMethod(Source.class, isNameExpr);
        isMethod(Gpx.class, isNameExpr);
    }

    public void isMethod() {
        isNameExpr.isMethod().isMethod();
        isNameExpr.isMethod().isMethod();
    }

    public SourceDao isMethod() {
        return isNameExpr;
    }

    public GpxDao isMethod() {
        return isNameExpr;
    }
}
