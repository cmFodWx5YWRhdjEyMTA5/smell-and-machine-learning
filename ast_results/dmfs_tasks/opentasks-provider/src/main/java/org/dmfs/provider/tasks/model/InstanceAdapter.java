// isComment
package org.dmfs.provider.tasks.model;

import android.content.ContentValues;
import android.database.Cursor;
import org.dmfs.provider.tasks.model.adapters.DateTimeFieldAdapter;
import org.dmfs.provider.tasks.model.adapters.IntegerFieldAdapter;
import org.dmfs.provider.tasks.model.adapters.LongFieldAdapter;
import org.dmfs.tasks.contract.TaskContract.Instances;
import org.dmfs.tasks.contract.TaskContract.Tasks;

/**
 * isComment
 */
public interface isClassOrIsInterface extends EntityAdapter<InstanceAdapter> {

    /**
     * isComment
     */
    LongFieldAdapter<InstanceAdapter> isVariable = new LongFieldAdapter<InstanceAdapter>(isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    DateTimeFieldAdapter<InstanceAdapter> isVariable = new DateTimeFieldAdapter<>(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    DateTimeFieldAdapter<InstanceAdapter> isVariable = new DateTimeFieldAdapter<>(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    LongFieldAdapter<InstanceAdapter> isVariable = new LongFieldAdapter<>(isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    LongFieldAdapter<InstanceAdapter> isVariable = new LongFieldAdapter<>(isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    DateTimeFieldAdapter<InstanceAdapter> isVariable = new DateTimeFieldAdapter<>(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    IntegerFieldAdapter<InstanceAdapter> isVariable = new IntegerFieldAdapter<>(isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    LongFieldAdapter<InstanceAdapter> isVariable = new LongFieldAdapter<InstanceAdapter>(isNameExpr.isFieldAccessExpr);

    @Override
    InstanceAdapter isMethod();

    /**
     * isComment
     */
    TaskAdapter isMethod();
}
