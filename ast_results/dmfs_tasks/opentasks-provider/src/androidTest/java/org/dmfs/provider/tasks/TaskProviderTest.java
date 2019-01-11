// isComment
package org.dmfs.provider.tasks;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.os.Build;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import org.dmfs.android.contentpal.Operation;
import org.dmfs.android.contentpal.OperationsQueue;
import org.dmfs.android.contentpal.RowSnapshot;
import org.dmfs.android.contentpal.Table;
import org.dmfs.android.contentpal.operations.Assert;
import org.dmfs.android.contentpal.operations.BulkDelete;
import org.dmfs.android.contentpal.operations.BulkUpdate;
import org.dmfs.android.contentpal.operations.Delete;
import org.dmfs.android.contentpal.operations.Put;
import org.dmfs.android.contentpal.operations.Referring;
import org.dmfs.android.contentpal.predicates.ReferringTo;
import org.dmfs.android.contentpal.queues.BasicOperationsQueue;
import org.dmfs.android.contentpal.rowdata.CharSequenceRowData;
import org.dmfs.android.contentpal.rowdata.Composite;
import org.dmfs.android.contentpal.rowdata.EmptyRowData;
import org.dmfs.android.contentpal.rowsnapshots.VirtualRowSnapshot;
import org.dmfs.android.contenttestpal.operations.AssertEmptyTable;
import org.dmfs.android.contenttestpal.operations.AssertRelated;
import org.dmfs.iterables.SingletonIterable;
import org.dmfs.iterables.elementary.Seq;
import org.dmfs.opentaskspal.tables.InstanceTable;
import org.dmfs.opentaskspal.tables.LocalTaskListsTable;
import org.dmfs.opentaskspal.tables.TaskListScoped;
import org.dmfs.opentaskspal.tables.TaskListsTable;
import org.dmfs.opentaskspal.tables.TasksTable;
import org.dmfs.opentaskspal.tasklists.NameData;
import org.dmfs.opentaskspal.tasks.OriginalInstanceSyncIdData;
import org.dmfs.opentaskspal.tasks.StatusData;
import org.dmfs.opentaskspal.tasks.SyncIdData;
import org.dmfs.opentaskspal.tasks.TimeData;
import org.dmfs.opentaskspal.tasks.TitleData;
import org.dmfs.opentaskstestpal.InstanceTestData;
import org.dmfs.rfc5545.DateTime;
import org.dmfs.rfc5545.Duration;
import org.dmfs.tasks.contract.TaskContract.Instances;
import org.dmfs.tasks.contract.TaskContract.TaskLists;
import org.dmfs.tasks.contract.TaskContract.Tasks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.TimeZone;
import static org.dmfs.android.contenttestpal.ContentMatcher.resultsIn;
import static org.dmfs.optional.Absent.absent;
import static org.junit.Assert.assertThat;

/**
 * isComment
 */
