package com.shiver.modularmachineryterminal.common.handler;

import com.shiver.modularmachineryterminal.ModularMachineryTerminal;
import com.shiver.modularmachineryterminal.common.MachineInfo;
import com.shiver.modularmachineryterminal.server.MachineCache;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

@Mod.EventBusSubscriber(modid = ModularMachineryTerminal.MOD_ID)
public class PlayerLoggedInHandler {

    /**
     * 在玩家登录后推送其可见的未成型机器提示。
     *
     * @param event 玩家登录事件
     */
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (!(event.player instanceof EntityPlayerMP)) {
            return;
        }

        EntityPlayerMP player = (EntityPlayerMP) event.player;
        for (MachineInfo info : MachineCache.listUnformedMachines(player, true)) {
            sendMachineInfo(player, info);
        }
    }

    /**
     * 向目标对象发送单台未成型机器的提示消息。
     *
     * @param target 消息接收者
     * @param info 机器信息
     */
    public static void sendMachineInfo(ICommandSender target, MachineInfo info) {
        BlockPos pos = info.key.pos;
        int dimension = info.key.dimension;

        TextComponentTranslation message = new TextComponentTranslation(
                "modular_machinery_terminal.machine_prefix",
                info.name,
                dimension
        );
        TextComponentString cord = new TextComponentString(pos.getX() + ", " + pos.getY() + ", " + pos.getZ());
        cord.setStyle(new Style().setColor(TextFormatting.AQUA));

        message.appendSibling(cord);
        message.appendSibling(new TextComponentString(" "));
        message.appendSibling(new TextComponentTranslation("modular_machinery_terminal.unformed"));
        target.sendMessage(message);
    }
}
