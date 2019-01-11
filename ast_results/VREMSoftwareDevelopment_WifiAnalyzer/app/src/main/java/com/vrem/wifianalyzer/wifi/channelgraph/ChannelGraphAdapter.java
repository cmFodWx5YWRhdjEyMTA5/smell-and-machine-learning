// isComment
package com.vrem.wifianalyzer.wifi.channelgraph;

import android.support.annotation.NonNull;
import android.support.v4.util.Pair;
import com.vrem.util.EnumUtils;
import com.vrem.wifianalyzer.wifi.band.WiFiBand;
import com.vrem.wifianalyzer.wifi.band.WiFiChannel;
import com.vrem.wifianalyzer.wifi.graphutils.GraphAdapter;
import com.vrem.wifianalyzer.wifi.graphutils.GraphViewNotifier;
import com.vrem.wifianalyzer.wifi.model.WiFiData;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.IterableUtils;
import java.util.ArrayList;
import java.util.List;

class isClassOrIsInterface extends GraphAdapter {

    private final ChannelGraphNavigation isVariable;

    isConstructor(@NonNull ChannelGraphNavigation isParameter) {
        super(isMethod());
        this.isFieldAccessExpr = isNameExpr;
    }

    private static List<GraphViewNotifier> isMethod() {
        List<GraphViewNotifier> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr.isMethod(WiFiBand.class), new WiFiBandClosure(isNameExpr));
        return isNameExpr;
    }

    @Override
    public void isMethod(@NonNull WiFiData isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    private static class isClassOrIsInterface implements Closure<WiFiBand> {

        private final List<GraphViewNotifier> isVariable;

        private isConstructor(@NonNull List<GraphViewNotifier> isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public void isMethod(WiFiBand isParameter) {
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), new WiFiChannelClosure(isNameExpr, isNameExpr));
        }
    }

    private static class isClassOrIsInterface implements Closure<Pair<WiFiChannel, WiFiChannel>> {

        private final List<GraphViewNotifier> isVariable;

        private final WiFiBand isVariable;

        private isConstructor(@NonNull List<GraphViewNotifier> isParameter, @NonNull WiFiBand isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public void isMethod(Pair<WiFiChannel, WiFiChannel> isParameter) {
            isNameExpr.isMethod(new ChannelGraphView(isNameExpr, isNameExpr));
        }
    }
}
