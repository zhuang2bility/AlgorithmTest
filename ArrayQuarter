import java.util.*;
/**
 * Created by shizhuangzhuang on 2017/3/6.
 * 对于一个长度为N的整型数组A， 数组里所有的数都是正整数，对于两个满足0<=X <= Y <N的整数，A[X], A[X+1] … A[Y]构成A的一个切片，记作(X, Y)。
 用三个下标 m1, m2, m3下标满足条件 0 < m1, m1 + 1 < m2, m2 +1 < m3 < N – 1。
 可以把这个整型数组分成(0, m1-1), (m1+1, m2-1), (m2+1, m3-1), (m3+1, N-1) 四个切片。
 如果这四个切片中的整数求和相等，称作“四等分”。
 编写一个函数，求一个给定的整型数组是否可以四等分，如果可以，返回一个布尔类型的true，如果不可以返回一个布尔类型的false。
 限制条件： 数组A最多有1,000,000项，数组中的整数取值范围介于-1,000,000到1,000,000之间。
 要求： 函数的计算复杂度为O(N)，使用的额外存储空间（除了输入的数组之外）最多为O(N)。
 例子：
 对于数组A=[2, 5, 1, 1, 1, 1, 4, 1, 7, 3, 7] 存在下标 2, 7, 9使得数组分成四个分片[2, 5], [1, 1, 1, 4], [7], [7]，
 这四个分片内整数之和相等，所以对于这个数组，函数应该返回true。
 对于数组 A=[10, 2, 11, 13, 1, 1, 1, 1, 1]， 找不到能把数组四等分的下标，所以函数应该返回false。

 思路：删除三个元素，等分为四等份
 */
public class ArrayQuarter {
    static boolean solve(int[] A){
        int[] re=findValLocate(A);
        System.out.println("寻找完毕，开始检查："+Arrays.toString(re));
        re[2]=checkingFind(A,re[0],re[1]+1,re[3]-1);
        System.out.println("检查："+Arrays.toString(re));
        int v3=checkingFind(A,re[0],re[2]+1,re[3]);
        if(re[3]==v3){
            return true;
        }
        return false;
    }

    static int checkingFind(int[] A,int val,int begin,int end){
        int s=0;
        for(int i=begin;i<end;i++){
            s=s+A[i];
            if(s==val){
                return i+1;
            }
        }
        return -1;
    }

    //返回均分值和第一，三切点
    static int[] findValLocate(int[] A){
        int v1=0,v4=0;
        for(int i=0,j=A.length-1;i<j;){
            if(v1<v4){
                v1=v1+A[i];
                ++i;
            }else if(v1>v4){
                v4=v4+A[j];
                --j;
            }else{
                int m=A.length-3-(i+1+A.length-j);
                if(m>=2&&m<=2*v1){
                    int[] re={v1,i,0,j};
                    return re;
                }else{
                    v1=v1+A[i];
                    ++i;
                }
            }
        }
        return null;
    }

    public static void main(String[] args){
        int[] A={1,1,1,1,10,1,3,1,1,2,1,5,2,2};
        Boolean res = solve(A);

        System.out.println(String.valueOf(res));
    }
}
