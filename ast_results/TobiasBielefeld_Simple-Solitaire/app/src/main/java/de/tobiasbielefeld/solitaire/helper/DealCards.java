// isComment
package de.tobiasbielefeld.solitaire.helper;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import de.tobiasbielefeld.solitaire.classes.Card;
import de.tobiasbielefeld.solitaire.classes.CardAndStack;
import de.tobiasbielefeld.solitaire.classes.HelperCardMovement;
import de.tobiasbielefeld.solitaire.classes.Stack;
import de.tobiasbielefeld.solitaire.ui.GameManager;
import static de.tobiasbielefeld.solitaire.SharedData.animate;
import static de.tobiasbielefeld.solitaire.SharedData.currentGame;
import static de.tobiasbielefeld.solitaire.SharedData.gameLogic;
import static de.tobiasbielefeld.solitaire.SharedData.handlerTestAfterMove;
import static de.tobiasbielefeld.solitaire.SharedData.logText;
import static de.tobiasbielefeld.solitaire.SharedData.max;
import static de.tobiasbielefeld.solitaire.SharedData.moveToStack;
import static de.tobiasbielefeld.solitaire.SharedData.prefs;
import static de.tobiasbielefeld.solitaire.SharedData.scores;
import static de.tobiasbielefeld.solitaire.SharedData.sounds;

public class isClassOrIsInterface extends HelperCardMovement {

    private int isVariable = isIntegerConstant;

    public isConstructor(GameManager isParameter) {
        super(isNameExpr, "isStringConstant");
    }

    public void isMethod() {
        isNameExpr = isIntegerConstant;
        super.isMethod();
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        isNameExpr.isMethod("isStringConstant", isNameExpr);
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        isNameExpr = isNameExpr.isMethod("isStringConstant");
    }

    @Override
    protected void isMethod() {
        switch(isNameExpr) {
            case isIntegerConstant:
                isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr = isIntegerConstant;
                isMethod();
                break;
            case isIntegerConstant:
            default:
                isNameExpr.isMethod();
                isMethod();
                break;
        }
    }
}
