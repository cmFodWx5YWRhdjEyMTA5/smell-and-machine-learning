// isComment
package com.vrem.wifianalyzer.wifi.timegraph;

import android.support.annotation.NonNull;
import com.vrem.util.EnumUtils;
import com.vrem.wifianalyzer.wifi.band.WiFiBand;
import com.vrem.wifianalyzer.wifi.graphutils.GraphAdapter;
import com.vrem.wifianalyzer.wifi.graphutils.GraphViewNotifier;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;
import java.util.ArrayList;
import java.util.List;

class isClassOrIsInterface extends GraphAdapter {

    isConstructor() {
        super(isMethod());
    }

    @NonNull
    private static List<GraphViewNotifier> isMethod() {
        return new ArrayList<>(isNameExpr.isMethod(isNameExpr.isMethod(WiFiBand.class), new ToGraphViewNotifier()));
    }

    private static class isClassOrIsInterface implements Transformer<WiFiBand, GraphViewNotifier> {

        @Override
        public GraphViewNotifier isMethod(WiFiBand isParameter) {
            return new TimeGraphView(isNameExpr);
        }
    }
}
