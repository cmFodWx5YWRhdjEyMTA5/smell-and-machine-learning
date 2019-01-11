// isComment
package org.kvj.vimtouch.ext;

import java.util.List;
import java.util.Map;
import org.kvj.vimtouch.ext.Transferable.FieldType;
import org.kvj.vimtouch.ext.impl.write.BooleanFieldWriter;
import org.kvj.vimtouch.ext.impl.write.DoubleFieldWriter;
import org.kvj.vimtouch.ext.impl.write.ListFieldWriter;
import org.kvj.vimtouch.ext.impl.write.MapFieldWriter;
import org.kvj.vimtouch.ext.impl.write.NumberFieldWriter;
import org.kvj.vimtouch.ext.impl.write.StringFieldWriter;
import org.kvj.vimtouch.ext.impl.write.TransferableFieldWriter;

public class isClassOrIsInterface {

    private StringBuilder isVariable = null;

    public void isMethod() {
        isNameExpr = new StringBuilder();
    }

    public StringBuilder isMethod() {
        return isNameExpr;
    }

    public void isMethod(int isParameter) {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod('isStringConstant');
    }

    public void isMethod(String isParameter) {
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod('isStringConstant');
    }

    public <T> void isMethod(String isParameter, T isParameter, FieldWriter<T> isParameter) {
        if (null != isNameExpr) {
            isMethod(isNameExpr);
        }
        if (null == isNameExpr) {
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod());
            isNameExpr.isMethod('isStringConstant');
            return;
        }
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(this, isNameExpr);
    }

    public void isMethod(String isParameter, String isParameter) {
        isMethod(isNameExpr, isNameExpr, new StringFieldWriter());
    }

    public void isMethod(String isParameter, Number isParameter) {
        isMethod(isNameExpr, isNameExpr, new NumberFieldWriter());
    }

    public void isMethod(String isParameter, Double isParameter) {
        isMethod(isNameExpr, isNameExpr, new DoubleFieldWriter());
    }

    public void isMethod(String isParameter, boolean isParameter) {
        isMethod(isNameExpr, isNameExpr, new BooleanFieldWriter());
    }

    public <T> void isMethod(String isParameter, List<T> isParameter, FieldWriter<T> isParameter) {
        isMethod(isNameExpr, isNameExpr, new ListFieldWriter<T>(isNameExpr));
    }

    public <T> void isMethod(String isParameter, Map<String, T> isParameter, FieldWriter<T> isParameter) {
        isMethod(isNameExpr, isNameExpr, new MapFieldWriter<T>(isNameExpr));
    }

    public void isMethod(String isParameter, Transferable isParameter) {
        isMethod(isNameExpr, isNameExpr, new TransferableFieldWriter());
    }

    public void isMethod() {
        isMethod("isStringConstant");
    }
}
