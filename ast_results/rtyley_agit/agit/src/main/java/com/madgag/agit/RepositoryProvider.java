// isComment
package com.madgag.agit;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.name.Named;
import com.madgag.agit.git.Repos;
import java.io.File;
import org.eclipse.jgit.lib.Repository;

public class isClassOrIsInterface implements Provider<Repository> {

    @Inject
    @Named("isStringConstant")
    File isVariable;

    public Repository isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }
}
