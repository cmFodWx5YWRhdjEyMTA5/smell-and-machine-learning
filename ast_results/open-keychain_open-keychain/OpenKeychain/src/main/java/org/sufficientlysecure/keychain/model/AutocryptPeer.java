// isComment
package org.sufficientlysecure.keychain.model;

import com.google.auto.value.AutoValue;
import com.squareup.sqldelight.RowMapper;
import org.sufficientlysecure.keychain.AutocryptPeersModel;

@AutoValue
public abstract class isClassOrIsInterface implements AutocryptPeersModel {

    public enum GossipOrigin {

        GOSSIP_HEADER, SIGNATURE, DEDUP
    }

    public static final Factory<AutocryptPeer> isVariable = new Factory<AutocryptPeer>(AutoValue_AutocryptPeer::new, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    public static final RowMapper<AutocryptPeer> isVariable = isNameExpr.isMethod();

    public static final RowMapper<AutocryptKeyStatus> isVariable = isNameExpr.isMethod(AutoValue_AutocryptPeer_AutocryptKeyStatus::new);

    @AutoValue
    public abstract static class isClassOrIsInterface implements SelectAutocryptKeyStatusModel<AutocryptPeer> {

        public boolean isMethod() {
            return isMethod().isMethod() != null;
        }

        public boolean isMethod() {
            Boolean isVariable = isMethod();
            return isNameExpr != null && isNameExpr;
        }

        public boolean isMethod() {
            return isMethod() != isIntegerConstant;
        }

        public boolean isMethod() {
            return isMethod() != isIntegerConstant;
        }

        public boolean isMethod() {
            Boolean isVariable = isMethod();
            return isNameExpr != null && isNameExpr;
        }

        public boolean isMethod() {
            return isMethod() != isIntegerConstant;
        }

        public boolean isMethod() {
            return isMethod() != isIntegerConstant;
        }
    }
}
