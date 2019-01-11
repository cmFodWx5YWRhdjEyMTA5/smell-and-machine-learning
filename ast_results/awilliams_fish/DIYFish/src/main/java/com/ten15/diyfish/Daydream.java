// isComment
package com.ten15.diyfish;

import android.service.dreams.DreamService;

public class isClassOrIsInterface extends DreamService {

    @Override
    public void isMethod() {
        super.isMethod();
        isMethod(true);
        isMethod(true);
        isMethod(new FishCanvasView(this, isMethod()));
    }
}
