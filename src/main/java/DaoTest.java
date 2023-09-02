import daos.Ads;
import daos.DaoFactory;
import daos.MySQLAdsDao;
import models.Ad;

import java.util.List;

public class DaoTest {
    public static void main(String[] args) {

        Ads adsDao = DaoFactory.getAdsDao();
        List<Ad> adObjects = adsDao.all();

        for(Ad ad: adObjects) {
            System.out.println(ad.getId() + " " + ad.getUserId() + " " + ad.getTitle() + " " + ad.getDescription());
        }

    }
}
