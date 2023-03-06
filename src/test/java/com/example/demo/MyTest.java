package com.example.demo;

import com.example.demo.common.PoJoObj;
import org.junit.jupiter.api.Test;

import java.util.ListResourceBundle;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author: zhangguofen
 * @date: 2023/1/30 12:48
 */
public class MyTest {

    //一些字段
    private final Object lock = new Object();

    public static void main(String[] args) {


//        ClassLoader classLoader=MyTest.class.getClassLoader().getParent().getParent();
//        assertNull(classLoader);
    }

    /**
     * 测试
     */
    @Test
    void test() throws InterruptedException {
        assertTrue(true);

//        TreeMap<String,Integer> treeMap=new TreeMap<>();
//        //add 3 elements for test
//        treeMap.put("a",1);
//        treeMap.put("b",2);
//        treeMap.put("c",3);
//        assertTrue(treeMap.containsKey("a"));
//        //first
//        assertEquals("a",treeMap.firstKey());
//        //last
//        assertEquals("c",treeMap.lastKey());
//
//        //***NOTE*** ceiling and higher for least keys
//        //ceiling
//        assertEquals("a",treeMap.ceilingKey("a"));
//        //higher
//        assertEquals("b",treeMap.higherKey("a"));
//
//        //***NOTE*** floor and lower for greater keys
//        //floor
//        assertEquals("c",treeMap.floorKey("c"));
//        //lower
//        assertEquals("b",treeMap.lowerKey("c"));

//        LinkedHashMap<String,Integer> linkedHashMap1=new LinkedHashMap<>();
//        linkedHashMap1.put("1",1);
//        linkedHashMap1.put("2",2);
//        linkedHashMap1.put("3",3);
//        linkedHashMap1.values().forEach(integer -> System.out.println("v:"+integer));//ordered

//        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>(8,0.75f,true);
//        linkedHashMap.put("a",1);
//        assertTrue(linkedHashMap.containsKey("a"));
//        linkedHashMap.put("b",2);
//        //new key iterator
//        Iterator<String> iterator=linkedHashMap.keySet().iterator();
//        assertEquals("a",iterator.next());
//
//        //do get operator
//        linkedHashMap.get("a");
//        linkedHashMap.get("a");
//        linkedHashMap.get("a");
//        linkedHashMap.get("a");
//        linkedHashMap.get("a");
//
////        assertEquals("b",iterator.next());//cause cme
//        //new value Iterator
//        Iterator<Integer> vIterator=linkedHashMap.values().iterator();
//        assertEquals(2,vIterator.next());

//        Objects.hash()
//        IdentityHashMap<String,Integer> identityHashMap=new IdentityHashMap<>();
//        System.out.println("1".hashCode());
//        System.out.println("11".hashCode());
//        identityHashMap.put("1",1);
//        assertTrue(identityHashMap.containsKey("1"));
//
//        Object o=new Object();
//        System.out.println("o.hashCode: "+o.hashCode());
//        System.out.println("System.identityHashCode: "+System.identityHashCode(o));
//        System.out.println(new Object().hashCode());

//        WeakHashMap<String,Integer> weakHashMap=new WeakHashMap<>();
//        weakHashMap.put("a",1);
//        assertTrue(weakHashMap.containsKey("a"));
//
//        Iterator<String> iterator=weakHashMap.keySet().iterator();//get iterator
//        assertTrue(iterator.hasNext());
//        weakHashMap.remove("a");
////        assertTrue(iterator.hasNext());//
//        iterator.next();//throw cme

//        EnumMap<COLOR,String> enumMap=new EnumMap<>(COLOR.class);
//        System.out.println(enumMap.size());
//        enumMap.put(COLOR.RED,"red");//size+1
//        assertNull(enumMap.get(COLOR.BLACK));
//        assertEquals("red",enumMap.get(COLOR.RED));
//        System.out.println(enumMap.size());//1
//        assertEquals(1,enumMap.size());
//
//        int[] ints={1,2,3};
//        int[] ints1=ints.clone();//clone
//        assertNotEquals(ints1,ints);
//
//        System.out.println(COLOR.RED);
//        System.out.println(COLOR.class);
//        System.out.println(COLOR.RED.getDeclaringClass());

//        System.out.println(EA.EA.getDeclaringClass());
//        System.out.println(EA.EA.getClass().getSuperclass());//class com.example.demo.EA
//        System.out.println(EB.EB.getDeclaringClass());
//        System.out.println(EB.EB.getClass().getSuperclass());//class java.lang.Enum
//        System.out.println(EA.EA.getClass());

//        COLOR.valueOf("123");//not exist


//        assertEquals(COLOR.class,COLOR.RED.name());

//        do{
//
//        }while (true);

//        Hashtable<String,Integer> hashtable=new Hashtable<>();
//        hashtable.keySet();
//        hashtable.elements();

//        Map<String,Integer> stringIntegerMap=new HashMap<>();
//        //get
//        stringIntegerMap.get("1");
//        stringIntegerMap.getOrDefault("1",1);
//        //replace
//        stringIntegerMap.replaceAll((s, integer) -> {
//            return 1;
//        });
//        stringIntegerMap.replace("1",1);
//        stringIntegerMap.replace("1",1,11);
//        //remove
//        stringIntegerMap.remove("1");
//        //put
//        stringIntegerMap.put("1",1);
//        stringIntegerMap.putIfAbsent("1",1);//get(key) == null
//        //compute
//        stringIntegerMap.compute("1",(s, integer) -> {
//            return 1;
//        });
//        stringIntegerMap.computeIfAbsent("1",s -> {
//            return 1;
//        });//get(key) == null
//        stringIntegerMap.computeIfPresent("1",(s, integer) -> {
//            return 1;
//        });//get(key) != null
//        //merge
//        stringIntegerMap.merge("1",0,(integer, integer2) -> 1);

//        Comparable<Integer> comparable=(Comparable<Integer> & Serializable)(o -> {
//            return 1;
//        });
//        assertTrue(comparable instanceof Serializable);

////        System.out.println((int) 'a');//97
//
//        ByteBuffer buffer = ByteBuffer.allocate(10);
//        //write
//        buffer.putChar('a');
//
//        //char 'b'
//        buffer.put((byte) 0);
//        buffer.put((byte) 98);
//
//        //int 9
//        buffer.put((byte) 0);
//        buffer.put((byte) 0);
//        buffer.put((byte) 0);
//        buffer.put((byte) 9);
//
//        //test
//        assertFalse(buffer.isReadOnly());
//        assertFalse(buffer.isDirect());
//        assertTrue(buffer.hasArray());
//        assertEquals(0,buffer.arrayOffset());
//
//        //read
//        buffer.flip();
//        assertEquals('a',buffer.getChar());
//        assertEquals('b',buffer.getChar());
////        assertEquals('b',buffer.getChar(2));//note this position not modify attention
//
////        System.out.println(buffer.position());
////        System.out.println(buffer.getInt());
//        assertEquals(9,buffer.getInt());

        //bytes
//        System.out.println(Byte.BYTES);//1
//        System.out.println(Character.BYTES);//2
//        System.out.println(Short.BYTES);//2
//        System.out.println(Integer.BYTES);//4
//        System.out.println(Long.BYTES);//8
//        System.out.println(Float.BYTES);//4
//        System.out.println(Double.BYTES);//8

//        System.out.println(0x0102030405060708L);

//        assert false;

//        Files
        //list files
//        String dir="C:\\Users\\zhangguofen\\IdeaProjects\\demo\\src\\main\\resources";
//        try(
//                DirectoryStream<Path> directoryStream=Files.newDirectoryStream(Paths.get(dir),"*.properties")
//                ) {
//            for (Path p:directoryStream) {
//                System.out.println(p+"type: "+Files.probeContentType(p)+"is file:"+Files.isRegularFile(p));
//            }
//
//        }catch (IOException e){
//
//        }

//        System.out.println(0xffff_ffff_ffff_ffffL);//-1
//        String filePath = "C:\\Users\\zhangguofen\\IdeaProjects\\demo\\src\\main\\resources\\file";
//        Path file = Paths.get(filePath);
//        System.out.println("getFileName: " + file.getFileName());
//        System.out.println("getParent: " + file.getParent());
//        System.out.println("getRoot " + file.getRoot());
//        System.out.println("isAbsolute: " + file.isAbsolute());
//        System.out.println("getNameCount:" + file.getNameCount());//8
//        System.out.println("0: " + file.getName(0));//users
//        System.out.println("7: " + file.getName(7));//file
//        file=file.subpath(3,8);
//        assertFalse(file.startsWith("fi"));//注意格式 相对路径不能直接比较
//        assertTrue(file.endsWith("file"));//完整名称 file
//        System.out.println("next: " + file.iterator().next());//users
//
//        Path file1 = Paths.get("./file");
//        System.out.println(file1);
//        System.out.println(file1.normalize());

        //watchable listen modify event
//        Path file=Paths.get("C:\\Users\\zhangguofen\\IdeaProjects\\demo\\src\\main\\resources");
//        FileSystem fileSystem = FileSystems.getDefault();
//        System.out.println(fileSystem);//WindowsFileSystem
//        System.out.println(fileSystem.getSeparator());//\
//        System.out.println(fileSystem.getFileStores().iterator().next());//disk
//        try (
//                WatchService watchService = fileSystem.newWatchService();
//        ) {
//            WatchKey watchKey = file.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);
//            boolean valid=watchKey.isValid();
//            while (valid){
//                List<WatchEvent<?>> watchEvents=watchKey.pollEvents();
//                if(!watchEvents.isEmpty()){
//                    for (WatchEvent<?> event:watchEvents
//                    ) {
//                        WatchEvent.Kind<?> kind=event.kind();
//                        System.out.println("event kind: "+kind.name());
//
//                    }
//                }else {
//                    System.out.println("nothing happen");
//                }
//                valid=watchKey.reset();//reset
//                if(!valid){
//                    System.out.println("watchkey no longer valid.");
//                    break;
//                }
//                Thread.sleep(2000);
//            }
//
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        System.out.println(0%5);//0
//        System.out.println(1%5);//1
//        //...
//        System.out.println(4%5);//4
//        //0
//        System.out.println(5%5);//0

//        long l=127 & 0xffL;
//        System.out.println("l: "+l);
//        int[] ints=new int[1];
//        System.out.println(ints[0]);//0 数组默认初始值0

        //0001...0000
//        int i=1 << 28;
//        System.out.println(i >>> 26);//4
//        System.out.println(i >>> -6);//i >>> -6 = i >>> 26
//
//        long mask= 0xffff_ffff_ffff_ffffL;
//        System.out.println(mask << 4);//1 1111...0000 ->1 01111->1 10000=-16
//        System.out.println(mask >>> -4);//15
//        System.out.println(mask >>> 60);//15

//        System.out.println(1 ^ 0);//零 1
//        System.out.println(1 ^ 1);//自身 0

//        int a=1,b=2;
//        a=a^b;
//        b=a^b;//b=a
//        a=a^b;//a=b
//        assertEquals(2,a);
//        assertEquals(1,b);
//        System.out.println(5 &5);//5
//        System.out.println(4 &5);//4
//        System.out.println(3 &5);//1
//        System.out.println(2 &5);//0
//        System.out.println(1 &5);//1
//        System.out.println(0 &5);//0
        //-1 &5 =5
        //-2 &5=4
        //-3 &5=3
        //-4 &5=2
        //-5 &5=1
        //-6 &5=0
        //-7 &5==1

//        int i=0;
//        out:while (true){
//            if(i++<5){
//                System.out.println("i: "+i);
//            }else {
//                break ;
//            }
//            for (int j = 0; j < 10; j++) {
//                int randomInt=new Random().nextInt(10);
//                if( randomInt == 9){
//                    System.out.println(" end.");
//                    break out;
//                }
//                System.out.print(" j: "+j);
//                if(j==9){
//                    //last line
//                    System.out.println();
//                }
//            }
//        }

//        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
//        priorityQueue.add(3);
//        priorityQueue.offer(2);
//        priorityQueue.add(1);
//        priorityQueue.remove();
//        priorityQueue.add(1);
//        priorityQueue.poll();
//
//        assertEquals(2,priorityQueue.element());
//        assertEquals(2,priorityQueue.peek());
//
//        Collection<Integer> integers=new ArrayList<>();
//        integers.add(1);
//        Collection<Integer> integers1= Arrays.asList(1,2,3);
//        boolean b=integers.retainAll(integers1);//false for no changed
//        assertFalse(b);
//        assertEquals(1,integers.size());

//        Iterator

//        MyClassLoader myClassLoader = new MyClassLoader();
//        try {
//            Class<?> a= myClassLoader.loadClass("com.example.demo.MyTest$ObjectProvider");
//            System.out.println(a.getClassLoader());//
//            System.out.println(Class.forName("com.example.demo.MyTest$ObjectProvider")
//                    .getClassLoader());//Launcher$AppClassLoader

//            System.out.println(MyTest.class.getClassLoader().getParent());//ExtClassLoader
//
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        System.out.println(ObjectProvider.class.getName());//com.example.demo.MyTest$ObjectProvider


//        ResourceBundle.Control control=new ResourceBundle.Control(){
//
//            /**
//             * 设置 resourceBundle 保持时长，过期reload
//             *
//             * @param baseName
//             *        the base name of the resource bundle for which the
//             *        expiration value is specified.
//             * @param locale
//             *        the locale of the resource bundle for which the
//             *        expiration value is specified.
//             * @return
//             */
//            @Override
//            public long getTimeToLive(String baseName, Locale locale) {
//                if(baseName.equals("my")){
//                    return 10;
//                }
//                return super.getTimeToLive(baseName, locale);
//            }
//        };
//        ResourceBundle resourceBundle=ResourceBundle.getBundle("my",control);
//        System.out.println(resourceBundle.getString("hello"));
//        //ttl
//        Thread.sleep(100);
//        assertTrue(resourceBundle.containsKey("hello"));//true
//
//        ResourceBundle javaR=ResourceBundle.getBundle("com.example.demo.msg.MSG_SUCCESS");
//        System.out.println(javaR.keySet().size());
//        System.out.println(javaR.getString("success"));

//        ClassLoader.getSystemResource().openConnection().setUseCaches(false);
//        new HashMap<>().replace();//!=null || containsKey  存在
//        //==null 覆盖
//        //==null && !containsKey 不覆盖
//        new HashMap<>().putIfAbsent();
//        new HashMap<>().computeIfAbsent();

//        Object o=new Object();
//
//        new Thread(){
//            @Override
//            public void run() {
//                Thread.currentThread().interrupt();//self interrupt
//                synchronized (o){
//                    try {
//                        o.wait();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        }.run();

//        Thread thread1=new Thread(){
//            @Override
//            public void run() {
//                try {
//                    synchronized (o){
//                        o.wait();
//                    }
//                } catch (InterruptedException e) {
//                    assertFalse(Thread.currentThread().isInterrupted());//interrupt flag has been clear
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//
//        class MyThread extends Thread{
//            final Thread thread;
//
//            public MyThread(Thread thread) {
//                this.thread = thread;
//            }
//
//            @Override
//            public void run() {
//                thread.interrupt();
//            }
//        }
//
//        //start
//        thread1.start();
//        new MyThread(thread1).start();


//        //AppClassLoader -> ExtClassLoader->
//        ClassLoader classLoader=MyTest.class.getClassLoader();
//        System.out.println(classLoader);//AppClassLoader
//        System.out.println(ClassLoader.getSystemClassLoader());//AppClassLoader
//        ClassLoader pcl=classLoader.getParent();
//        System.out.println(pcl);//ExtClassLoader
//        pcl=pcl.getParent();
//        System.out.println(pcl);//null 无法获取boot class loader?

//        class MyTask implements Runnable{
//
//            public MyTask(ShareData shareData,boolean loop) {
//                this.shareData = shareData;
//                this.loopFlag=loop;
//
//                this.updateFlag=!loopFlag;
//            }
//
//            private final ShareData shareData;
//            private final boolean loopFlag;
//            private final boolean updateFlag;
//
//            @Override
//            public void run() {
//                Thread thread=Thread.currentThread();
//                String threadId="tid: "+Thread.currentThread().getId();
//                //loop
//                while (loopFlag && !thread.isInterrupted()){
//                    printData(threadId);
//
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//
//                if(updateFlag){
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    //update sharedata
//                    shareData.setaBoolean(true);
//                    //show warn
//                    printData(threadId,"updated.");
//                }
//            }
//
//            void printData(String threadId){
//                System.out.println(threadId+" ,"+shareData);
//            }
//
//            void printData(String threadId,String suffix){
//                System.err.println(threadId+" ,"+shareData+" ,"+suffix);
//            }
//        }
//        ShareData shareData=new ShareData();
//        Runnable task1=new MyTask(shareData,false);
//        Runnable task2=new MyTask(shareData,true);
//        new Thread(task1).start();
//
//        //mock 100 thread to test
//        for (int i = 0; i < 1000; i++) {
//            new Thread(task2).start();
//        }
//
//        Thread.sleep(1000);

//        @SuppressWarnings("rawtypes")
//        List list = new ArrayList();
//        assertFalse(list.listIterator().hasPrevious());
//
//        MyResourceBundle resourceBundle = new MyResourceBundle();
//        System.out.println(resourceBundle.getString("hello"));

//        MData<Integer> mData=new MData<>((Integer[]) null);
//        int s=ForkJoinPool.getCommonPoolParallelism();
//        System.out.println("getCommonPoolParallelism: "+s);//15

//        System.out.println(1 << 10);//1024
//        System.out.println(1 << 15);//32768
//        System.out.println(1 << 16);//65536


//        assert 0==returnAdd();

//        //iterate使用
//        long sum=Stream.iterate(1,integer -> {
//            return ++integer;
//        }).limit(5).mapToInt(Integer::intValue).sum();
//        System.out.println("count: "+sum);//15
//        //generate使用
//        Stream.generate(()-> 1).limit(1).forEach(System.out::println);//1

//        System.out.println(String.format("v:%s",1));

        //通配符.匹配一个
        //限位符 + 1个或多个 ? 0个或1个 * 0个或多个
        //补充
        // 常用 \\w \\s \\d  大写表示取反
//        String s = "ab.c";
//        String regex = "b.";
//        System.out.println(Arrays.toString(s.split(regex)));//[a,c]
//        regex="b";
//        System.out.println(Arrays.toString(s.split(regex)));//[a,.c]
//        regex="b*";
//        System.out.println(Arrays.toString(s.split(regex)));//[a, , ., c]
//        regex="b?";
//        System.out.println(Arrays.toString(s.split(regex)));//[a, , ., c]
//        regex="b+";
//        System.out.println(Arrays.toString(s.split(regex)));//[a, .c]

//        TreeSet
//        HashSet

//        int[] aInts=new int[1];
//        System.out.println(aInts[0]);//default value 0
//        double d=0,d1=0.0;
//        System.out.println(d);//0.0
//        System.out.println(d1);//0.0


//        throwError();
//        int[] ints = {1, 2, 3};
//        Stream<Integer> integerStream = Arrays.stream(ints).boxed();
//        IntStream.of(4,5,6).peek(value -> {
//            System.out.println(value);
//        }).forEach(System.out::println);

//        System.out.println(integerStream.count());
//        int v=integerStream.reduce((integer, integer2) -> integer+integer2).get();//sum
//        int v=integerStream.mapToInt(Integer::intValue).sum();//sum
//        System.out.println(v);
//        integerStream.forEach(System.out::println);

//        ArrayList<Integer> arrayList=new ArrayList<>();
//        List<Integer> integerList=integerStream
//                .collect(()-> arrayList,ArrayList::add, ArrayList::addAll);
//        System.out.println(integerList.size());
//        System.out.println(Float.BYTES);//4
//        System.out.println(Integer.BYTES);//4

//        System.out.println("\thello\tworld.");

//        Thread.holdsLock();
//        Thread.currentThread()

//        synchronized (lock){
//            assert Thread.holdsLock(lock);
//
//            synchronized (lock){
//                System.out.println("hello");
//            }
//        }

//        Throwable throwable;
//        Error error;
//        Exception exception;
//
//        Exception lowException=new Exception("low exception");
//        Exception highException=new Exception("high exception", lowException);
//        throw highException;
//        highException.printStackTrace();

//        A<String,Integer> aa=(a,a1)->{
//            System.out.println(a+2*a1);
//        };
//        aa.func("a",1);
//        B<Integer> bb=(b,b1)->{
//            System.out.println(b*2+b1*3);
//        };
//        bb.func(1,2);

//        //local class
//        class DD{
//            String f(Function<String,String> function){
//                return function.apply("1");
//            }
//
//        }
//
//        DD dd=new DD();
//        Function<String,String> function=(s)->{
//            return "1"+s;
//        };
//        System.out.println(dd.f(function));

//        Consumer<Integer> consumer1=(a)->{
//            System.out.println(a);
//        };
//        Consumer<Integer> consumer2=(b)->{
//            System.out.println(b);
//        };
//        consumer1.andThen(consumer2).accept(1);

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

    //一些辅助方法
    private void cloneTest() throws CloneNotSupportedException {
        PoJoObj field = new PoJoObj();
        field.setAnInt(555);

        PoJoObj old = new PoJoObj();
        old.setPoJoObj(field);
//        System.out.println(old);
        PoJoObj copy = (PoJoObj) old.clone();
//        System.out.println(copy);
    }

    private void throwError() {
        throw new TestError();
    }

    private int returnAdd() {
        int i = 0;
        return i++;//0
    }

    private ClassLoader getCl(ClassLoader c) {
        if (null == c) {
            return null;
        }
        ClassLoader p;
        while ((p = c.getParent()) != null) {
            c = p;
        }
        return c;
    }

    //类定义
    interface A<T, R> {

        void func(T t, R r);

        void func1(Supplier<T> supplier);
    }

    interface AA<T, R, T_S> extends A<T, R> {

        void func1(T_S supplier);
    }

    interface AASupplier extends Supplier<String> {
    }

    static class AAImpl implements AA<Integer, String, AASupplier> {

        @Override
        public void func(Integer integer, String s) {

        }

        private Integer integer() {
            try {

                return null;
            } catch (Exception e) {
                failM();
            }
            throw new Error();//this cannot happen
        }

        void failM() {
            throw new RuntimeException("");
        }

        @Override
        public void func1(Supplier<Integer> supplier) {

        }

        @Override
        public void func1(AASupplier supplier) {

        }
    }

    /**
     * @param <T>
     */
    interface B<T> extends A<T, T> {

        default void bbb(Consumer<? super T> consumer, T value) {
            consumer.accept(value);
        }

    }

    static class TestError extends Error {

        @Override
        public String toString() {
            String s;
            return s = super.toString();
        }
    }

    static class MData<M> {
        M[] data;

        Object[] items;

        public MData(M[] data) {
            this.data = data;
        }

        @SuppressWarnings("unchecked")
        public M[] getMItems() {
            return (M[]) items;
        }
    }

    static class MyResourceBundle extends ListResourceBundle {

        @Override
        protected Object[][] getContents() {
            return new Object[][]{
                    {"hello", "你好"},
                    {"world", "世界"}
            };
        }
    }

    static class ShareData {
        private volatile boolean aBoolean;// volatile 保证内存可见性
//        private  boolean aBoolean;

        private String name;

        private int hash;//0

        String p;

        public void setName(String name) {
            if (!name.equals(this.name)) {
                this.name = name;
                calculateHash();
            }
        }

        void calculateHash() {
            this.hash = Objects.hash(name);
        }

        @Override
        public int hashCode() {
            return hash;
        }

        public synchronized boolean isaBoolean() {
            return aBoolean;
        }

        public synchronized void setaBoolean(boolean aBoolean) {
            this.aBoolean = aBoolean;
        }

        @Override
        public String toString() {
            return "aBoolean: " + aBoolean;
        }

        private static class InnerD {

            private static final InnerD d = doInit();

            private static InnerD doInit() {
                //init operate

                return null;
            }

            void m() {

                //访问上级private 变量 hash
//                ShareData.this.hash;
                //访问上级 普通变量 p
//                p.length()
            }
        }
    }

    static class ObjectProvider {

        ObjectProvider provider = null;

        Object get() {
            ObjectProvider objectProvider;
            for (objectProvider = provider;
                 objectProvider != null;
                 objectProvider = getFallbackProvider()) {
                Object v = objectProvider.get();
                if (v != null) {
                    return v;
                }
            }

            return null;
        }

        /**
         * 提供备用的 ObjectProvider 对象
         *
         * @return o
         */
        ObjectProvider getFallbackProvider() {
            return null;
        }

    }

    enum COLOR {
        RED,
        BLACK
    }

    public interface MarkI {
        //no use
    }

    static class MyClassLoader extends ClassLoader {

        //ext loader
        private static final ClassLoader c;

        static {
            ClassLoader t = ClassLoader.getSystemClassLoader();
            ClassLoader p;
            while ((p = t.getParent()) != null) {
                t = p;
            }
            c = t;
        }

        public static ClassLoader getC() {
            return c;
        }

        @Override
        public Class<?> loadClass(String name) throws ClassNotFoundException {
            return c.loadClass(name);
        }
    }
}
