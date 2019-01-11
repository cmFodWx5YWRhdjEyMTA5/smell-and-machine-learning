// isComment
package com.concentricsky.android.khanacademy.data.remote;

import java.io.IOException;
import java.util.Iterator;
import com.concentricsky.android.khanacademy.data.db.UserVideo;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class isClassOrIsInterface extends SimpleModule {

    private static final long isVariable = isStringConstant;

    private ObjectMapper isVariable;

    public isConstructor() {
        super("isStringConstant", new Version(isIntegerConstant, isIntegerConstant, isIntegerConstant, null, "isStringConstant", "isStringConstant"));
        this.isMethod(UserVideo.class, new UserVideoDeserializer());
        isNameExpr = new ObjectMapper();
    }

    public final class isClassOrIsInterface extends StdScalarDeserializer<UserVideo> {

        private static final long isVariable = isStringConstant;

        public isConstructor() {
            super(UserVideo.class);
        }

        @Override
        public UserVideo isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException {
            TreeNode isVariable = isNameExpr.isMethod(isNameExpr);
            ObjectNode isVariable = (ObjectNode) isNameExpr;
            Iterator<String> isVariable = isNameExpr.isMethod();
            while (isNameExpr.isMethod()) {
                String isVariable = isNameExpr.isMethod();
                if ("isStringConstant".isMethod(isNameExpr)) {
                    JsonNode isVariable = isNameExpr.isMethod(isNameExpr);
                    if (isNameExpr.isMethod()) {
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant"));
                    }
                }
            }
            UserVideo isVariable = isNameExpr.isMethod(isNameExpr, UserVideo.class);
            return isNameExpr;
        }
    }
}
