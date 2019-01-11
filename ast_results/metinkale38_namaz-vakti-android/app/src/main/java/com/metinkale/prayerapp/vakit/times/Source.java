// isComment
package com.metinkale.prayerapp.vakit.times;

import android.support.annotation.DrawableRes;
import android.support.annotation.RawRes;
import com.metinkale.prayer.R;
import com.metinkale.prayerapp.App;
import com.metinkale.prayerapp.utils.Utils;
import com.metinkale.prayerapp.vakit.times.sources.CSVTimes;
import com.metinkale.prayerapp.vakit.times.sources.CalcTimes;
import com.metinkale.prayerapp.vakit.times.sources.DiyanetTimes;
import com.metinkale.prayerapp.vakit.times.sources.FaziletTimes;
import com.metinkale.prayerapp.vakit.times.sources.IGMGTimes;
import com.metinkale.prayerapp.vakit.times.sources.IndonesiaTimes;
import com.metinkale.prayerapp.vakit.times.sources.LondonTimes;
import com.metinkale.prayerapp.vakit.times.sources.MalaysiaTimes;
import com.metinkale.prayerapp.vakit.times.sources.MoroccoTimes;
import com.metinkale.prayerapp.vakit.times.sources.NVCTimes;
import com.metinkale.prayerapp.vakit.times.sources.SemerkandTimes;
import java.util.Locale;

/**
 * isComment
 */
public enum Source {

    Calc(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, CalcTimes.class),
    Diyanet("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, DiyanetTimes.class),
    @Deprecated
    Fazilet("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant, FaziletTimes.class),
    IGMG("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, IGMGTimes.class),
    Semerkand("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, SemerkandTimes.class),
    NVC("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, NVCTimes.class),
    Morocco("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, MoroccoTimes.class),
    Malaysia("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, MalaysiaTimes.class),
    Indonesia("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, IndonesiaTimes.class),
    London("isStringConstant", isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, LondonTimes.class),
    CSV("isStringConstant", isIntegerConstant, isIntegerConstant, CSVTimes.class);

    public final Class<? extends Times> isVariable;

    public final int isVariable;

    public final String isVariable;

    public final int isVariable;

    isConstructor(String isParameter, @DrawableRes int isParameter, @RawRes int isParameter, Class<? extends Times> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    isConstructor(int isParameter, int isParameter, Class<? extends Times> isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod());
        this.isFieldAccessExpr = isNameExpr.isMethod().isMethod(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = isIntegerConstant;
    }
}
