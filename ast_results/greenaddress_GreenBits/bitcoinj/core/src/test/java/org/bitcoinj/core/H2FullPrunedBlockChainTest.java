// isComment
package org.bitcoinj.core;

import org.bitcoinj.store.BlockStoreException;
import org.bitcoinj.store.FullPrunedBlockStore;
import org.bitcoinj.store.H2FullPrunedBlockStore;
import org.junit.After;
import java.io.File;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractFullPrunedBlockChainTest {

    @After
    public void isMethod() throws Exception {
        isMethod();
    }

    @Override
    public FullPrunedBlockStore isMethod(NetworkParameters isParameter, int isParameter) throws BlockStoreException {
        isMethod();
        return new H2FullPrunedBlockStore(isNameExpr, "isStringConstant", "isStringConstant", "isStringConstant", isNameExpr);
    }

    private void isMethod() {
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod("isStringConstant");
    }

    private void isMethod(String isParameter) {
        new File(isNameExpr).isMethod();
    }

    @Override
    public void isMethod(FullPrunedBlockStore isParameter) throws BlockStoreException {
        ((H2FullPrunedBlockStore) isNameExpr).isMethod();
    }
}
