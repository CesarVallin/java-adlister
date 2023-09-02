package daos;

import daos.Ads;
import utils.Config;

/** There is no instance of the DaoFactory
 * It is static through and through,
 * it only has static methods & static properties.
 * */
public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(new Config());
        }
        return adsDao;
    }
}
