package com.example.fileoperator

import java.io.File

fun main() {
    var fileNames: MutableList<String> = mutableListOf()
    var mPath = "E:\\java\\KotlinExample"
    //在该目录下走一圈，得到文件目录树结构
    val fileTree: FileTreeWalk = File(mPath).walk()
    fileTree //需遍历的目录层级为1，即无需检查子目录
        .filter { it.isFile } //只挑选文件，不处理文件夹
        .filter { it.extension in listOf("xml", "iml") } //选择扩展名为png和jpg的图片文件
        .forEach { fileNames.add(it.name) } //循环处理符合条件的文件
    println(fileNames.size)
    println(fileNames)
    val file: File = File(mPath)
}