@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    private ContentResolver isVariable;

    private String isVariable;

    private Context isVariable;

    private ContentProviderClient isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr);
        // isComment
        OperationsQueue isVariable = new BasicOperationsQueue(isNameExpr);
        isNameExpr.isMethod(new Seq<Operation<?>>(new AssertEmptyTable<>(new TasksTable(isNameExpr)), new AssertEmptyTable<>(new TaskListsTable(isNameExpr)), new AssertEmptyTable<>(new InstanceTable(isNameExpr))));
        isNameExpr.isMethod();
    }

    @After
    public void isMethod() throws Exception {
        /*isComment*/
        // isComment
        BasicOperationsQueue isVariable = new BasicOperationsQueue(isNameExpr);
        isNameExpr.isMethod(new SingletonIterable<Operation<?>>(new BulkDelete<>(new LocalTaskListsTable(isNameExpr))));
        isNameExpr.isMethod();
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isNameExpr.isMethod();
        } else {
            isNameExpr.isMethod();
        }
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TaskListScoped(isNameExpr, new TasksTable(isNameExpr)));
        isMethod(new Seq<>(new Put<>(isNameExpr, new NameData("isStringConstant")), new Put<>(isNameExpr, new TitleData("isStringConstant"))), isMethod(isNameExpr, new Assert<>(isNameExpr, new NameData("isStringConstant")), new Assert<>(isNameExpr, new TitleData("isStringConstant")), new AssertRelated<>(new InstanceTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<Instances>(new InstanceTestData(isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, null)))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TaskListScoped(isNameExpr, new TasksTable(isNameExpr)));
        Table<Instances> isVariable = new InstanceTable(isNameExpr);
        isMethod(new Seq<>(new Put<>(isNameExpr, new NameData("isStringConstant")), new Put<>(isNameExpr, new TitleData("isStringConstant")), new BulkUpdate<>(isNameExpr, new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant"), new ReferringTo<>(isNameExpr.isFieldAccessExpr, isNameExpr))), isMethod(isNameExpr, new Assert<>(isNameExpr, new NameData("isStringConstant")), new Assert<>(isNameExpr, new TitleData("isStringConstant")), new AssertRelated<>(new InstanceTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<Instances>(new InstanceTestData(isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, null)))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        Table<TaskLists> isVariable = new LocalTaskListsTable(isNameExpr);
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(isNameExpr);
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(isNameExpr);
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TaskListScoped(isNameExpr, new TasksTable(isNameExpr)));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TaskListScoped(isNameExpr, new TasksTable(isNameExpr)));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TaskListScoped(isNameExpr, new TasksTable(isNameExpr)));
        isMethod(new Seq<>(new Put<>(isNameExpr, new NameData("isStringConstant")), new Put<>(isNameExpr, new NameData("isStringConstant")), new Put<>(isNameExpr, new TitleData("isStringConstant")), new Put<>(isNameExpr, new TitleData("isStringConstant")), new Put<>(isNameExpr, new TitleData("isStringConstant"))), isMethod(isNameExpr, new Assert<>(isNameExpr, new NameData("isStringConstant")), new Assert<>(isNameExpr, new NameData("isStringConstant")), new Assert<>(isNameExpr, new TitleData("isStringConstant")), new Assert<>(isNameExpr, new TitleData("isStringConstant")), new Assert<>(isNameExpr, new TitleData("isStringConstant")), new AssertRelated<>(new InstanceTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<Instances>(new InstanceTestData(isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, null))), new AssertRelated<>(new InstanceTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<Instances>(new InstanceTestData(isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, null))), new AssertRelated<>(new InstanceTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<Instances>(new InstanceTestData(isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, null)))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TaskListScoped(isNameExpr, new TasksTable(isNameExpr)));
        DateTime isVariable = isNameExpr.isMethod();
        DateTime isVariable = isNameExpr.isMethod(new Duration(isIntegerConstant, isIntegerConstant, isIntegerConstant));
        isMethod(new Seq<>(new Put<>(isNameExpr, new EmptyRowData<TaskLists>()), new Put<>(isNameExpr, new TimeData(isNameExpr, isNameExpr))), isMethod(isNameExpr, new Assert<>(isNameExpr, new TimeData(isNameExpr, isNameExpr)), new AssertRelated<>(new InstanceTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<Instances>(new InstanceTestData(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod(isNameExpr.isMethod()), isMethod(), isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant")))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TaskListScoped(isNameExpr, new TasksTable(isNameExpr)));
        DateTime isVariable = isNameExpr.isMethod();
        DateTime isVariable = isNameExpr.isMethod(new Duration(isIntegerConstant, isIntegerConstant, isIntegerConstant));
        isMethod(new Seq<>(new Put<>(isNameExpr, new EmptyRowData<>()), new Put<>(isNameExpr, new TimeData(isNameExpr, isNameExpr)), // isComment
        new Put<>(isNameExpr, new StatusData(isNameExpr.isFieldAccessExpr))), isMethod(isNameExpr, new Assert<>(isNameExpr, new TimeData(isNameExpr, isNameExpr)), new AssertRelated<>(new InstanceTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<Instances>(new InstanceTestData(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod(isNameExpr.isMethod()), isMethod(), -isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant")))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TaskListScoped(isNameExpr, new TasksTable(isNameExpr)));
        DateTime isVariable = isNameExpr.isMethod();
        DateTime isVariable = isNameExpr.isMethod(new Duration(isIntegerConstant, isIntegerConstant, isIntegerConstant));
        Duration isVariable = new Duration(isIntegerConstant, isIntegerConstant, isIntegerConstant);
        DateTime isVariable = isNameExpr.isMethod(isNameExpr);
        DateTime isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(new Seq<>(new Put<>(isNameExpr, new EmptyRowData<TaskLists>()), new Put<>(isNameExpr, new TimeData(isNameExpr, isNameExpr)), new Put<>(isNameExpr, new TimeData(isNameExpr, isNameExpr))), isMethod(isNameExpr, new Assert<>(isNameExpr, new TimeData(isNameExpr, isNameExpr)), new AssertRelated<>(new InstanceTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<Instances>(new InstanceTestData(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod(isNameExpr.isMethod()), isMethod(), isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant")))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TaskListScoped(isNameExpr, new TasksTable(isNameExpr)));
        DateTime isVariable = isNameExpr.isMethod();
        DateTime isVariable = isNameExpr.isMethod(new Duration(isIntegerConstant, isIntegerConstant, isIntegerConstant));
        Duration isVariable = new Duration(-isIntegerConstant, isIntegerConstant, isIntegerConstant);
        DateTime isVariable = isNameExpr.isMethod(isNameExpr);
        DateTime isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(new Seq<>(new Put<>(isNameExpr, new EmptyRowData<TaskLists>()), new Put<>(isNameExpr, new TimeData(isNameExpr, isNameExpr)), new Put<>(isNameExpr, new TimeData(isNameExpr, isNameExpr))), isMethod(isNameExpr, new Assert<>(isNameExpr, new TimeData(isNameExpr, isNameExpr)), new AssertRelated<>(new InstanceTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<Instances>(new InstanceTestData(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod(isNameExpr.isMethod()), isMethod(), isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant")))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TaskListScoped(isNameExpr, new TasksTable(isNameExpr)));
        DateTime isVariable = isNameExpr.isMethod();
        DateTime isVariable = isNameExpr.isMethod(new Duration(isIntegerConstant, isIntegerConstant, isIntegerConstant));
        isMethod(new Seq<>(new Put<>(isNameExpr, new EmptyRowData<TaskLists>()), new Put<>(isNameExpr, new TitleData("isStringConstant")), new Put<>(isNameExpr, new TimeData(isNameExpr, isNameExpr))), isMethod(isNameExpr, new Assert<>(isNameExpr, new TimeData(isNameExpr, isNameExpr)), new AssertRelated<>(new InstanceTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<Instances>(new InstanceTestData(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod(isNameExpr.isMethod()), isMethod(), isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant")))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TaskListScoped(isNameExpr, new TasksTable(isNameExpr)));
        DateTime isVariable = isNameExpr.isMethod();
        Duration isVariable = isNameExpr.isMethod("isStringConstant");
        long isVariable = isNameExpr.isMethod();
        isMethod(new Seq<>(new Put<>(isNameExpr, new EmptyRowData<TaskLists>()), new Put<>(isNameExpr, new TimeData(isNameExpr, isNameExpr))), isMethod(isNameExpr, new Assert<>(isNameExpr, new TimeData(isNameExpr, isNameExpr)), new AssertRelated<>(new InstanceTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<Instances>(new InstanceTestData(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr), isMethod(), isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant")))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TaskListScoped(isNameExpr, new TasksTable(isNameExpr)));
        DateTime isVariable = isNameExpr.isMethod();
        Duration isVariable = isNameExpr.isMethod("isStringConstant");
        long isVariable = isNameExpr.isMethod();
        DateTime isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(new Seq<>(new Put<>(isNameExpr, new EmptyRowData<TaskLists>()), new Put<>(isNameExpr, new TimeData(isNameExpr, isNameExpr)), // isComment
        new Put<>(isNameExpr, new TimeData(isNameExpr, isNameExpr))), isMethod(isNameExpr, new Assert<>(isNameExpr, new TimeData(isNameExpr, isNameExpr)), // isComment
        new AssertRelated<>(new InstanceTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<Instances>(new InstanceTestData(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr), isMethod(), isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant")))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() throws Exception {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TaskListScoped(isNameExpr, new TasksTable(isNameExpr)));
        OperationsQueue isVariable = new BasicOperationsQueue(isNameExpr);
        DateTime isVariable = isNameExpr.isMethod();
        DateTime isVariable = isNameExpr.isMethod(new Duration(isIntegerConstant, isIntegerConstant, isIntegerConstant));
        isNameExpr.isMethod(new Seq<>(new Put<>(isNameExpr, new NameData("isStringConstant")), new Put<>(isNameExpr, new TimeData(isNameExpr, isNameExpr))));
        isNameExpr.isMethod();
        DateTime isVariable = isNameExpr.isMethod(new Duration(isIntegerConstant, isIntegerConstant, isIntegerConstant));
        isMethod(new SingletonIterable<>(new Put<>(isNameExpr, new TimeData(isNameExpr, isNameExpr))), isMethod(isNameExpr, new Assert<>(isNameExpr, new TimeData(isNameExpr, isNameExpr)), new AssertRelated<>(new InstanceTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<Instances>(new InstanceTestData(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod(isNameExpr.isMethod()), isMethod(), isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant")))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() throws Exception {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        Table<Tasks> isVariable = new TaskListScoped(isNameExpr, new TasksTable(isNameExpr));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(isNameExpr);
        OperationsQueue isVariable = new BasicOperationsQueue(isNameExpr);
        isNameExpr.isMethod(new Seq<>(new Put<>(isNameExpr, new NameData("isStringConstant")), new Put<>(isNameExpr, new TitleData("isStringConstant"))));
        isNameExpr.isMethod();
        isMethod(new SingletonIterable<>(new Delete<>(isNameExpr)), isMethod(isNameExpr, new AssertEmptyTable<>(new TasksTable(isNameExpr)), new AssertEmptyTable<>(new InstanceTable(isNameExpr))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() throws Exception {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        Table<Tasks> isVariable = new TaskListScoped(isNameExpr, new TasksTable(isNameExpr));
        Table<Instances> isVariable = new InstanceTable(isNameExpr);
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(isNameExpr);
        OperationsQueue isVariable = new BasicOperationsQueue(isNameExpr);
        isNameExpr.isMethod(new Seq<>(new Put<>(isNameExpr, new NameData("isStringConstant")), new Put<>(isNameExpr, new TitleData("isStringConstant"))));
        isNameExpr.isMethod();
        // isComment
        isMethod(new SingletonIterable<>(new BulkDelete<>(isNameExpr, new ReferringTo<>(isNameExpr.isFieldAccessExpr, isNameExpr))), isMethod(isNameExpr, new AssertEmptyTable<>(new TasksTable(isNameExpr)), new AssertEmptyTable<>(new InstanceTable(isNameExpr))));
    }

    /**
     * isComment
     */
    @Test(expected = IllegalArgumentException.class)
    public void isMethod() throws Exception {
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TasksTable(isNameExpr));
        OperationsQueue isVariable = new BasicOperationsQueue(isNameExpr);
        isNameExpr.isMethod(new SingletonIterable<Operation<?>>(new Put<>(isNameExpr, new TitleData("isStringConstant"))));
        isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        ContentValues isVariable = new ContentValues();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() throws Exception {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        Table<Tasks> isVariable = new TaskListScoped(isNameExpr, new TasksTable(isNameExpr));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(isNameExpr);
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(isNameExpr);
        OperationsQueue isVariable = new BasicOperationsQueue(isNameExpr);
        isNameExpr.isMethod(new Seq<Operation<?>>(new Put<>(isNameExpr, new NameData("isStringConstant")), new Put<>(isNameExpr, new Composite<>(new TitleData("isStringConstant"), new SyncIdData("isStringConstant")))));
        isNameExpr.isMethod();
        isMethod(new SingletonIterable<>(new Put<>(isNameExpr, new Composite<>(new TitleData("isStringConstant"), new OriginalInstanceSyncIdData("isStringConstant")))), isMethod(isNameExpr, new AssertRelated<>(new TasksTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new TitleData("isStringConstant"))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() throws Exception {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        Table<Tasks> isVariable = new TaskListScoped(isNameExpr, new TasksTable(isNameExpr));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(isNameExpr);
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(isNameExpr);
        OperationsQueue isVariable = new BasicOperationsQueue(isNameExpr);
        isNameExpr.isMethod(new Seq<Operation<?>>(new Put<>(isNameExpr, new NameData("isStringConstant")), new Put<>(isNameExpr, new Composite<>(new TitleData("isStringConstant"), new SyncIdData("isStringConstant")))));
        isNameExpr.isMethod();
        isMethod(new SingletonIterable<>(new Referring<>(isNameExpr, isNameExpr.isFieldAccessExpr, new Put<>(isNameExpr, new TitleData("isStringConstant")))), isMethod(isNameExpr, new AssertRelated<>(new TasksTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<>(new TitleData("isStringConstant"), new OriginalInstanceSyncIdData("isStringConstant")))));
    }
}
