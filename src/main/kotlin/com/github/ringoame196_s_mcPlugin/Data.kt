package com.github.ringoame196_s_mcPlugin

import org.bukkit.ChatColor
import org.bukkit.TreeType

object Data {
    val GUI_NAME = "${ChatColor.DARK_RED}木 選択画面"

    val treeTypeMap = mapOf(
        // オーク系
        "${ChatColor.AQUA}オーク" to TreeType.TREE,
        "${ChatColor.AQUA}大きなオーク" to TreeType.BIG_TREE,
        "${ChatColor.AQUA}ダークオーク" to TreeType.DARK_OAK,

        // シラカバ系
        "${ChatColor.YELLOW}シラカバ" to TreeType.BIRCH,
        "${ChatColor.YELLOW}背の高いシラカバ" to TreeType.TALL_BIRCH,

        // アカシア系
        "${ChatColor.GOLD}アカシア" to TreeType.ACACIA,

        // ツツジ系
        "${ChatColor.YELLOW}ツツジ" to TreeType.AZALEA,

        // サクラ系
        "${ChatColor.LIGHT_PURPLE}サクラ" to TreeType.CHERRY,

        // ジャングル系
        "${ChatColor.GOLD}ジャングル" to TreeType.JUNGLE,
        "${ChatColor.GOLD}ジャングル低木" to TreeType.JUNGLE_BUSH,
        "${ChatColor.GOLD}小さなジャングル" to TreeType.SMALL_JUNGLE,

        // マングローブ系
        "${ChatColor.RED}マングローブ" to TreeType.MANGROVE,
        "${ChatColor.RED}背の高いマングローブ" to TreeType.TALL_MANGROVE,

        // 松・レッドウッド系
        "${ChatColor.DARK_RED}松" to TreeType.REDWOOD,
        "${ChatColor.DARK_RED}大きな松" to TreeType.MEGA_REDWOOD,
        "${ChatColor.DARK_RED}背の高い松" to TreeType.TALL_REDWOOD,

        // 沼地系
        "${ChatColor.DARK_RED}沼地の木" to TreeType.SWAMP,

        // クリムゾン・ワープファンガス
        "${ChatColor.DARK_RED}紅いキノコ" to TreeType.CRIMSON_FUNGUS,
        "${ChatColor.DARK_RED}ワープファンガス" to TreeType.WARPED_FUNGUS,

        // コーラス植物
        "${ChatColor.YELLOW}コーラス植物" to TreeType.CHORUS_PLANT,

        // キノコ系
        "${ChatColor.DARK_RED}茶色のキノコ" to TreeType.BROWN_MUSHROOM,
        "${ChatColor.RED}赤いキノコ" to TreeType.RED_MUSHROOM,

        // ココアの木
        "${ChatColor.YELLOW}ココアの木" to TreeType.COCOA_TREE
    )
}
