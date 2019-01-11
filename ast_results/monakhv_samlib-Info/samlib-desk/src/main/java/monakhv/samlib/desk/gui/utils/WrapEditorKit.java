// isComment
package monakhv.samlib.desk.gui.utils;

import javax.swing.text.*;

/*isComment*/
public class isClassOrIsInterface extends StyledEditorKit {

    ViewFactory isVariable = new WrapColumnFactory();

    public ViewFactory isMethod() {
        return isNameExpr;
    }

    class isClassOrIsInterface implements ViewFactory {

        @Override
        public View isMethod(Element isParameter) {
            String isVariable = isNameExpr.isMethod();
            if (isNameExpr != null) {
                if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                    return new WrapLabelView(isNameExpr);
                } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                    return new ParagraphView(isNameExpr);
                } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                    return new BoxView(isNameExpr, isNameExpr.isFieldAccessExpr);
                } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                    return new ComponentView(isNameExpr);
                } else if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                    return new IconView(isNameExpr);
                }
            }
            // isComment
            return new LabelView(isNameExpr);
        }
    }

    class isClassOrIsInterface extends LabelView {

        public isConstructor(Element isParameter) {
            super(isNameExpr);
        }

        @Override
        public float isMethod(int isParameter) {
            switch(isNameExpr) {
                case isNameExpr.isFieldAccessExpr:
                    return isIntegerConstant;
                case isNameExpr.isFieldAccessExpr:
                    return super.isMethod(isNameExpr);
                default:
                    throw new IllegalArgumentException("isStringConstant" + isNameExpr);
            }
        }
    }
}
