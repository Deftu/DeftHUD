package xyz.deftu.template

import net.fabricmc.api.ModInitializer

object TemplateMod : ModInitializer {
    const val NAME = "@MOD_NAME@"
    const val ID = "@MOD_ID@"
    const val VERSION = "@MOD_VERSION@"

    override fun onInitialize() {
        // TODO - Your general code here... (both client and server)
    }
}
