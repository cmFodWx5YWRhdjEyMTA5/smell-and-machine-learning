// isComment
package com.brentpanther.bitcoinwidget;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class isClassOrIsInterface extends RecyclerView.Adapter<CoinSelectionAdapter.ViewHolder> {

    private CoinSelectionView.CoinSelectedListener isVariable;

    private final ArrayList<Coin> isVariable;

    static class isClassOrIsInterface extends RecyclerView.ViewHolder {

        isConstructor(CoinSelectionView isParameter) {
            super(isNameExpr);
        }
    }

    isConstructor(CoinSelectionView.CoinSelectedListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        isNameExpr = new ArrayList<>(isNameExpr.isMethod(Coin.class));
        isNameExpr.isMethod(isNameExpr, (isParameter, isParameter) -> isNameExpr.isMethod().isMethod(isNameExpr.isMethod()));
    }

    @NonNull
    @Override
    public CoinSelectionAdapter.ViewHolder isMethod(@NonNull ViewGroup isParameter, int isParameter) {
        return new ViewHolder(new CoinSelectionView(isNameExpr.isMethod()));
    }

    @Override
    public void isMethod(@NonNull ViewHolder isParameter, int isParameter) {
        ((CoinSelectionView) isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod().isFieldAccessExpr;
    }
}
