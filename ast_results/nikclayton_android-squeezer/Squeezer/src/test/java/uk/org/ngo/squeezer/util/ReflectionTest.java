// isComment
package uk.org.ngo.squeezer.util;

import junit.framework.TestCase;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class isClassOrIsInterface extends TestCase {

    class isClassOrIsInterface {
    }

    class isClassOrIsInterface extends Item {
    }

    class isClassOrIsInterface extends Item {
    }

    class isClassOrIsInterface extends Item {
    }

    class isClassOrIsInterface extends GroupItem {
    }

    class isClassOrIsInterface extends GroupItem {
    }

    class isClassOrIsInterface<T extends Item> {
    }

    class isClassOrIsInterface extends A<Item1> {
    }

    class isClassOrIsInterface extends A<Item2> {
    }

    class isClassOrIsInterface<T extends GroupItem> extends A<T> {
    }

    class isClassOrIsInterface extends C<GroupItem1> {
    }

    class isClassOrIsInterface extends C<GroupItem2> {
    }

    class isClassOrIsInterface<T1 extends Item, T2 extends Item> {
    }

    class isClassOrIsInterface extends AA<Item1, Item2> {
    }

    interface isClassOrIsInterface<T extends Item> {
    }

    class isClassOrIsInterface<T extends Item> implements I<T> {
    }

    class isClassOrIsInterface extends AI<Item1> {
    }

    class isClassOrIsInterface extends AI<Item2> {
    }

    class isClassOrIsInterface extends AI<GroupItem1> {
    }

    class isClassOrIsInterface extends AI<GroupItem2> {
    }

    class isClassOrIsInterface<T extends GroupItem> extends AI<T> {
    }

    class isClassOrIsInterface extends CIG<GroupItem1> {
    }

    class isClassOrIsInterface extends CIG<GroupItem2> {
    }

    // isComment
    class isClassOrIsInterface<T extends Item> extends A<Item1> {
    }

    class isClassOrIsInterface extends StrangeExtend<Item2> {
    }

    interface isClassOrIsInterface<T extends Item> {
    }

    interface isClassOrIsInterface<T1 extends Item, T2 extends Item> extends _I<T1> {
    }

    class isClassOrIsInterface<T1 extends Item, T2 extends Item> implements II<T1, T2> {
    }

    class isClassOrIsInterface implements II<Item1, Item2> {
    }

    class isClassOrIsInterface extends BII {
    }

    class isClassOrIsInterface extends AII<Item1, Item2> {
    }

    class isClassOrIsInterface implements II<Item1, Item2>, I<Item2> {
    }

    class isClassOrIsInterface<T1 extends Item, T2 extends Item> implements II<T1, T2>, I<T2> {
    }

    interface isClassOrIsInterface<T extends Item> {
    }

    class isClassOrIsInterface extends AIII<Item1, GroupItem1> implements __I<GroupItem2> {
    }

    class isClassOrIsInterface<T1 extends Item, T2 extends Item> extends AA<T2, T1> {
    }

    class isClassOrIsInterface<T1 extends Item, T2 extends Item> implements II<T2, T1> {
    }

    class isClassOrIsInterface<T1 extends Item, T2 extends Item> extends AII<T2, T1> {
    }

    public void isMethod() {
        isMethod(new Type[] { Item1.class }, isNameExpr.isMethod(new B1().isMethod(), A.class));
        isMethod(new Type[] { Item1.class }, isNameExpr.isMethod(B1.class, A.class));
        isMethod(new Type[] { Item2.class }, isNameExpr.isMethod(new B2().isMethod(), A.class));
        isMethod(new Type[] { Item2.class }, isNameExpr.isMethod(B2.class, A.class));
        isMethod(new Type[] { GroupItem1.class }, isNameExpr.isMethod(D1.class, A.class));
        isMethod(new Type[] { GroupItem2.class }, isNameExpr.isMethod(D2.class, A.class));
        isMethod(new Type[] { GroupItem1.class }, isNameExpr.isMethod(new D1().isMethod(), C.class));
        isMethod(new Type[] { GroupItem2.class }, isNameExpr.isMethod(new D2().isMethod(), C.class));
        isMethod(new Type[] { Item1.class, Item2.class }, isNameExpr.isMethod(BII.class, II.class));
        isMethod(new Type[] { Item1.class }, isNameExpr.isMethod(BII.class, _I.class));
        isMethod(new Type[] { Item1.class, Item2.class }, isNameExpr.isMethod(CII.class, II.class));
        isMethod(new Type[] { Item1.class }, isNameExpr.isMethod(CII.class, _I.class));
        isMethod(new Type[] { Item1.class, Item2.class }, isNameExpr.isMethod(BAII.class, II.class));
        isMethod(new Type[] { Item1.class, Item2.class }, isNameExpr.isMethod(BAII.class, AII.class));
        isMethod(new Type[] { Item1.class }, isNameExpr.isMethod(BAII.class, _I.class));
        isMethod(new Type[] { Item1.class, Item2.class }, isNameExpr.isMethod(BIII.class, II.class));
        isMethod(new Type[] { Item2.class }, isNameExpr.isMethod(BIII.class, I.class));
        isMethod(new Type[] { Item1.class }, isNameExpr.isMethod(BIII.class, _I.class));
        isMethod(new Type[] { Item1.class, GroupItem1.class }, isNameExpr.isMethod(BAIII.class, II.class));
        isMethod(new Type[] { Item1.class, GroupItem1.class }, isNameExpr.isMethod(BAIII.class, AIII.class));
        isMethod(new Type[] { GroupItem1.class }, isNameExpr.isMethod(BAIII.class, I.class));
        isMethod(new Type[] { Item1.class }, isNameExpr.isMethod(BAIII.class, _I.class));
        isMethod(new Type[] { GroupItem2.class }, isNameExpr.isMethod(BAIII.class, __I.class));
        isMethod(new Type[] { Item2.class, Item1.class }, isNameExpr.isMethod(new SwapOrder1<Item1, Item2>() {
        }.isMethod(), AA.class));
        isMethod(new Type[] { Item2.class, Item1.class }, isNameExpr.isMethod(new SwapOrder2<Item1, Item2>() {
        }.isMethod(), II.class));
        isMethod(new Type[] { Item2.class, Item1.class }, isNameExpr.isMethod(new SwapOrder3<Item1, Item2>() {
        }.isMethod(), II.class));
        isMethod(new Type[] { Item2.class, Item1.class }, isNameExpr.isMethod(new SwapOrder3<Item1, Item2>() {
        }.isMethod(), AII.class));
    }

    private void isMethod(Type[] isParameter, Type[] isParameter) {
        isMethod(isMethod(isNameExpr), isMethod(isNameExpr));
    }

    private String isMethod(Type[] isParameter) {
        StringBuilder isVariable = new StringBuilder();
        for (Type isVariable : isNameExpr) {
            isNameExpr.isMethod(isNameExpr.isMethod() > isIntegerConstant ? "isStringConstant" : "isStringConstant");
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr.isMethod("isStringConstant").isMethod();
    }

    public void isMethod() {
        isMethod(Item1.class, isNameExpr.isMethod(new B1().isMethod(), A.class, isIntegerConstant));
        isMethod(Item1.class, isNameExpr.isMethod(B1.class, A.class, isIntegerConstant));
        isMethod(Item2.class, isNameExpr.isMethod(new B2().isMethod(), A.class, isIntegerConstant));
        isMethod(Item2.class, isNameExpr.isMethod(B2.class, A.class, isIntegerConstant));
        isMethod(GroupItem1.class, isNameExpr.isMethod(new D1().isMethod(), A.class, isIntegerConstant));
        isMethod(GroupItem1.class, isNameExpr.isMethod(D1.class, A.class, isIntegerConstant));
        isMethod(GroupItem2.class, isNameExpr.isMethod(new D2().isMethod(), A.class, isIntegerConstant));
        isMethod(GroupItem2.class, isNameExpr.isMethod(D2.class, A.class, isIntegerConstant));
        isMethod(GroupItem1.class, isNameExpr.isMethod(new D1().isMethod(), C.class, isIntegerConstant));
        isMethod(GroupItem1.class, isNameExpr.isMethod(D1.class, C.class, isIntegerConstant));
        isMethod(GroupItem2.class, isNameExpr.isMethod(new D2().isMethod(), C.class, isIntegerConstant));
        isMethod(GroupItem2.class, isNameExpr.isMethod(D2.class, C.class, isIntegerConstant));
        isMethod(Item1.class, isNameExpr.isMethod(BB.class, AA.class, isIntegerConstant));
        isMethod(Item2.class, isNameExpr.isMethod(BB.class, AA.class, isIntegerConstant));
        isMethod(Item1.class, isNameExpr.isMethod(BI1.class, I.class, isIntegerConstant));
        isMethod(Item2.class, isNameExpr.isMethod(BI2.class, I.class, isIntegerConstant));
        isMethod(Item1.class, isNameExpr.isMethod(BI1.class, AI.class, isIntegerConstant));
        isMethod(Item2.class, isNameExpr.isMethod(BI2.class, AI.class, isIntegerConstant));
        isMethod(GroupItem1.class, isNameExpr.isMethod(BIG1.class, I.class, isIntegerConstant));
        isMethod(GroupItem2.class, isNameExpr.isMethod(BIG2.class, I.class, isIntegerConstant));
        isMethod(GroupItem1.class, isNameExpr.isMethod(BIG1.class, AI.class, isIntegerConstant));
        isMethod(GroupItem2.class, isNameExpr.isMethod(BIG2.class, AI.class, isIntegerConstant));
        isMethod(GroupItem1.class, isNameExpr.isMethod(CIG1.class, I.class, isIntegerConstant));
        isMethod(GroupItem2.class, isNameExpr.isMethod(CIG2.class, I.class, isIntegerConstant));
        isMethod(GroupItem1.class, isNameExpr.isMethod(CIG1.class, AI.class, isIntegerConstant));
        isMethod(GroupItem2.class, isNameExpr.isMethod(CIG2.class, AI.class, isIntegerConstant));
        isMethod(GroupItem1.class, isNameExpr.isMethod(CIG1.class, CIG.class, isIntegerConstant));
        isMethod(GroupItem2.class, isNameExpr.isMethod(CIG2.class, CIG.class, isIntegerConstant));
        isMethod(null, isNameExpr.isMethod(Item1ToItem2.class, A.class, isIntegerConstant));
        isMethod(Item2.class, isNameExpr.isMethod(Item1ToItem2.class, StrangeExtend.class, isIntegerConstant));
        isMethod(Item1.class, isNameExpr.isMethod(BB.class, AA.class, isIntegerConstant));
        isMethod(Item2.class, isNameExpr.isMethod(BB.class, AA.class, isIntegerConstant));
    }

    public void isMethod() {
        List<Item1> isVariable = new ArrayList<Item1>() {

            private static final long isVariable = isStringConstant;
        };
        Set<Item1> isVariable = new HashSet<Item1>() {

            private static final long isVariable = isStringConstant;
        };
        Map<String, Item1> isVariable = new HashMap<String, ReflectionTest.Item1>() {

            private static final long isVariable = isStringConstant;
        };
        List<Integer> isVariable = new ArrayList<Integer>() {

            private static final long isVariable = isStringConstant;
        };
        Set<Integer> isVariable = new HashSet<Integer>() {

            private static final long isVariable = isStringConstant;
        };
        isMethod(Item1.class, isNameExpr.isMethod(isNameExpr.isMethod(), Collection.class, isIntegerConstant));
        isMethod(Item1.class, isNameExpr.isMethod(isNameExpr.isMethod(), List.class, isIntegerConstant));
        isMethod(Item1.class, isNameExpr.isMethod(isNameExpr.isMethod(), AbstractCollection.class, isIntegerConstant));
        isMethod(Item1.class, isNameExpr.isMethod(isNameExpr.isMethod(), AbstractList.class, isIntegerConstant));
        isMethod(Item1.class, isNameExpr.isMethod(isNameExpr.isMethod(), Collection.class, isIntegerConstant));
        isMethod(Item1.class, isNameExpr.isMethod(isNameExpr.isMethod(), Set.class, isIntegerConstant));
        isMethod(Item1.class, isNameExpr.isMethod(isNameExpr.isMethod(), AbstractCollection.class, isIntegerConstant));
        isMethod(Item1.class, isNameExpr.isMethod(isNameExpr.isMethod(), AbstractSet.class, isIntegerConstant));
        isMethod(String.class, isNameExpr.isMethod(isNameExpr.isMethod(), Map.class, isIntegerConstant));
        isMethod(Item1.class, isNameExpr.isMethod(isNameExpr.isMethod(), Map.class, isIntegerConstant));
        isMethod(String.class, isNameExpr.isMethod(isNameExpr.isMethod(), AbstractMap.class, isIntegerConstant));
        isMethod(Item1.class, isNameExpr.isMethod(isNameExpr.isMethod(), AbstractMap.class, isIntegerConstant));
        isMethod(Integer.class, isNameExpr.isMethod(isNameExpr.isMethod(), Collection.class, isIntegerConstant));
        isMethod(Integer.class, isNameExpr.isMethod(isNameExpr.isMethod(), List.class, isIntegerConstant));
        isMethod(Integer.class, isNameExpr.isMethod(isNameExpr.isMethod(), AbstractCollection.class, isIntegerConstant));
        isMethod(Integer.class, isNameExpr.isMethod(isNameExpr.isMethod(), AbstractList.class, isIntegerConstant));
        isMethod(Integer.class, isNameExpr.isMethod(isNameExpr.isMethod(), Collection.class, isIntegerConstant));
        isMethod(Integer.class, isNameExpr.isMethod(isNameExpr.isMethod(), Set.class, isIntegerConstant));
        isMethod(Integer.class, isNameExpr.isMethod(isNameExpr.isMethod(), AbstractCollection.class, isIntegerConstant));
        isMethod(Integer.class, isNameExpr.isMethod(isNameExpr.isMethod(), AbstractSet.class, isIntegerConstant));
        // isComment
        isMethod(null, isNameExpr.isMethod(new ArrayList<Integer>().isMethod(), List.class, isIntegerConstant));
    }
}
