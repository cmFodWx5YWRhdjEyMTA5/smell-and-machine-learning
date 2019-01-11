// isComment
package net.cyclestreets.api.client;

import android.content.Context;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.github.tomakehurst.wiremock.verification.LoggedRequest;
import net.cyclestreets.api.ApiClient;
import net.cyclestreets.api.Blog;
import net.cyclestreets.api.GeoPlace;
import net.cyclestreets.api.GeoPlaces;
import net.cyclestreets.api.POI;
import net.cyclestreets.api.POICategories;
import net.cyclestreets.api.POICategory;
import net.cyclestreets.api.Photo;
import net.cyclestreets.api.PhotomapCategories;
import net.cyclestreets.api.PhotomapCategory;
import net.cyclestreets.api.Photos;
import net.cyclestreets.api.Result;
import net.cyclestreets.api.Signin;
import net.cyclestreets.api.Upload;
import net.cyclestreets.api.UserJourney;
import net.cyclestreets.api.UserJourneys;
import net.cyclestreets.core.R;
import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osmdroid.util.GeoPoint;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import static com.github.tomakehurst.wiremock.client.WireMock.findAll;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor;
import static net.cyclestreets.api.Photo.Video;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.getRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.matching;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Config(manifest = isNameExpr.isFieldAccessExpr, sdk = isIntegerConstant)
@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    @Rule
    public WireMockRule isVariable = new WireMockRule(isIntegerConstant);

    private RetrofitApiClient isVariable;

    @Before
    public void isMethod() throws Exception {
        // isComment
        File isVariable = new File("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        Context isVariable = isMethod(Context.class);
        isMethod(isNameExpr.isMethod()).isMethod(new File("isStringConstant"));
        isNameExpr = new RetrofitApiClient.Builder().isMethod("isStringConstant").isMethod(isNameExpr).isMethod("isStringConstant").isMethod("isStringConstant").isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        // isComment
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod(isMethod().isMethod(isIntegerConstant).isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant")));
        // isComment
        POICategories isVariable = isNameExpr.isMethod(isIntegerConstant);
        // isComment
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            isNameExpr.isMethod(isIntegerConstant);
        }
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
        POICategory isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod(isMethod()));
        // isComment
        List<LoggedRequest> isVariable = isMethod(isMethod(isMethod("isStringConstant")));
        isMethod(isNameExpr, isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod(isMethod().isMethod(isIntegerConstant).isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant")));
        // isComment
        List<POI> isVariable = isNameExpr.isMethod("isStringConstant", isDoubleConstant, isDoubleConstant, isDoubleConstant, isDoubleConstant);
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")));
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod(isMethod().isMethod(isIntegerConstant).isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant")));
        // isComment
        List<POI> isVariable = isNameExpr.isMethod("isStringConstant", isDoubleConstant, isDoubleConstant, isIntegerConstant);
        // isComment
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            isNameExpr.isMethod("isStringConstant", isDoubleConstant, isDoubleConstant, isIntegerConstant);
        }
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")));
        isMethod(isNameExpr);
        // isComment
        List<LoggedRequest> isVariable = isMethod(isMethod(isMethod("isStringConstant")));
        isMethod(isNameExpr, isMethod(isIntegerConstant));
    }

    private static void isMethod(List<POI> isParameter) {
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
        // isComment
        POI isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod(new GeoPoint(isDoubleConstant, isDoubleConstant)));
        // isComment
        isNameExpr = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod(new GeoPoint(isDoubleConstant, isDoubleConstant)));
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod(isMethod().isMethod(isIntegerConstant).isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant")));
        // isComment
        UserJourneys isVariable = isNameExpr.isMethod("isStringConstant");
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
        UserJourney isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod(isMethod().isMethod(isIntegerConstant).isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant")));
        // isComment
        Photos isVariable = isNameExpr.isMethod(isDoubleConstant, isDoubleConstant, isDoubleConstant, isDoubleConstant);
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")));
        Iterator<Photo> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        Photo isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod(new GeoPoint(isDoubleConstant, isDoubleConstant)));
        isMethod(isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr.isMethod(), isMethod(true));
        List<Video> isVariable = (List<Video>) isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
        Video isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod(isMethod().isMethod(isIntegerConstant).isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant")));
        // isComment
        GeoPlaces isVariable = isNameExpr.isMethod("isStringConstant", isDoubleConstant, isDoubleConstant, isDoubleConstant, isDoubleConstant);
        // isComment
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            isNameExpr.isMethod("isStringConstant", isDoubleConstant, isDoubleConstant, isDoubleConstant, isDoubleConstant);
        }
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(), isMethod(isIntegerConstant));
        GeoPlace isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod(new GeoPoint(isDoubleConstant, isDoubleConstant)));
        // isComment
        List<LoggedRequest> isVariable = isMethod(isMethod(isMethod("isStringConstant")));
        isMethod(isNameExpr, isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod(isMethod().isMethod(isIntegerConstant).isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant")));
        // isComment
        Result isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant");
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod(isMethod().isMethod(isIntegerConstant).isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant")));
        // isComment
        Result isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant");
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod(isMethod().isMethod(isIntegerConstant).isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant")));
        // isComment
        Signin.Result isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant");
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod(isMethod().isMethod(isIntegerConstant).isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant")));
        // isComment
        Result isVariable = isNameExpr.isMethod(isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant");
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod(isMethod().isMethod(isIntegerConstant).isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant")));
        // isComment
        PhotomapCategories isVariable = isNameExpr.isMethod();
        // isComment
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            isNameExpr.isMethod();
        }
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod().isMethod(), isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod().isMethod(), isMethod(isIntegerConstant));
        PhotomapCategory isVariable = isNameExpr.isMethod().isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        PhotomapCategory isVariable = isNameExpr.isMethod().isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        // isComment
        List<LoggedRequest> isVariable = isMethod(isMethod(isMethod("isStringConstant")));
        isMethod(isNameExpr, isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod(isMethod().isMethod(isIntegerConstant).isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant")));
        // isComment
        Upload.Result isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant", -isDoubleConstant, isIntegerConstant, isIntegerConstant, "isStringConstant", "isStringConstant", "isStringConstant", null);
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")));
        isMethod(isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod(isMethod().isMethod(isIntegerConstant).isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant")));
        // isComment
        String isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant", null, isIntegerConstant);
        // isComment
        // isComment
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")));
        isMethod(isNameExpr, isMethod(isMethod()));
        isMethod(isNameExpr, isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod(isMethod().isMethod(isIntegerConstant).isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant")));
        // isComment
        Blog isVariable = isNameExpr.isMethod();
        // isComment
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            isNameExpr.isMethod();
        }
        // isComment
        isMethod(isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")));
        isMethod(isNameExpr, isMethod(isMethod()));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(), isMethod("isStringConstant"));
        // isComment
        List<LoggedRequest> isVariable = isMethod(isMethod(isMethod("isStringConstant")).isMethod("isStringConstant", isMethod("isStringConstant")));
        isMethod(isNameExpr, isMethod(isIntegerConstant));
    }
}
