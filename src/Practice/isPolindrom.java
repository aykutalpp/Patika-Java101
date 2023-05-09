package Practice;

public class isPolindrom {
    static boolean isPolindrom(int num){
        int temp = num, reversedNum=0, lastNum;
        while(temp!=0){
            lastNum = temp % 10;
            reversedNum = (reversedNum * 10) + lastNum;
            temp /= 10;
        }
        if (reversedNum==num)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        System.out.println(isPolindrom(33));
        System.out.println("Hello GitHub");
    }

}
