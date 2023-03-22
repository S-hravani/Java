public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Shravani");
        System.out.println(name);
        System.out.println(name.append("Panaskar"));
        System.out.println(name);
        System.out.println(name.insert(8,"Arun"));
        System.out.println(name.replace(8,23,"lives in Pune"));
        System.out.println(name.reverse());
        System.out.println(name.length());
        StringBuffer s1 = new StringBuffer();
        System.out.println(s1.length());
        System.out.println(s1.capacity());
        s1.append("my name is shravani");
        System.out.println(s1.length());
        System.out.println(s1.capacity());
        s1.delete(3,9);
        System.out.println(s1);

    }
}

