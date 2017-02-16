package addressbook;

import java.util.ArrayList;


public class AddressBook  {

    private ArrayList<BuddyInfo> BuddyList;

    public AddressBook() {
        BuddyList = new ArrayList<BuddyInfo>();
    }

    public void setBuddyList(ArrayList<BuddyInfo> buddyList) {
        BuddyList = buddyList;
    }

    public ArrayList<BuddyInfo> getBuddyList() {
        return BuddyList;
    }

    public void addBuddy(BuddyInfo BI){
        BuddyList.add(BI);
    }

    @Override
    public String toString() {
        return "AddressBook.AddressBook{" +
                "BuddyList=" + BuddyList +
                '}';
    }

    /*public static void main(String args[]){
        AddressBook.AddressBook ab1 = new AddressBook.AddressBook();
        AddressBook.BuddyInfo b1 = new AddressBook.BuddyInfo("matt leblanc","613-831");
        AddressBook.BuddyInfo b2 = new AddressBook.BuddyInfo("david leblanc", "613-852");
        ab1.addBuddy(b1);
        ab1.addBuddy(b2);

        System.out.println(ab1);
    }*/


}