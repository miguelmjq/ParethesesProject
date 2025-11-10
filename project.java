class project {
    public static void main(String[] args) {
            System.out.println(check("]()[]"));
    }

    public static boolean check(String input) {
        
        int b, n = 0;
        char [] m= input.toCharArray();
        String c="";
        { //check for instant false
        c = input.substring(input.length()-1, input.length() );
        if (c.equals("(") || c.equals("[") || c.equals("{")) {
            return false;
        }
        c = input.substring(0, 1);
        if (c.equals(")") || c.equals("]") || c.equals("}")) {
           return false;
        }
    }

    

        return true;
    }

}