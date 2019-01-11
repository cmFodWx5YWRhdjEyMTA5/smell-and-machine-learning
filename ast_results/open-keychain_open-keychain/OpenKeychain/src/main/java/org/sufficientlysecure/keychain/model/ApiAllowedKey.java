// isComment
package org.sufficientlysecure.keychain.model;

import com.google.auto.value.AutoValue;
import org.sufficientlysecure.keychain.ApiAllowedKeysModel;

@AutoValue
public abstract class isClassOrIsInterface implements ApiAllowedKeysModel {

    public static final Factory<ApiAllowedKey> isVariable = new Factory<ApiAllowedKey>(AutoValue_ApiAllowedKey::new);
}
