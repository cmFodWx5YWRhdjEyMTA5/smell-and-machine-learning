// isComment
package me.ccrama.redditslide.Tumblr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
@JsonPropertyOrder({ "isStringConstant", "isStringConstant", "isStringConstant" })
public class isClassOrIsInterface {

    @JsonProperty("isStringConstant")
    private String isVariable;

    @JsonProperty("isStringConstant")
    private List<AltSize> isVariable = new ArrayList<AltSize>();

    @JsonProperty("isStringConstant")
    private OriginalSize isVariable;

    @JsonIgnore
    private Map<String, Object> isVariable = new HashMap<String, Object>();

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public String isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public void isMethod(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public List<AltSize> isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public void isMethod(List<AltSize> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public OriginalSize isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public void isMethod(OriginalSize isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @JsonAnyGetter
    public Map<String, Object> isMethod() {
        return this.isFieldAccessExpr;
    }

    @JsonAnySetter
    public void isMethod(String isParameter, Object isParameter) {
        this.isFieldAccessExpr.isMethod(isNameExpr, isNameExpr);
    }
}
