class Caesar {
    String caesar(String s, int n) {
        String result = "";

        n = n % 26;
        for ( int i = 0 ; i < s.length() ; i ++ ) {
            char temp = s.charAt(i);
            //Capital
            if (temp >= 'A' && temp <= 'Z') {
                if ( temp + n > 'Z' ) {
                    result += (char)('A' + (temp+n-'A')%26);
                } else {
                    result += (char)(temp + n);
                }
            //Small
            } else {
                if ( temp + n > 'z' ) {
                    result += (char)('a' + (temp+n-'a')%26);
                } else {
                    result += (char)(temp + n);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Caesar c = new Caesar();
        System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
    }
}