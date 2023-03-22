class Student_info
{
        int roll;
        String name;
        Student_info(int r, String nm)
        {
            roll = r;
            name = nm;
        }

        void display()
        {
            System.out.println("Roll no = "+roll);
            System.out.println("Name = "+name);
        }
    }

    public class Student_3
    {
        public static void main(String args[]) {
            Student_info obj = new Student_info(22, "Shravani");
            Student_info obj1 = new Student_info(21, "XYZ");
            obj.display();
            obj1.display();
        }
    }

