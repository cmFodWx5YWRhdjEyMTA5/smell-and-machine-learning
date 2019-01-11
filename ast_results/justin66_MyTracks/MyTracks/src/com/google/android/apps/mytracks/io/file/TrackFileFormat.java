// isComment
package com.google.android.apps.mytracks.io.file;

import com.google.android.apps.mytracks.io.file.exporter.CsvTrackWriter;
import com.google.android.apps.mytracks.io.file.exporter.GpxTrackWriter;
import com.google.android.apps.mytracks.io.file.exporter.KmlTrackWriter;
import com.google.android.apps.mytracks.io.file.exporter.TcxTrackWriter;
import com.google.android.apps.mytracks.io.file.exporter.TrackWriter;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/**
 * isComment
 */
public enum TrackFileFormat implements Parcelable {

    KML {

        @Override
        public TrackWriter isMethod(Context isParameter, boolean isParameter, boolean isParameter) {
            return new KmlTrackWriter(isNameExpr, isNameExpr, isNameExpr);
        }
    }
    , GPX {

        @Override
        public TrackWriter isMethod(Context isParameter, boolean isParameter, boolean isParameter) {
            return new GpxTrackWriter(isNameExpr);
        }
    }
    , CSV {

        @Override
        public TrackWriter isMethod(Context isParameter, boolean isParameter, boolean isParameter) {
            return new CsvTrackWriter(isNameExpr);
        }
    }
    , TCX {

        @Override
        public TrackWriter isMethod(Context isParameter, boolean isParameter, boolean isParameter) {
            return new TcxTrackWriter(isNameExpr);
        }
    }
    ;

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(final Parcel isParameter, final int isParameter) {
        isNameExpr.isMethod(isMethod());
    }

    public static final Creator<TrackFileFormat> isVariable = new Creator<TrackFileFormat>() {

        @Override
        public TrackFileFormat isMethod(final Parcel isParameter) {
            return isNameExpr.isMethod()[isNameExpr.isMethod()];
        }

        @Override
        public TrackFileFormat[] isMethod(final int isParameter) {
            return new TrackFileFormat[isNameExpr];
        }
    };

    /**
     * isComment
     */
    public abstract TrackWriter isMethod(Context isParameter, boolean isParameter, boolean isParameter);

    /**
     * isComment
     */
    public String isMethod() {
        return "isStringConstant" + isMethod() + "isStringConstant";
    }

    /**
     * isComment
     */
    public String isMethod() {
        return this.isMethod().isMethod(isNameExpr.isFieldAccessExpr);
    }
}
