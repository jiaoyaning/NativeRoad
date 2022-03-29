# https://blog.csdn.net/afei__/article/details/81201039
# cmake 是一个跨平台、开源的构建系统。它是一个集软件构建、测试、打包于一身的软件。它使用与平台和编译器独立的配置文件来对软件编译过程进行控制。

# 指定 cmake 的最小版本
cmake_minimum_required(VERSION 3.18.1)

# 设置项目名称
project("jni")

# 指定编译包含的源文件
add_library(
        jni
        SHARED
        jni.cpp)

# 查找到指定的预编译库，并将它的路径存储在变量中。
find_library(
        log-lib
        log)

# 设置 target 需要链接的库
target_link_libraries(
        # 目标库
        jni

        # 目标库需要链接的库
        # log-lib 是上面 find_library 指定的变量名
        ${log-lib})