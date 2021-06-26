val map: MutableMap<String,Int> = mutableMapOf()
val linkmap: MutableMap<String,Int> = linkedMapOf()

fun main() {
    map.put("你好",12)
    map.put("你好1",12)
    map.put("你好2",23)
    linkmap.put("你好",12)
    linkmap.put("你好1",12)
    linkmap.put("你好2",23)
    val put = linkmap.put("你好2", 23)
    println(put)
    linkmap.forEach { t, u ->
        println("$t->$u")
    }
}