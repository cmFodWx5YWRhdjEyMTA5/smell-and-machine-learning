// isComment
package be.digitalia.fosdem.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import be.digitalia.fosdem.db.DatabaseManager;
import be.digitalia.fosdem.livedata.AsyncTaskLiveData;
import be.digitalia.fosdem.model.Event;

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
