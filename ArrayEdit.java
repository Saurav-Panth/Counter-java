
public class ArrayEdit {

    public String counter(String test){
        int highest=0;
        String alph = null;
        for (int i = 0; i < test.length(); i++) {
            char check = test.charAt(i);
            int count = count(test,check);
            if (count>highest){
                highest=count;
                alph = String.valueOf(check);
            }

        }
        return alph+highest;
    }
    public <Char> int count(String text, Char haha){
        int count=0;
        for (int i = 0; i < text.length() ; i++) {
            char check2 = text.charAt(i);
            if(haha.equals(check2)){
                count++;
            }
        }
        return count;
    }
}


