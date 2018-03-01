public int hammingDistance(int x, int y) {
        if(x==y) return 0;
        int count=0,i=0;
        String s = Integer.toBinaryString(x^y);
        while(s.length()>i)
            if(s.charAt(i++)=='1') count++;
        return count;
    }
