// isComment
package de.geeksfactory.opacclient.apis;

import org.json.JSONException;
import java.io.IOException;
import de.geeksfactory.opacclient.objects.Account;
import de.geeksfactory.opacclient.objects.AccountData;
import de.geeksfactory.opacclient.objects.DetailedItem;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends ApacheBaseApi {

    @Override
    public final ReservationResult isMethod(DetailedItem isParameter, Account isParameter, int isParameter, String isParameter) throws IOException {
        return null;
    }

    @Override
    public final ProlongResult isMethod(String isParameter, Account isParameter, int isParameter, String isParameter) throws IOException {
        return null;
    }

    @Override
    public final ProlongAllResult isMethod(Account isParameter, int isParameter, String isParameter) throws IOException {
        return null;
    }

    @Override
    public final CancelResult isMethod(String isParameter, Account isParameter, int isParameter, String isParameter) throws IOException, OpacErrorException {
        return null;
    }

    @Override
    public final AccountData isMethod(Account isParameter) throws IOException, JSONException, OpacErrorException {
        return null;
    }

    @Override
    public final void isMethod(Account isParameter) throws IOException, JSONException, OpacErrorException {
    }
}
