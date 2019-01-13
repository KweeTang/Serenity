package net.serenitybdd.tutorials.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.tutorials.model.Category;
import org.openqa.selenium.By;

public class CategoryNavigationBar extends PageObject {
    public void selectCategory(Category category) {

        $("#mainContent > div.hl-cat-nav > ul > li:nth-child(3) > a").click();
    }
}
