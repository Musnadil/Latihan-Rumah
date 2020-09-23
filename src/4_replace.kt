//replace
fun main (){
    var a = 1
    val s1 = "a is $a"

    a = 2
    val s2 = "${s1.replace("is","was")}, but now is $a"
    println(s1)
    println(s2)


    var hari : String =  "senin"
    val kalimat : String = "ini hari $hari"

    hari = "selasa"
    val kalimat2 = "${kalimat.replace("ini","kemarin")} tapi hari $hari"
    println(kalimat)
    println(kalimat2)
}