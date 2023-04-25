
public class CapitalizeTitle {
    public static void main(String[] args) {
    String str = "First leTTeR of EACH Word";
        System.out.println(capitalize(str));
    }
    //Capitalize the Title easy (similar to SortSentence);
    static String capitalize(String title){

    String [] s1=title.split(" ");

        for (int i = 0; i < s1.length; i++) {
            if (s1[i].length()<3){
                s1[i]=s1[i].toLowerCase();
            }
            else{
                s1[i]=s1[i].substring(0,1).toUpperCase()+s1[i].substring(1).toLowerCase();
            }
        }
        return ("\""+String.join(" ",s1)+"\"");
    }
}
