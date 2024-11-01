package com.github.ringoame196_s_mcPlugin.managers

import org.bukkit.Location
import org.bukkit.TreeType
import org.bukkit.entity.Player

class TreeManager {
    fun generation(location: Location, treeType: TreeType) {
        location.world?.generateTree(location, treeType)
    }

    fun teleportTreeTop(player: Player) {
        val location = player.location
        val world = player.world
        val highestBlock = world.getHighestBlockAt(location).location
        player.teleport(highestBlock)
    }
}
