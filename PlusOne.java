// Plus One
class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i=digits.length - 1; i >= 0; i--) {
            if (digits[i]!=9) {
                digits[i]++;
                break;
            }
	        digits[i] = 0;
        }
        if(digits[0]==0){
            int[]res=new int[digits.length+1];
            res[0]=1;
            return res;
        }
        return digits;
    }
}
