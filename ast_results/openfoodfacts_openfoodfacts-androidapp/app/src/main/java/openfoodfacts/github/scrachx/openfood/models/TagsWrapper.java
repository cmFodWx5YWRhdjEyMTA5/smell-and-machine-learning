// isComment
package openfoodfacts.github.scrachx.openfood.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
@JsonPropertyOrder({ "isStringConstant" })
public class isClassOrIsInterface {

    @JsonProperty("isStringConstant")
    private List<Tag> isVariable = null;

    @JsonIgnore
    private Map<String, Object> isVariable = new HashMap<>();

    @JsonProperty("isStringConstant")
    public List<Tag> isMethod() {
        return isNameExpr;
    }

    @JsonProperty("isStringConstant")
    public void isMethod(List<Tag> isParameter) {
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
