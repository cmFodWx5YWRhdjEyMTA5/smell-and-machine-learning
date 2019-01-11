// isComment
package com.gracecode.android.presentation.listener;

import com.android.volley.Response;
import com.android.volley.VolleyError;

public abstract class isClassOrIsInterface implements Response.Listener<String>, Response.ErrorListener {

    @Override
    public abstract void isMethod(VolleyError isParameter);

    @Override
    public abstract void isMethod(String isParameter);

    public abstract void isMethod(int isParameter);
}
