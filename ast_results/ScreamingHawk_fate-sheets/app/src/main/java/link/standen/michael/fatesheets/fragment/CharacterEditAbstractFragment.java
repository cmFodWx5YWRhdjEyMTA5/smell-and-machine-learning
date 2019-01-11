// isComment
package link.standen.michael.fatesheets.fragment;

import android.support.v4.app.Fragment;
import link.standen.michael.fatesheets.activity.CharacterEditActivity;
import link.standen.michael.fatesheets.model.Character;
import link.standen.michael.fatesheets.model.CoreCharacter;
import link.standen.michael.fatesheets.model.FAECharacter;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends Fragment {

    protected Character isMethod() {
        return ((CharacterEditActivity) isMethod()).isMethod();
    }

    /**
     * isComment
     */
    protected CoreCharacter isMethod() {
        Character isVariable = isMethod();
        if (isNameExpr instanceof CoreCharacter) {
            return (CoreCharacter) isNameExpr;
        }
        return null;
    }

    /**
     * isComment
     */
    protected FAECharacter isMethod() {
        Character isVariable = isMethod();
        if (isNameExpr instanceof FAECharacter) {
            return (FAECharacter) isNameExpr;
        }
        return null;
    }
}
