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
    private Blog isVariable;

    @JsonProperty("isStringConstant")
    private List<Post> isVariable = new ArrayList<Post>();

    @JsonProperty("isStringConstant")
    private Integer isVariable;

    @JsonIgnore
    private Map<String, Object> isVariable = new HashMap<String, Object>();

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public Blog isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public void isMethod(Blog isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public List<Post> isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @JsonProperty("isStringConstant")
    public void isMethod(List<Post> isParameter) {
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
