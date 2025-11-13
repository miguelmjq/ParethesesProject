//  Class author:  Miguel Mirabal Q
//  Date created:  11/7/25
//  General description: the project takes a string of parentheses and declares whether it is valid or not

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

    //precon: a string that contains only the characters 
    //poscon: a boolean true or false that declares if it is valid
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

        while (et.length() > 0) {
            b = et.lastIndexOf("(");
            n = et.lastIndexOf("[");
            d = et.lastIndexOf("{");
            index = Math.max(b, Math.max(n, d));
            c = et.substring(index, index + 1);
            c2 = et.substring(index + 1, index + 2);
            if (et.length() == 1) {
                return false;
            }
            if (c.equals("(")) {

                if (c2.equals(")")) {
                    et.delete(index, index + 2);

                } else {
                    return false;
                }
            }
            else if (c.equals("[")) {

                if (c2.equals("]")) {
                    et.delete(index, index + 2);

                } else {
                    return false;
                }
            }
            else if (c.equals("{")) {

                if (c2.equals("}")) {
                    et.delete(index, index + 2);

                } else {
                    return false;
                }
            }
        }

        return true;
    }

}