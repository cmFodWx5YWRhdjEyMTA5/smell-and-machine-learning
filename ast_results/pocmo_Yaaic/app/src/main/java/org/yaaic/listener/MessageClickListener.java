// isComment
package org.yaaic.listener;

import org.yaaic.activity.MessageActivity;
import org.yaaic.adapter.MessageListAdapter;
import org.yaaic.model.Extra;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/**
 * isComment
 */
public class isClassOrIsInterface implements OnItemClickListener {

    private static MessageClickListener isVariable;

    /**
     * isComment
     */
    private isConstructor() {
    }

    /**
     * isComment
     */
    public static synchronized MessageClickListener isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new MessageClickListener();
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(AdapterView<?> isParameter, View isParameter, int isParameter, long isParameter) {
        MessageListAdapter isVariable = (MessageListAdapter) isNameExpr.isMethod();
        Intent isVariable = new Intent(isNameExpr.isMethod(), MessageActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr).isMethod().isMethod());
        isNameExpr.isMethod().isMethod(isNameExpr);
    }
}
