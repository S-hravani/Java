public class Variable{
    static int  num1=200;//static variable default val =0
    String name="Shravani";//instance var
    void method (){
        float num2=200.123f ;//local variable initialze is reqd
        System.out.println("value of local var num2 "+num2);

    }
    public static void main(String args[]){
        Variable obj1=new Variable();
        obj1.method();
        System.out.println("value of Static var num1 "+num1);
        System.out.println("value of Static var num1 "+Variable.num1);
        System.out.println("value of instance  var "+obj1.name);

    }

}
