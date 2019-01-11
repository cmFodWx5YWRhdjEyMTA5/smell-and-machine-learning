// isComment
package de.stephanlindauer.criticalmaps.handler;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.ligi.axt.AXT;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import de.stephanlindauer.criticalmaps.events.Events;
import de.stephanlindauer.criticalmaps.model.ChatModel;
import de.stephanlindauer.criticalmaps.model.OtherUsersLocationModel;
import de.stephanlindauer.criticalmaps.provider.EventBus;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class isClassOrIsInterface {

    @Test
    public void isMethod() throws IOException, URISyntaxException, JSONException {
        final String isVariable = isNameExpr.isMethod(new File(isMethod().isMethod().isMethod("isStringConstant").isMethod())).isMethod();
        final ChatModel isVariable = isMethod(ChatModel.class);
        final ServerResponseProcessor isVariable = new ServerResponseProcessor(isMethod(OtherUsersLocationModel.class), isMethod(EventBus.class), isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(JSONObject.class));
    }

    @Test
    public void isMethod() throws IOException, URISyntaxException {
        final String isVariable = isNameExpr.isMethod(new File(isMethod().isMethod().isMethod("isStringConstant").isMethod())).isMethod();
        final EventBus isVariable = isMethod(EventBus.class);
        final ServerResponseProcessor isVariable = new ServerResponseProcessor(isMethod(OtherUsersLocationModel.class), isNameExpr, isMethod(ChatModel.class));
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws IOException, URISyntaxException {
        final EventBus isVariable = isMethod(EventBus.class);
        final ServerResponseProcessor isVariable = new ServerResponseProcessor(isMethod(OtherUsersLocationModel.class), isNameExpr, isMethod(ChatModel.class));
        isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr, isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
    }
}
