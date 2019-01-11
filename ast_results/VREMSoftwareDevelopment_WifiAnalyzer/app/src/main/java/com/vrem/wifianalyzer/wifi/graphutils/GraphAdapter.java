// isComment
package com.vrem.wifianalyzer.wifi.graphutils;

import android.support.annotation.NonNull;
import com.jjoe64.graphview.GraphView;
import com.vrem.wifianalyzer.wifi.model.WiFiData;
import com.vrem.wifianalyzer.wifi.scanner.UpdateNotifier;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.Transformer;
import java.util.ArrayList;
import java.util.List;

public class isClassOrIsInterface implements UpdateNotifier {

    private final List<GraphViewNotifier> isVariable;

    public isConstructor(@NonNull List<GraphViewNotifier> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @NonNull
    public List<GraphView> isMethod() {
        return new ArrayList<>(isNameExpr.isMethod(isNameExpr, new ToGraphView()));
    }

    @Override
    public void isMethod(@NonNull WiFiData isParameter) {
        isNameExpr.isMethod(isNameExpr, new UpdateClosure(isNameExpr));
    }

    @NonNull
    public List<GraphViewNotifier> isMethod() {
        return isNameExpr;
    }

    private class isClassOrIsInterface implements Closure<GraphViewNotifier> {

        private final WiFiData isVariable;

        private isConstructor(@NonNull WiFiData isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public void isMethod(GraphViewNotifier isParameter) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    private class isClassOrIsInterface implements Transformer<GraphViewNotifier, GraphView> {

        @Override
        public GraphView isMethod(GraphViewNotifier isParameter) {
            return isNameExpr.isMethod();
        }
    }
}
