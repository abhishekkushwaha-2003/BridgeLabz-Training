package Day2.DealTracker;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DealReader {

    private static final Pattern CODE =
            Pattern.compile("DealCode:\\s*(.*)");
    private static final Pattern DATE =
            Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");
    private static final Pattern DISCOUNT =
            Pattern.compile("Discount:\\s*(\\d+)%");
    private static final Pattern MIN_PURCHASE =
            Pattern.compile("MinimumPurchase:\\s*(\\d+)");

    public static Deal readDeal(String filePath) {

        String content = "";

        try (FileInputStream fis = new FileInputStream(filePath)) {

            int ch;
            while ((ch = fis.read()) != -1) {
                content += (char) ch;
            }

        } catch (Exception e) {
            return null;
        }

        Matcher mCode = CODE.matcher(content);
        Matcher mDate = DATE.matcher(content);
        Matcher mDiscount = DISCOUNT.matcher(content);
        Matcher mMin = MIN_PURCHASE.matcher(content);

        if (mCode.find() && mDate.find()
                && mDiscount.find() && mMin.find()) {

            return new Deal(
                    mCode.group(1),
                    mDate.group(1),
                    Integer.parseInt(mDiscount.group(1)),
                    Integer.parseInt(mMin.group(1))
            );
        }

        return null;
    }

    public static boolean isExpired(String date) {

        LocalDate expiry =
                LocalDate.parse(date,
                        DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        return expiry.isBefore(LocalDate.now());
    }
}
