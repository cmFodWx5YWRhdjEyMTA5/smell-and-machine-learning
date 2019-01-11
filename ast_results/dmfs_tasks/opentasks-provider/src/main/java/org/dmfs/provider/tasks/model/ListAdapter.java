// isComment
package org.dmfs.provider.tasks.model;

import android.content.ContentValues;
import android.database.Cursor;
import org.dmfs.provider.tasks.model.adapters.IntegerFieldAdapter;
import org.dmfs.provider.tasks.model.adapters.LongFieldAdapter;
import org.dmfs.provider.tasks.model.adapters.StringFieldAdapter;
import org.dmfs.tasks.contract.TaskContract.TaskLists;

/**
 * isComment
 */
public interface isClassOrIsInterface extends EntityAdapter<ListAdapter> {

    /**
     * isComment
     */
    LongFieldAdapter<ListAdapter> isVariable = new LongFieldAdapter<ListAdapter>(isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    StringFieldAdapter<ListAdapter> isVariable = new StringFieldAdapter<ListAdapter>(isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    StringFieldAdapter<ListAdapter> isVariable = new StringFieldAdapter<ListAdapter>(isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    StringFieldAdapter<ListAdapter> isVariable = new StringFieldAdapter<ListAdapter>(isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    StringFieldAdapter<ListAdapter> isVariable = new StringFieldAdapter<ListAdapter>(isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    StringFieldAdapter<ListAdapter> isVariable = new StringFieldAdapter<ListAdapter>(isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    StringFieldAdapter<ListAdapter> isVariable = new StringFieldAdapter<ListAdapter>(isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    IntegerFieldAdapter<ListAdapter> isVariable = new IntegerFieldAdapter<ListAdapter>(isNameExpr.isFieldAccessExpr);

    /**
     * isComment
     */
    @Override
    ListAdapter isMethod();
}
