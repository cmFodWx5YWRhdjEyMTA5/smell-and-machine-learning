// isComment
package de.geeksfactory.opacclient.reminder;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentMatcher;
import java.util.ArrayList;
import de.geeksfactory.opacclient.OpacClient;
import de.geeksfactory.opacclient.objects.LentItem;
import de.geeksfactory.opacclient.storage.AccountDataSource;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.argThat;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

public class isClassOrIsInterface {

    private ReminderHelper isVariable;

    private OpacClient isVariable;

    private SharedPreferences isVariable;

    private AccountDataSource isVariable;

    private NotificationManager isVariable;

    private AlarmManager isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = isMethod(OpacClient.class);
        isNameExpr = isMethod(SharedPreferences.class);
        isNameExpr = isMethod(AccountDataSource.class);
        isNameExpr = new ReminderHelper(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isMethod(NotificationManager.class);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr);
        isNameExpr = isMethod(AlarmManager.class);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod("isStringConstant"), isMethod())).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(true);
        isNameExpr.isMethod();
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod();
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(new ArrayList<LentItem>());
        isNameExpr.isMethod();
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(LocalDate.class), isMethod(long[].class), isMethod(DateTime.class));
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(true);
        LocalDate isVariable = isNameExpr.isMethod();
        long isVariable = isStringConstant;
        isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isNameExpr, new long[] { isNameExpr }, isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isIntegerConstant)));
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(new ArrayList<LentItem>());
        Alarm isVariable = isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(true);
        isMethod(isNameExpr.isMethod(), isStringConstant);
        isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(new ArgumentMatcher<Alarm>() {

            @Override
            public boolean isMethod(Object isParameter) {
                Alarm isVariable = (Alarm) isNameExpr;
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr == isIntegerConstant && isNameExpr.isFieldAccessExpr[isIntegerConstant] == isStringConstant;
            }
        }));
    }

    @SuppressLint("isStringConstant")
    @Test
    public void isMethod() {
        SharedPreferences.Editor isVariable = isMethod(SharedPreferences.Editor.class);
        isMethod(isNameExpr.isMethod(isMethod("isStringConstant"), isMethod())).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(new ArrayList<LentItem>());
        isMethod(isNameExpr.isMethod(isMethod(), isMethod())).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod("isStringConstant", "isStringConstant");
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr);
    }

    private void isMethod(boolean isParameter) {
        isMethod(isNameExpr.isMethod(isMethod("isStringConstant"), isMethod())).isMethod(isNameExpr);
    }

    private LentItem isMethod(LocalDate isParameter, long isParameter) {
        ArrayList<LentItem> isVariable = new ArrayList<>();
        LentItem isVariable = new LentItem();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        return isNameExpr;
    }

    @NonNull
    private Alarm isMethod() {
        ArrayList<Alarm> isVariable = new ArrayList<>();
        Alarm isVariable = new Alarm();
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr = true;
        isNameExpr.isFieldAccessExpr = true;
        isNameExpr.isFieldAccessExpr = isStringConstant;
        isNameExpr.isFieldAccessExpr = new long[] { isStringConstant };
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr);
        return isNameExpr;
    }
}
