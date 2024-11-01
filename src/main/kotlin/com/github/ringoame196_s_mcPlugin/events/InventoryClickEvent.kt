package com.github.ringoame196_s_mcPlugin.events

import com.github.ringoame196_s_mcPlugin.Data
import com.github.ringoame196_s_mcPlugin.managers.TreeManager
import org.bukkit.Material
import org.bukkit.Sound
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.inventory.InventoryClickEvent
import org.bukkit.inventory.ItemStack

class InventoryClickEvent : Listener {
    private val treeMaterial = TreeManager()

    @EventHandler
    fun onInventoryClickEvent(e: InventoryClickEvent) {
        val player = e.whoClicked as? Player ?: return
        val gui = e.view
        val guiTitle = gui.title
        val guiItem = e.currentItem ?: return
        val guiItemName = guiItem.itemMeta?.displayName ?: return

        if (guiTitle != Data.GUI_NAME) return
        e.isCancelled = true
        e.currentItem = ItemStack(Material.AIR) // アイテムが取れてしまう対策
        player.closeInventory()

        generation(guiItemName, player)
    }

    private fun generation(guiItemName: String, player: Player) {
        val treeType = Data.treeTypeMap[guiItemName] ?: return
        val location = player.location
        val message = "${guiItemName}を生成しました"
        val sound = Sound.ITEM_BONE_MEAL_USE
        treeMaterial.generation(location, treeType)
        player.sendMessage(message)
        player.playSound(player, sound, 1f, 1f)
        treeMaterial.teleportTreeTop(player)
    }
}
