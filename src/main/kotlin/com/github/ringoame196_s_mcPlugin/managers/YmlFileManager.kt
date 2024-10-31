package com.github.ringoame196_s_mcPlugin.managers

import org.bukkit.configuration.file.YamlConfiguration
import java.io.File

class YmlFileManager(private val file: File) {
    private fun acquisitionYml(): YamlConfiguration {
        return YamlConfiguration.loadConfiguration(file)
    }

    fun acquisitionIntValue(key: String): Int {
        val ymlFile = acquisitionYml()
        return ymlFile.getInt(key)
    }

    fun acquisitionStringValue(key: String): String? {
        val ymlFile = acquisitionYml()
        return ymlFile.getString(key)
    }

    fun acquisitionListValue(key: String): MutableList<String> {
        val ymlFile = acquisitionYml()
        return ymlFile.getStringList(key)
    }

    fun setValue(file: File, key: String, value: Any?) {
        val ymlFile = acquisitionYml()
        ymlFile.set(key, value)
        ymlFile.save(file)
    }
}
