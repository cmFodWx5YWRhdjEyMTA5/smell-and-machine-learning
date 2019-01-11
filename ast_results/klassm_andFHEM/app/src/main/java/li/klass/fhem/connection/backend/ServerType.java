// isComment
package li.klass.fhem.connection.backend;

import li.klass.fhem.util.ApplicationProperties;

public enum ServerType {

    DUMMY(new ConnectionProvider() {

        @Override
        public FHEMConnection isMethod(FHEMServerSpec isParameter, ApplicationProperties isParameter) {
            return new DummyDataConnection(isNameExpr, isNameExpr);
        }
    }), FHEMWEB(new ConnectionProvider() {

        @Override
        public FHEMConnection isMethod(FHEMServerSpec isParameter, ApplicationProperties isParameter) {
            return new FHEMWEBConnection(isNameExpr, isNameExpr);
        }
    }), TELNET(new ConnectionProvider() {

        @Override
        public FHEMConnection isMethod(FHEMServerSpec isParameter, ApplicationProperties isParameter) {
            return new TelnetConnection(isNameExpr, isNameExpr);
        }
    });

    private final ConnectionProvider isVariable;

    isConstructor(ConnectionProvider isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public FHEMConnection isMethod(FHEMServerSpec isParameter, ApplicationProperties isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    private interface isClassOrIsInterface {

        FHEMConnection isMethod(FHEMServerSpec isParameter, ApplicationProperties isParameter);
    }
}
