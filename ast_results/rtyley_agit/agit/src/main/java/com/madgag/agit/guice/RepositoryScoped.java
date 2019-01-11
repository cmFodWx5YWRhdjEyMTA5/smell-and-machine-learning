// isComment
package com.madgag.agit.guice;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import com.google.inject.ScopeAnnotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ isNameExpr, isNameExpr })
@Retention(isNameExpr)
@ScopeAnnotation
public @interface RepositoryScoped {
}
