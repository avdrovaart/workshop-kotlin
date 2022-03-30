package server.model

class Player(var stamina: Int) {
    private val initialStamina = stamina;
    private val inventory = mutableListOf<String>()

    inner class Statistics {
        fun checkStamina(): Boolean {
            return stamina > 0
        }

        fun decrementStamina() {
            stamina = stamina.dec()
        }
    }

    inner class Inventory {
        fun getInventory(): List<String> {
            return inventory.toList();
        }

        fun addItems(items: Set<String>) {
            inventory.addAll(items);
        }

        fun checkInventory(item: String): Boolean {
            return inventory.contains(item);
        }

        fun removeItem(item: String): Boolean {
            return inventory.remove(item);
        }
    }

    fun reset() {
        stamina = initialStamina
        inventory.clear();
    }
}
