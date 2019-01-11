// isComment
package org.sudowars.Controller.Local.Activity;

import org.sudowars.Model.SudokuManagement.Pool.SudokuFilePool;
import org.sudowars.Model.SudokuManagement.Pool.SudokuFilePool.SudokuFilePoolBinder;
import org.sudowars.Model.SudokuManagement.Pool.SudokuPool;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

public class isClassOrIsInterface extends Activity {

    /**
     * isComment
     */
    protected SudokuPool isVariable;

    /**
     * isComment
     */
    private boolean isVariable = true;

    /*isComment*/
    @Override
    protected void isMethod() {
        super.isMethod();
        Intent isVariable = new Intent(this, SudokuFilePool.class);
        isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    /*isComment*/
    @Override
    protected void isMethod() {
        super.isMethod();
        if (this.isFieldAccessExpr) {
            isMethod(isNameExpr);
            this.isFieldAccessExpr = true;
        }
    }

    /*isComment*/
    private ServiceConnection isVariable = new ServiceConnection() {

        /*isComment*/
        @Override
        public void isMethod(ComponentName isParameter, IBinder isParameter) {
            // isComment
            SudokuFilePoolBinder isVariable = (SudokuFilePoolBinder) isNameExpr;
            isNameExpr.this.isFieldAccessExpr = isNameExpr.isMethod();
            isNameExpr.this.isFieldAccessExpr = true;
        }

        /*isComment*/
        @Override
        public void isMethod(ComponentName isParameter) {
            isNameExpr.this.isFieldAccessExpr = true;
        }
    };
}
