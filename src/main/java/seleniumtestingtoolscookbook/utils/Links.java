package seleniumtestingtoolscookbook.utils;

import java.util.HashMap;

public class Links {

    public static final String TOOLSQA_AUTOMATION_PRACTICE_FORM_PAGE = "http://toolsqa.com/automation-practice-form/";
    public static final String TOOLSQA_ALERTS_PAGE = "http://toolsqa.com/handling-alerts-using-selenium-webdriver/";
    public static final String DEMOQA_SELECTABLE_PAGE = "http://demoqa.com/selectable/";
    public static final String TOOLSQA_AUTOMATION_PRACTICE_TABLE_PAGE = "http://toolsqa.com/automation-practice-table/";
    public static final String DEMOQA_DRAG_DROP_PAGE = "http://demoqa.com/droppable/";
    public static final String TOOLSQA_IFRAME_PAGE = "http://toolsqa.com/iframe-practice-page/";
    public static final String TOOLSQA_SWITCH_WINDOWS_PAGE = "http://toolsqa.com/automation-practice-switch-windows/";
    public static final String GOOGLE_PAGE = "http://www.google.com/ncr";
    public static final String SELENIUMACADEMY_CONFIG_PAGE = "http://cookbook.seleniumacademy.com/Config.html";
    public static final String SELENIUMACADEMY_BMICALCULATOR_PAGE = "http://cookbook.seleniumacademy.com/bmicalculator.html";

    private static final String TOOLSQA_AUTOMATION_PRACTICE_FORM_PAGE_TITLE = "demo form";
    private static final String TOOLSQA_ALERTS_PAGE_TITLE = "toolsqa";
    private static final String DEMOQA_SELECTABLE_PAGE_TITLE = "selectable";
    private static final String TOOLSQA_TABLE_PAGE_TITLE = "demo table";
    private static final String DEMOQA_DRAG_DROP_PAGE_TITLE = "droppable";
    private static final String TOOLSQA_IFRAME_PAGE_TITLE = "toolsqa";
    private static final String TOOLSQA_SWITCH_WINDOWS_PAGE_TITLE = "a new title";
    private static final String GOOGLE_PAGE_TITLE = "google";
    private static final String SELENIUMACADEMY_CONFIG_PAGE_TITLE = "build my car";
    private static final String SELENIUMACADEMY_BMICALCULATOR_PAGE_TITLE = "bmi calculator";

    static HashMap<String, String> getPages() {

        HashMap<String, String> pagesMap = new HashMap<>();

        pagesMap.put(TOOLSQA_AUTOMATION_PRACTICE_FORM_PAGE, TOOLSQA_AUTOMATION_PRACTICE_FORM_PAGE_TITLE);
        pagesMap.put(TOOLSQA_ALERTS_PAGE, TOOLSQA_ALERTS_PAGE_TITLE);
        pagesMap.put(DEMOQA_SELECTABLE_PAGE, DEMOQA_SELECTABLE_PAGE_TITLE);
        pagesMap.put(TOOLSQA_AUTOMATION_PRACTICE_TABLE_PAGE, TOOLSQA_TABLE_PAGE_TITLE);
        pagesMap.put(DEMOQA_DRAG_DROP_PAGE, DEMOQA_DRAG_DROP_PAGE_TITLE);
        pagesMap.put(TOOLSQA_IFRAME_PAGE, TOOLSQA_IFRAME_PAGE_TITLE);
        pagesMap.put(TOOLSQA_SWITCH_WINDOWS_PAGE, TOOLSQA_SWITCH_WINDOWS_PAGE_TITLE);
        pagesMap.put(GOOGLE_PAGE, GOOGLE_PAGE_TITLE);
        pagesMap.put(SELENIUMACADEMY_CONFIG_PAGE, SELENIUMACADEMY_CONFIG_PAGE_TITLE);
        pagesMap.put(SELENIUMACADEMY_BMICALCULATOR_PAGE, SELENIUMACADEMY_BMICALCULATOR_PAGE_TITLE);

        return pagesMap;
    }
}
