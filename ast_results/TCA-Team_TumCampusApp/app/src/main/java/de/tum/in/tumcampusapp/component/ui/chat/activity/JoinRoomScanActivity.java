// isComment
package de.tum.in.tumcampusapp.component.ui.chat.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import java.util.Collections;
import java.util.List;
import de.tum.in.tumcampusapp.utils.Utils;
import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class isClassOrIsInterface extends Activity implements ZXingScannerView.ResultHandler {

    private ZXingScannerView isVariable;

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        // isComment
        isNameExpr = new ZXingScannerView(this);
        List<BarcodeFormat> isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        super.isMethod();
        // isComment
        isNameExpr.isMethod(this);
        // isComment
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        // isComment
        isNameExpr.isMethod();
        super.isMethod();
    }

    @Override
    public void isMethod(Result isParameter) {
        // isComment
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        Intent isVariable = new Intent();
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr);
        isMethod();
    }
}
