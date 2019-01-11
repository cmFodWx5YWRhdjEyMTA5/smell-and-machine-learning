// isComment
package com.google.android.apps.mytracks.io.gdata.maps;

import com.google.wireless.gdata.client.GDataParserFactory;
import com.google.wireless.gdata.data.Entry;
import com.google.wireless.gdata.parser.GDataParser;
import com.google.wireless.gdata.parser.ParseException;
import com.google.wireless.gdata.parser.xml.XmlGDataParser;
import com.google.wireless.gdata.parser.xml.XmlParserFactory;
import com.google.wireless.gdata.serializer.GDataSerializer;
import com.google.wireless.gdata.serializer.xml.XmlEntryGDataSerializer;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParserException;

/**
 * isComment
 */
public class isClassOrIsInterface implements GDataParserFactory {

    private XmlParserFactory isVariable;

    public isConstructor(XmlParserFactory isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public GDataParser isMethod(InputStream isParameter) throws ParseException {
        isNameExpr = isMethod(isNameExpr);
        try {
            return new XmlGDataParser(isNameExpr, isNameExpr.isMethod());
        } catch (XmlPullParserException isParameter) {
            isNameExpr.isMethod();
            return null;
        }
    }

    @SuppressWarnings({ "isStringConstant", "isStringConstant" })
    @Override
    public GDataParser isMethod(Class isParameter, InputStream isParameter) throws ParseException {
        isNameExpr = isMethod(isNameExpr);
        try {
            return isMethod(isNameExpr, isNameExpr);
        } catch (XmlPullParserException isParameter) {
            isNameExpr.isMethod();
            return null;
        }
    }

    private InputStream isMethod(InputStream isParameter) throws ParseException {
        if (isNameExpr.isFieldAccessExpr) {
            StringBuilder isVariable = new StringBuilder();
            byte[] isVariable = new byte[isIntegerConstant];
            try {
                for (int isVariable = isNameExpr.isMethod(isNameExpr); isNameExpr >= isIntegerConstant; isNameExpr = isNameExpr.isMethod(isNameExpr)) {
                    String isVariable = new String(isNameExpr, isIntegerConstant, isNameExpr);
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr.isMethod("isStringConstant", isNameExpr);
                }
            } catch (IOException isParameter) {
                throw new ParseException("isStringConstant", isNameExpr);
            }
            String isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr);
            isNameExpr = new ByteArrayInputStream(isNameExpr.isMethod());
        }
        return isNameExpr;
    }

    private GDataParser isMethod(Class<? extends Entry> isParameter, InputStream isParameter) throws ParseException, XmlPullParserException {
        if (isNameExpr == MapFeatureEntry.class) {
            return new XmlMapsGDataParser(isNameExpr, isNameExpr.isMethod());
        } else {
            return new XmlGDataParser(isNameExpr, isNameExpr.isMethod());
        }
    }

    @Override
    public GDataSerializer isMethod(Entry isParameter) {
        if (isNameExpr instanceof MapFeatureEntry) {
            return new XmlMapsGDataSerializer(isNameExpr, (MapFeatureEntry) isNameExpr);
        } else {
            return new XmlEntryGDataSerializer(isNameExpr, isNameExpr);
        }
    }
}
