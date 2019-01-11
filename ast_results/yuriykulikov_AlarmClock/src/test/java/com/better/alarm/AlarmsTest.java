// isComment
package com.better.alarm;

import android.content.ContentResolver;
import com.better.alarm.configuration.Prefs;
import com.better.alarm.configuration.Store;
import com.better.alarm.interfaces.Alarm;
import com.better.alarm.interfaces.IAlarmsManager;
import com.better.alarm.interfaces.Intents;
import com.better.alarm.logger.Logger;
import com.better.alarm.logger.SysoutLogWriter;
import com.better.alarm.model.AlarmActiveRecord;
import com.better.alarm.model.AlarmCore;
import com.better.alarm.model.AlarmCoreFactory;
import com.better.alarm.model.AlarmSetter;
import com.better.alarm.model.AlarmValue;
import com.better.alarm.model.Alarms;
import com.better.alarm.model.AlarmsScheduler;
import com.better.alarm.model.CalendarType;
import com.better.alarm.model.Calendars;
import com.better.alarm.model.ContainerFactory;
import com.better.alarm.model.DaysOfWeek;
import com.better.alarm.persistance.DatabaseQuery;
import com.better.alarm.util.Optional;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.mockito.ArgumentCaptor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.TestScheduler;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import kotlin.collections.CollectionsKt;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class isClassOrIsInterface {

    private AlarmCore.IStateNotifier isVariable;

    private AlarmSetter isVariable;

    private TestScheduler isVariable;

    private Store isVariable;

    private Prefs isVariable;

    private Logger isVariable;

    @Rule
    public TestRule isVariable = new TestWatcher() {

        protected void isMethod(Description isParameter) {
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
        }
    };

    @Before
    public void isMethod() {
        isNameExpr = new TestScheduler();
        isNameExpr = isNameExpr.isMethod().isMethod(new SysoutLogWriter());
        isNameExpr = new Prefs(/*isComment*/
        isNameExpr.isMethod(true), /*isComment*/
        isNameExpr.isMethod(isIntegerConstant), /*isComment*/
        isNameExpr.isMethod(isIntegerConstant), /*isComment*/
        isNameExpr.isMethod(isIntegerConstant));
        isNameExpr = new Store(/*isComment*/
        isNameExpr.<List<AlarmValue>>isMethod(new ArrayList<AlarmValue>()), /*isComment*/
        isNameExpr.isMethod(isNameExpr.<Store.Next>isMethod()), /*isComment*/
        isNameExpr.<Store.AlarmSet>isMethod());
        isNameExpr = isMethod(AlarmCore.IStateNotifier.class);
        isNameExpr = isMethod(AlarmSetter.class);
    }

    private Alarms isMethod(DatabaseQuery isParameter) {
        Calendars isVariable = new Calendars() {

            @Override
            public Calendar isMethod() {
                return isNameExpr.isMethod();
            }
        };
        AlarmsScheduler isVariable = new AlarmsScheduler(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        Alarms isVariable = new Alarms(isNameExpr, isNameExpr, new AlarmCoreFactory(isNameExpr, isNameExpr, isNameExpr, new TestHandlerFactory(isNameExpr), isNameExpr, isNameExpr, isNameExpr), new TestContainerFactory(isNameExpr));
        return isNameExpr;
    }

    private Alarms isMethod() {
        return isMethod(isMethod());
    }

    @android.support.annotation.NonNull
    private DatabaseQuery isMethod() {
        final DatabaseQuery isVariable = isMethod(DatabaseQuery.class);
        List<AlarmActiveRecord> isVariable = new ArrayList<>();
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr));
        return isNameExpr;
    }

    @Test
    public void isMethod() {
        // isComment
        IAlarmsManager isVariable = isMethod();
        Alarm isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(true);
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod().isMethod().isMethod(new Predicate<List<AlarmValue>>() {

            @Override
            public boolean isMethod(@NonNull List<AlarmValue> isParameter) throws Exception {
                return isNameExpr.isMethod() == isIntegerConstant && isNameExpr.isMethod(isIntegerConstant).isMethod();
            }
        });
    }

    @Test
    public void isMethod() {
        // isComment
        IAlarmsManager isVariable = isMethod();
        Alarm isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod().isMethod().isMethod(new Predicate<List<AlarmValue>>() {

            @Override
            public boolean isMethod(@NonNull List<AlarmValue> isParameter) throws Exception {
                return isNameExpr.isMethod() == isIntegerConstant;
            }
        });
    }

    @Test
    public void isMethod() {
        // isComment
        IAlarmsManager isVariable = isMethod();
        Alarm isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(true);
        isNameExpr.isMethod();
        isNameExpr.isMethod(isIntegerConstant).isMethod();
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod().isMethod().isMethod(new Predicate<List<AlarmValue>>() {

            @Override
            public boolean isMethod(@NonNull List<AlarmValue> isParameter) throws Exception {
                return isNameExpr.isMethod() == isIntegerConstant;
            }
        });
    }

    @Test
    public void isMethod() {
        // isComment
        IAlarmsManager isVariable = isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod(true);
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant, new Predicate<List<AlarmValue>>() {

            @Override
            public boolean isMethod(@NonNull List<AlarmValue> isParameter) throws Exception {
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
                return isNameExpr.isMethod() == isIntegerConstant && !isNameExpr.isMethod(isIntegerConstant).isMethod() && isNameExpr.isMethod(isIntegerConstant).isMethod() && !isNameExpr.isMethod(isIntegerConstant).isMethod();
            }
        });
    }

    static class isClassOrIsInterface extends DatabaseQuery {

        private ContainerFactory isVariable;

        public isConstructor(ContainerFactory isParameter) {
            super(isMethod(ContentResolver.class), isNameExpr);
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public Single<List<AlarmActiveRecord>> isMethod() {
            AlarmActiveRecord isVariable = isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod(true).isMethod("isStringConstant");
            List<AlarmActiveRecord> isVariable = isNameExpr.isMethod(isNameExpr);
            return isNameExpr.isMethod(isNameExpr);
        }
    }

    @Test
    public void isMethod() {
        // isComment
        Alarms isVariable = isMethod(new DatabaseQueryMock(new TestContainerFactory(new Calendars() {

            @Override
            public Calendar isMethod() {
                return isNameExpr.isMethod();
            }
        })));
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod().isMethod().isMethod(new Predicate<List<AlarmValue>>() {

            @Override
            public boolean isMethod(@NonNull List<AlarmValue> isParameter) throws Exception {
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
                return isNameExpr.isMethod() == isIntegerConstant && isNameExpr.isMethod(isIntegerConstant).isMethod() && isNameExpr.isMethod(isIntegerConstant).isMethod().isMethod("isStringConstant");
            }
        });
    }

    @Test
    public void isMethod() {
        // isComment
        IAlarmsManager isVariable = isMethod();
        Alarm isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod(true).isMethod(isIntegerConstant).isMethod();
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod().isMethod().isMethod(new Predicate<List<AlarmValue>>() {

            @Override
            public boolean isMethod(@NonNull List<AlarmValue> isParameter) throws Exception {
                return isNameExpr.isMethod() == isIntegerConstant && isNameExpr.isMethod(isIntegerConstant).isMethod() && isNameExpr.isMethod(isIntegerConstant).isMethod() == isIntegerConstant;
            }
        });
    }

    @Test
    public void isMethod() {
        // isComment
        Alarms isVariable = isMethod();
        Alarm isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(true);
        isNameExpr.isMethod();
        isNameExpr.isMethod((AlarmCore) isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
        // isComment
        isNameExpr.isMethod().isMethod().isMethod(new Predicate<List<AlarmValue>>() {

            @Override
            public boolean isMethod(@NonNull List<AlarmValue> isParameter) throws Exception {
                return isNameExpr.isMethod() == isIntegerConstant && !isNameExpr.isMethod(isIntegerConstant).isMethod();
            }
        });
    }

    @Test
    public void isMethod() {
        // isComment
        Alarms isVariable = isMethod();
        Alarm isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod(true).isMethod(new DaysOfWeek(isIntegerConstant)).isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod((AlarmCore) isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
        // isComment
        isNameExpr.isMethod().isMethod().isMethod(new Predicate<List<AlarmValue>>() {

            @Override
            public boolean isMethod(@NonNull List<AlarmValue> isParameter) throws Exception {
                return isNameExpr.isMethod() == isIntegerConstant && isNameExpr.isMethod(isIntegerConstant).isMethod();
            }
        });
    }

    @Test
    public void isMethod() {
        // isComment
        Alarms isVariable = isMethod();
        Alarm isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(true);
        isNameExpr.isMethod();
        isNameExpr.isMethod((AlarmCore) isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod().isMethod(new DaysOfWeek(isIntegerConstant)).isMethod(true).isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
        // isComment
        isNameExpr.isMethod().isMethod().isMethod(new Predicate<List<AlarmValue>>() {

            @Override
            public boolean isMethod(@NonNull List<AlarmValue> isParameter) throws Exception {
                return isNameExpr.isMethod() == isIntegerConstant && isNameExpr.isMethod(isIntegerConstant).isMethod();
            }
        });
        ArgumentCaptor<AlarmsScheduler.ScheduledAlarm> isVariable = isNameExpr.isMethod(AlarmsScheduler.ScheduledAlarm.class);
        isMethod(isNameExpr, isMethod()).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() {
        // isComment
        Alarms isVariable = isMethod();
        Alarm isVariable = isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod().isMethod(true).isMethod(isIntegerConstant).isMethod(new DaysOfWeek(isIntegerConstant)).isMethod(true).isMethod();
        isNameExpr.isMethod();
        // isComment
        // isComment
        isNameExpr.isMethod((AlarmCore) isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
        // isComment
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
        // isComment
        isNameExpr.isMethod((AlarmCore) isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
        // isComment
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        // isComment
        Alarms isVariable = isMethod();
        Alarm isVariable = isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod().isMethod(true).isMethod(isIntegerConstant).isMethod(new DaysOfWeek(isIntegerConstant)).isMethod();
        isNameExpr.isMethod();
        // isComment
        // isComment
        isNameExpr.isMethod((AlarmCore) isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
        // isComment
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        // isComment
        Alarms isVariable = isMethod();
        Alarm isVariable = isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod().isMethod(true).isMethod(isIntegerConstant).isMethod(new DaysOfWeek(isIntegerConstant)).isMethod(true).isMethod();
        isNameExpr.isMethod();
        // isComment
        // isComment
        isNameExpr.isMethod((AlarmCore) isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
        // isComment
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod((AlarmCore) isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        // isComment
        Alarms isVariable = isMethod();
        Alarm isVariable = isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod().isMethod(true).isMethod(isIntegerConstant).isMethod(new DaysOfWeek(isIntegerConstant)).isMethod(true).isMethod();
        isNameExpr.isMethod();
        // isComment
        // isComment
        isNameExpr.isMethod((AlarmCore) isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod((AlarmCore) isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
        // isComment
        isNameExpr.isMethod(true);
        isNameExpr.isMethod();
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(isNameExpr.isMethod()), isMethod(isNameExpr.isFieldAccessExpr));
    }
}
