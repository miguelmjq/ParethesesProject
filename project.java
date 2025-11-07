class project {
    public static void main(String[] args) {

    }

    public static boolean check(String input) {
        int b, n = 0;
        String c = input.substring(0, 1);
        if (c.equals(")") || c.equals("]") || c.equals("}")) {
            return false;
        }

        return true;
    }

}