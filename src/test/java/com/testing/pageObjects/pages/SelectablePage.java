package com.testing.pageObjects.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("/selectable")
public class SelectablePage extends InteractionPage {
    public static By SELECTABLE_TITLE = text("Selectable");
    public static By LIST_TAB = css("a[id='demo-tab-list']");
    public static By GRID_TAB = css("a[id='demo-tab-grid']");
    public static By CRAS_JUSTO_ODIO = text("Cras justo odio");


    @Override
    public void waitForPageToLoad() {
        getElement(SELECTABLE_TITLE).waitUntilPresent();
        logWeAreOnPage();
    }
}
