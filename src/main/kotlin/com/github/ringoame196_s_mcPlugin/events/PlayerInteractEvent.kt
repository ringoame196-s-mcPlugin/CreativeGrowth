package com.github.ringoame196_s_mcPlugin.events

import com.github.ringoame196_s_mcPlugin.managers.TreeGUIManager
import org.bukkit.GameMode
import org.bukkit.Material
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEvent

class PlayerInteractEvent : Listener {
    private val treeGUIManager = TreeGUIManager()

    @EventHandler
    fun onPlayerInteract(e: PlayerInteractEvent) {
        val player = e.player
        val location = player.location.block.location
        val item = e.item ?: return

        if (player.gameMode != GameMode.CREATIVE) return
        if (!player.isSneaking) return
        if (item.type != Material.BONE_MEAL) return

        e.isCancelled = true
        val gui = treeGUIManager.makeGUi(location)
        player.openInventory(gui)
    }
}
