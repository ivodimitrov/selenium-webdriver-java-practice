package utils;

import java.util.HashMap;

public class Links {

    public static final String HOME_PAGE = "http://toolsqa.com/automation-practice-form/";
    public static final String ALERTS_PAGE = "http://toolsqa.com/handling-alerts-using-selenium-webdriver/";
    public static final String SELECTABLE_PAGE = "http://demoqa.com/selectable/";
    public static final String TABLE_PAGE = "http://toolsqa.com/automation-practice-table/";
    public static final String DRAG_DROP_PAGE = "http://demoqa.com/droppable/";
    public static final String IFRAME_PAGE = "http://toolsqa.com/iframe-practice-page/";
    public static final String SWITCH_WINDOWS_PAGE = "http://toolsqa.com/automation-practice-switch-windows/";
    public static final String GMAIL_PAGE = "https://www.google.com/gmail/about/";
    public static final String GOOGLE_PAGE = "http://www.google.com/ncr";
    public static final String CONFIG_PAGE = "http://cookbook.seleniumacademy.com/Config.html";

    private static final String HOME_PAGE_TITLE = "demo form";
    private static final String ALERTS_PAGE_TITLE = "toolsqa";
    private static final String SELECTABLE_PAGE_TITLE = "selectable";
    private static final String TABLE_PAGE_TITLE = "demo table";
    private static final String DRAG_DROP_PAGE_TITLE = "droppable";
    private static final String IFRAME_PAGE_TITLE = "toolsqa";
    private static final String SWITCH_WINDOWS_PAGE_TITLE = "a new title";
    private static final String GMAIL_PAGE_TITLE = "gmail";
    private static final String GOOGLE_PAGE_TITLE = "google";
    private static final String CONFIG_PAGE_TITLE = "build my car";

    static HashMap<String, String> getPages() {

        HashMap<String, String> pagesMap = new HashMap<String, String>();

        pagesMap.put(HOME_PAGE, HOME_PAGE_TITLE);
        pagesMap.put(ALERTS_PAGE, ALERTS_PAGE_TITLE);
        pagesMap.put(SELECTABLE_PAGE, SELECTABLE_PAGE_TITLE);
        pagesMap.put(TABLE_PAGE, TABLE_PAGE_TITLE);
        pagesMap.put(DRAG_DROP_PAGE, DRAG_DROP_PAGE_TITLE);
        pagesMap.put(IFRAME_PAGE, IFRAME_PAGE_TITLE);
        pagesMap.put(SWITCH_WINDOWS_PAGE, SWITCH_WINDOWS_PAGE_TITLE);
        pagesMap.put(GMAIL_PAGE, GMAIL_PAGE_TITLE);
        pagesMap.put(GOOGLE_PAGE, GOOGLE_PAGE_TITLE);
        pagesMap.put(CONFIG_PAGE, CONFIG_PAGE_TITLE);

        return pagesMap;
    }
}
