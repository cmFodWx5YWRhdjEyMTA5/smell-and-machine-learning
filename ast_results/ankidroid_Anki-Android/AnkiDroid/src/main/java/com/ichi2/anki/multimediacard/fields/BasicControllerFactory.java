// isComment
package com.ichi2.anki.multimediacard.fields;

public class isClassOrIsInterface implements IControllerFactory {

    private isConstructor() {
    }

    public static IControllerFactory isMethod() {
        return new BasicControllerFactory();
    }

    @Override
    public IFieldController isMethod(IField isParameter) {
        EFieldType isVariable = isNameExpr.isMethod();
        switch(isNameExpr) {
            case isNameExpr:
                return new BasicTextFieldController();
            case isNameExpr:
                return new BasicImageFieldController();
            case isNameExpr:
                return new BasicAudioFieldController();
            default:
                break;
        }
        return null;
    }
}
