// isComment
package openfoodfacts.github.scrachx.openfood.models;

import android.util.Log;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.JoinProperty;
import org.greenrobot.greendao.annotation.Keep;
import org.greenrobot.greendao.annotation.ToMany;
import org.greenrobot.greendao.annotation.Unique;
import java.util.List;

@Entity(indexes = { @Index(value = "isStringConstant", unique = true) })
public class isClassOrIsInterface {

    @Id(autoincrement = true)
    private Long isVariable;

    @Unique
    private String isVariable;

    @Unique
    private String isVariable;

    private Boolean isVariable;

    @ToMany(joinProperties = { @JoinProperty(name = "isStringConstant", referencedName = "isStringConstant") })
    private List<LabelName> isVariable;

    /**
     * isComment
     */
    @Generated(hash = isIntegerConstant)
    private transient DaoSession isVariable;

    /**
     * isComment
     */
    @Generated(hash = isIntegerConstant)
    private transient LabelDao isVariable;

    public isConstructor() {
    }

    @Keep
    public isConstructor(String isParameter, List<LabelName> isParameter, String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = true;
    }

    @Keep
    public isConstructor(String isParameter, List<LabelName> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = true;
    }

    @Generated(hash = isIntegerConstant)
    public isConstructor(Long isParameter, String isParameter, String isParameter, Boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public Long isMethod() {
        return this.isFieldAccessExpr;
    }

    public void isMethod(Long isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public String isMethod() {
        return this.isFieldAccessExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Boolean isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Generated(hash = isIntegerConstant)
    public List<LabelName> isMethod() {
        if (isNameExpr == null) {
            final DaoSession isVariable = this.isFieldAccessExpr;
            if (isNameExpr == null) {
                throw new DaoException("isStringConstant");
            }
            LabelNameDao isVariable = isNameExpr.isMethod();
            List<LabelName> isVariable = isNameExpr.isMethod(isNameExpr);
            synchronized (this) {
                if (isNameExpr == null) {
                    isNameExpr = isNameExpr;
                }
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Generated(hash = isIntegerConstant)
    public synchronized void isMethod() {
        isNameExpr = null;
    }

    /**
     * isComment
     */
    @Generated(hash = isIntegerConstant)
    public void isMethod() {
        if (isNameExpr == null) {
            throw new DaoException("isStringConstant");
        }
        isNameExpr.isMethod(this);
    }

    /**
     * isComment
     */
    @Generated(hash = isIntegerConstant)
    public void isMethod() {
        if (isNameExpr == null) {
            throw new DaoException("isStringConstant");
        }
        isNameExpr.isMethod(this);
    }

    /**
     * isComment
     */
    @Generated(hash = isIntegerConstant)
    public void isMethod() {
        if (isNameExpr == null) {
            throw new DaoException("isStringConstant");
        }
        isNameExpr.isMethod(this);
    }

    public String isMethod() {
        return this.isFieldAccessExpr;
    }

    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public Boolean isMethod() {
        return this.isFieldAccessExpr;
    }

    public void isMethod(Boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @Generated(hash = isIntegerConstant)
    public void isMethod(DaoSession isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = isNameExpr != null ? isNameExpr.isMethod() : null;
    }
}
