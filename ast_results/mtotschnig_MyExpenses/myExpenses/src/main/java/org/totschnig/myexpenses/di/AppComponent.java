// isComment
package org.totschnig.myexpenses.di;

import android.support.annotation.VisibleForTesting;
import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.activity.ExpenseEdit;
import org.totschnig.myexpenses.activity.MyExpenses;
import org.totschnig.myexpenses.activity.ProtectedFragmentActivity;
import org.totschnig.myexpenses.dialog.AmountFilterDialog;
import org.totschnig.myexpenses.dialog.ContribDialogFragment;
import org.totschnig.myexpenses.dialog.DonateDialogFragment;
import org.totschnig.myexpenses.dialog.EditCurrencyDialog;
import org.totschnig.myexpenses.dialog.TransactionDetailFragment;
import org.totschnig.myexpenses.dialog.TransactionListDialogFragment;
import org.totschnig.myexpenses.export.pdf.PdfPrinter;
import org.totschnig.myexpenses.fragment.CategoryList;
import org.totschnig.myexpenses.fragment.CurrencyList;
import org.totschnig.myexpenses.fragment.HistoryChart;
import org.totschnig.myexpenses.fragment.OnboardingDataFragment;
import org.totschnig.myexpenses.fragment.SettingsFragment;
import org.totschnig.myexpenses.fragment.SplitPartList;
import org.totschnig.myexpenses.fragment.StaleImagesList;
import org.totschnig.myexpenses.fragment.SyncBackendList;
import org.totschnig.myexpenses.fragment.TemplatesList;
import org.totschnig.myexpenses.fragment.TransactionList;
import org.totschnig.myexpenses.model.CurrencyContext;
import org.totschnig.myexpenses.preference.PrefHandler;
import org.totschnig.myexpenses.provider.TransactionProvider;
import org.totschnig.myexpenses.service.AutoBackupService;
import org.totschnig.myexpenses.sync.webdav.WebDavClient;
import org.totschnig.myexpenses.task.LicenceApiTask;
import org.totschnig.myexpenses.util.ads.AdHandler;
import org.totschnig.myexpenses.util.crashreporting.CrashHandler;
import org.totschnig.myexpenses.util.licence.LicenceHandler;
import org.totschnig.myexpenses.util.tracking.Tracker;
import org.totschnig.myexpenses.viewmodel.EditCurrencyViewModel;
import org.totschnig.myexpenses.viewmodel.RoadmapViewModel;
import javax.inject.Named;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = { AppModule.class, UiModule.class, UtilsModule.class, NetworkModule.class })
public interface isClassOrIsInterface {

    void isMethod(MyApplication isParameter);

    void isMethod(ExpenseEdit isParameter);

    void isMethod(MyExpenses isParameter);

    void isMethod(ProtectedFragmentActivity isParameter);

    void isMethod(TransactionDetailFragment isParameter);

    void isMethod(StaleImagesList isParameter);

    void isMethod(PdfPrinter isParameter);

    void isMethod(TemplatesList isParameter);

    void isMethod(TransactionList isParameter);

    void isMethod(SplitPartList isParameter);

    void isMethod(TransactionListDialogFragment isParameter);

    void isMethod(CategoryList isParameter);

    void isMethod(AdHandler isParameter);

    void isMethod(LicenceApiTask isParameter);

    void isMethod(SettingsFragment isParameter);

    void isMethod(ContribDialogFragment isParameter);

    void isMethod(WebDavClient isParameter);

    void isMethod(RoadmapViewModel isParameter);

    void isMethod(HistoryChart isParameter);

    CrashHandler isMethod();

    Tracker isMethod();

    PrefHandler isMethod();

    @VisibleForTesting
    LicenceHandler isMethod();

    @Named("isStringConstant")
    String isMethod();

    CurrencyContext isMethod();

    void isMethod(DonateDialogFragment isParameter);

    void isMethod(AutoBackupService isParameter);

    void isMethod(SyncBackendList isParameter);

    void isMethod(AmountFilterDialog isParameter);

    void isMethod(CurrencyList isParameter);

    void isMethod(EditCurrencyDialog isParameter);

    void isMethod(TransactionProvider isParameter);

    void isMethod(OnboardingDataFragment isParameter);

    void isMethod(EditCurrencyViewModel isParameter);
}
