// isComment
package org.totschnig.myexpenses.export.pdf;

import android.database.Cursor;
import android.net.Uri;
import android.support.v4.provider.DocumentFile;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.fragment.TransactionList;
import org.totschnig.myexpenses.model.Account;
import org.totschnig.myexpenses.model.Category;
import org.totschnig.myexpenses.model.Grouping;
import org.totschnig.myexpenses.model.Model;
import org.totschnig.myexpenses.model.Money;
import org.totschnig.myexpenses.model.Transaction;
import org.totschnig.myexpenses.model.Transfer;
import org.totschnig.myexpenses.provider.DatabaseConstants;
import org.totschnig.myexpenses.provider.DbUtils;
import org.totschnig.myexpenses.provider.TransactionProvider;
import org.totschnig.myexpenses.provider.filter.WhereFilter;
import org.totschnig.myexpenses.util.AppDirHelper;
import org.totschnig.myexpenses.util.CurrencyFormatter;
import org.totschnig.myexpenses.util.io.FileUtils;
import org.totschnig.myexpenses.util.LazyFontSelector;
import org.totschnig.myexpenses.util.PdfHelper;
import org.totschnig.myexpenses.util.Result;
import org.totschnig.myexpenses.util.Utils;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.inject.Inject;
import timber.log.Timber;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ACCOUNTID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ACCOUNT_LABEL;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_AMOUNT;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_CATID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_COMMENT;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_CURRENCY;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_DATE;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_DAY;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_IS_SAME_CURRENCY;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_LABEL_MAIN;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_LABEL_SUB;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_MONTH;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PARENTID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PAYEE_NAME;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_REFERENCE_NUMBER;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ROWID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_SECOND_GROUP;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_SUM_EXPENSES;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_SUM_INCOME;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_SUM_TRANSFERS;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_TRANSFER_PEER;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_WEEK;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_YEAR;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_YEAR_OF_WEEK_START;
import static org.totschnig.myexpenses.provider.DatabaseConstants.SPLIT_CATID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.TABLE_ACCOUNTS;

public class isClassOrIsInterface {

    private Account isVariable;

    private DocumentFile isVariable;

    private WhereFilter isVariable;

    @Inject
    CurrencyFormatter isVariable;

