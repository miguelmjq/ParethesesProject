class project {
    public static void main(String[] args) {
        System.out.println(isValid("(){}[]")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([{({})}])")); // true
        System.out.println(isValid("(([]){})")); // true
        System.out.println(isValid("{}[())()(]")); // false
        System.out.println(isValid("(){}{")); // false
        System.out.println(isValid("([)]")); // false
        System.out.println(isValid("([{}([)])]")); // false

    }

    public static boolean isValid(String input) {

        int b, n, d = 0;
        int index;
        StringBuilder et = new StringBuilder(input);
        String c = "";
        String c2 = "";

        { // check for instant false
            c = input.substring(0, 1);
            if (input.length() % 2 != 0) {
                return false;
            }
        }

        while (et.length()>0){
            b = et.lastIndexOf("(");
            n = et.lastIndexOf("[");
            d = et.lastIndexOf("{");
            index = Math.max(b, Math.max(n,d));
            c = et.substring(index);
            c2 = et.substring(index+1);
            //(
            if (index==b){
                if (c.equals(c2)){
                    
                }
            }
            //[
            else if (index==n){

            }
            //{
            else if (index==d){

            }
        }

        return true;
    }

}