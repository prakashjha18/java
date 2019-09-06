class Solution {
    public String addBinary(String a, String b) {
         StringBuilder sb = new StringBuilder();
        //two pointers starting from the back of both strings
        int i=a.length()-1;
        int j=b.length()-1;
        //to store carry
        int carry=0;
        //till both the string is traversed
        while(i>=0||j>=0){
            //if there is a carry from the last addition, add it to carry 
            int sum=carry;
            //we subtract '0' to get the int value of the char from the ascii
            if(i>=0){sum=sum+a.charAt(i--)-'0';}
            if(j>=0){sum=sum+b.charAt(j--)-'0';}
            //if sum==2 or sum==0 append 0 cause 1+1=0 in this case  
            sb.append(sum%2);
            //in case sum==2, we have a carry 1
            carry=sum/2;   
        }
        //if atlast carry remains, append it to string
        if (carry != 0) {sb.append(carry);} 
        //reverse it for obvious reasons
        return sb.reverse().toString();
    }
}
