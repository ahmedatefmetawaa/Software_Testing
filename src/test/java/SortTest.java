


public class SortTest extends TestBase{

    HomePage homePage;
    SortPage sortPage;
    public void ValidSortingTC (){

      homePage  = new HomePage(driver);
      sortPage = homePage.ClickSearchButton("web-development");
      sortPage.clickonsortrelevant();
      sortPage.clickonsortnewest();
      sortPage.clickonsortrates();
      sortPage.clickonsortreviews();


    }

}

