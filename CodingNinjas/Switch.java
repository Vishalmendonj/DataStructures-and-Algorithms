package CodingNinjas;

public class Switch {
    public static String replace(String str, char ch1, char ch2){
        String word = "";
        for(int i=0; i<str.length(); i++){
            char letter = str.charAt(i);
            if(letter==ch1){
                word+=ch2;
            }
            else if(letter==ch2){
                
                word+=ch1;
            }
            else{
                word+=letter;
            }

        }

        return word;
    }
    public static void main(String[] args) {
        System.out.println(replace("vishal", 'v', 'i'));
        
    }
}
