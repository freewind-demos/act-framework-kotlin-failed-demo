ActFramework with Kotlin Failed Demo
====================================

在Act Framework中使用Kotlin，失败。

运行

```
./run_dev
```

后卡在这一步很久，最后`OutOfMemoryError`：

```
[INFO]
[INFO] --- exec-maven-plugin:1.6.0:exec (default-cli) @ helloworld ---
Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit exceeded
        at org.osgl.util.FastStr.charArray(FastStr.java:1321)
        at org.osgl.util.FastStr.toString(FastStr.java:582)
        at org.osgl.util.FastStr.toLowerCase(FastStr.java:1276)

```

看来只能在Java下使用了。