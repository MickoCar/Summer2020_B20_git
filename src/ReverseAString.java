public class ReverseAString {

    public static void main(String[] args) {


        String str="Milovan";
        String reverse = "";
        for (int i=str.length()-1;i<=0;i++){
            reverse+=i;
        }
        System.out.println(reverse);
    }
}
