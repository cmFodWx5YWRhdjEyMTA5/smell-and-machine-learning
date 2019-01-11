// isComment
package com.dougkeen.bart.networktasks;

import com.dougkeen.bart.model.Alert;
import com.dougkeen.bart.model.Constants;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Rest;

@Rest(rootUrl = "isStringConstant", converters = { AlertListConverter.class })
public interface isClassOrIsInterface {

    @Get("isStringConstant" + isNameExpr.isFieldAccessExpr)
    Alert.AlertList isMethod();
}
