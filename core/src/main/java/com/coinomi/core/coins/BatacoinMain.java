package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author John L. Jegutanis
 */
public class BatacoinMain extends CoinType {
    private BatacoinMain() {
        id = "batacoin.main";

        addressHeader = 25;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 153;

		family = BitFamily.get();
        name = "Batacoin";
        symbol = "BTA";
        uriScheme = "batacoin";
        bip44Index = 92;
        unitExponent = 8;
        feePerKb = value(100000);
        minNonDust = value(1000); // 0.00001 LTC mininput
        softDustLimit = value(100000); // 0.001 LTC
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
    }

    private static BatacoinMain instance = new BatacoinMain();
    public static synchronized BatacoinMain get() {
        return instance;
    }
}
