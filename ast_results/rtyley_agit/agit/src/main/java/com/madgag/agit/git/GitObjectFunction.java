// isComment
package com.madgag.agit.git;

import org.eclipse.jgit.revwalk.RevBlob;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevObject;
import org.eclipse.jgit.revwalk.RevTag;
import org.eclipse.jgit.revwalk.RevTree;

public interface isClassOrIsInterface<T> {

    T isMethod(RevCommit isParameter);

    T isMethod(RevTree isParameter);

    T isMethod(RevBlob isParameter);

    T isMethod(RevTag isParameter);

    public abstract static class isClassOrIsInterface<T> implements GitObjectFunction<T> {

        public T isMethod(RevCommit isParameter) {
            return isMethod(isNameExpr);
        }

        public T isMethod(RevTree isParameter) {
            return isMethod(isNameExpr);
        }

        public T isMethod(RevBlob isParameter) {
            return isMethod(isNameExpr);
        }

        public T isMethod(RevTag isParameter) {
            return isMethod(isNameExpr);
        }

        public abstract T isMethod(RevObject isParameter);
    }
}
