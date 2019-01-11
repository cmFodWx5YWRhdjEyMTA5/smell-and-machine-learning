// isComment
package com.nineoldandroids.animation;

import android.view.animation.Interpolator;

/**
 * isComment
 */
public abstract class isClassOrIsInterface implements Cloneable {

    /**
     * isComment
     */
    float isVariable;

    /**
     * isComment
     */
    Class isVariable;

    /**
     * isComment
     */
    private Interpolator /*isComment*/
    isVariable = null;

    /**
     * isComment
     */
    boolean isVariable = true;

    /**
     * isComment
     */
    public static Keyframe isMethod(float isParameter, int isParameter) {
        return new IntKeyframe(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public static Keyframe isMethod(float isParameter) {
        return new IntKeyframe(isNameExpr);
    }

    /**
     * isComment
     */
    public static Keyframe isMethod(float isParameter, float isParameter) {
        return new FloatKeyframe(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public static Keyframe isMethod(float isParameter) {
        return new FloatKeyframe(isNameExpr);
    }

    /**
     * isComment
     */
    public static Keyframe isMethod(float isParameter, Object isParameter) {
        return new ObjectKeyframe(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public static Keyframe isMethod(float isParameter) {
        return new ObjectKeyframe(isNameExpr, null);
    }

    /**
     * isComment
     */
    public boolean isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public abstract Object isMethod();

    /**
     * isComment
     */
    public abstract void isMethod(Object isParameter);

    /**
     * isComment
     */
    public float isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(float isParameter) {
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public /*isComment*/
    Interpolator isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(/*isComment*/
    Interpolator isParameter) {
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public Class isMethod() {
        return isNameExpr;
    }

    @Override
    public abstract Keyframe isMethod();

    /**
     * isComment
     */
    static class isClassOrIsInterface extends Keyframe {

        /**
         * isComment
         */
        Object isVariable;

        isConstructor(float isParameter, Object isParameter) {
            isNameExpr = isNameExpr;
            isNameExpr = isNameExpr;
            isNameExpr = (isNameExpr != null);
            isNameExpr = isNameExpr ? isNameExpr.isMethod() : Object.class;
        }

        public Object isMethod() {
            return isNameExpr;
        }

        public void isMethod(Object isParameter) {
            isNameExpr = isNameExpr;
            isNameExpr = (isNameExpr != null);
        }

        @Override
        public ObjectKeyframe isMethod() {
            ObjectKeyframe isVariable = new ObjectKeyframe(isMethod(), isNameExpr);
            isNameExpr.isMethod(isMethod());
            return isNameExpr;
        }
    }

    /**
     * isComment
     */
    static class isClassOrIsInterface extends Keyframe {

        /**
         * isComment
         */
        int isVariable;

        isConstructor(float isParameter, int isParameter) {
            isNameExpr = isNameExpr;
            isNameExpr = isNameExpr;
            isNameExpr = int.class;
            isNameExpr = true;
        }

        isConstructor(float isParameter) {
            isNameExpr = isNameExpr;
            isNameExpr = int.class;
        }

        public int isMethod() {
            return isNameExpr;
        }

        public Object isMethod() {
            return isNameExpr;
        }

        public void isMethod(Object isParameter) {
            if (isNameExpr != null && isNameExpr.isMethod() == Integer.class) {
                isNameExpr = ((Integer) isNameExpr).isMethod();
                isNameExpr = true;
            }
        }

        @Override
        public IntKeyframe isMethod() {
            IntKeyframe isVariable = new IntKeyframe(isMethod(), isNameExpr);
            isNameExpr.isMethod(isMethod());
            return isNameExpr;
        }
    }

    /**
     * isComment
     */
    static class isClassOrIsInterface extends Keyframe {

        /**
         * isComment
         */
        float isVariable;

        isConstructor(float isParameter, float isParameter) {
            isNameExpr = isNameExpr;
            isNameExpr = isNameExpr;
            isNameExpr = float.class;
            isNameExpr = true;
        }

        isConstructor(float isParameter) {
            isNameExpr = isNameExpr;
            isNameExpr = float.class;
        }

        public float isMethod() {
            return isNameExpr;
        }

        public Object isMethod() {
            return isNameExpr;
        }

        public void isMethod(Object isParameter) {
            if (isNameExpr != null && isNameExpr.isMethod() == Float.class) {
                isNameExpr = ((Float) isNameExpr).isMethod();
                isNameExpr = true;
            }
        }

        @Override
        public FloatKeyframe isMethod() {
            FloatKeyframe isVariable = new FloatKeyframe(isMethod(), isNameExpr);
            isNameExpr.isMethod(isMethod());
            return isNameExpr;
        }
    }
}
