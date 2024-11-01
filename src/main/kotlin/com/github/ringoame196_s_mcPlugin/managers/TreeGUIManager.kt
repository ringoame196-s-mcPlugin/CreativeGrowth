package com.github.ringoame196_s_mcPlugin.managers

import com.github.ringoame196_s_mcPlugin.Data
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack

class TreeGUIManager {
    fun makeGUi(treeLocation: Location): Inventory {
        val guiSize = 27
        val guiName = Data.GUI_NAME
        val gui = Bukkit.createInventory(null, guiSize, guiName)

        for (treeType in Data.treeTypeMap.keys) {
            val guiItem = ItemStack(Material.BONE_MEAL)
            val meta = guiItem.itemMeta
            meta?.setDisplayName(treeType)
            guiItem.setItemMeta(meta)
            gui.addItem(guiItem)
        }

        return gui
    }
}
