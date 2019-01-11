// isComment
package de.koelle.christian.trickytripper.dataaccess;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import de.koelle.christian.trickytripper.model.CurrenciesUsed;
import de.koelle.christian.trickytripper.model.ExchangeRate;
import de.koelle.christian.trickytripper.model.Participant;
import de.koelle.christian.trickytripper.model.Payment;
import de.koelle.christian.trickytripper.model.Trip;
import de.koelle.christian.trickytripper.model.TripSummary;

public interface isClassOrIsInterface {

    boolean isMethod(String isParameter, long isParameter);

    boolean isMethod(String isParameter, long isParameter, long isParameter);

    boolean isMethod();

    List<TripSummary> isMethod();

    Trip isMethod(long isParameter);

    Trip isMethod(Trip isParameter);

    Trip isMethod(TripSummary isParameter);

    Participant isMethod(long isParameter, Participant isParameter);

    Payment isMethod(long isParameter, Payment isParameter);

    void isMethod(TripSummary isParameter);

    void isMethod(long isParameter);

    boolean isMethod(long isParameter);

    boolean isMethod(long isParameter);

    ArrayList<String> isMethod(long isParameter);

    /*isComment*/
    List<ExchangeRate> isMethod(Currency isParameter, Currency isParameter);

    List<ExchangeRate> isMethod();

    ExchangeRate isMethod(Long isParameter);

    boolean isMethod(List<ExchangeRate> isParameter);

    ExchangeRate isMethod(ExchangeRate isParameter);

    boolean isMethod(ExchangeRate isParameter);

    void isMethod(ExchangeRate isParameter, boolean isParameter);

    void isMethod(ExchangeRate isParameter);

    /*isComment*/
    CurrenciesUsed isMethod(Currency isParameter);

    void isMethod();
}
