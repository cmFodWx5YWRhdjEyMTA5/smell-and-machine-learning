// isComment
package com.dougkeen.bart.networktasks;

import com.dougkeen.bart.model.Constants;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Rest;

@Rest(rootUrl = "isStringConstant", converters = { ElevatorMessageConverter.class })
public interface isClassOrIsInterface {

    @Get("isStringConstant" + isNameExpr.isFieldAccessExpr)
    String isMethod();
}
