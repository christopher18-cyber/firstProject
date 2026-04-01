public class Book {

    int pages;
    String title;

    Book(String title,int pages){
        this.pages = pages;
        this.title = title;
    }

    String displayInfo(){
      return this.title + " " + this.pages + " pages.";
    };
}