    public isConstructor(Account isParameter, DocumentFile isParameter, WhereFilter isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public Result<Uri> isMethod() throws IOException, DocumentException {
        isNameExpr.isMethod().isMethod().isMethod(this);
        long isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        PdfHelper isVariable = new PdfHelper();
        isNameExpr.isMethod("isStringConstant", (isNameExpr.isMethod() - isNameExpr));
        String isVariable;
        String[] isVariable;
        if (isNameExpr.isMethod() < isIntegerConstant) {
            isNameExpr = isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
            isNameExpr = new String[] { isNameExpr.isMethod().isMethod() };
        } else {
            isNameExpr = isNameExpr + "isStringConstant";
            isNameExpr = new String[] { isNameExpr.isMethod(isNameExpr.isMethod()) };
        }
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            isNameExpr += "isStringConstant" + isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(true));
        }
        Cursor isVariable;
        String isVariable = isNameExpr.isMethod().isMethod("isStringConstant", "isStringConstant");
        DocumentFile isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant", true);
        Document isVariable = new Document();
        isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr.isMethod(true), isNameExpr.isMethod(), isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant", isNameExpr, isNameExpr + "isStringConstant");
        // isComment
        if (isNameExpr.isMethod() == isIntegerConstant) {
            isNameExpr.isMethod();
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        // isComment
        if (isNameExpr == null) {
            isNameExpr.isMethod();
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()));
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod().isMethod(isNameExpr.isMethod()));
        isNameExpr.isMethod("isStringConstant", (isNameExpr.isMethod() - isNameExpr));
        isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant", (isNameExpr.isMethod() - isNameExpr));
        isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant", (isNameExpr.isMethod() - isNameExpr));
        isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod("isStringConstant", (isNameExpr.isMethod() - isNameExpr));
        isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod("isStringConstant", (isNameExpr.isMethod() - isNameExpr));
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(), isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()));
    }

    private void isMethod(Document isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant");
    }

    private void isMethod(Document isParameter, PdfHelper isParameter) throws DocumentException, IOException {
        String isVariable, isVariable;
        String[] isVariable;
        if (isNameExpr.isMethod() < isIntegerConstant) {
            isNameExpr = "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant";
            isNameExpr = isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
            isNameExpr = new String[] { isNameExpr.isMethod().isMethod() };
        } else {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = isNameExpr + "isStringConstant";
            isNameExpr = new String[] { isNameExpr.isMethod(isNameExpr.isMethod()) };
        }
        Cursor isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, new String[] { isNameExpr }, isNameExpr, isNameExpr, null);
        isNameExpr.isMethod();
        long isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod();
        PdfPTable isVariable = new PdfPTable(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new Date()), isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isNameExpr.isMethod(new Money(isNameExpr.isMethod(), isNameExpr)), isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr);
        Paragraph isVariable = new Paragraph();
        isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
    }

    private void isMethod(Document isParameter, Cursor isParameter, PdfHelper isParameter, WhereFilter isParameter) throws DocumentException, IOException {
        String isVariable;
        String[] isVariable;
        if (!isNameExpr.isMethod()) {
            // isComment
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(true);
        } else {
            isNameExpr = null;
            isNameExpr = null;
        }
        Uri.Builder isVariable = isNameExpr.isFieldAccessExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod());
        if (isNameExpr.isMethod() < isIntegerConstant) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod().isMethod());
        } else {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod()));
        }
        Cursor isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), null, isNameExpr, isNameExpr, isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant");
        MyApplication isVariable = isNameExpr.isMethod();
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod(isNameExpr);
        DateFormat isVariable;
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
                isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(isNameExpr);
                break;
            case isNameExpr:
                // isComment
                isNameExpr = new SimpleDateFormat("isStringConstant");
                break;
            case isNameExpr:
                // isComment
                isNameExpr = new SimpleDateFormat("isStringConstant");
                break;
            default:
                isNameExpr = isNameExpr.isMethod();
        }
        PdfPTable isVariable = null;
        int isVariable = isIntegerConstant, isVariable;
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        long isVariable = isNameExpr.isFieldAccessExpr.isMethod();
        while (isNameExpr.isMethod() < isNameExpr.isMethod()) {
            int isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr) ? isNameExpr : isNameExpr);
            int isVariable = isNameExpr.isMethod(isNameExpr);
            int isVariable = isNameExpr.isMethod(isNameExpr);
            int isVariable = isNameExpr.isMethod(isNameExpr);
            int isVariable = -isIntegerConstant;
            switch(isNameExpr.isMethod()) {
                case isNameExpr:
                    isNameExpr = isNameExpr * isIntegerConstant + isNameExpr;
                    break;
                case isNameExpr:
                    isNameExpr = isNameExpr * isIntegerConstant + isNameExpr;
                    break;
                case isNameExpr:
                    isNameExpr = isNameExpr * isIntegerConstant + isNameExpr;
                    break;
                case isNameExpr:
                    isNameExpr = isNameExpr * isIntegerConstant;
                    break;
                default:
                    isNameExpr = isIntegerConstant;
            }
            if (isNameExpr != isNameExpr) {
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isNameExpr);
                }
                switch(isNameExpr.isMethod()) {
                    case isNameExpr:
                        isNameExpr = isNameExpr.isMethod(isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr = isNameExpr.isMethod(isNameExpr);
                        break;
                    case isNameExpr:
                        isNameExpr = isNameExpr.isMethod(isNameExpr);
                        break;
                }
                isNameExpr = isNameExpr.isMethod(isIntegerConstant);
                isNameExpr.isMethod(isDoubleConstant);
                PdfPCell isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr);
                long isVariable = isNameExpr.isMethod(isNameExpr);
                long isVariable = isNameExpr.isMethod(isNameExpr);
                long isVariable = isNameExpr.isMethod(isNameExpr);
                Long isVariable = isNameExpr + isNameExpr + isNameExpr;
                long isVariable = isNameExpr + isNameExpr;
                String isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr) > -isIntegerConstant ? "isStringConstant" : "isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod()));
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod() ? isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod()), isNameExpr, isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod())) : isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
                isNameExpr = isNameExpr.isMethod(isIntegerConstant);
                isNameExpr.isMethod(isDoubleConstant);
                isNameExpr = isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod()), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr);
                isNameExpr = isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod(-isNameExpr, isNameExpr.isMethod()), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr);
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr), isNameExpr.isMethod()), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isDoubleConstant);
                isNameExpr.isMethod(isNameExpr);
                LineSeparator isVariable = new LineSeparator();
                isNameExpr.isMethod(isNameExpr);
                isNameExpr = isNameExpr.isMethod(isIntegerConstant);
                isNameExpr.isMethod(isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr ? new int[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant } : new int[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant });
                isNameExpr.isMethod(isDoubleConstant);
                isNameExpr.isMethod(isDoubleConstant);
                isNameExpr.isMethod(isDoubleConstant);
                isNameExpr = isNameExpr;
                isNameExpr.isMethod();
                isNameExpr = isNameExpr;
            }
            long isVariable = isNameExpr.isMethod(isNameExpr);
            PdfPCell isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr);
            String isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isMethod(isNameExpr, isNameExpr) != null) {
                isNameExpr = isNameExpr.isMethod(isNameExpr) + isNameExpr;
            } else {
                Long isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
                if (isNameExpr.isMethod(isNameExpr)) {
                    Cursor isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, null, isNameExpr + "isStringConstant" + isNameExpr.isMethod(isNameExpr), null, null);
                    isNameExpr.isMethod();
                    isNameExpr = "isStringConstant";
                    while (isNameExpr.isMethod() < isNameExpr.isMethod()) {
                        String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
                        if (isNameExpr.isMethod() > isIntegerConstant) {
                            if (isNameExpr.isMethod(isNameExpr, isNameExpr) != null) {
                                isNameExpr = "isStringConstant" + isNameExpr + "isStringConstant";
                            } else {
                                String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
                                if (isNameExpr.isMethod() > isIntegerConstant)
                                    isNameExpr += isNameExpr.isFieldAccessExpr + isNameExpr;
                            }
                        } else {
                            isNameExpr = isNameExpr.isFieldAccessExpr;
                        }
                        isNameExpr += "isStringConstant" + isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)), isNameExpr.isMethod());
                        String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
                        if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
                            isNameExpr += "isStringConstant" + isNameExpr + "isStringConstant";
                        }
                        isNameExpr += isNameExpr;
                        if (isNameExpr.isMethod() != isNameExpr.isMethod() - isIntegerConstant) {
                            isNameExpr += "isStringConstant";
                        }
                        isNameExpr.isMethod();
                    }
                    isNameExpr.isMethod();
                } else if (isNameExpr == null) {
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                } else {
                    String isVariable = isNameExpr.isMethod(isNameExpr);
                    if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
                        isNameExpr = isNameExpr + isNameExpr.isFieldAccessExpr + isNameExpr;
                    }
                }
            }
            if (isNameExpr.isMethod() < isIntegerConstant) {
                // isComment
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)) + "isStringConstant" + isNameExpr;
            }
            String isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant)
                isNameExpr = "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr;
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            String isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant) {
                isNameExpr.isMethod(isIntegerConstant);
            }
            isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            }
            LazyFontSelector.FontType isVariable;
            if (isNameExpr.isMethod() < isIntegerConstant && isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)) == isIntegerConstant) {
                isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            } else {
                isNameExpr = isNameExpr < isIntegerConstant ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            }
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod()), isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr);
            String isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isIntegerConstant);
                isNameExpr.isMethod(isNameExpr.isMethod());
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
            isNameExpr.isMethod();
        }
        // isComment
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
    }

    private void isMethod(Paragraph isParameter, int isParameter) {
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
            isNameExpr.isMethod(new Paragraph("isStringConstant"));
        }
    }
}
