//fun main() {
//    // Deklarasi variabel dengan tipe data bilangan bulat
//    val age: Byte = 25
//    val quantity: Short = 1000
//    val population: Int = 7500000
//    val distance: Long = 12000000000L // Harus ditambahkan "L" pada akhir nilai untuk tipe Long
//
//    // Operasi dengan tipe data bilangan bulat
//    val total: Int = quantity * 2
//    val remaining: Int = population % 1000000
//
//    // Konversi tipe data
//    val salary: Long = 50000L
//    val salaryInt: Int = salary.toInt()
//
//    // Menampilkan nilai variabel
//    println("Usia: $age")
//    println("Jumlah: $quantity")
//    println("Populasi: $population")
//    println("Jarak: $distance")
//    println("Total: $total")
//    println("Sisa: $remaining")
//    println("Gaji: $salaryInt")
//}

//fun main() {
//    // Deklarasi variabel dengan tipe data bilangan pecahan
//    val pi: Float = 3.14159265359f // Harus ditambahkan "f" pada akhir nilai untuk tipe Float
//    val gravity: Double = 9.81
//
//    // Operasi dengan tipe data bilangan pecahan
//    val halfPi: Float = pi / 2.0f
//    val squareArea: Double = 5.5 * 5.5
//
//    // Menampilkan nilai variabel
//    println("Nilai Pi: $pi")
//    println("Gravitasi: $gravity")
//    println("Nilai Pi dibagi 2: $halfPi")
//    println("Luas Persegi: $squareArea")
//}

//fun main() {
//    // Deklarasi variabel dengan tipe data karakter
//    val gender: Char = 'M'
//    val grade: Char = 'A'
//    val specialChar: Char = '@'
//
//    // Menampilkan nilai variabel
//    println("Jenis Kelamin: $gender")
//    println("Nilai Ujian: $grade")
//    println("Karakter Khusus: $specialChar")
//}

//fun main() {
//    // Deklarasi variabel dengan tipe data boolean
//    val isRaining: Boolean = true
//    val isSunny: Boolean = false
//
//    // Menampilkan nilai variabel
//    println("Apakah sedang hujan? $isRaining")
//    println("Apakah sedang cerah? $isSunny")
//
//    // Penggunaan dalam pernyataan if-else
//    if (isRaining) {
//        println("Sedang hujan, jangan lupa bawa payung!")
//    } else {
//        println("Tidak sedang hujan, bersiap-siap untuk aktivitas di luar!")
//    }
//}

//fun main() {
//    // Deklarasi variabel dengan tipe data String
//    val firstName: String = "John"
//    val lastName: String = "Doe"
//    val fullName: String = "$firstName $lastName"
//
//    // Menampilkan nilai variabel
//    println("Nama Depan: $firstName")
//    println("Nama Belakang: $lastName")
//    println("Nama Lengkap: $fullName")
//
//    // Penggunaan metode atau fungsi String
//    println("Panjang Nama Lengkap: ${fullName.length}")
//    println("Nama Lengkap Kapital: ${fullName.toUpperCase()}")
//}

//fun main() {
//    // Deklarasi array dengan tipe data int
//    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
//
//    // Menampilkan elemen-elemen dalam array
//    println("Elemen-elemen dalam array numbers:")
//    for (number in numbers) {
//        println(number)
//    }
//
//    // Mengakses elemen tertentu dalam array
//    val firstNumber: Int = numbers[0]
//    println("Elemen pertama: $firstNumber")
//
//    // Mendeklarasikan array tanpa nilai awal
//    val names: Array<String> = arrayOf("John", "Jane", "Tom")
//
//    // Mengubah nilai elemen dalam array
//    names[2] = "Alice"
//
//    // Menampilkan elemen-elemen dalam array names
//    println("Elemen-elemen dalam array names:")
//    for (name in names) {
//        println(name)
//    }
//}

//fun main() {
//    // Deklarasi variabel dengan tipe data nullable
//    val name: String? = "John"
//    val age: Int? = null
//
//    // Mengakses nilai tipe data nullable
//    println("Nama: $name")
//    println("Usia: $age")
//
//    // Melakukan pemeriksaan null sebelum mengakses nilai
//    if (name != null) {
//        println("Panjang Nama: ${name.length}")
//    } else {
//        println("Nama belum diisi.")
//    }
//
//    // Menggunakan operator elvis untuk mengganti nilai null dengan nilai default
//    val length: Int = age ?: 0
//    println("Usia atau 0 jika null: $length")
//}

//class Person(val name: String, var age: Int) {
//    fun greet() {
//        println("Hello, my name is $name and I am $age years old.")
//    }
//}
//
//fun main() {
//    val person = Person("John", 30)
//    person.greet()
//}

//enum class Color {
//    RED, GREEN, BLUE
//}
//
//fun main() {
//    val selectedColor = Color.GREEN
//    println("Selected color: $selectedColor")
//}

//interface Shape {
//    fun area(): Double
//    fun perimeter(): Double
//}
//
//class Circle(val radius: Double) : Shape {
//    override fun area(): Double = Math.PI * radius * radius
//    override fun perimeter(): Double = 2 * Math.PI * radius
//}
//
//fun main() {
//    val circle = Circle(5.0)
//    println("Circle Area: ${circle.area()}")
//    println("Circle Perimeter: ${circle.perimeter()}")
//}

//data class Book(val title: String, val author: String, val year: Int)
//
//fun main() {
//    val book = Book("Harry Potter", "J.K. Rowling", 1997)
//    println(book)
//}
//
//fun main() {
//    // Tipe data nullable
//    val name: String? = null
//    val age: Int? = 30
//
//    // Penggunaan tipe data nullable dengan aman (safe call)
//    val length: Int? = name?.length
//    val nextAge: Int? = age?.plus(1)
//
//    // Penggunaan Elvis operator untuk memberikan nilai default
//    val lengthOrZero: Int = name?.length ?: 0
//
//    // Pengecekan null menggunakan if-else
//    if (name != null) {
//        println("Panjang Nama: ${name.length}")
//    } else {
//        println("Nama belum diisi.")
//    }
//
//    // Aman tanpa menggunakan null safety (berpotensi NPE)
//    // val unsafeLength: Int = name.length // Error: Unresolved reference: length
//}

//fun main() {
//    val a = 10
//    val b = 3
//
//    val sum = a + b
//    val difference = a - b
//    val product = a * b
//    val quotient = a / b
//    val remainder = a % b
//
//    println("Penjumlahan: $sum")
//    println("Pengurangan: $difference")
//    println("Perkalian: $product")
//    println("Pembagian: $quotient")
//    println("Modulo: $remainder")
//}

//fun main() {
//    val a = 5
//    val b = 5
//    val c = 10
//
//    println("a == b: ${a == b}")
//    println("a == c: ${a == c}")
//}

//fun main() {
//    val x = true
//    val y = false
//
//    println("x && y: ${x && y}")
//    println("x || y: ${x || y}")
//    println("!x: ${!x}")
//}

fun main() {
    var num = 10

    num = 5 // Penugasan nilai
    println("num setelah penugasan nilai: $num")

    num += 3 // Penugasan penjumlahan
    println("num setelah penugasan penjumlahan: $num")

    num -= 2 // Penugasan pengurangan
    println("num setelah penugasan pengurangan: $num")

    num *= 4 // Penugasan perkalian
    println("num setelah penugasan perkalian: $num")

    num /= 2 // Penugasan pembagian
    println("num setelah penugasan pembagian: $num")

    num %= 3 // Penugasan modulo
    println("num setelah penugasan modulo: $num")
}
