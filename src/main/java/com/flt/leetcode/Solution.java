package com.flt.leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * @author fenglingtong
 * @date 2018/5/28
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        if(S.length() > 50 || J.length() > 50){
            throw new RuntimeException("S 和 J 最多含有50个字母");
        }
        char[] chars = S.toCharArray();
        int num = 0;
        for (int i=0; i<chars.length;i++){
            if (J.contains(String.valueOf(chars[i]))){
                num ++;
            }
        }
        return num;
    }

    public boolean judgeCircle(String moves) {
        char[] arr = moves.toCharArray();
        int[] counts = new int[86];
        for(char c : arr){
            counts[c]++;
        }
        return (counts['U'] == counts['D']) && (counts['L'] == counts['R']);
    }

    public int[][] flipAndInvertImage(int[][] A) {
        for (int i=0;i < A.length; i++){
            int[] tem = new int[A[i].length];
            for (int j=0;j<A[i].length;j++){
                tem[j] = A[i][A[i].length - j-1] ^ 1;
            }
            A[i] = tem;
        }
        return A;
    }

    public static int hammingDistance(int x, int y) {
        int z = x ^y;
        String string = Integer.toBinaryString(z);
        String replace = string.replace("0", "");
        return replace.length();
    }

    public int hammingDistance1(int x, int y) {
        int hamming = x ^ y;
        int cnt = 0;
        while(hamming > 0){
            hamming = hamming & (hamming - 1);
            cnt++;
        }
        return cnt;
    }

    public int findComplement(int num) {
        return (~num) & ((Integer.highestOneBit(num) << 1) - 1);
    }

    public int findComplement1(int num) {
        int n=1;
        while(n-num<0&&n<=2147483647){
            n=n*2+1;
        }
        return n-num;
    }

    public static byte[] intToByte(int value){
        byte[] src = new byte[4];
        src[0] = (byte) ((value>>24) & 0xFF);
        src[1] = (byte) ((value>>16)& 0xFF);
        src[2] = (byte) ((value>>8)&0xFF);
        src[3] = (byte) (value & 0xFF);
        return src;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = left;i <= right;i++){
            int m = 1;
            boolean flag = true;
            while (i/m != 0){

                int j = i/m % 10;
                if (j == 0){
                    flag = false;
                    break;
                }
                if(i % j != 0){
                    flag = false;
                    break;
                }
                m = m * 10;
            }
            if(flag){
                arrayList.add(i);
            }

        }
        return arrayList;
    }

    public String reverseString(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = s.length()-1; i >= 0; i--){
            stringBuffer.append(s.charAt(i));
        }
        return stringBuffer.toString();
    }

    public String reverseString1(String s) {
        char[] array = s.toCharArray();
        int length = array.length;
        int pair = length / 2;
        int last;
        for (int i = 0; i < pair; ++i) {
            last = length - i - 1;
            char temp = array[i];
            array[i] = array[last];
            array[last] = temp;
        }
        return new String(array);
    }

    //292. Nim游戏
    public boolean canWinNim(int n) {
        return !(n % 4 == 0);
    }

    //557. 反转字符串中的单词 III
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        for (int i=0; i<length/2;i++){
            char temp = chars[i];
            chars[i] = chars[length - i -1];
            chars[length - i -1] = temp;
        }
        String s1 = new String(chars);
        String[] split = s1.split(" ");
        for (int j= 0 ;j<split.length/2;j++){
            String temp = split[j];
            split[j] = split[split.length - j -1];
            split[split.length - j -1] = temp;
        }
        return String.join(" ",split);
    }

    public String reverseWords1(String s) {
        String[] split1 = s.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0;i<split1.length;i++){
            stringBuilder.append(reverseString1(split1[i]));
            if (i < split1.length -1 ){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    //852. 山脉数组的峰顶索引
    public int peakIndexInMountainArray(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {
                return i ;
            }
        }
        return 0;
    }

    //852. 山脉数组的峰顶索引
    public int peakIndexInMountainArray1(int[] A) {
        return compara(A,0,A.length-1);
    }

    private int compara(int[] A, int first, int end) {
        int i = (first + end)/2;
        if (A[i] > A[i + 1] && A[i-1] < A[i]){
            return i;
        }
        if (A[i] < A[i + 1]){
            first = i;
        } else {
            end = i;
        }
        return compara(A,first,end);
    }

    //    709转换成小写字母
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    //804. 唯一摩尔斯密码词
/*    public int uniqueMorseRepresentations(String[] words) {

    }*/

/*    public int uniqueMorseRepresentations(String[] words) {

    }*/

    public static void main(String[] args) {
        int i = 2;
        int j = 4;
        hammingDistance(i,j);
        System.out.println(i^j);
    }
}
