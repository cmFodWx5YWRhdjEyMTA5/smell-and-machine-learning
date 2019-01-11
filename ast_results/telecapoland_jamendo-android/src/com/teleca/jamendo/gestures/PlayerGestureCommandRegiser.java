// isComment
package com.teleca.jamendo.gestures;

import android.content.Context;
import com.teleca.jamendo.media.PlayerEngine;

public class isClassOrIsInterface extends GestureCommandRegister {

    public isConstructor(PlayerEngine isParameter) {
        super();
        isMethod("isStringConstant", new PlayerGestureNextCommand(isNameExpr));
        isMethod("isStringConstant", new PlayerGesturePrevCommand(isNameExpr));
        isMethod("isStringConstant", new PlayerGesturePlayCommand(isNameExpr));
        isMethod("isStringConstant", new PlayerGestureStopCommand(isNameExpr));
    }
}
