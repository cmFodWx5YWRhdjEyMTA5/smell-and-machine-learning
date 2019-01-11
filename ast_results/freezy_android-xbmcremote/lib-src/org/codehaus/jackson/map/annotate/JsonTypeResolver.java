// isComment
package org.codehaus.jackson.map.annotate;

import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;

/**
 * isComment
 */
public @interface JsonTypeResolver {

    public Class<? extends TypeResolverBuilder<?>> value();
}
