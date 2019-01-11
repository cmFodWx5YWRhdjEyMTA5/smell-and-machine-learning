// isComment
package org.ale.openwatch.model;

import android.content.Context;
import com.orm.androrm.Filter;
import com.orm.androrm.Model;
import com.orm.androrm.QuerySet;
import com.orm.androrm.field.BooleanField;
import com.orm.androrm.field.CharField;
import com.orm.androrm.field.IntegerField;
import com.orm.androrm.field.ManyToManyField;
import org.ale.openwatch.constants.Constants;
import org.ale.openwatch.constants.DBConstants;
import org.ale.openwatch.contentprovider.OWContentProvider;
import org.json.JSONException;
import org.json.JSONObject;

public class isClassOrIsInterface extends Model {

    public CharField isVariable;

    public BooleanField isVariable;

    public IntegerField isVariable;

    public ManyToManyField<OWSyncTask, OWVideoRecording> isVariable;

    public isConstructor() {
        super();
        isNameExpr = new CharField();
        isNameExpr = new BooleanField();
        isNameExpr = new IntegerField();
        isNameExpr = new ManyToManyField<OWSyncTask, OWVideoRecording>(OWSyncTask.class, OWVideoRecording.class);
    }

    @Override
    public boolean isMethod(Context isParameter) {
        // isComment
        isNameExpr.isMethod().isMethod(isNameExpr.isMethod(this.isMethod()), null);
        return super.isMethod(isNameExpr);
    }

    public JSONObject isMethod() {
        JSONObject isVariable = new JSONObject();
        if (isNameExpr.isMethod() != null) {
            try {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
            } catch (JSONException isParameter) {
                isNameExpr.isMethod();
            }
            return isNameExpr;
        }
        return null;
    }

    public static OWSyncTask isMethod(Context isParameter, JSONObject isParameter) throws JSONException {
        Filter isVariable;
        OWSyncTask isVariable = null;
        isNameExpr = new Filter();
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        // isComment
        QuerySet<OWSyncTask> isVariable = isNameExpr.isMethod(isNameExpr, OWSyncTask.class).isMethod(isNameExpr);
        for (OWSyncTask isVariable : isNameExpr) {
            isNameExpr = isNameExpr;
            break;
        }
        if (isNameExpr == null) {
            isNameExpr = new OWSyncTask();
        }
        if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        return isNameExpr;
    }
}
