// isComment
package com.mendhak.gpslogger.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * isComment
 */
@Target({ isNameExpr.isFieldAccessExpr })
public @interface EventBusHook {
}
