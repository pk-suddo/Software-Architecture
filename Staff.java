public class Staff {
    private int staffNumber;
    private Name name;

    public Staff(int staffNumber, Name name) {
        this.staffNumber = staffNumber;
        this.name = name;
    }





    @Override
    public String toString() {
        return "Staff number: " + staffNumber + ", Name: " + name.toString();
    }
}
