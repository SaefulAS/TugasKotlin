fun main() {
    val a = readLine()?.toInt() //string

    println("masukkan Nilai b :")
    val b = readLine()?.toInt()

    val hasil = a!! % b!!

    print("nilai dari penjumlahan $hasil")
}