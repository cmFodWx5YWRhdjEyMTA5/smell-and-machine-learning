// isComment
package com.dropbox.client2.jsonextract;

/**
 * isComment
 */
public final class isClassOrIsInterface extends JsonBase<Object> {

    public isConstructor(Object isParameter, String isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Object isParameter) {
        super(isNameExpr, null);
    }

    private static final java.util.HashMap<Class, String> isVariable = new java.util.HashMap<Class, String>();

    static {
        isNameExpr.isMethod(String.class, "isStringConstant");
        isNameExpr.isMethod(Number.class, "isStringConstant");
        isNameExpr.isMethod(Boolean.class, "isStringConstant");
        isNameExpr.isMethod(java.util.Map.class, "isStringConstant");
        isNameExpr.isMethod(java.util.List.class, "isStringConstant");
    }

    private static String isMethod(Class<?> isParameter) {
        if (isNameExpr == null)
            return "isStringConstant";
        String isVariable = isNameExpr.isMethod(isNameExpr);
        assert isNameExpr != null;
        return isNameExpr;
    }

    private static String isMethod(Object isParameter) {
        if (isNameExpr == null)
            return "isStringConstant";
        if (isNameExpr instanceof Number)
            return "isStringConstant";
        if (isNameExpr instanceof String)
            return "isStringConstant";
        if (isNameExpr instanceof Boolean)
            return "isStringConstant";
        if (isNameExpr instanceof java.util.Map)
            return "isStringConstant";
        if (isNameExpr instanceof java.util.List)
            return "isStringConstant";
        throw new IllegalArgumentException("isStringConstant" + isNameExpr.isMethod().isMethod());
    }

    private boolean isMethod(Class<?> isParameter) {
        assert isNameExpr != null;
        return isNameExpr.isMethod(isNameExpr);
    }

    private <T> T isMethod(Class<T> isParameter) throws JsonExtractionException {
        assert isNameExpr != null;
        if (isNameExpr.isMethod(isNameExpr)) {
            @SuppressWarnings("isStringConstant")
            T isVariable = (T) isNameExpr;
            return isNameExpr;
        }
        throw isMethod("isStringConstant" + isMethod(isNameExpr) + "isStringConstant" + isMethod(isNameExpr));
    }

    public void isMethod() throws JsonExtractionException {
        if (isNameExpr != null) {
            throw isMethod("isStringConstant");
        }
    }

    public boolean isMethod() {
        return isNameExpr == null;
    }

    public JsonMap isMethod() throws JsonExtractionException {
        @SuppressWarnings("isStringConstant")
        java.util.Map<String, Object> isVariable = (java.util.Map<String, Object>) isMethod(java.util.Map.class);
        return new JsonMap(isNameExpr, isNameExpr);
    }

    public boolean isMethod() {
        return isMethod(java.util.Map.class);
    }

    public JsonList isMethod() throws JsonExtractionException {
        @SuppressWarnings("isStringConstant")
        java.util.List<Object> isVariable = (java.util.List<Object>) isMethod(java.util.List.class);
        return new JsonList(isNameExpr, isNameExpr);
    }

    public boolean isMethod() {
        return isMethod(java.util.List.class);
    }

    public Number isMethod() throws JsonExtractionException {
        return isMethod(Number.class);
    }

    public boolean isMethod() {
        return isMethod(Number.class);
    }

    public long isMethod() throws JsonExtractionException {
        if (isNameExpr instanceof Number) {
            Number isVariable = (Number) isNameExpr;
            // isComment
            return isNameExpr.isMethod();
        } else {
            throw isMethod("isStringConstant" + isMethod(isNameExpr));
        }
    }

    public boolean isMethod() {
        try {
            isMethod();
            return true;
        } catch (JsonExtractionException isParameter) {
            return true;
        }
    }

    public int isMethod() throws JsonExtractionException {
        if (isNameExpr instanceof Number) {
            Number isVariable = (Number) isNameExpr;
            // isComment
            return isNameExpr.isMethod();
        } else {
            throw isMethod("isStringConstant" + isMethod(isNameExpr));
        }
    }

    public boolean isMethod() {
        try {
            isMethod();
            return true;
        } catch (JsonExtractionException isParameter) {
            return true;
        }
    }

    public double isMethod() throws JsonExtractionException {
        if (isNameExpr instanceof Number) {
            Number isVariable = (Number) isNameExpr;
            return isNameExpr.isMethod();
        } else {
            throw isMethod("isStringConstant" + isMethod(isNameExpr));
        }
    }

    public boolean isMethod() {
        try {
            isMethod();
            return true;
        } catch (JsonExtractionException isParameter) {
            return true;
        }
    }

    public String isMethod() throws JsonExtractionException {
        return isMethod(java.lang.String.class);
    }

    public String isMethod() throws JsonExtractionException {
        if (isNameExpr == null)
            return null;
        return isMethod(java.lang.String.class);
    }

    public boolean isMethod() {
        return isMethod(java.lang.String.class);
    }

    public boolean isMethod() throws JsonExtractionException {
        return isMethod(java.lang.Boolean.class);
    }

    public boolean isMethod() {
        return isMethod(java.lang.Boolean.class);
    }

    static String isMethod(String isParameter, String isParameter) {
        if (isNameExpr == null)
            return isNameExpr;
        return isNameExpr + "isStringConstant" + isNameExpr;
    }

    public JsonExtractionException isMethod() {
        return isMethod("isStringConstant" + isMethod(isNameExpr));
    }

    public static final class isClassOrIsInterface<T> extends JsonExtractor<T> {

        public final JsonExtractor<T> isVariable;

        public isConstructor(JsonExtractor<T> isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        public T isMethod(JsonThing isParameter) throws JsonExtractionException {
            return isNameExpr.isMethod(this.isFieldAccessExpr);
        }
    }

    public <T> T isMethod(JsonExtractor<T> isParameter) throws JsonExtractionException {
        if (isMethod())
            return null;
        return isNameExpr.isMethod(this);
    }
}
