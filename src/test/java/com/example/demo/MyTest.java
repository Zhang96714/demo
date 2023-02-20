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


//        String regex="(\\w)";
//        String s=Pattern.quote(regex);
////        System.out.println(s);
////        System.out.println(Pattern.matches(regex,"a"));
//        assertTrue(Pattern.matches(regex,"a"));
//        assertFalse(Pattern.matches(s,"b"));
//        Pattern pattern=Pattern.compile(regex);
//        pattern.splitAsStream()
//        Matcher matcher=pattern.matcher("1a");
//        System.out.println( matcher.find());//true
//        System.out.println(matcher.lookingAt());;//begin true
//        System.out.println(matcher.find());//true
//        System.out.println(matcher.start());
//        System.out.println(matcher.end());
//
//        System.out.println(matcher.group(0));
//        System.out.println(matcher.group(1));
//
//        System.out.println(matcher.find());//false
//        System.out.println(matcher.groupCount());//1

//        System.out.println(Integer.MAX_VALUE);
//        System.out.println((""+Integer.MAX_VALUE).length());//10
//        System.out.println(Long.MAX_VALUE);
//        System.out.println((""+Long.MAX_VALUE).length());//19
//        System.out.println(Integer.TYPE);//int
//        System.out.println(Integer.class);//class java.lang.Integer
//        System.out.println(Integer.toHexString(123));//7b
//        System.out.println(Integer.toBinaryString(8));//1000
//        System.out.println(Integer.toOctalString(8));//10
//        System.out.println(Integer.toString(-1));//-1
//        System.out.println(Integer.toUnsignedString(-1));//4294967295
//        System.out.println(Character.MIN_RADIX);//2
//        System.out.println(Character.MAX_RADIX);//36

//        System.out.println(Math.pow(2,16));//65536
        //1  100=64+32+4  -> 0110 0100 ->   1 << 6 + 1<<5 + 1<<2
//        Integer.parseInt("100");
//        System.out.println(""+Integer.toString(Integer.MAX_VALUE,Character.MAX_RADIX).length());//6

        //127 128-1 = 2^7 -1 = 1000 0000 -1 -> 111 1111
        //0000...0001->
//        System.out.println(Integer.numberOfLeadingZeros(-1));//0
        //-0  1000...0000 -> 1111...1111-> 0000...0000
//        Integer.MIN_VALUE 0x8000_0000
//        System.out.println(Integer.numberOfLeadingZeros(Integer.MIN_VALUE));//0
//        System.out.println(Integer.numberOfTrailingZeros(Integer.MIN_VALUE));//31
//        System.out.println(Integer.rotateLeft(1,31));
//        System.out.println(2 &1);//0
//        System.out.println(3 &1);//1
//        System.out.println(5 &1);//1

        //-1 1000...0001 -> 1111...1110 -> 1111...1111

//        System.setProperty("my.name","zzz");
//        System.out.println(System.getProperties());
//        System.out.println(System.getenv());
//        System.out.println(System.getProperty("my.name"));

//        System.out.println(MyTest.class.getClassLoader());
//        System.out.println(Thread.currentThread().getContextClassLoader());
//        System.out.println(ClassLoader.getSystemClassLoader());

//        int[] ints=new int[]{};
//        System.out.println(int.class);
//        System.out.println(ints.getClass());
//        System.out.println(ints.getClass().getName());
//        System.out.println(ints.getClass().getClassLoader());
//        assertNull(ints.getClass().getClassLoader());// null
//        Integer[] integers=new Integer[0];
//        System.out.println(integers.getClass());
//        System.out.println(integers.getClass().getClassLoader());//null
//        assertNull(integers.getClass().getClassLoader());

//        System.out.println(-1 >>>2);
//        System.out.println(-1 >>> 1);

//        Class<PoJoObj> p=(Class<PoJoObj>) Class.forName("com.example.demo.common.PoJoObj");//true
//        Class.forName("com.example.demo.common.PoJoObj",false,ClassLoader.getSystemClassLoader());
//        Object.class.isAssignableFrom(p);
//        Object poJoObj=new PoJoObj();
//        assertTrue(p.isInstance(poJoObj));

//        URL url=MyTest.class.getResource("D.class");//给定文件名称
//        System.out.println(url);
//        url=MyTest.class.getResource("/file");//绝对路径
//        System.out.println(url);
//        URI uri=url.toURI();
//        System.out.println(uri);

//        MyTest.class.getResource();//调用resolveName()
//        ClassLoader.getSystemResource();

//        ClassLoader classLoader=ClassLoader.getSystemClassLoader();
//        classLoader.loadClass("com.example.demo.D");
//        Class.forName("com.example.demo.D",true,classLoader);

//        System.out.println(OneEnum.ONE.getClass());//com.example.demo.common.OneEnum$1
//        System.out.println(OneEnum.ONE.getClass().getSuperclass());//com.example.demo.common.OneEnum
//        System.out.println(OneEnum.ONE.getDeclaringClass());//com.example.demo.common.OneEnum
//        System.out.println(OneEnum.ONE.ordinal());//0
//        assertTrue(OneEnum.TWO.compareTo(OneEnum.ONE)>0);

//        String s="abc";
//        String s1="abc";
//        assertTrue(s1==s);//true
//        char[] chars={'a','b','c'};
//        String s2=new String(chars);
//        assertTrue(s2==s1);//false

//        //-1
//        //1 0001 ->1 0000 -> 1 1111
//
//        //~ 取反
//        System.out.println(~1); //0 0001  1 1110 ->1 0001 ->1 0010= -2
//        //&
//        System.out.println(3 &5);//0 0011 & 0 0101 ->0 001=1
//        System.out.println(3 &-1);//0 0011 & 1 1111 ->0 0011=3
//        System.out.println(-3 & -1);//1 1101 & 1 1111 ->1 1101=-3
//        //|
//        System.out.println(3 | 5);//0011 | 0101 -> 0111=7
//        //^
//        System.out.println(3 ^5);//0011 ^ 0101 -> 0110=6
//        System.out.println(1 ^0);//特殊 与0^ 为自身
//        System.out.println(1 ^1);//特殊 与自身^ 为0
//
//        //>>
//        System.out.println(7 >>2);//0111 -> 0001=1
//        System.out.println(-7 >>2);//1 0111 -> 1 0110-> 1 111...1001 >>2 ->1 111...1110(原码)
//        // ->1 000...0001->1 000...0010=-2
//        System.out.println(-1 >>1);//-1
//        System.out.println(-1 >>2);//-1
//        //>>>
//        System.out.println(-1 >>> 1);//1 111.1111 >>>1 ->0111.1111(正)=2147483647
//        //<<
//        System.out.println(1<<2);//0001 <<2 ->0100=4

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
