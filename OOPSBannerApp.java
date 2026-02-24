/**
 * OOPS Banner App - UC5
 *
 * Displays OOPS banner using array initialization with String.join()
 *
 * @author Mohith
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
            String.join("", " *****", "   *****", "   *****", "   ***** "),
            String.join("", "*     *", " *     *", " *     *", " *     *"),
            String.join("", "*     *", " *     *", " *     *", " *     *"),
            String.join("", "*     *", " *     *", " *     *", " *     *"),
            String.join("", "*     *", " *     *", " *     *", " *     *"),
            String.join("", "*     *", " *     *", " *     *", " *     *"),
            String.join("", " *****", "   *****", "   *****", "   ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}