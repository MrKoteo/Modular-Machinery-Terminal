package com.shiver.modularmachineryterminal.server.command;

import com.shiver.modularmachineryterminal.common.MachineInfo;
import com.shiver.modularmachineryterminal.common.handler.PlayerLoggedInHandler;
import com.shiver.modularmachineryterminal.server.MachineCache;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;

import javax.annotation.Nonnull;

public class CommandMachineStatus extends CommandBase {

    /**
     * 返回机器状态查询命令的名称。
     *
     * @return 命令名称
     */
    @Override
    @Nonnull
    public String getName() {
        return "mmt_machines";
    }

    /**
     * 返回命令用法说明。
     *
     * @param sender 执行命令的对象
     * @return 用法文本
     */
    @Override
    @Nonnull
    public String getUsage(@Nonnull ICommandSender sender) {
        return "/mmt_machines [player]";
    }

    /**
     * 返回执行命令所需的基础权限等级。
     *
     * @return 基础权限等级
     */
    @Override
    public int getRequiredPermissionLevel() {
        return 0;
    }

    /**
     * 输出指定玩家可见的未成型机器列表。
     *
     * @param server 当前服务器
     * @param sender 执行命令的对象
     * @param args 命令参数，留空查询自己，传入玩家名查询目标玩家
     * @throws CommandException 参数非法、目标玩家不存在或权限不足时抛出
     */
    @Override
    public void execute(@Nonnull MinecraftServer server, @Nonnull ICommandSender sender, String[] args) throws CommandException {
        if (args.length > 1) {
            throw new CommandException(getUsage(sender));
        }

        EntityPlayerMP queryTarget;
        if (args.length == 1) {
            if (!sender.canUseCommand(2, getName())) {
                throw new CommandException("commands.generic.permission");
            }
            queryTarget = getPlayer(server, sender, args[0]);
        } else {
            queryTarget = getCommandSenderAsPlayer(sender);
        }
        for (MachineInfo info : MachineCache.listUnformedMachines(queryTarget, true)) {
            PlayerLoggedInHandler.sendMachineInfo(sender, info);
        }
    }
}
