// isComment
package github.daneren2005.dsub.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public class isClassOrIsInterface extends ContentProvider {

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public Cursor isMethod(Uri isParameter, String[] isParameter, String isParameter, String[] isParameter, String isParameter) {
        return null;
    }

    @Override
    public String isMethod(Uri isParameter) {
        return "isStringConstant";
    }

    @Override
    public Uri isMethod(Uri isParameter, ContentValues isParameter) {
        return null;
    }

    @Override
    public int isMethod(Uri isParameter, String isParameter, String[] isParameter) {
        return isIntegerConstant;
    }

    @Override
    public int isMethod(Uri isParameter, ContentValues isParameter, String isParameter, String[] isParameter) {
        return isIntegerConstant;
    }
}
