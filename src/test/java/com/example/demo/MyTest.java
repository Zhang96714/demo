package com.example.demo;

import com.example.demo.common.PoJoObj;
import org.junit.jupiter.api.Test;

/**
 * @author: zhangguofen
 * @date: 2023/1/30 12:48
 */
public class MyTest {

    /**
     * 测试
     */
    @Test
    void test() throws Exception {


//        long s=System.currentTimeMillis();
//        for (int i = 0; i < 1000; i++) {
//            cloneTest();
//        }
//        System.out.println("clone finish cost:"+(System.currentTimeMillis()-s)+"ms");

//        System.out.println(new Throwable());
//        System.out.println(new Exception());
//        System.out.println(new Error());

//        System.out.println('\0');

//        String s="你";
//        System.out.println(s.length());
//        System.out.println(Character.isUnicodeIdentifierPart(s.toCharArray()[0])); //true
//        System.out.println(Character.codePointAt(s.toCharArray(),0));

//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(1 >>>1);
//        System.out.println(1 << -1); // 1 << 31
//        System.out.println(Integer.rotateRight(1,1));

//        System.out.println(1 << 2);//4
//        System.out.println(1 >>> -2); // 1 >>> 30 0
//        System.out.println(Integer.rotateLeft(1,2));//4

//        System.out.println(3 & 1);//1
//        System.out.println(2 & 1);//0

//        System.out.println(-1 >>> 1);

        //静态初始化块
//        Class.forName("com.example.demo.common.PoJoObj",false,Thread.currentThread().getContextClassLoader());
//        Class.forName("com.example.demo.common.PoJoObj");

//        System.out.println('\u0000');

        //-1 原码 1 ...1111
//        System.out.println((-1 >>> 29));//1 0001 -> 1 0000 -> 1 1111 (原码)   ->0 0111=7

//        Integer[] integers={1,2,3};
//        assertEquals(3,Stream.of(integers).count());
//        assertEquals(3,Arrays.stream(integers).count());

//        int[] ints={1,2,3};
//        System.arraycopy(ints,1,ints,0,2);
//        System.out.println(Arrays.toString(ints));//[2,3,3]  自动补全

//        Object[] objects=new Object[3];
//        Object o1=new Object();
//        Object o2=new Object();
//        Object o3=new Object();
//        objects[0]=o1;
//        objects[1]=o2;
//        objects[2]=o3;
//        System.arraycopy(objects,1,objects,0,2);
//        assertEquals(o3,objects[2]); // true

//        StringBuffer stringBuffer=new StringBuffer();//toString
//        StringBuilder stringBuilder=new StringBuilder();//toString

//        String s="海";
//        int c=s.codePointAt(0);
//        System.out.println("c:"+c);
//        System.out.println(s.codePoints().count());//1
//        System.out.println(Character.charCount(c));//1

//        StringTokenizer stringTokenizer=new StringTokenizer("a b abc","a");
//        System.out.println(stringTokenizer.countTokens());//2
//        System.out.println(stringTokenizer.nextToken());// b 包含空格

//        Long.MIN_VALUE;
//        Integer.MAX_VALUE

//        Collection<Integer> integers= new ArrayList<>();
//        integers.add(1);
//        integers.add(4);
//        Collection<Integer> integers1=Arrays.asList(1,3);
//        boolean b=integers.retainAll(integers1);//删除4
//        assertTrue(b);
//        assertEquals(1,integers.size());

//        Map map=new HashMap();
//        map.put(null,null);
//        map.remove("abc");

//        System.out.println(1 ^ 0);
//        assertEquals(0,2 ^2);// 0
//        assertEquals(2,2 ^0);// 自身

//        int a=1,b=2;
//        a=a^b;
//        b=a^b; // a bb -> a 0 -> b=a
//        a=a^b; // aa b -> 0 b -> a=b
//
//        assertEquals(2,a);
//        assertEquals(1,b);

//        System.out.println(1 << 1);//2

//        assertEquals(255,255 & 255);

//        do{
//
//        }while (true);

//        assertFalse(aBoolean);

//        Thread thread=new Thread();
//        BlockingQueue<Runnable> threadBlockingQueue=new ArrayBlockingQueue<>(10);
//        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor(10,100,10, TimeUnit.MINUTES,threadBlockingQueue);

//        System.out.println(0 % 1);//0

//        Hashtable hashtable=new Hashtable();
//        hashtable.put(null,"a"); //npe

//        System.out.println(Integer.signum(-1));

//        System.out.println(Thread.currentThread().getContextClassLoader());//appClassLoader
//        System.out.println(ClassLoader.getSystemClassLoader());//appClassLoader

//        System.out.println(0x61c88647);

//        System.out.println(Integer.numberOfLeadingZeros(1));

//        for (int item:new IntegerArray(new Integer[]{1,2,3})) {
//            System.out.println(item);
//        }

//        System.out.println((char) 46);// .
//        System.out.println("---");
//        System.out.println((char) 91);// [
    }

    //---一些辅助方法
    private void cloneTest() throws CloneNotSupportedException {
        PoJoObj field = new PoJoObj();
        field.setAnInt(555);

        PoJoObj old = new PoJoObj();
        old.setPoJoObj(field);
//        System.out.println(old);
        PoJoObj copy = (PoJoObj) old.clone();
//        System.out.println(copy);
    }

}
