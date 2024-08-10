// generics
class Test<T>{
    int val1;
    T val2;

    Test(int val1, T val2){
        this.val1 = val1;
        this.val2 = val2;
    }

    void getVal(){
        System.out.println(val1);
        System.out.println(val2);
    }
}
public class program3 {
    public static void main(String[] args) {
        Test<String> obj = new Test<String>(10,"str");
        obj.getVal();

        Test<Double> obj1 = new Test<>(20,20.2);
        obj1.getVal();
    }
}
