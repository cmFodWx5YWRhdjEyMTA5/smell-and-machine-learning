// isComment
package com.nolanlawson.japanesenamegenerator.v3.data;

/**
 * isComment
 */
public enum ConditionType {

    FollowedByConsonant,
    PrecededByConsonant,
    EndOfString,
    StartOfString,
    OriginalStringWas,
    NextChar,
    PrevChar,
    NextCharPlusOne,
    PrevCharPlusOne,
    HadRuleApplied,
    NextCharIsLast,
    PrevCharIsFirst,
    NextCharPlusOneIsConsonant,
    NextString,
    PrevString
}
