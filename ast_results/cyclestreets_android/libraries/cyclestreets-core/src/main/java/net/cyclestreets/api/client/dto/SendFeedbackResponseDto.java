// isComment
package net.cyclestreets.api.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.cyclestreets.api.Feedback;
import net.cyclestreets.api.Result;

public class isClassOrIsInterface extends ApiResponseDto {

    @JsonProperty
    private String isVariable;

    public Result isMethod() {
        return isMethod() ? isNameExpr.isMethod() : isNameExpr.isMethod(isNameExpr);
    }
}
