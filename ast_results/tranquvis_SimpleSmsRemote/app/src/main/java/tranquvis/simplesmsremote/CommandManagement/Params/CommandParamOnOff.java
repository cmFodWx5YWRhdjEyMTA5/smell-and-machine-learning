// isComment
package tranquvis.simplesmsremote.CommandManagement.Params;

public class isClassOrIsInterface extends CommandParam<Boolean> {

    public isConstructor(String isParameter) {
        super(isNameExpr);
    }

    @Override
    public Boolean isMethod(String isParameter) {
        return !isNameExpr.isMethod("isStringConstant");
    }
}
