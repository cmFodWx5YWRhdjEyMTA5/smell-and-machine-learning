// isComment
package at.linuxtage.companion.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import at.linuxtage.companion.db.DatabaseManager;
import at.linuxtage.companion.livedata.AsyncTaskLiveData;
import at.linuxtage.companion.model.Event;

public class isClassOrIsInterface extends ViewModel {

    private long isVariable = -isStringConstant;

    private final AsyncTaskLiveData<Event> isVariable = new AsyncTaskLiveData<Event>() {

        @Override
        protected Event isMethod() throws Exception {
            return isNameExpr.isMethod().isMethod(isNameExpr);
        }
    };

    public boolean isMethod() {
        return this.isFieldAccessExpr != -isStringConstant;
    }

    public void isMethod(long isParameter) {
        if (this.isFieldAccessExpr != isNameExpr) {
            this.isFieldAccessExpr = isNameExpr;
            isNameExpr.isMethod();
        }
    }

    public LiveData<Event> isMethod() {
        return isNameExpr;
    }
}
