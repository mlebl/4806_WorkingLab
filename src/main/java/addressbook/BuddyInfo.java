package addressbook;

public class BuddyInfo {

    private Long id;
    private String name;
    private String phone;

    protected BuddyInfo(){
        //Constructor
        name="";
        phone="";
    }

    public BuddyInfo(String Name, String Phone){
        //Constructor
        name=Name;
        phone=Phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, name='%s', phone='%s']",
                id, name, phone);
    }
}
