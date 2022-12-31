package com.xinto.opencord.domain.permissions

import androidx.compose.runtime.Immutable
import com.xinto.opencord.rest.models.ApiPermissions

@Immutable
enum class DomainPermission(val flags: Long) {
    NONE(0L),
    CREATE_INSTANT_INVITE(1L shl 0),
    KICK_MEMBERS(1L shl 1),
    BAN_MEMBERS(1L shl 2),
    ADMINISTRATOR(1L shl 3),
    MANAGE_CHANNELS(1L shl 4),
    MANAGE_GUILD(1L shl 5),
    ADD_REACTIONS(1L shl 6),
    VIEW_AUDIT_LOG(1L shl 7),
    PRIORITY_SPEAKER(1L shl 8),
    STREAM(1L shl 9),
    VIEW_CHANNEL(1L shl 10),
    SEND_MESSAGES(1L shl 11),
    SEND_TTS_MESSAGES(1L shl 12),
    MANAGE_MESSAGES(1L shl 13),
    EMBED_LINKS(1L shl 14),
    ATTACH_FILES(1L shl 15),
    READ_MESSAGE_HISTORY(1L shl 16),
    MENTION_EVERYONE(1L shl 17),
    USE_EXTERNAL_EMOJIS(1L shl 18),
    VIEW_GUILD_INSIGHTS(1L shl 19),
    CONNECT(1L shl 20),
    SPEAK(1L shl 21),
    MUTE_MEMBERS(1L shl 22),
    DEAFEN_MEMBERS(1L shl 23),
    MOVE_MEMBERS(1L shl 24),
    USE_VAD(1L shl 25),
    CHANGE_NICKNAME(1L shl 26),
    MANAGE_NICKNAMES(1L shl 27),
    MANAGE_ROLES(1L shl 28),
    MANAGE_WEBHOOKS(1L shl 29),
    MANAGE_EMOJIS_AND_STICKERS(1L shl 30),
    USE_APPLICATION_COMMANDS(1L shl 31),
    REQUEST_TO_SPEAK(1L shl 32),
    MANAGE_EVENTS(1L shl 33),
    MANAGE_THREADS(1L shl 34),
    CREATE_PUBLIC_THREADS(1L shl 35),
    CREATE_PRIVATE_THREADS(1L shl 36),
    USE_EXTERNAL_STICKERS(1L shl 37),
    SEND_MESSAGES_IN_THREADS(1L shl 38),
    USE_EMBEDDED_ACTIVITIES(1L shl 39),
    MODERATE_MEMBERS(1L shl 40);
}

fun ApiPermissions.toDomain(): List<DomainPermission> {
    return DomainPermission.values().filter {
        (value and it.flags) == it.flags
    }
}