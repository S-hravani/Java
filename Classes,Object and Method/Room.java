public class Room {
    int roomno;
    String roomtype;
    float roomarea;
    boolean acmachine;

    void setdata(int rno, String rtype, float rarea, boolean ac)
    {
        roomno = rno;
        roomtype = rtype;
        roomarea = rarea;
        acmachine = ac;
    }

    void display()
    {
        System.out.println(" Room number is = "+roomno);
        System.out.println(" Room type is = "+roomtype);
        System.out.println(" Room area is = "+roomarea);
        String s = (acmachine) ? "Yes" : "No";
        System.out.println("AC Machine needed = "+s);
    }

    public static void main(String args[])
    {
        Room obj = new Room();
        obj.setdata(220,"Deluxe",280.0f,true);
        obj.display();
    }
}
