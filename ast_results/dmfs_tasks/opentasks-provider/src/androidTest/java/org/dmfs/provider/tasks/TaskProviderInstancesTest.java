// isComment
package org.dmfs.provider.tasks;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.Build;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import org.dmfs.android.contentpal.Operation;
import org.dmfs.android.contentpal.OperationsQueue;
import org.dmfs.android.contentpal.RowSnapshot;
import org.dmfs.android.contentpal.operations.Assert;
import org.dmfs.android.contentpal.operations.BulkAssert;
import org.dmfs.android.contentpal.operations.BulkDelete;
import org.dmfs.android.contentpal.operations.Counted;
import org.dmfs.android.contentpal.operations.Delete;
import org.dmfs.android.contentpal.operations.Put;
import org.dmfs.android.contentpal.queues.BasicOperationsQueue;
import org.dmfs.android.contentpal.rowdata.CharSequenceRowData;
import org.dmfs.android.contentpal.rowdata.Composite;
import org.dmfs.android.contentpal.rowdata.Referring;
import org.dmfs.android.contentpal.rowsnapshots.VirtualRowSnapshot;
import org.dmfs.android.contentpal.transactions.BaseTransaction;
import org.dmfs.android.contenttestpal.operations.AssertEmptyTable;
import org.dmfs.android.contenttestpal.operations.AssertRelated;
import org.dmfs.iterables.SingletonIterable;
import org.dmfs.iterables.elementary.Seq;
import org.dmfs.opentaskspal.tables.InstanceTable;
import org.dmfs.opentaskspal.tables.LocalTaskListsTable;
import org.dmfs.opentaskspal.tables.TaskListsTable;
import org.dmfs.opentaskspal.tables.TasksTable;
import org.dmfs.opentaskspal.tasklists.NameData;
import org.dmfs.opentaskspal.tasks.TimeData;
import org.dmfs.opentaskspal.tasks.TitleData;
import org.dmfs.opentaskstestpal.InstanceTestData;
import org.dmfs.rfc5545.DateTime;
import org.dmfs.tasks.contract.TaskContract.Instances;
import org.dmfs.tasks.contract.TaskContract.TaskLists;
import org.dmfs.tasks.contract.TaskContract.Tasks;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.dmfs.android.contenttestpal.ContentMatcher.resultsIn;
import static org.junit.Assert.assertThat;

/**
 * isComment
 */
