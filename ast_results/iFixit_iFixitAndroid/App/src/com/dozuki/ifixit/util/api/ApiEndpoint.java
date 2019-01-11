// isComment
package com.dozuki.ifixit.util.api;

import android.net.Uri;
import android.util.Log;
import com.dozuki.ifixit.model.Comment;
import com.dozuki.ifixit.model.dozuki.Site;
import com.dozuki.ifixit.util.JSONHelper;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/**
 * isComment
 */
public enum ApiEndpoint {

    SEARCH(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.Search().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.Search();
        }
    }, true, "isStringConstant"),
    CATEGORIES(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant";
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.Categories().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.Categories();
        }
    }, true, "isStringConstant"),
    WIKI(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public String isMethod(String isParameter, String isParameter) {
            return "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.ViewWiki().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.ViewGuide();
        }
    }, true, "isStringConstant"),
    GUIDE(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.ViewGuide().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.ViewGuide();
        }
    }, true, "isStringConstant"),
    GUIDES(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.Guides().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.Guides();
        }
    }, true, "isStringConstant"),
    ADD_COMMENT(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.AddComment().isMethod(new Comment(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.AddComment();
        }
    }, true, "isStringConstant"),
    EDIT_COMMENT(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.EditComment().isMethod(new Comment(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.EditComment();
        }
    }, true, "isStringConstant"),
    DELETE_COMMENT(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.DeleteComment().isMethod("isStringConstant");
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.DeleteComment();
        }
    }, true, "isStringConstant"),
    TOPIC(new Endpoint() {

        public String isMethod(String isParameter) {
            try {
                return "isStringConstant" + isNameExpr.isMethod(isNameExpr, "isStringConstant");
            } catch (Exception isParameter) {
                isNameExpr.isMethod("isStringConstant", "isStringConstant" + isNameExpr.isMethod());
                return null;
            }
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.Topic().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.Topic();
        }
    }, true, "isStringConstant"),
    ALL_TOPICS(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant";
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.TopicList().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.TopicList();
        }
    }, true, "isStringConstant"),
    LOGIN(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant";
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.Login().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.Login();
        }
    }, true, "isStringConstant", true),
    LOGOUT(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant";
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.Logout();
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.Logout();
        }
    }, true, "isStringConstant", true, true),
    REGISTER(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant";
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.Register().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.Register();
        }
    }, true, "isStringConstant", true),
    USER_IMAGES(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.UserImages().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.UserImages();
        }
    }, true, "isStringConstant"),
    USER_VIDEOS(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.UserVideos().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.UserVideos();
        }
    }, true, "isStringConstant"),
    USER_FAVORITES(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant";
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.UserFavorites().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.UserFavorites();
        }
    }, true, "isStringConstant"),
    USER_EMBEDS(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.UserEmbeds().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.UserVideos();
        }
    }, true, "isStringConstant"),
    UPLOAD_IMAGE(new Endpoint() {

        public String isMethod(String isParameter) {
            String isVariable;
            try {
                isNameExpr = isNameExpr.isMethod(isMethod(isNameExpr), "isStringConstant");
            } catch (UnsupportedEncodingException isParameter) {
                // isComment
                isNameExpr = "isStringConstant";
            }
            return "isStringConstant" + isNameExpr;
        }

        private String isMethod(String isParameter) {
            int isVariable = isNameExpr.isMethod('isStringConstant');
            if (isNameExpr == -isIntegerConstant) {
                /**
                 * isComment
                 */
                return isNameExpr;
            }
            return isNameExpr.isMethod(isNameExpr + isIntegerConstant);
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.UploadImage().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.UploadImage();
        }
    }, true, "isStringConstant"),
    UPLOAD_STEP_IMAGE(new Endpoint() {

        public String isMethod(String isParameter) {
            String isVariable;
            try {
                isNameExpr = isNameExpr.isMethod(isMethod(isNameExpr), "isStringConstant");
            } catch (UnsupportedEncodingException isParameter) {
                // isComment
                isNameExpr = "isStringConstant";
            }
            return "isStringConstant" + isNameExpr;
        }

        private String isMethod(String isParameter) {
            int isVariable = isNameExpr.isMethod('isStringConstant');
            if (isNameExpr == -isIntegerConstant) {
                /**
                 * isComment
                 */
                return isNameExpr;
            }
            return isNameExpr.isMethod(isNameExpr + isIntegerConstant);
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.UploadStepImage().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.UploadStepImage();
        }
    }, true, "isStringConstant"),
    COPY_IMAGE(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.DeleteImage().isMethod("isStringConstant");
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.DeleteImage();
        }
    }, true, "isStringConstant"),
    DELETE_IMAGE(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.DeleteImage().isMethod("isStringConstant");
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.DeleteImage();
        }
    }, true, "isStringConstant"),
    USER_GUIDES(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant";
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.UserGuides().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.UserGuides();
        }
    }, true, "isStringConstant"),
    GUIDE_FOR_EDIT(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr + "isStringConstant";
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.GuideForEdit().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.GuideForEdit();
        }
    }, true, "isStringConstant"),
    FAVORITE_GUIDE(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.FavoriteGuide().isMethod(true);
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.FavoriteGuide();
        }
    }, true, "isStringConstant"),
    UNFAVORITE_GUIDE(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.FavoriteGuide().isMethod(true);
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.FavoriteGuide();
        }
    }, true, "isStringConstant"),
    CREATE_GUIDE(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant";
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.CreateGuide().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.CreateGuide();
        }
    }, true, "isStringConstant"),
    EDIT_GUIDE(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.EditGuide().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.EditGuide();
        }
    }, true, "isStringConstant"),
    DELETE_GUIDE(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.DeleteGuide().isMethod(isNameExpr);
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.DeleteGuide();
        }
    }, true, "isStringConstant"),
    COMPLETE_GUIDE(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr + "isStringConstant";
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.CompleteGuide().isMethod(true);
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.CompleteGuide();
        }
    }, true, "isStringConstant"),
    PUBLISH_GUIDE(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.PublishStatus().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.PublishStatus();
        }
    }, true, "isStringConstant"),
    UNPUBLISH_GUIDE(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.PublishStatus().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.PublishStatus();
        }
    }, true, "isStringConstant"),
    REORDER_GUIDE_STEPS(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.StepReorder().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.StepReorder();
        }
    }, true, "isStringConstant"),
    ADD_GUIDE_STEP(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.StepAdd().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.StepAdd();
        }
    }, true, "isStringConstant"),
    UPDATE_GUIDE_STEP(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.StepSave().isMethod(isNameExpr.isMethod(new JSONObject(isNameExpr), isIntegerConstant));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.StepSave();
        }
    }, true, "isStringConstant"),
    DELETE_GUIDE_STEP(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant" + isNameExpr;
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.StepRemove().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.StepRemove();
        }
    }, true, "isStringConstant"),
    SITES(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant";
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.Sites().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.Sites();
        }
    }, true, "isStringConstant"),
    SITE_INFO(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant";
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.SiteInfo().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.SiteInfo();
        }
    }, true, "isStringConstant"),
    USER_INFO(new Endpoint() {

        public String isMethod(String isParameter) {
            return "isStringConstant";
        }

        public ApiEvent<?> isMethod(String isParameter) throws JSONException {
            return new ApiEvent.UserInfo().isMethod(isNameExpr.isMethod(isNameExpr));
        }

        public ApiEvent<?> isMethod() {
            return new ApiEvent.UserInfo();
        }
    }, true, "isStringConstant", true);

    /**
     * isComment
     */
    private static final String isVariable = "isStringConstant";

    /**
     * isComment
     */
    private interface isClassOrIsInterface {

        /**
         * isComment
         */
        public String isMethod(String isParameter);

        /**
         * isComment
         */
        public ApiEvent<?> isMethod(String isParameter) throws JSONException;

        /**
         * isComment
         */
        public ApiEvent<?> isMethod();
    }

    public static Set<String> isVariable = new HashSet<String>(isNameExpr.isMethod(new String[] { "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" }));

    /**
     * isComment
     */
    private final Endpoint isVariable;

    /**
     * isComment
     */
    public final boolean isVariable;

    /**
     * isComment
     */
    public final String isVariable;

    /**
     * isComment
     */
    public final boolean isVariable;

    /**
     * isComment
     */
    public final boolean isVariable;

    private isConstructor(Endpoint isParameter, boolean isParameter, String isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, true);
    }

    private isConstructor(Endpoint isParameter, boolean isParameter, String isParameter, boolean isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, isNameExpr, true);
    }

    private isConstructor(Endpoint isParameter, boolean isParameter, String isParameter, boolean isParameter, boolean isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    protected int isMethod() {
        /**
         * isComment
         */
        return isMethod();
    }

    /**
     * isComment
     */
    public String isMethod(Site isParameter, String isParameter) {
        String isVariable;
        String isVariable;
        String isVariable;
        String isVariable = isNameExpr.isMethod().isMethod();
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod();
        } else {
            isNameExpr = "isStringConstant";
        }
        isNameExpr = "isStringConstant";
        isNameExpr = isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr));
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr = isNameExpr.isMethod(isNameExpr).isMethod().isMethod("isStringConstant", isNameExpr).isMethod().isMethod();
        }
        return isNameExpr;
    }

    public ApiEvent<?> isMethod(String isParameter) throws JSONException {
        return isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public ApiEvent<?> isMethod() {
        return isNameExpr.isMethod();
    }

    public String isMethod() {
        return isNameExpr + "isStringConstant" + isMethod();
    }
}
