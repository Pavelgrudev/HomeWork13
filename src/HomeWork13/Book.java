package HomeWork13;

import java.util.Objects;

public class Book {
    //public String toString() {}
        // Возвращаем строку в метод Main
        private  Author author;
        private String bookName;
        private int yearOfBook;

        public Book(String bookName, Author authorName,int yearOfBook) {
            this.bookName = bookName;
            this.yearOfBook = yearOfBook;
            this.author=authorName;
        }

        public String getBookName() {
            return bookName;
        }
        public int getYearOfBook() {
            return yearOfBook;}
        public Author getAuthorName(){
            return author;
        }
        public void setYearOfBook(int yearOfBook){
            this.yearOfBook=yearOfBook;}

    public String toString() {
        return "Книга называеться " +this.bookName+this.author+ ", Год выпуска книги  "  +this.yearOfBook+ " .";}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfBook == book.yearOfBook && Objects.equals(author, book.author) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName, yearOfBook);
    }
   }





