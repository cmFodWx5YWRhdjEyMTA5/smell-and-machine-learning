// isComment
package net.cyclestreets.api.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.cyclestreets.api.Registration;
import net.cyclestreets.api.Result;

public class isClassOrIsInterface extends ApiResponseDto {

    @JsonProperty(value = "isStringConstant")
    private String isVariable;

    public Result isMethod() {
        return isMethod() ? isNameExpr.isMethod() : isNameExpr.isMethod(isNameExpr);
    }
}
