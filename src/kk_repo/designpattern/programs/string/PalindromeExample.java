package kk_repo.designpattern.programs.string;

class PalindromeExample{

    private static void checkString() {
        String str = "Radar", reverseStr = "";
        int strLength = str.length();
        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverseStr)) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }

    private static void checkNumber() {
        int n=121;//It is the number variable to be checked for palindrome
        int r,sum=0,temp;
        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println(temp + " palindrome number ");
        else
            System.out.println(temp + " not palindrome number");
    }
    public static void main(String[] args){
        checkString();
        checkNumber();
    }
}
