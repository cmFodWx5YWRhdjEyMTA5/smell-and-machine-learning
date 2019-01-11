// isComment
package com.asksven.android.common.dto;

import java.io.Serializable;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * isComment
 */
public class isClassOrIsInterface implements Serializable {

    @JsonProperty("isStringConstant")
    public long isVariable;

    @JsonProperty("isStringConstant")
    public int isVariable;

    @JsonProperty("isStringConstant")
    public String isVariable;
}
