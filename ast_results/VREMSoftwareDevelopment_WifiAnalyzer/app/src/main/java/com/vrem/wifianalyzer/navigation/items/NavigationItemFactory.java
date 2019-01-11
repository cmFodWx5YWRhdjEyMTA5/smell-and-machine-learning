// isComment
package com.vrem.wifianalyzer.navigation.items;

import android.view.View;
import com.vrem.wifianalyzer.about.AboutFragment;
import com.vrem.wifianalyzer.settings.SettingsFragment;
import com.vrem.wifianalyzer.vendor.VendorFragment;
import com.vrem.wifianalyzer.wifi.accesspoint.AccessPointsFragment;
import com.vrem.wifianalyzer.wifi.channelavailable.ChannelAvailableFragment;
import com.vrem.wifianalyzer.wifi.channelgraph.ChannelGraphFragment;
import com.vrem.wifianalyzer.wifi.channelrating.ChannelRatingFragment;
import com.vrem.wifianalyzer.wifi.timegraph.TimeGraphFragment;

public class isClassOrIsInterface {

    public static final NavigationItem isVariable = new FragmentItem(new AccessPointsFragment());

    public static final NavigationItem isVariable = new FragmentItem(new ChannelRatingFragment());

    public static final NavigationItem isVariable = new FragmentItem(new ChannelGraphFragment());

    public static final NavigationItem isVariable = new FragmentItem(new TimeGraphFragment());

    public static final NavigationItem isVariable = new ExportItem();

    public static final NavigationItem isVariable = new FragmentItem(new ChannelAvailableFragment(), true);

    public static final NavigationItem isVariable = new FragmentItem(new VendorFragment(), true, isNameExpr.isFieldAccessExpr);

    public static final NavigationItem isVariable = new FragmentItem(new SettingsFragment(), true, isNameExpr.isFieldAccessExpr);

    public static final NavigationItem isVariable = new FragmentItem(new AboutFragment(), true, isNameExpr.isFieldAccessExpr);

    private isConstructor() {
        throw new IllegalStateException("isStringConstant");
    }
}
