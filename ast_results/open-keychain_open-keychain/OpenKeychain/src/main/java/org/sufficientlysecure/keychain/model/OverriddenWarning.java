// isComment
package org.sufficientlysecure.keychain.model;

import com.google.auto.value.AutoValue;
import org.sufficientlysecure.keychain.KeySignaturesModel;
import org.sufficientlysecure.keychain.OverriddenWarningsModel;

@AutoValue
public abstract class isClassOrIsInterface implements OverriddenWarningsModel {

    public static final Factory<OverriddenWarning> isVariable = new Factory<>(AutoValue_OverriddenWarning::new);

    public static final Mapper<OverriddenWarning> isVariable = new Mapper<>(isNameExpr);
}
