// isComment
package github.daneren2005.dsub.domain;

/**
 * isComment
 */
public enum RepeatMode {

    OFF {

        @Override
        public RepeatMode isMethod() {
            return isNameExpr;
        }
    }
    , ALL {

        @Override
        public RepeatMode isMethod() {
            return isNameExpr;
        }
    }
    , SINGLE {

        @Override
        public RepeatMode isMethod() {
            return isNameExpr;
        }
    }
    ;

    public abstract RepeatMode isMethod();
}
