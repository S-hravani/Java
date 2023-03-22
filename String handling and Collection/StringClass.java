

public class StringClass {
    public static void main(String[] args) {
        String name= "Shravani";
        String surname = new String("Panaskar");
        System.out.println("name string = "+name);
        System.out.println(name.concat(surname));
        String concated = name.concat(surname);
        System.out.println(concated);
        System.out.println(concated.charAt(0));
        System.out.println(concated.indexOf('P'));
        System.out.println(concated.lastIndexOf('P'));
        System.out.println(name.length());
        System.out.println(concated.substring(0,4));
        System.out.println(concated.substring(3));
        String fullname = "Shravani Panaskar";
        System.out.println(concated.equals(fullname));
        System.out.println(concated.equalsIgnoreCase(fullname));
        System.out.println(concated.toUpperCase());
        System.out.println(concated.contains("hra"));
        System.out.println(concated.isEmpty());
        System.out.println("comparing with equals() and == ");
        String s1 = "Hey";
        String s2 = "Hey";
        String s3 = new String("Hey");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }

}
