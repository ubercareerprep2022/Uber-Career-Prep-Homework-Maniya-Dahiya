package Exercise5;

import java.util.ArrayList;
import java.util.List;

import Exercise5.Exercise5.PhoneBook;

public class ListPhoneBook implements PhoneBook{
    List<PhoneBook> listBook = new ArrayList<PhoneBook>();
    /**
    * @return The number of entries in this phone book.
    */
    public int size(){
        return listBook.size();
    }
    /**
    * Inserts an entry in this phone book.
    * @param name The name for the entry.
    * @param phoneNumber The phone number for the entry.
    */
    public void insert(String name, long phoneNumber){
        listBook.add((PhoneBook) new directory(name, phoneNumber));
    }
    /**
    * Returns the phone number associated with a name in the phone
    book.
    * @param name The name to search for.
    * @return The phone number for the entry, or -1 if the name is not
    present in the phone book.
    */
    public long find(String name){
        for (PhoneBook d : listBook){
            if(d.getName() == name) { return d.getPhoneNumber();}
        } return -1;
    }
    
}
