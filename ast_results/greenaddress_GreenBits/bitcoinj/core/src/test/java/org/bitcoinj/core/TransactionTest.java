// isComment
package org.bitcoinj.core;

import static org.bitcoinj.script.ScriptOpCodes.*;
import org.bitcoinj.core.TransactionConfidence.*;
import org.bitcoinj.crypto.TransactionSignature;
import org.bitcoinj.params.*;
import org.bitcoinj.script.*;
import org.bitcoinj.testing.*;
import org.easymock.*;
import org.junit.*;
import java.math.BigInteger;
import java.util.*;
import static org.bitcoinj.core.Utils.HEX;
import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private static final NetworkParameters isVariable = isNameExpr.isMethod();

    private static final Address isVariable = new ECKey().isMethod(isNameExpr);

    private Transaction isVariable;

    @Before
    public void isMethod() throws Exception {
        Context isVariable = new Context(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }

    @Test(expected = VerificationException.EmptyInputsOrOutputs.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod();
        isNameExpr.isMethod();
    }

    @Test(expected = VerificationException.EmptyInputsOrOutputs.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod();
        isNameExpr.isMethod();
    }

    @Test(expected = VerificationException.LargerThanMaxBlockSize.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isIntegerConstant).isMethod(new byte[isNameExpr.isFieldAccessExpr]);
        isNameExpr.isMethod();
    }

    @Test(expected = VerificationException.DuplicatedOutPoint.class)
    public void isMethod() throws Exception {
        TransactionInput isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(new byte[isIntegerConstant]);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod();
    }

    @Test(expected = VerificationException.NegativeValueOutput.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
    }

    @Test(expected = VerificationException.ExcessiveValue.class)
    public void isMethod() throws Exception {
        Coin isVariable = isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isIntegerConstant).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod();
    }

    @Test(expected = VerificationException.UnexpectedCoinbaseInput.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isStringConstant, new ScriptBuilder().isMethod(new byte[isIntegerConstant]).isMethod());
        isNameExpr.isMethod();
    }

    @Test(expected = VerificationException.CoinbaseScriptSizeOutOfRange.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isStringConstant, new ScriptBuilder().isMethod());
        isNameExpr.isMethod();
    }

    @Test(expected = VerificationException.CoinbaseScriptSizeOutOfRange.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod();
        TransactionInput isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isStringConstant, new ScriptBuilder().isMethod(new byte[isIntegerConstant]).isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod().isFieldAccessExpr);
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        int isVariable = isIntegerConstant;
        Date isVariable = isNameExpr.isMethod().isMethod();
        BlockChain isVariable = isMethod(BlockChain.class);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        Transaction isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
    }

    @Test
    public void isMethod() {
        Transaction isVariable = new Transaction(isNameExpr);
        int isVariable = isNameExpr.isFieldAccessExpr;
        // isComment
        isNameExpr.isMethod(new TransactionOutput(isNameExpr, null, isNameExpr.isFieldAccessExpr, isNameExpr));
        isNameExpr += isMethod(isNameExpr.isMethod());
        // isComment
        isNameExpr += isMethod(isNameExpr.isMethod());
        // isComment
        isMethod(isNameExpr.isMethod(), isNameExpr);
    }

    private int isMethod(List<? extends Message> isParameter) {
        int isVariable = isIntegerConstant;
        for (Message isVariable : isNameExpr) {
            isNameExpr += isNameExpr.isMethod() + isIntegerConstant;
        }
        return isNameExpr;
    }

    @Test
    public void isMethod() {
        Transaction isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(), true);
    }

    @Test
    public void isMethod() {
        BigInteger isVariable = isNameExpr.isMethod(isIntegerConstant);
        ECKey isVariable = new ECKey(), isVariable = new ECKey(), isVariable = new ECKey();
        Script isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        Transaction isVariable = new Transaction(isNameExpr);
        isNameExpr.isMethod(new TransactionInput(isNameExpr, isNameExpr, new byte[] {}));
        isNameExpr.isMethod(isIntegerConstant).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        Script isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        Script isVariable = isNameExpr.isMethod(isNameExpr);
        Script isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        Script isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        try {
            isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr.isFieldAccessExpr);
        } catch (ScriptException isParameter) {
            isNameExpr.isMethod();
            isMethod("isStringConstant");
        }
        try {
            isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr.isFieldAccessExpr);
            isMethod("isStringConstant");
        } catch (ScriptException isParameter) {
        }
        try {
            isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr.isFieldAccessExpr);
            isMethod("isStringConstant");
        } catch (ScriptException isParameter) {
        }
        try {
            isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr.isFieldAccessExpr);
            isMethod("isStringConstant");
        } catch (ScriptException isParameter) {
        }
    }

    @Test
    public void isMethod() {
        BigInteger isVariable = isNameExpr.isMethod(isIntegerConstant);
        ECKey isVariable = new ECKey(), isVariable = new ECKey(), isVariable = new ECKey();
        Script isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        Transaction isVariable = new Transaction(isNameExpr);
        isNameExpr.isMethod(new TransactionInput(isNameExpr, isNameExpr, new byte[] {}));
        isNameExpr.isMethod(isIntegerConstant).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        Script isVariable = isNameExpr.isMethod(isNameExpr);
        Script isVariable = isNameExpr.isMethod(isNameExpr);
        try {
            isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr.isFieldAccessExpr);
        } catch (ScriptException isParameter) {
            isNameExpr.isMethod();
            isMethod("isStringConstant");
        }
        try {
            isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr.isFieldAccessExpr);
            isMethod("isStringConstant");
        } catch (ScriptException isParameter) {
        }
    }

    @Test
    public void isMethod() {
        byte[] isVariable = null;
        byte[] isVariable = null;
        Transaction isVariable = null;
        // isComment
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr = new Transaction(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
        isMethod(isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod();
        isMethod(isNameExpr, isNameExpr);
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod().isMethod());
        // isComment
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr = new Transaction(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
        isMethod(isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod();
        isMethod(isNameExpr, isNameExpr);
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod().isMethod());
        // isComment
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr = new Transaction(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr);
        Sha256Hash isVariable = isNameExpr.isMethod(isIntegerConstant, new Script(isNameExpr.isMethod("isStringConstant")), isNameExpr.isMethod(isIntegerConstant), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod());
        // isComment
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        isNameExpr = new Transaction(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr);
        isNameExpr = isNameExpr.isMethod(isIntegerConstant, new Script(isNameExpr.isMethod("isStringConstant")), isNameExpr.isMethod(isStringConstant), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        Transaction isVariable = isNameExpr.isMethod(isNameExpr);
        TransactionInput isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant);
        int isVariable = isIntegerConstant;
        isNameExpr.isMethod(isNameExpr);
        Calendar isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
        BlockChain isVariable = isMethod(BlockChain.class);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod("isStringConstant" + isNameExpr), true);
        isMethod(isNameExpr.isMethod("isStringConstant"), true);
    }

    @Test
    public void isMethod() {
        Transaction isVariable = isNameExpr.isMethod(isNameExpr);
        TransactionInput isVariable = new TransactionInput(isNameExpr, isNameExpr, new byte[isIntegerConstant]) {

            @Override
            public Script isMethod() throws ScriptException {
                throw new ScriptException("isStringConstant");
            }
        };
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod("isStringConstant"), true);
    }

    @Test
    public void isMethod() {
        Transaction isVariable = new Transaction(isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod("isStringConstant"), true);
    }

    @Test
    public void isMethod() {
        Transaction isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(isIntegerConstant);
        Transaction isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(isIntegerConstant);
        Transaction isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(isIntegerConstant);
        SortedSet<Transaction> isVariable = new TreeSet<>(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        Iterator<Transaction> isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr), true);
        isMethod(isNameExpr.isMethod(isNameExpr), true);
        isMethod(isNameExpr.isMethod(isNameExpr), true);
        isMethod(isNameExpr.isMethod().isMethod(isNameExpr), true);
        isMethod(isNameExpr.isMethod().isMethod(isNameExpr), true);
        isMethod(isNameExpr.isMethod().isMethod(isNameExpr), true);
        isMethod(isNameExpr.isMethod(), true);
    }

    @Test(expected = ScriptException.class)
    public void isMethod() {
        ECKey isVariable = new ECKey();
        Address isVariable = isNameExpr.isMethod(isNameExpr);
        Transaction isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
        Transaction isVariable = new Transaction(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant));
        Script isVariable = isNameExpr.isMethod(new byte[isIntegerConstant]);
        isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant).isMethod(), isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Transaction isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
        int isVariable = isNameExpr.isMethod();
        int isVariable = isNameExpr.isMethod();
        isMethod(isIntegerConstant, isNameExpr - isNameExpr);
        isNameExpr.isMethod(isIntegerConstant).isMethod(new Script(new byte[isIntegerConstant]));
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant).isMethod(new Script(new byte[isIntegerConstant]));
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant).isMethod(new Script(new byte[isIntegerConstant]));
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws VerificationException {
        // isComment
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final int isVariable = isIntegerConstant;
        final Transaction isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() throws VerificationException {
        // isComment
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant");
        final int isVariable = isIntegerConstant;
        final Transaction isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        // isComment
        Transaction isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr - isIntegerConstant);
        isMethod(isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        Block isVariable = isNameExpr.isMethod().isMethod();
        Block isVariable = isNameExpr.isMethod(new ECKey().isMethod(isNameExpr.isMethod()), isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod(isIntegerConstant).isMethod());
        final Transaction isVariable = isNameExpr.isMethod().isMethod(isIntegerConstant);
        final String isVariable = isNameExpr.isMethod();
        final String isVariable = isNameExpr.isMethod(isIntegerConstant, new byte[isIntegerConstant], isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod()).isMethod();
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            // isComment
            isMethod(isNameExpr, isNameExpr.isMethod());
            new Thread() {

                public void isMethod() {
                    isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant, new byte[isIntegerConstant], isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod()).isMethod());
                }
            };
        }
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Transaction isVariable = new Transaction(isNameExpr.isMethod(), isNameExpr);
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isIntegerConstant).isMethod(isNameExpr);
        final Script isVariable = new Script(isNameExpr.isMethod("isStringConstant"));
        final Script isVariable = isNameExpr.isMethod();
        final ECKey isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        final Coin isVariable = isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Sha256Hash isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final TransactionWitness isVariable = new TransactionWitness(isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant).isMethod().isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Transaction isVariable = new Transaction(isNameExpr.isMethod(), isNameExpr);
        final Script isVariable = new Script(isNameExpr.isMethod("isStringConstant"));
        final Script isVariable = new Script(isNameExpr.isMethod("isStringConstant"));
        final Script isVariable = isNameExpr.isMethod();
        final ECKey isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        final Coin isVariable = isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Sha256Hash isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final TransactionWitness isVariable = new TransactionWitness(isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        final ScriptBuilder isVariable = new ScriptBuilder();
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant).isMethod(isNameExpr.isMethod().isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant).isMethod().isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        int isVariable = isIntegerConstant;
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Transaction isVariable = new Transaction(isNameExpr.isMethod(), isNameExpr);
        final byte[] isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod(isIntegerConstant).isMethod(isNameExpr);
        final Script isVariable = new Script(isNameExpr.isMethod("isStringConstant"));
        final Script isVariable = new Script(isNameExpr.isMethod("isStringConstant"));
        final Coin isVariable = isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
        final ECKey isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), true);
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Sha256Hash isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        // isComment
        for (ScriptChunk isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isMethod() + isIntegerConstant;
                break;
            }
        }
        isMethod(isIntegerConstant, isNameExpr);
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final byte[] isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr.isMethod().isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr);
        final Script isVariable = new Script(isNameExpr);
        final ECKey isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), true);
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Sha256Hash isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final TransactionWitness isVariable = new TransactionWitness(isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant).isMethod().isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Transaction isVariable = new Transaction(isNameExpr.isMethod(), isNameExpr);
        final Script isVariable = new Script(isNameExpr.isMethod("isStringConstant"));
        final Script isVariable = new Script(isNameExpr.isMethod("isStringConstant"));
        final Script isVariable = new Script(isNameExpr.isMethod("isStringConstant"));
        final Script isVariable = new Script(isNameExpr.isMethod("isStringConstant"));
        final Coin isVariable = isNameExpr.isMethod(isStringConstant);
        final ECKey isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), true);
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Sha256Hash isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        byte[] isVariable = null;
        for (ScriptChunk isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod() + isIntegerConstant, isNameExpr.isMethod().isFieldAccessExpr);
                break;
            }
        }
        final TransactionWitness isVariable = new TransactionWitness(isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Sha256Hash isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final TransactionWitness isVariable = new TransactionWitness(isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr, isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Transaction isVariable = new Transaction(isNameExpr.isMethod(), isNameExpr);
        final Script isVariable = new Script(isNameExpr.isMethod("isStringConstant"));
        final Script isVariable = new Script(isNameExpr.isMethod("isStringConstant"));
        final Script isVariable = new Script(isNameExpr.isMethod("isStringConstant"));
        final Coin isVariable = isNameExpr.isMethod(isStringConstant);
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Sha256Hash isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final ECKey isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        final TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Sha256Hash isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final ECKey isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        final TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Sha256Hash isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final ECKey isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        final TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Sha256Hash isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final ECKey isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        final TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Sha256Hash isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final ECKey isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        final TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Sha256Hash isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final ECKey isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        final TransactionSignature isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isIntegerConstant).isMethod(new ScriptBuilder().isMethod(isNameExpr.isMethod()).isMethod().isMethod());
        final TransactionWitness isVariable = new TransactionWitness(isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant, new byte[isIntegerConstant]);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant).isMethod().isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Transaction isVariable = new Transaction(isNameExpr.isMethod(), isNameExpr);
        final Script isVariable = new Script(isNameExpr.isMethod("isStringConstant"));
        final Script isVariable = new Script(isNameExpr.isMethod("isStringConstant"));
        final Coin isVariable = isNameExpr.isMethod(isStringConstant);
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final Sha256Hash isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isMethod(isNameExpr, isNameExpr.isMethod());
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        final TransactionWitness isVariable = new TransactionWitness(isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        final byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant).isMethod().isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, // isComment
        isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }
}
