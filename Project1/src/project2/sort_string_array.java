package project2;

public class sort_string_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,j;
        StringBuilder str = new StringBuilder("hello");
        //String str="Hello";
        for(i=1;i<str.length();i++)
        {
            int T = (int)str.charAt(i);
            char ch = str.charAt(i);
            for(j=i-1;j>=0;j--)
            {
                if((int)str.charAt(j) <= T)
                    break;
                else
                    str.replace(j+1,j+2,str.substring(j,j+1)); 
                  //  str.replace(str, str)
            }
            str.replace(j+1,j+2,Character.toString(ch));
        }
        System.out.println(str);
    }
    
}
