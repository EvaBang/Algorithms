class JumpCase {

    public int jumpCase(int num) {
        int answer = 0;
        if ( num == 0 ) return 1;
        else if ( num < 0 ) return 0;
        return jumpCase(num-1) + jumpCase(num-2);
    }
    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 4;
        System.out.println(c.jumpCase(testCase));
    }
}