package com.example.demo.algorithm.sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * 简单排序算法例子
 *
 * @author: zhangguofen
 * @date: 2022/10/5 17:16
 */
public class SortAlgorithmTest {

    /**
     * 冒泡排序
     */
    @Test
    void test1(){
        int[] result=SortUtils.method1(new int[]{1,3,2,4,2,5});
        System.out.println(Arrays.toString(result));
    }

    /**
     * 快速选择
     */
    @Test
    void test2(){
        int[] list={3,2,1};
        SortUtils.method2(list,0,2);
        System.out.println(Arrays.toString(list));
    }

    /**
     * 直接插入
     */
    @Test
    void test3(){
        System.out.println(Arrays.toString(SortUtils.method3(new int[]{1,2,3,2,3})));
    }

    /**
     * 辅助工具类
     */
    static class SortUtils{

        /**
         * 冒泡排序
         *
         */
        static int[] method1(int[] arr){
            int t=0;
            for (int i = 0; i < arr.length-1; i++) {
                boolean b=false;
                for (int j = arr.length-1;j>i; j--) {
                    //相邻两数,升序
                    if(arr[j] < arr[j-1]){
                        t=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=t;
                        b=true;
                    }
                }
                if(!b){
                    break;
                }
            }
            return arr;
        }

        /**
         * 快速选择排序
         *
         */
        static void method2(int[] list,int left,int right){
            if(left < right){
                int base=method2d(list, left, right);
                System.out.println(base);
                method2(list, left,base-1);
                method2(list,base+1,right);
            }
        }

        static int method2d(int[] list,int left,int right){
            int base=list[left];
            while (left < right){
                while (left < right && list[right] >=base){
                    right--;
                }
                //左移
                list[left]=list[right];
                while (left < right && list[left] <= base){
                    left++;
                }
                //右移
                list[right]=list[left];
            }
            //基准值 赋予 重合位置
            list[left]=base;
            return left;
        }

        /**
         * 直接插入排序
         *
         */
        static int[] method3(int[] list) {
            //第2个元素开始
            for (int i = 1; i < list.length; i++) {
                int temp=list[i];
                int j;
                for (j=i-1; j>=0 && temp < list[j]; j--) {
                    list[j+1]=list[j];
                }
                list[j+1]=temp;
            }
            return list;
        }
    }

}
