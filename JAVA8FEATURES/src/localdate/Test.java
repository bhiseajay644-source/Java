package localdate;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

       /* LocalDate startDate=LocalDate.of(2026,9,1);
        LocalDate endDate=LocalDate.of(2028,1,1);

        System.out.println("Difference in days : "+ChronoUnit.DAYS.between(startDate,endDate));
        System.out.println("Difference in months : "+ChronoUnit.MONTHS.between(startDate,endDate));
        System.out.println("Difference in years : "+ChronoUnit.YEARS.between(startDate,endDate));

        LocalDate date=LocalDate.now();
        */
      /*  long a=System.currentTimeMillis();
        Set<String> availableZoneIds= ZoneId.getAvailableZoneIds();
        for(
                String zoneid:availableZoneIds
        ){
            System.out.println(zoneid);
        }
        long b=System.currentTimeMillis();
        System.out.println(b-a);*/

        Set<String> availablezoneids=ZoneId.getAvailableZoneIds();
        availablezoneids.stream().forEach(System.out::println);
    }
}
