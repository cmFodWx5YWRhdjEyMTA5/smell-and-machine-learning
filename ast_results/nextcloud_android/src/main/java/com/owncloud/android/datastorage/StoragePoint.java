// isComment
package com.owncloud.android.datastorage;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * isComment
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class isClassOrIsInterface implements Comparable<StoragePoint> {

    public enum StorageType {

        INTERNAL, EXTERNAL
    }

    public enum PrivacyType {

        PRIVATE, PUBLIC
    }

    private String isVariable;

    private String isVariable;

    private StorageType isVariable;

    private PrivacyType isVariable;

    @Override
    public int isMethod(StoragePoint isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }
}
