public class LargestLexoString {
    public static void main(String[] args) {
        String s[] = {"apple", "mango", "banana"};
        String largest = s[0];
        for(int i=0 ; i<s.length ; i++){
            if(largest.compareToIgnoreCase(s[i])<0){
                largest=s[i];
            }
        }
        System.out.println("Largest String is: "+largest);
    }
}
