package server.player

class Player(var stamina: Int) {
    private val initialStamina = stamina;
    inner class Statistics {
        fun checkStamina(): Boolean {
            return stamina > 0
        }

        fun decrementStamina() {
            stamina = stamina.dec()
        }
    }

    fun reset() {
        stamina = initialStamina
    }
}
