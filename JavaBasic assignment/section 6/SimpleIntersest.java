public class SimpleIntersest {
    public double calulatesimpleinterest(double principle,double rate,double time){
        return (principle*rate*time)/100;
    }
    public static void main(String[] args) {
        SimpleIntersest si=new SimpleIntersest();
        double result=si.calulatesimpleinterest(5000, 4,3 );
        System.out.println("Simple Interest:"+result);
    }
}
