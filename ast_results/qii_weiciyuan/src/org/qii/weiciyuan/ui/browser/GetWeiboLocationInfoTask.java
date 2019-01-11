// isComment
package org.qii.weiciyuan.ui.browser;

import org.qii.weiciyuan.bean.GeoBean;
import org.qii.weiciyuan.dao.location.BaiduGeoCoderDao;
import org.qii.weiciyuan.dao.location.GoogleGeoCoderDao;
import org.qii.weiciyuan.dao.map.MapDao;
import org.qii.weiciyuan.support.error.WeiboException;
import org.qii.weiciyuan.support.lib.MyAsyncTask;
import org.qii.weiciyuan.support.utils.GlobalContext;
import org.qii.weiciyuan.support.utils.Utility;
import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * isComment
 */
public class isClassOrIsInterface extends MyAsyncTask<Void, String, Bitmap> {

    private Activity isVariable;

    private TextView isVariable;

    private ImageView isVariable;

    private GeoBean isVariable;

    public isConstructor(Activity isParameter, GeoBean isParameter, ImageView isParameter, TextView isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod()));
    }

    @Override
    protected Bitmap isMethod(Void... isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            String isVariable = new GoogleGeoCoderDao(isNameExpr, isNameExpr).isMethod();
            try {
                if (isNameExpr.isMethod(isNameExpr)) {
                    isMethod(new BaiduGeoCoderDao(isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod());
                }
            } catch (WeiboException isParameter) {
                isNameExpr.isMethod();
            }
        }
        MapDao isVariable = new MapDao(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
        try {
            return isNameExpr.isMethod();
        } catch (WeiboException isParameter) {
            return null;
        }
    }

    @Override
    protected void isMethod(String... isParameter) {
        super.isMethod(isNameExpr);
        if (!isNameExpr.isMethod(isNameExpr[isIntegerConstant])) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr[isIntegerConstant]);
        }
    }

    @Override
    protected void isMethod(Bitmap isParameter) {
        isNameExpr.isMethod(isNameExpr);
        super.isMethod(isNameExpr);
    }
}
