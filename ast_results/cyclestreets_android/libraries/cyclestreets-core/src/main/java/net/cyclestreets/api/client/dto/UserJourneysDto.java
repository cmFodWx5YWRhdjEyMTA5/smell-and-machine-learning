// isComment
package net.cyclestreets.api.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.cyclestreets.api.UserJourney;
import net.cyclestreets.api.UserJourneys;
import java.util.HashMap;
import java.util.Map;

public final class isClassOrIsInterface {

    @JsonProperty
    private final Map<String, UserJourney> isVariable = new HashMap<>();

    public UserJourneys isMethod() {
        return new UserJourneys(isNameExpr.isMethod());
    }
}
