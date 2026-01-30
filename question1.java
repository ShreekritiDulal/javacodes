//WAP where you should be passing two variables inside a function with float data type amd performing their addition inside the main function using double data type.
public class question1{

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args){
        float x=10;
        float y=15;
        double add= sum(x,y);
        System.out.println("Addition: "+add);
    }
}