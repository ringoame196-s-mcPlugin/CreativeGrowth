package com.github.ringoame196_s_mcPlugin.managers

import com.github.ringoame196_s_mcPlugin.Data
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.World
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.InventoryView
import org.bukkit.inventory.ItemStack

class TreeGUIManager {
    private val displayLocationItemSlot = 0

    fun makeGUi(treeLocation: Location): Inventory {
        val guiSize = 27
        val guiName = Data.GUI_NAME
        val gui = Bukkit.createInventory(null, guiSize, guiName)
        val displayTreeLocationItem = makeDisplayTreeLocation(treeLocation)

        gui.setItem(displayLocationItemSlot, displayTreeLocationItem)

        for (treeType in Data.treeTypeMap.keys) {
            val guiItem = ItemStack(Material.BONE_MEAL)
            val meta = guiItem.itemMeta
            meta?.setDisplayName(treeType)
            guiItem.setItemMeta(meta)
            gui.addItem(guiItem)
        }

        return gui
    }

    private fun makeDisplayTreeLocation(treeLocation: Location): ItemStack {
        val item = ItemStack(Material.COMPASS)
        val meta = item.itemMeta
        meta?.setDisplayName("x:${treeLocation.x.toInt()}y:${treeLocation.y.toInt()}z:${treeLocation.z.toInt()}")
        item.setItemMeta(meta)
        return item
    }

    fun acquisitionTreeLocation(gui: InventoryView, world: World): Location? {
        val displayItem = gui.getItem(displayLocationItemSlot) ?: return null
        val locationText = displayItem.itemMeta?.displayName ?: return null
        val regex = Regex("""x\s*:\s*(-?\d+)\s*y\s*:\s*(-?\d+)\s*z\s*:\s*(-?\d+)""")

        return regex.find(locationText)?.destructured?.let { (x, y, z) ->
            Location(world, x.toDouble(), y.toDouble(), z.toDouble())
        }
    }
}
