package utils;

import java.util.HashMap;

public class Links {

    public static final String HOME_PAGE = "http://toolsqa.com/automation-practice-form/";
    private static final String HOME_PAGE_TITLE = "demo form";

    public static final String ALERTS_PAGE = "http://toolsqa.com/handling-alerts-using-selenium-webdriver/";
    private static final String ALERTS_PAGE_TITLE = "toolsqa";

    public static final String SELECTABLE_PAGE = "http://demoqa.com/selectable/";
    private static final String SELECTABLE_PAGE_TITLE = "selectable";

    public static final String TABLE_PAGE = "http://toolsqa.com/automation-practice-table/";
    private static final String TABLE_PAGE_TITLE = "demo table";

    public static final String DRAG_DROP_PAGE = "http://demoqa.com/droppable/";
    private static final String DRAG_DROP_PAGE_TITLE = "droppable";

    public static final String GMAIL_PAGE = "https://www.google.com/gmail/about/";
    private static final String GMAIL_PAGE_TITLE = "gmail";

    public static final String GOOGLE_PAGE = "http://www.google.com/ncr";
    private static final String GOOGLE_PAGE_TITLE = "google";

    static HashMap<String, String> getPages() {

        HashMap<String, String> pagesMap = new HashMap<String, String>();

        pagesMap.put(HOME_PAGE, HOME_PAGE_TITLE);
        pagesMap.put(ALERTS_PAGE, ALERTS_PAGE_TITLE);
        pagesMap.put(SELECTABLE_PAGE, SELECTABLE_PAGE_TITLE);
        pagesMap.put(TABLE_PAGE, TABLE_PAGE_TITLE);
        pagesMap.put(DRAG_DROP_PAGE, DRAG_DROP_PAGE_TITLE);
        pagesMap.put(GMAIL_PAGE, GMAIL_PAGE_TITLE);
        pagesMap.put(GOOGLE_PAGE, GOOGLE_PAGE_TITLE);

        return pagesMap;
    }
}
