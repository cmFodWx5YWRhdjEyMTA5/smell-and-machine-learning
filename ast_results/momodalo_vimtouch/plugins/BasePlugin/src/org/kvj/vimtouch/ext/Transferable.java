// isComment
package org.kvj.vimtouch.ext;

public interface isClassOrIsInterface {

    public enum FieldType {

        String('isStringConstant'),
        Number('isStringConstant'),
        Double('isStringConstant'),
        List('isStringConstant'),
        Map('isStringConstant'),
        Transferable('isStringConstant'),
        Boolean('isStringConstant'),
        Null('isStringConstant');

        private char isVariable;

        private isConstructor(char isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        public char isMethod() {
            return isNameExpr;
        }
    }

    public void isMethod(IncomingTransfer isParameter);

    public void isMethod(OutgoingTransfer isParameter);
}
