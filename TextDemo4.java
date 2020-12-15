import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//public class TextDemo4 {

    //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量

//    public static String toString(int[] arr){
//        String ret = "[";
//        for(int i = 0; i < arr.length; i++){
//            ret += arr[i];
//            if(i != arr.length - 1){
//                ret += ",";
//            }
//        }
//        ret += "]";
//        return ret;
//    }
//
//    public static void main(String[] args){
//        int[] arr = {1, 2, 3};
//        System.out.println(toString(arr));
//    }

    //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
//    public static void my_copyOf1(int[] arr,int[] arr1){
//        for(int i = 0; i < arr.length; i++){
//            arr1[i] = arr[i];
//        }
//        System.out.println("arr1:" + Arrays.toString(arr1));
//    }

//    public static int[] my_copyOf(int[] arr){
//        int ret[] = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//            ret[i] = arr[i];
//        }
//        return ret;
//    }
//    public static void main(String[] args){
//        int[] arr = {1, 2, 3};
//        int[] arr1 = new int[arr.length];
//        my_copyOf1(arr,arr1);
        //int[] arr2 = my_copyOf(arr);
        //System.out.println("arr2:" + Arrays.toString(arr2));
//    }

//    public static void BinarySearch(int[] arr,int n){
//        int left = arr[0];
//        int len = arr.length;
//        int right = arr[len - 1];
//        while(left < right){
//            int mid = (left + right)/2;
//            if(n < arr[mid]){
//                right = mid - 1;
//            }else if(n > arr[mid]){
//                left = mid + 1;
//            }else{
//                System.out.println("找到了，数组下标是：" + mid);
//                break;
//            }
//        }
//    }
//
//    //给定一个有序整型数组, 实现二分查找
//    public static void main(String[] args){
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int Fin = 3;
//        BinarySearch(arr,Fin);
//    }

    //判断有序方法
//    public static void JudgeSort(int[] arr){
//        boolean flag = false;
//        for(int i = 0; i < arr.length - 1; i++){
//            if(arr[i] < arr[i + 1]){
//                flag = true;
//            }else{
//                flag = false;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println("数组有序！");
//        }else{
//            System.out.println("数组无序！");
//        }
//    }
//
//    //给定一个整型数组, 判定数组是否有序（递增）
//    public static void main(String[] args){
//        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
//        int[] arr2 = {5, 8, 4, 6 ,1, 3, 7};
//        JudgeSort(arr1);
//        JudgeSort(arr2);
//    }

    //冒泡排序方法
//    public static void BubbleSort(int[] arr){
//        boolean flag = false;
//        for(int i = 0; i < arr.length - 1;i++){
//            flag = true;
//            for(int j = 0; j < arr.length - 1 - i; j++){
//                if(arr[j] > arr[j + 1]){
//                    int tmp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1 ] = tmp;
//                    flag = false;
//                }
//            }
//        }
//        //判断数组是否有序
//        if(flag){
//            System.out.println("1");//数组有序
//        }else{
//            System.out.println("-1");//数组乱序
//        }
//    }
//    public static void main(String[] args){
//        //给定一个整型数组, 实现冒泡排序(升序排序)
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        int i = 0;
//        for(i = 0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
//        BubbleSort(arr);//排序
//        //打印
//        for(i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
//}
