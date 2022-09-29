public class XO {
    public static boolean getXO (String str) {
        boolean flag=false;
        int o_number=0;
        int x_number=0;
        if((str.contains("o")||str.contains("O"))&&(str.contains("x")||str.contains("X"))){
            for(int i=0;i<str.length();i++){
                String o=str.charAt(i)+"";
                if(o.trim().equals("o")||o.trim().equals("O")){
                    o_number++;
                }
            }
            for(int i=0;i<str.length();i++){
                String x=str.charAt(i)+"";
                if(x.trim().equals("x")||x.trim().equals("X")){
                    x_number++;
                }
            }
            if(o_number==x_number){
                flag=true;
            }
        }else {
            flag=true;
        }
        if((str.contains("o")||str.contains("O"))&&!(str.contains("x")||str.contains("X"))){
            flag=false;
        }
        if(!(str.contains("o")||str.contains("O"))&&(str.contains("x")||str.contains("X"))){
            flag=false;
        }
        return flag;
    }

    public static boolean getXO2 (String str) {
        str = str.toLowerCase();
        return str.replace("o","").length() == str.replace("x","").length();

    }

    public static void main(String[] args) {
        System.out.println(getXO("xooxx"));
        System.out.println(getXO2("xooxx"));
    }
}
