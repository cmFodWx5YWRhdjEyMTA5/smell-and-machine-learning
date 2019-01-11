// isComment
package org.bitcoinj.wallet;

import org.bitcoinj.testing.FooWalletExtension;
import org.bitcoinj.testing.TestWithWallet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class isClassOrIsInterface extends TestWithWallet {

    @Before
    @Override
    public void isMethod() throws Exception {
        super.isMethod();
    }

    @After
    @Override
    public void isMethod() throws Exception {
        super.isMethod();
    }

    @Test(expected = java.lang.IllegalStateException.class)
    public void isMethod() {
        isNameExpr.isMethod(new FooWalletExtension("isStringConstant", true));
        isNameExpr.isMethod(new FooWalletExtension("isStringConstant", true));
    }
}
