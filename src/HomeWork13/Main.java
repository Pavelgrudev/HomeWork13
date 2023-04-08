package HomeWork13;

import com.sun.security.jgss.AuthorizationDataEntry;

public class Main {


    public static void main(String[] args) {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book(" War And Peace", levTolstoy, 1867);
        System.out.println("Книга называется  " + warAndPeace.getBookName() + " написал " + levTolstoy + " в " + warAndPeace.getYearOfBook() + " году.");
        System.out.println("написал " + levTolstoy);
        System.out.println("warAndPeace.name1  = " + warAndPeace.getBookName());
        System.out.println("warAndPeace =  " + warAndPeace.getYearOfBook());
        warAndPeace.setYearOfBook(2000);
        System.out.println("warAndPeace.yearOfBook = " + warAndPeace.getYearOfBook());
        Author vasyaPupkin = new Author("Vasya", "Pupkin");
        Book warAndWar = new Book("War And War", vasyaPupkin, 1995);
        System.out.println("Книга называется War And WAR , Написал  Vasya Pupkin в 1995");
        Author petyaLupkin = new Author("Petya", "Lupkin");
        Book catAndDog = new Book("Cat and dog", petyaLupkin, 2005);
        System.out.println("Cat and dog= " + catAndDog.getYearOfBook());
        System.out.println("книга называется Cat and dog написал" + petyaLupkin + " в 2005 году");
        catAndDog.setYearOfBook(2010);
        System.out.println(catAndDog.getYearOfBook());
        System.out.println("===========================================================================");
        System.out.println(warAndWar);
        System.out.println(catAndDog);
        System.out.println(warAndPeace);
        System.out.println(warAndPeace.equals(warAndPeace));
        System.out.println(levTolstoy.equals(levTolstoy));
        System.out.println(levTolstoy.equals(petyaLupkin));
        System.out.println(warAndPeace.hashCode());
        System.out.println(warAndPeace.hashCode());
        System.out.println(petyaLupkin.hashCode());
        System.out.println(petyaLupkin.hashCode());
    }
}

