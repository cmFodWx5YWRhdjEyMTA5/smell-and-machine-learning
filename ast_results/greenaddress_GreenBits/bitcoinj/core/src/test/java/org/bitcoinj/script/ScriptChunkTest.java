// isComment
package org.bitcoinj.script;

import static org.bitcoinj.script.ScriptOpCodes.OP_PUSHDATA1;
import static org.bitcoinj.script.ScriptOpCodes.OP_PUSHDATA2;
import static org.bitcoinj.script.ScriptOpCodes.OP_PUSHDATA4;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod("isStringConstant", new ScriptBuilder().isMethod(new byte[isIntegerConstant]).isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
        for (byte isVariable = -isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) isMethod("isStringConstant" + isNameExpr, new ScriptBuilder().isMethod(new byte[] { isNameExpr }).isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; isNameExpr++) isMethod("isStringConstant" + isNameExpr + "isStringConstant", new ScriptBuilder().isMethod(new byte[isNameExpr]).isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
        // isComment
        for (byte isVariable = isIntegerConstant; isNameExpr <= isIntegerConstant; isNameExpr++) isMethod("isStringConstant" + isNameExpr, new ScriptChunk(isIntegerConstant, new byte[] { isNameExpr }).isMethod());
        isMethod("isStringConstant", new ScriptChunk(isNameExpr, new byte[isIntegerConstant]).isMethod());
        isMethod("isStringConstant", new ScriptChunk(isNameExpr, new byte[isIntegerConstant]).isMethod());
        isMethod("isStringConstant", new ScriptChunk(isNameExpr, new byte[isIntegerConstant]).isMethod());
    }
}
