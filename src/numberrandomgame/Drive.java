package numberrandomgame;

import java.time.LocalDate;

public class Drive {
    public static int level;
    public static int timeTotal;
    public static boolean isSaved;
    public static String name;
    public static LocalDate date;
    
    public static void clean(){
        level = 0;
        isSaved = false;
    }
}
