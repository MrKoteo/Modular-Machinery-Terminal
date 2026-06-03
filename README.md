# Modular Machinery Terminal

[English](#english) | [中文](#中文)

---

## English

### Overview

Modular Machinery Terminal is a Minecraft 1.12.2 addon mod for Modular Machinery (Community Edition) that provides a powerful remote terminal GUI to monitor and interact with all Modular Machinery multiblock machines in your world.

### Features

#### Remote Machine Monitoring
- **Keybind**: Default Shift+X to open terminal from anywhere
- **Full-Screen Terminal GUI**: View all Modular Machinery controllers across all dimensions in one interface
- **Machine Status Dashboard**: Summary header showing Total/Loaded/Formed/Running counts
- **Color-Coded Status Lamps**: 
  - 🟢 Green: Running
  - 🟡 Yellow: Formed/Idle
  - 🔴 Red: Invalid/Not formed
  - ⚫ Gray: Unloaded
- **Login Notifications**: Receive messages about unformed machines on login

#### Search and Organization
- **Text Search**: Search machines by name with JE Characters pinyin search support
- **Sorting**: Sort by Name, Loaded, Formed, or Running state with ascending/descending toggle
- **Pin/Favorite**: Pin frequently accessed machines to the top of the list

#### Remote Interaction
- **Teleport to Machine**: Teleport directly in front of a machine controller (cross-dimension support)
- **Remote Component GUIs**: Open machine component GUIs remotely (cross-dimension support, supports various ME buses):
  - Controller GUI
  - Input buses
  - Output hatches
  - Pattern providers
  - Upgrade buses
  - Smart interfaces
- **Pagination**: Navigate through multiple components of the same type

#### Detailed Information
- **Recipe Thread Details**: View each thread's name, status, parallelism, progress, and output
- **Smart Interface Display**: Shows bound smart interface data including position, type, and value
- **Energy Consumption**: Monitor machine energy consumption

#### Mod Integration
- **Team Access**: Optionally show controllers owned by FTB Utilities teammates
- **Baubles Support**: Terminal item can be equipped as a Baubles trinket
- **GameStages Integration**: Configure game stages required for teleport functionality

#### Commands
- `/mmt_machines` - List your unformed machines
- `/mmt_machines [player]` - List another player's unformed machines (requires OP)

---

## 中文

### 概述

模块化机械终端是一个 Minecraft 1.12.2 的附加模组，为 模块化机械（社区版） 提供了一个强大的远程终端界面，用于监控和交互世界中所有的模块化机械多方块机器。

### 功能特性

#### 远程机器监控
- **快捷键**：默认Shift+X，随时随地打开终端
- **全屏终端界面**：在一个界面中查看所有维度的模块化机械控制器
- **机器状态仪表板**：显示总计/已加载/已成型/正在运行的计数摘要
- **颜色编码状态灯**：
  - 🟢 绿色：正在运行
  - 🟡 黄色：已成型/空闲
  - 🔴 红色：异常/未成型
  - ⚫ 灰色：未加载
- **登录通知**：进入游戏时接收关于未成型机器的消息

#### 搜索和组织
- **文本搜索**：按名称搜索机器，支持JE Characters的拼音搜索
- **排序**：按名称、加载状态、成型状态或运行状态排序，支持升序/降序切换
- **置顶/收藏**：将常用机器置顶显示

#### 远程交互
- **传送到机器**：直接传送到机器控制器前方（支持跨维度）
- **远程组件界面**：远程打开机器组件界面（支持跨维度，支持各种ME仓）：
  - 控制器界面
  - 输入仓
  - 输出仓
  - 样板供应器
  - 升级总线
  - 智能数据接口
- **分页功能**：浏览同类型的多个组件

#### 详细信息
- **配方线程详情**：查看每个线程的名称、状态、并行度、进度和产出
- **智能数据显示**：显示绑定的智能数据接口信息，包括位置、类型和数值
- **能耗监控**：监控机器的能源消耗

#### MOD联动功能
- **团队访问**：可选择显示FTB Utilities队友拥有的控制器
- **Baubles支持**：终端物品可装备为Baubles饰品
- **gamestage联动**：可以设定使用控制器传送功能的游戏阶段

#### 命令
- `/mmt_machines` - 列出你的未成型机器
- `/mmt_machines [玩家]` - 列出其他玩家的未成型机器（需要OP）
