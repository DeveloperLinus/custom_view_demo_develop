1.NDK与JNI基础概述
NDK：Native Development Kit(NDK)是一系列的工具集合，它提供了一系列的工具，帮助开发这快速开发C/C++的动态库，并能自动将so和Java一起打包成apk。
JNI：Java Native Interface(JNI)标准是java平台的一部分，JNI是Java语言提供的Java和C/C++互相沟通的机制，Java可以通过JNI调用C/C++代码，C/C++的代码也可以调用java代码。

NDK可以为我们生成C/C++的动态链接库，JNI是java和C/C++沟通的接口，两者和Android没有半毛钱关系，只因为Android是Java程序语言开发，所以通过JNI又能与C/C++沟通，所以我们
可以使用NDK+JNI来实现”Java+C的开发方式“
1.1
2.

