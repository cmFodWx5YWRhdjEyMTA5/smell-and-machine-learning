// isComment
package com.vuze.android.widget;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import com.vuze.util.Thunk;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

/**
 * isComment
 */
public class isClassOrIsInterface extends ImageView {

    private static class isClassOrIsInterface extends AsyncTask<URL, Void, Bitmap> {

        private final ImageView isVariable;

        private boolean isVariable = true;

        private InputStream isVariable;

        @Thunk
        isConstructor(ImageView isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        protected Bitmap isMethod(URL... isParameter) {
            try {
                URLConnection isVariable = isNameExpr[isIntegerConstant].isMethod();
                // isComment
                isNameExpr.isMethod(true);
                this.isFieldAccessExpr = isNameExpr.isMethod();
                return isNameExpr.isMethod(isNameExpr);
            } catch (IOException isParameter) {
                isNameExpr.isMethod(UrlImageView.class.isMethod(), "isStringConstant" + isNameExpr[isIntegerConstant], isNameExpr);
                return null;
            } finally {
                if (this.isFieldAccessExpr != null) {
                    try {
                        this.isFieldAccessExpr.isMethod();
                    } catch (IOException isParameter) {
                    // isComment
                    } finally {
                        this.isFieldAccessExpr = null;
                    }
                }
            }
        }

        @Override
        protected void isMethod(Bitmap isParameter) {
            if (!this.isFieldAccessExpr) {
                // isComment
                this.isFieldAccessExpr.isMethod(isNameExpr);
            }
        }

        /*isComment*/
        @Override
        protected void isMethod() {
            this.isFieldAccessExpr = true;
            try {
                if (this.isFieldAccessExpr != null) {
                    try {
                        this.isFieldAccessExpr.isMethod();
                    } catch (IOException isParameter) {
                    // isComment
                    } finally {
                        this.isFieldAccessExpr = null;
                    }
                }
            } finally {
                super.isMethod();
            }
        }
    }

    /*isComment*/
    private AsyncTask<URL, Void, Bitmap> isVariable;

    /*isComment*/
    private final Object isVariable = new Object();

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    @Override
    public void isMethod(Bitmap isParameter) {
        isMethod();
        super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Drawable isParameter) {
        isMethod();
        super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(int isParameter) {
        isMethod();
        super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Uri isParameter) {
        isMethod();
        super.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public void isMethod(URL isParameter) {
        synchronized (isNameExpr) {
            isMethod();
            this.isFieldAccessExpr = new UrlLoadingTask(this).isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    private void isMethod() {
        synchronized (isNameExpr) {
            if (this.isFieldAccessExpr != null) {
                this.isFieldAccessExpr.isMethod(true);
                this.isFieldAccessExpr = null;
            }
        }
    }
}
