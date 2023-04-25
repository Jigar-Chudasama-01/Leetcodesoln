public class bitchars {
    public static void main(String[] args) {

    }
//    Yet to complete
    static boolean bitchar(int [] arr){
        int count=0;
        if(arr.length==1){
            return  true;
        }
        for(int i=0; i<arr.length-1; i++){
            if (i!=arr.length-2 && arr[i]==1 && (arr[i+1] ==0 || arr[i+1] ==1) ){
                count++;
            }
        }
        return arr.length / 2 != count;

    }

}
