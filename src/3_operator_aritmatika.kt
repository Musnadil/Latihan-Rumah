import java.util.*

// nyoba bikin rumus
    // 1. rumus persegi
fun main (args:Array<String>){
    val add = Scanner(System.`in`)

    println("==================================\nKalkulator Penghitung luas persegi\n==================================")
    println("Masukan panjang sisi persegi  : ")
    val sisi:Int = add.nextInt()
    println("luas persegi : ${sisi * sisi}")

    // 2. rumus persegi panjang
    println("==========================================\nKalkulator Penghitung Luas Persegi Panjang\n==========================================")
    println("Masukan Panjang Persegi Panjang :")
    val panjang:Int = add.nextInt()
    println("Masukan Lebar Persegi Panjang : ")
    val lebar:Int = add.nextInt()
    println("Luas Persegi Panjangmu adalah : ${panjang * lebar}")

    // 3. rumus segitiga
    println("==================================\nKalkulator Penghitung luas segitiga\n==================================")
    println("Masukan Tinggi Segitiga : ")
    val tinggi:Int = add.nextInt()
    println("Masukan Panjang Alas Segitiga : ")
    val alas:Int = add.nextInt()
    println("luas Segitiga : ${alas * tinggi / 2}")

    // 4. rumus lingkaran
    val phi = 3.14
    println("==================================\nKalkulator Penghitung luas lingkaran\n==================================")
    println("Masukan Jari Jari lingkaran : ")
    val jari:Int = add.nextInt()
    println("luas Lingkaran : ${phi * (jari * jari)}")




}