package net.serenitybdd.tutorials.steps;

import net.serenitybdd.tutorials.model.Category;
import net.serenitybdd.tutorials.ui.CategoryNavigationBar;
import net.serenitybdd.tutorials.ui.CurrentPage;
import net.serenitybdd.tutorials.ui.EbayHomePage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigatingUser {

    EbayHomePage ebayHomePage;
    CurrentPage currentPage;
    CategoryNavigationBar categoryNavigationBar;


    // Given
    @Step
    public void isOnTheHomePage() {
        ebayHomePage.open();
    }

    // When
    @Step
    public void navigatesToCategory(Category category){
        categoryNavigationBar.selectCategory(category);
    }

    // Then
    @Step
    public void shouldSeePageTitleContaining(String expectedTitle){
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
    }

}




