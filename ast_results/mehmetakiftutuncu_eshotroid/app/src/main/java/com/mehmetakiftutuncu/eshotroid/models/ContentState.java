// isComment
package com.mehmetakiftutuncu.eshotroid.models;

public enum ContentState {

    DATA, NO_DATA, LOADING, ERROR;

    public interface isClassOrIsInterface {

        void isMethod();

        void isMethod(ContentState isParameter);
    }
}