@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    private String isVariable;

    private Context isVariable;

    private ContentProviderClient isVariable;

    @Before
    public void isMethod() throws Exception {
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
        RowSnapshot<Instances> isVariable = new VirtualRowSnapshot<>(new InstanceTable(isNameExpr));
        isMethod(new Seq<>(// isComment
        new Put<>(isNameExpr, new NameData("isStringConstant")), // isComment
        new Put<>(isNameExpr, new Referring<>(isNameExpr.isFieldAccessExpr, isNameExpr, new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant")))), isMethod(isNameExpr, new Assert<>(isNameExpr, new NameData("isStringConstant")), // isComment
        new Counted<>(isIntegerConstant, new BulkAssert<>(new TasksTable(isNameExpr))), new AssertRelated<>(new TasksTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<>(new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant"))), // isComment
        new Counted<>(isIntegerConstant, new BulkAssert<>(new InstanceTable(isNameExpr))), // isComment
        new Assert<>(isNameExpr, new Composite<>(new InstanceTestData(isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant")))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        RowSnapshot<Instances> isVariable = new VirtualRowSnapshot<>(new InstanceTable(isNameExpr));
        isMethod(new Seq<>(// isComment
        new Put<>(isNameExpr, new NameData("isStringConstant")), // isComment
        new Put<>(isNameExpr, new Referring<>(isNameExpr.isFieldAccessExpr, isNameExpr, new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant"))), // isComment
        new Put<>(isNameExpr, new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant"))), isMethod(isNameExpr, new Assert<>(isNameExpr, new NameData("isStringConstant")), // isComment
        new Counted<>(isIntegerConstant, new BulkAssert<>(new TasksTable(isNameExpr))), new AssertRelated<>(new TasksTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<>(new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant"))), // isComment
        new Counted<>(isIntegerConstant, new BulkAssert<>(new InstanceTable(isNameExpr))), // isComment
        new Assert<>(isNameExpr, new Composite<>(new InstanceTestData(isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant")))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        RowSnapshot<Instances> isVariable = new VirtualRowSnapshot<>(new InstanceTable(isNameExpr));
        isMethod(new Seq<>(// isComment
        new Put<>(isNameExpr, new NameData("isStringConstant")), // isComment
        new Put<>(isNameExpr, new Referring<>(isNameExpr.isFieldAccessExpr, isNameExpr, new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant"))), // isComment
        new Put<>(isNameExpr, (isParameter, isParameter) -> isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr))), isMethod(isNameExpr, new Assert<>(isNameExpr, new NameData("isStringConstant")), // isComment
        new Counted<>(isIntegerConstant, new BulkAssert<>(new TasksTable(isNameExpr))), new AssertRelated<>(new TasksTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<>(new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant"))), // isComment
        new Counted<>(isIntegerConstant, new BulkAssert<>(new InstanceTable(isNameExpr))), // isComment
        new Assert<>(isNameExpr, new Composite<>(new InstanceTestData(-isIntegerConstant), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant")))));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        RowSnapshot<Instances> isVariable = new VirtualRowSnapshot<>(new InstanceTable(isNameExpr));
        isMethod(new Seq<>(// isComment
        new Put<>(isNameExpr, new NameData("isStringConstant")), // isComment
        new Put<>(isNameExpr, new Referring<>(isNameExpr.isFieldAccessExpr, isNameExpr, new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant"))), // isComment
        new Delete<>(isNameExpr)), isMethod(isNameExpr, new Assert<>(isNameExpr, new NameData("isStringConstant")), // isComment
        new AssertEmptyTable<>(new TasksTable(isNameExpr)), new AssertEmptyTable<>(new InstanceTable(isNameExpr))));
    }

    /**
     * isComment
     */
    @Test(expected = IllegalArgumentException.class)
    public void isMethod() throws RemoteException, OperationApplicationException {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TasksTable(isNameExpr));
        RowSnapshot<Instances> isVariable = new VirtualRowSnapshot<>(new InstanceTable(isNameExpr));
        DateTime isVariable = isNameExpr.isMethod("isStringConstant");
        String isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        new BaseTransaction().isMethod(new Seq<>(// isComment
        new Put<>(isNameExpr, new NameData("isStringConstant")), // isComment
        new Put<>(isNameExpr, new Composite<>(new Referring<>(isNameExpr.isFieldAccessExpr, isNameExpr), new TimeData(isNameExpr), new TitleData("isStringConstant"))), new Put<>(isNameExpr, new Composite<>(new Referring<>(isNameExpr.isFieldAccessExpr, isNameExpr), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant"), // isComment
        new Referring<>(isNameExpr.isFieldAccessExpr, isNameExpr), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, isNameExpr), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant"), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant"))))).isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        RowSnapshot<TaskLists> isVariable = new VirtualRowSnapshot<>(new LocalTaskListsTable(isNameExpr));
        RowSnapshot<Tasks> isVariable = new VirtualRowSnapshot<>(new TasksTable(isNameExpr));
        RowSnapshot<Instances> isVariable = new VirtualRowSnapshot<>(new InstanceTable(isNameExpr));
        DateTime isVariable = isNameExpr.isMethod("isStringConstant");
        // isComment
        DateTime isVariable = isNameExpr.isMethod("isStringConstant");
        String isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        isMethod(new Seq<>(// isComment
        new Put<>(isNameExpr, new NameData("isStringConstant")), // isComment
        new Put<>(isNameExpr, new Composite<Tasks>(new Referring<>(isNameExpr.isFieldAccessExpr, isNameExpr), new TimeData(isNameExpr), new TitleData("isStringConstant"))), new Put<>(isNameExpr, new Composite<Instances>(new Referring<>(isNameExpr.isFieldAccessExpr, isNameExpr), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant"), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant"), // isComment
        new Referring<>(isNameExpr.isFieldAccessExpr, isNameExpr), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, isNameExpr), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant"), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant")))), isMethod(isNameExpr, new Assert<>(isNameExpr, new NameData("isStringConstant")), // isComment
        new Counted<>(isIntegerConstant, new BulkAssert<>(new TasksTable(isNameExpr))), // isComment
        new Assert<>(isNameExpr, new Composite<Tasks>(new Referring<>(isNameExpr.isFieldAccessExpr, isNameExpr), new TimeData(isNameExpr), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, "isStringConstant"), new TitleData("isStringConstant"))), // isComment
        new AssertRelated<>(new TasksTable(isNameExpr), isNameExpr.isFieldAccessExpr, isNameExpr, new Composite<Tasks>(new Referring<>(isNameExpr.isFieldAccessExpr, isNameExpr), new CharSequenceRowData<>(isNameExpr.isFieldAccessExpr, isNameExpr), new TimeData(new DateTime(isIntegerConstant)), new TitleData("isStringConstant")))));
    }
}
