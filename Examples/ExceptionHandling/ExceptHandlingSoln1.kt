// ExceptionHandling/ExceptHandlingSoln1.kt
package exceptionhandlingsoln1
import kotlin.random.Random             // STARTER CODE

data class Hamster(val name: String)

open class HamsterCageException(
  val msg: String
): Exception() {
  override fun toString() =
    "HamsterCageException: $msg"
}

class CageFullException(val limit: Int):
  HamsterCageException("Cage full > $limit")

class NoSuchHamsterException(val id: String):
  HamsterCageException("No Hamster $id")

class OutOfWaterException:
  HamsterCageException("Cage out of water")

class HamsterCage(val capacity: Int) {   // STARTER CODE
  private val seed = Random(47)          // STARTER CODE
  private val cage = HashSet<Hamster>()
  fun add(h: Hamster) {
    if (cage.size >= capacity)
      throw CageFullException(capacity)
    cage.add(h)
  }
  fun get(name: String): Hamster {
    for (h in cage)
      if (h.name == name)
        return h
    throw NoSuchHamsterException(name)
  }
  fun feed(): String {
    if ((0..10).random(seed) > 8)
      throw OutOfWaterException()
    return "Feeding complete"
  }
}

val hamsters = listOf(                 // STARTER CODE
  Hamster("Sally"), Hamster("Ralph"),  // STARTER CODE
  Hamster("Bob"), Hamster("Sergio"),   // STARTER CODE
  Hamster("Allison"), Hamster("Jane")) // STARTER CODE

fun test(hc: HamsterCage) {
  try {
    for (h in hamsters) {
      println("$h")
      hc.add(h)
    }
  } catch (e: CageFullException) {
    println("$e")
  }
  try {
    println("${hc.get(hamsters[0].name)}")
    println("${hc.get("Morty")}")
  } catch (e: NoSuchHamsterException) {
    println("$e")
  }
  try {
    println(hc.feed())
    println(hc.feed())
    println(hc.feed())
  } catch (e: OutOfWaterException) {
    println("$e")
  }
}

// All of main() is STARTER CODE:
fun main() {
  test(HamsterCage(3))
}
/* Output:
Hamster(name=Sally)
Hamster(name=Ralph)
Hamster(name=Bob)
Hamster(name=Sergio)
HamsterCageException: Cage full > 3
Hamster(name=Sally)
HamsterCageException: No Hamster Morty
Feeding complete
HamsterCageException: Cage out of water
*/
