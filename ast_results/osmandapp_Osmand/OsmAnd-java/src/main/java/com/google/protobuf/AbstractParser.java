// isComment
package com.google.protobuf;

import com.google.protobuf.AbstractMessageLite.Builder.LimitedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<MessageType extends MessageLite> implements Parser<MessageType> {

    /**
     * isComment
     */
    private UninitializedMessageException isMethod(MessageType isParameter) {
        if (isNameExpr instanceof AbstractMessageLite) {
            return ((AbstractMessageLite) isNameExpr).isMethod();
        }
        return new UninitializedMessageException(isNameExpr);
    }

    /**
     * isComment
     */
    private MessageType isMethod(MessageType isParameter) throws InvalidProtocolBufferException {
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            throw isMethod(isNameExpr).isMethod().isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    private static final ExtensionRegistryLite isVariable = isNameExpr.isMethod();

    public MessageType isMethod(CodedInputStream isParameter) throws InvalidProtocolBufferException {
        return isMethod(isNameExpr, isNameExpr);
    }

    public MessageType isMethod(CodedInputStream isParameter, ExtensionRegistryLite isParameter) throws InvalidProtocolBufferException {
        return isMethod(isMethod(isNameExpr, isNameExpr));
    }

    public MessageType isMethod(CodedInputStream isParameter) throws InvalidProtocolBufferException {
        return isMethod(isNameExpr, isNameExpr);
    }

    public MessageType isMethod(ByteString isParameter, ExtensionRegistryLite isParameter) throws InvalidProtocolBufferException {
        MessageType isVariable;
        try {
            CodedInputStream isVariable = isNameExpr.isMethod();
            isNameExpr = isMethod(isNameExpr, isNameExpr);
            try {
                isNameExpr.isMethod(isIntegerConstant);
            } catch (InvalidProtocolBufferException isParameter) {
                throw isNameExpr.isMethod(isNameExpr);
            }
            return isNameExpr;
        } catch (InvalidProtocolBufferException isParameter) {
            throw isNameExpr;
        } catch (IOException isParameter) {
            throw new RuntimeException("isStringConstant" + "isStringConstant", isNameExpr);
        }
    }

    public MessageType isMethod(ByteString isParameter) throws InvalidProtocolBufferException {
        return isMethod(isNameExpr, isNameExpr);
    }

    public MessageType isMethod(ByteString isParameter, ExtensionRegistryLite isParameter) throws InvalidProtocolBufferException {
        return isMethod(isMethod(isNameExpr, isNameExpr));
    }

    public MessageType isMethod(ByteString isParameter) throws InvalidProtocolBufferException {
        return isMethod(isNameExpr, isNameExpr);
    }

    public MessageType isMethod(byte[] isParameter, int isParameter, int isParameter, ExtensionRegistryLite isParameter) throws InvalidProtocolBufferException {
        try {
            CodedInputStream isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            MessageType isVariable = isMethod(isNameExpr, isNameExpr);
            try {
                isNameExpr.isMethod(isIntegerConstant);
            } catch (InvalidProtocolBufferException isParameter) {
                throw isNameExpr.isMethod(isNameExpr);
            }
            return isNameExpr;
        } catch (InvalidProtocolBufferException isParameter) {
            throw isNameExpr;
        } catch (IOException isParameter) {
            throw new RuntimeException("isStringConstant" + "isStringConstant", isNameExpr);
        }
    }

    public MessageType isMethod(byte[] isParameter, int isParameter, int isParameter) throws InvalidProtocolBufferException {
        return isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public MessageType isMethod(byte[] isParameter, ExtensionRegistryLite isParameter) throws InvalidProtocolBufferException {
        return isMethod(isNameExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    public MessageType isMethod(byte[] isParameter) throws InvalidProtocolBufferException {
        return isMethod(isNameExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    public MessageType isMethod(byte[] isParameter, int isParameter, int isParameter, ExtensionRegistryLite isParameter) throws InvalidProtocolBufferException {
        return isMethod(isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr));
    }

    public MessageType isMethod(byte[] isParameter, int isParameter, int isParameter) throws InvalidProtocolBufferException {
        return isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public MessageType isMethod(byte[] isParameter, ExtensionRegistryLite isParameter) throws InvalidProtocolBufferException {
        return isMethod(isNameExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    public MessageType isMethod(byte[] isParameter) throws InvalidProtocolBufferException {
        return isMethod(isNameExpr, isNameExpr);
    }

    public MessageType isMethod(InputStream isParameter, ExtensionRegistryLite isParameter) throws InvalidProtocolBufferException {
        CodedInputStream isVariable = isNameExpr.isMethod(isNameExpr);
        MessageType isVariable = isMethod(isNameExpr, isNameExpr);
        try {
            isNameExpr.isMethod(isIntegerConstant);
        } catch (InvalidProtocolBufferException isParameter) {
            throw isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    public MessageType isMethod(InputStream isParameter) throws InvalidProtocolBufferException {
        return isMethod(isNameExpr, isNameExpr);
    }

    public MessageType isMethod(InputStream isParameter, ExtensionRegistryLite isParameter) throws InvalidProtocolBufferException {
        return isMethod(isMethod(isNameExpr, isNameExpr));
    }

    public MessageType isMethod(InputStream isParameter) throws InvalidProtocolBufferException {
        return isMethod(isNameExpr, isNameExpr);
    }

    public MessageType isMethod(InputStream isParameter, ExtensionRegistryLite isParameter) throws InvalidProtocolBufferException {
        int isVariable;
        try {
            int isVariable = isNameExpr.isMethod();
            if (isNameExpr == -isIntegerConstant) {
                return null;
            }
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        } catch (IOException isParameter) {
            throw new InvalidProtocolBufferException(isNameExpr.isMethod());
        }
        InputStream isVariable = new LimitedInputStream(isNameExpr, isNameExpr);
        return isMethod(isNameExpr, isNameExpr);
    }

    public MessageType isMethod(InputStream isParameter) throws InvalidProtocolBufferException {
        return isMethod(isNameExpr, isNameExpr);
    }

    public MessageType isMethod(InputStream isParameter, ExtensionRegistryLite isParameter) throws InvalidProtocolBufferException {
        return isMethod(isMethod(isNameExpr, isNameExpr));
    }

    public MessageType isMethod(InputStream isParameter) throws InvalidProtocolBufferException {
        return isMethod(isNameExpr, isNameExpr);
    }
}
