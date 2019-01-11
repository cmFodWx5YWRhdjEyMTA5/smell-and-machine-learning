// isComment
package me.ccrama.redditslide.ImgurAlbum;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
@JsonPropertyOrder({ "isStringConstant", "isStringConstant", "isStringConstant" })
public class isClassOrIsInterface {

    @JsonProperty("isStringConstant")
    private Data isVariable;

    @JsonProperty("isStringConstant")
    private Boolean isVariable;

    @JsonProperty("isStringConstant")
    private Integer isVariable;

    @JsonIgnore
    private Map<String, Object> isVariable = new HashMap<>();

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public Data isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public void isMethod(Data isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public Boolean isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public void isMethod(Boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public Integer isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public void isMethod(Integer isParameter) {
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
