class NLCM {
    public long nlcm(int[] num) {
        long answer = 0;
        if (num.length < 2) return 0;

        answer = num[0] * num[1] / gcm(num[0], num[1]);
        for (int i = 2; i < num.length; i++) {
            answer = answer * num[i] / gcm(answer, num[i]);
        }
        return answer;
    }

    public long gcm(long a, long b) {
        if (b == 0) return a;
        return gcm(b, a % b);
    }

    public static void main(String[] args) {
        NLCM c = new NLCM();
        int[] ex = {2, 6, 8, 14}; //���� ���� sorting �ʿ�
        // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(c.nlcm(ex));
    }
}
