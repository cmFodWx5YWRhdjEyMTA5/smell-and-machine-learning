// isComment
package org.sufficientlysecure.keychain.model;

import com.google.auto.value.AutoValue;
import org.sufficientlysecure.keychain.KeyMetadataModel;

@AutoValue
public abstract class isClassOrIsInterface implements KeyMetadataModel {

    public static final Factory<KeyMetadata> isVariable = new Factory<>(AutoValue_KeyMetadata::new, isNameExpr.isFieldAccessExpr);

    public boolean isMethod() {
        return isMethod() != null;
    }

    public boolean isMethod() {
        if (isMethod() == null) {
            throw new IllegalStateException("isStringConstant");
        }
        Boolean isVariable = isMethod();
        return isNameExpr != null && isNameExpr;
    }
}
