package LunguFlorin;


import LunguFlorin.Lab4.AudioBook;
import LunguFlorin.Lab4.BookDemo;

/**
 * J9. Va rog sa definiti Pachetul Lab4 continand Interfata Book si Clasele BookDemo si AudioBook pe care sa le folositi din exteriorul
 * Pachetului instantiind 2 obiecte de tip BookDemo si AudioBook.
 */
public class J9 {
    public static void main(String... args) {
        //obiectele nu pot fi instantiate in afara pachetului fara a avea un constructor public
        BookDemo bookDemo = new BookDemo("Repair Revolution: How Fixers Are Transforming Our Throwaway Culture",2020,"John Wackman, Elizabeth Knight");
        AudioBook audioBook = new AudioBook("Lev Tolstoi",1869,"Razboi si pace",false);
        BookDemo bookDemo1 = new BookDemo();

    }
}
