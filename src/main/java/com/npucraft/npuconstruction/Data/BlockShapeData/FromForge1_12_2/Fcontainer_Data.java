package com.npucraft.npuconstruction.Data.BlockShapeData.FromForge1_12_2;

import net.minecraft.block.Block;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

public class Fcontainer_Data {
    private static final VoxelShape NORTH = VoxelShapes.union(
		Block.createCuboidShape(3, -13, -1, 12, -9, 6),
		Block.createCuboidShape(8, 5, -2, 18, 9, 5),
		Block.createCuboidShape(17, 5, 10, 28, 11, 17),
		Block.createCuboidShape(17, 23, 12, 28, 28, 16),
		Block.createCuboidShape(-14, 14, 11, -8, 18, 17),
		Block.createCuboidShape(-3, -4, 1, 5, 1, 5),
		Block.createCuboidShape(9, 23, 10, 15, 26, 18),
		Block.createCuboidShape(19, -4, 11, 26, 0, 15),
		Block.createCuboidShape(-7, -13, 0, 1, -9, 6),
		Block.createCuboidShape(-3, 14, 15, 4, 19, 19),
		Block.createCuboidShape(-6, 14, 13, -1, 28, 15),
		Block.createCuboidShape(19, 14, 10, 28, 19, 18),
		Block.createCuboidShape(19, 14, -2, 28, 19, 6),
		Block.createCuboidShape(-1, 5, -1, 4, 11, 6),
		Block.createCuboidShape(4, 14, -1, 11, 20, 4),
		Block.createCuboidShape(-9, 5, -1, -4, 11, 6),
		Block.createCuboidShape(-14, 23, 11, -8, 27, 15),
		Block.createCuboidShape(-2, 5, 10, 10, 7, 17),
		Block.createCuboidShape(-9, 14, -2, 1, 16, 4),
		Block.createCuboidShape(-15, -4, 12, -10, 1, 16),
		Block.createCuboidShape(23, -13, 10, 28, -7, 17),
		Block.createCuboidShape(-8, -4, 14, 3, 3, 16),
		Block.createCuboidShape(-8, -4, 17, 3, 3, 19),
		Block.createCuboidShape(-16, 3, -4, 32, 5, -3),
		Block.createCuboidShape(-16, -6, -4, 32, -4, -3),
		Block.createCuboidShape(-16, -6, 19, 32, -4, 20),
		Block.createCuboidShape(-16, 3, 19, 32, 5, 20),
		Block.createCuboidShape(-16, 13, 19, 32, 15, 20),
		Block.createCuboidShape(-16, 22, 19, 32, 24, 20),
		Block.createCuboidShape(-16, 13, -4, 32, 15, -3),
		Block.createCuboidShape(-16, 22, -4, 32, 24, -3),
		Block.createCuboidShape(20, 5, 0, 27, 9, 5),
		Block.createCuboidShape(-4, 23, 0, 14, 29, 4),
		Block.createCuboidShape(8, -4, 0, 14, 0, 4),
		Block.createCuboidShape(7, -4, 11, 17, 2, 16),
		Block.createCuboidShape(-16, -16, 7, 32, 32, 9),
		Block.createCuboidShape(-16, -16, -3, 32, -13, 7),
		Block.createCuboidShape(-16, -16, 9, 32, -13, 19),
		Block.createCuboidShape(-16, -5, 9, 32, -4, 19),
		Block.createCuboidShape(-16, -5, -3, 32, -4, 7),
		Block.createCuboidShape(-16, 4, -3, 32, 5, 7),
		Block.createCuboidShape(-16, 13, -3, 32, 14, 7),
		Block.createCuboidShape(-16, 22, -3, 32, 23, 7),
		Block.createCuboidShape(-16, 22, 9, 32, 23, 19),
		Block.createCuboidShape(-16, 31, 9, 32, 32, 19),
		Block.createCuboidShape(-16, 31, -3, 32, 32, 7),
		Block.createCuboidShape(-16, 13, 9, 32, 14, 19),
		Block.createCuboidShape(-16, 4, 9, 32, 5, 19),
		Block.createCuboidShape(-16, 21, 4, 32, 22, 7),
		Block.createCuboidShape(-16, 30, 4, 32, 31, 7),
		Block.createCuboidShape(-16, 30, 9, 32, 31, 12),
		Block.createCuboidShape(-16, 21, 9, 32, 22, 12),
		Block.createCuboidShape(-16, 12, 9, 32, 13, 12),
		Block.createCuboidShape(-16, 3, 9, 32, 4, 12),
		Block.createCuboidShape(-16, -6, 9, 32, -5, 12),
		Block.createCuboidShape(-16, 12, 4, 32, 13, 7),
		Block.createCuboidShape(-16, 3, 4, 32, 4, 7),
		Block.createCuboidShape(-16, -6, 4, 32, -5, 7),
		Block.createCuboidShape(2, 7, 10, 7, 9, 17),
		Block.createCuboidShape(15, -13, 0, 24, -7, 4),
		Block.createCuboidShape(18, -4, 0, 27, 2, 4),
		Block.createCuboidShape(-6, 16, -2, -2, 18, 4),
		Block.createCuboidShape(-5, 23, 10, -1, 28, 12),
		Block.createCuboidShape(-5, 23, 16, -1, 28, 18),
		Block.createCuboidShape(28, 23, 1, 30, 28, 5),
		Block.createCuboidShape(14, 14, -2, 18, 19, 6),
		Block.createCuboidShape(-15, 23, 2, -7, 28, 6),
		Block.createCuboidShape(-13, 23, -2, -5, 28, 2),
		Block.createCuboidShape(14, 14, 10, 18, 19, 18),
		Block.createCuboidShape(4, -13, 10, 8, -8, 18),
		Block.createCuboidShape(-8, -13, 10, 2, -8, 13),
		Block.createCuboidShape(-10, -13, 14, 0, -8, 17),
		Block.createCuboidShape(-15, -4, 3, -5, 1, 6),
		Block.createCuboidShape(-14, -4, -1, -4, 1, 2),
		Block.createCuboidShape(15, 23, -1, 25, 28, 2),
		Block.createCuboidShape(15, 23, 3, 25, 28, 6)
    );
    private static final VoxelShape EAST = VoxelShapes.union(
		Block.createCuboidShape(10, -13, 3, 17, -9, 12),
		Block.createCuboidShape(11, 5, 8, 18, 9, 18),
		Block.createCuboidShape(-1, 5, 17, 6, 11, 28),
		Block.createCuboidShape(0, 23, 17, 4, 28, 28),
		Block.createCuboidShape(-1, 14, -14, 5, 18, -8),
		Block.createCuboidShape(11, -4, -3, 15, 1, 5),
		Block.createCuboidShape(-2, 23, 9, 6, 26, 15),
		Block.createCuboidShape(1, -4, 19, 5, 0, 26),
		Block.createCuboidShape(10, -13, -7, 16, -9, 1),
		Block.createCuboidShape(-3, 14, -3, 1, 19, 4),
		Block.createCuboidShape(1, 14, -6, 3, 28, -1),
		Block.createCuboidShape(-2, 14, 19, 6, 19, 28),
		Block.createCuboidShape(10, 14, 19, 18, 19, 28),
		Block.createCuboidShape(10, 5, -1, 17, 11, 4),
		Block.createCuboidShape(12, 14, 4, 17, 20, 11),
		Block.createCuboidShape(10, 5, -9, 17, 11, -4),
		Block.createCuboidShape(1, 23, -14, 5, 27, -8),
		Block.createCuboidShape(-1, 5, -2, 6, 7, 10),
		Block.createCuboidShape(12, 14, -9, 18, 16, 1),
		Block.createCuboidShape(0, -4, -15, 4, 1, -10),
		Block.createCuboidShape(-1, -13, 23, 6, -7, 28),
		Block.createCuboidShape(0, -4, -8, 2, 3, 3),
		Block.createCuboidShape(-3, -4, -8, -1, 3, 3),
		Block.createCuboidShape(19, 3, -16, 20, 5, 32),
		Block.createCuboidShape(19, -6, -16, 20, -4, 32),
		Block.createCuboidShape(-4, -6, -16, -3, -4, 32),
		Block.createCuboidShape(-4, 3, -16, -3, 5, 32),
		Block.createCuboidShape(-4, 13, -16, -3, 15, 32),
		Block.createCuboidShape(-4, 22, -16, -3, 24, 32),
		Block.createCuboidShape(19, 13, -16, 20, 15, 32),
		Block.createCuboidShape(19, 22, -16, 20, 24, 32),
		Block.createCuboidShape(11, 5, 20, 16, 9, 27),
		Block.createCuboidShape(12, 23, -4, 16, 29, 14),
		Block.createCuboidShape(12, -4, 8, 16, 0, 14),
		Block.createCuboidShape(0, -4, 7, 5, 2, 17),
		Block.createCuboidShape(7, -16, -16, 9, 32, 32),
		Block.createCuboidShape(9, -16, -16, 19, -13, 32),
		Block.createCuboidShape(-3, -16, -16, 7, -13, 32),
		Block.createCuboidShape(-3, -5, -16, 7, -4, 32),
		Block.createCuboidShape(9, -5, -16, 19, -4, 32),
		Block.createCuboidShape(9, 4, -16, 19, 5, 32),
		Block.createCuboidShape(9, 13, -16, 19, 14, 32),
		Block.createCuboidShape(9, 22, -16, 19, 23, 32),
		Block.createCuboidShape(-3, 22, -16, 7, 23, 32),
		Block.createCuboidShape(-3, 31, -16, 7, 32, 32),
		Block.createCuboidShape(9, 31, -16, 19, 32, 32),
		Block.createCuboidShape(-3, 13, -16, 7, 14, 32),
		Block.createCuboidShape(-3, 4, -16, 7, 5, 32),
		Block.createCuboidShape(9, 21, -16, 12, 22, 32),
		Block.createCuboidShape(9, 30, -16, 12, 31, 32),
		Block.createCuboidShape(4, 30, -16, 7, 31, 32),
		Block.createCuboidShape(4, 21, -16, 7, 22, 32),
		Block.createCuboidShape(4, 12, -16, 7, 13, 32),
		Block.createCuboidShape(4, 3, -16, 7, 4, 32),
		Block.createCuboidShape(4, -6, -16, 7, -5, 32),
		Block.createCuboidShape(9, 12, -16, 12, 13, 32),
		Block.createCuboidShape(9, 3, -16, 12, 4, 32),
		Block.createCuboidShape(9, -6, -16, 12, -5, 32),
		Block.createCuboidShape(-1, 7, 2, 6, 9, 7),
		Block.createCuboidShape(12, -13, 15, 16, -7, 24),
		Block.createCuboidShape(12, -4, 18, 16, 2, 27),
		Block.createCuboidShape(12, 16, -6, 18, 18, -2),
		Block.createCuboidShape(4, 23, -5, 6, 28, -1),
		Block.createCuboidShape(-2, 23, -5, 0, 28, -1),
		Block.createCuboidShape(11, 23, 28, 15, 28, 30),
		Block.createCuboidShape(10, 14, 14, 18, 19, 18),
		Block.createCuboidShape(10, 23, -15, 14, 28, -7),
		Block.createCuboidShape(14, 23, -13, 18, 28, -5),
		Block.createCuboidShape(-2, 14, 14, 6, 19, 18),
		Block.createCuboidShape(-2, -13, 4, 6, -8, 8),
		Block.createCuboidShape(3, -13, -8, 6, -8, 2),
		Block.createCuboidShape(-1, -13, -10, 2, -8, 0),
		Block.createCuboidShape(10, -4, -15, 13, 1, -5),
		Block.createCuboidShape(14, -4, -14, 17, 1, -4),
		Block.createCuboidShape(14, 23, 15, 17, 28, 25),
		Block.createCuboidShape(10, 23, 15, 13, 28, 25)
    );
    private static final VoxelShape SOUTH = VoxelShapes.union(
		Block.createCuboidShape(4, -13, 10, 13, -9, 17),
		Block.createCuboidShape(-2, 5, 11, 8, 9, 18),
		Block.createCuboidShape(-12, 5, -1, -1, 11, 6),
		Block.createCuboidShape(-12, 23, 0, -1, 28, 4),
		Block.createCuboidShape(24, 14, -1, 30, 18, 5),
		Block.createCuboidShape(11, -4, 11, 19, 1, 15),
		Block.createCuboidShape(1, 23, -2, 7, 26, 6),
		Block.createCuboidShape(-10, -4, 1, -3, 0, 5),
		Block.createCuboidShape(15, -13, 10, 23, -9, 16),
		Block.createCuboidShape(12, 14, -3, 19, 19, 1),
		Block.createCuboidShape(17, 14, 1, 22, 28, 3),
		Block.createCuboidShape(-12, 14, -2, -3, 19, 6),
		Block.createCuboidShape(-12, 14, 10, -3, 19, 18),
		Block.createCuboidShape(12, 5, 10, 17, 11, 17),
		Block.createCuboidShape(5, 14, 12, 12, 20, 17),
		Block.createCuboidShape(20, 5, 10, 25, 11, 17),
		Block.createCuboidShape(24, 23, 1, 30, 27, 5),
		Block.createCuboidShape(6, 5, -1, 18, 7, 6),
		Block.createCuboidShape(15, 14, 12, 25, 16, 18),
		Block.createCuboidShape(26, -4, 0, 31, 1, 4),
		Block.createCuboidShape(-12, -13, -1, -7, -7, 6),
		Block.createCuboidShape(13, -4, 0, 24, 3, 2),
		Block.createCuboidShape(13, -4, -3, 24, 3, -1),
		Block.createCuboidShape(-16, 3, 19, 32, 5, 20),
		Block.createCuboidShape(-16, -6, 19, 32, -4, 20),
		Block.createCuboidShape(-16, -6, -4, 32, -4, -3),
		Block.createCuboidShape(-16, 3, -4, 32, 5, -3),
		Block.createCuboidShape(-16, 13, -4, 32, 15, -3),
		Block.createCuboidShape(-16, 22, -4, 32, 24, -3),
		Block.createCuboidShape(-16, 13, 19, 32, 15, 20),
		Block.createCuboidShape(-16, 22, 19, 32, 24, 20),
		Block.createCuboidShape(-11, 5, 11, -4, 9, 16),
		Block.createCuboidShape(2, 23, 12, 20, 29, 16),
		Block.createCuboidShape(2, -4, 12, 8, 0, 16),
		Block.createCuboidShape(-1, -4, 0, 9, 2, 5),
		Block.createCuboidShape(-16, -16, 7, 32, 32, 9),
		Block.createCuboidShape(-16, -16, 9, 32, -13, 19),
		Block.createCuboidShape(-16, -16, -3, 32, -13, 7),
		Block.createCuboidShape(-16, -5, -3, 32, -4, 7),
		Block.createCuboidShape(-16, -5, 9, 32, -4, 19),
		Block.createCuboidShape(-16, 4, 9, 32, 5, 19),
		Block.createCuboidShape(-16, 13, 9, 32, 14, 19),
		Block.createCuboidShape(-16, 22, 9, 32, 23, 19),
		Block.createCuboidShape(-16, 22, -3, 32, 23, 7),
		Block.createCuboidShape(-16, 31, -3, 32, 32, 7),
		Block.createCuboidShape(-16, 31, 9, 32, 32, 19),
		Block.createCuboidShape(-16, 13, -3, 32, 14, 7),
		Block.createCuboidShape(-16, 4, -3, 32, 5, 7),
		Block.createCuboidShape(-16, 21, 9, 32, 22, 12),
		Block.createCuboidShape(-16, 30, 9, 32, 31, 12),
		Block.createCuboidShape(-16, 30, 4, 32, 31, 7),
		Block.createCuboidShape(-16, 21, 4, 32, 22, 7),
		Block.createCuboidShape(-16, 12, 4, 32, 13, 7),
		Block.createCuboidShape(-16, 3, 4, 32, 4, 7),
		Block.createCuboidShape(-16, -6, 4, 32, -5, 7),
		Block.createCuboidShape(-16, 12, 9, 32, 13, 12),
		Block.createCuboidShape(-16, 3, 9, 32, 4, 12),
		Block.createCuboidShape(-16, -6, 9, 32, -5, 12),
		Block.createCuboidShape(9, 7, -1, 14, 9, 6),
		Block.createCuboidShape(-8, -13, 12, 1, -7, 16),
		Block.createCuboidShape(-11, -4, 12, -2, 2, 16),
		Block.createCuboidShape(18, 16, 12, 22, 18, 18),
		Block.createCuboidShape(17, 23, 4, 21, 28, 6),
		Block.createCuboidShape(17, 23, -2, 21, 28, 0),
		Block.createCuboidShape(-14, 23, 11, -12, 28, 15),
		Block.createCuboidShape(-2, 14, 10, 2, 19, 18),
		Block.createCuboidShape(23, 23, 10, 31, 28, 14),
		Block.createCuboidShape(21, 23, 14, 29, 28, 18),
		Block.createCuboidShape(-2, 14, -2, 2, 19, 6),
		Block.createCuboidShape(8, -13, -2, 12, -8, 6),
		Block.createCuboidShape(14, -13, 3, 24, -8, 6),
		Block.createCuboidShape(16, -13, -1, 26, -8, 2),
		Block.createCuboidShape(21, -4, 10, 31, 1, 13),
		Block.createCuboidShape(20, -4, 14, 30, 1, 17),
		Block.createCuboidShape(-9, 23, 14, 1, 28, 17),
		Block.createCuboidShape(-9, 23, 10, 1, 28, 13)
    );
    private static final VoxelShape WEST = VoxelShapes.union(
		Block.createCuboidShape(-1, -13, 4, 6, -9, 13),
		Block.createCuboidShape(-2, 5, -2, 5, 9, 8),
		Block.createCuboidShape(10, 5, -12, 17, 11, -1),
		Block.createCuboidShape(12, 23, -12, 16, 28, -1),
		Block.createCuboidShape(11, 14, 24, 17, 18, 30),
		Block.createCuboidShape(1, -4, 11, 5, 1, 19),
		Block.createCuboidShape(10, 23, 1, 18, 26, 7),
		Block.createCuboidShape(11, -4, -10, 15, 0, -3),
		Block.createCuboidShape(0, -13, 15, 6, -9, 23),
		Block.createCuboidShape(15, 14, 12, 19, 19, 19),
		Block.createCuboidShape(13, 14, 17, 15, 28, 22),
		Block.createCuboidShape(10, 14, -12, 18, 19, -3),
		Block.createCuboidShape(-2, 14, -12, 6, 19, -3),
		Block.createCuboidShape(-1, 5, 12, 6, 11, 17),
		Block.createCuboidShape(-1, 14, 5, 4, 20, 12),
		Block.createCuboidShape(-1, 5, 20, 6, 11, 25),
		Block.createCuboidShape(11, 23, 24, 15, 27, 30),
		Block.createCuboidShape(10, 5, 6, 17, 7, 18),
		Block.createCuboidShape(-2, 14, 15, 4, 16, 25),
		Block.createCuboidShape(12, -4, 26, 16, 1, 31),
		Block.createCuboidShape(10, -13, -12, 17, -7, -7),
		Block.createCuboidShape(14, -4, 13, 16, 3, 24),
		Block.createCuboidShape(17, -4, 13, 19, 3, 24),
		Block.createCuboidShape(-4, 3, -16, -3, 5, 32),
		Block.createCuboidShape(-4, -6, -16, -3, -4, 32),
		Block.createCuboidShape(19, -6, -16, 20, -4, 32),
		Block.createCuboidShape(19, 3, -16, 20, 5, 32),
		Block.createCuboidShape(19, 13, -16, 20, 15, 32),
		Block.createCuboidShape(19, 22, -16, 20, 24, 32),
		Block.createCuboidShape(-4, 13, -16, -3, 15, 32),
		Block.createCuboidShape(-4, 22, -16, -3, 24, 32),
		Block.createCuboidShape(0, 5, -11, 5, 9, -4),
		Block.createCuboidShape(0, 23, 2, 4, 29, 20),
		Block.createCuboidShape(0, -4, 2, 4, 0, 8),
		Block.createCuboidShape(11, -4, -1, 16, 2, 9),
		Block.createCuboidShape(7, -16, -16, 9, 32, 32),
		Block.createCuboidShape(-3, -16, -16, 7, -13, 32),
		Block.createCuboidShape(9, -16, -16, 19, -13, 32),
		Block.createCuboidShape(9, -5, -16, 19, -4, 32),
		Block.createCuboidShape(-3, -5, -16, 7, -4, 32),
		Block.createCuboidShape(-3, 4, -16, 7, 5, 32),
		Block.createCuboidShape(-3, 13, -16, 7, 14, 32),
		Block.createCuboidShape(-3, 22, -16, 7, 23, 32),
		Block.createCuboidShape(9, 22, -16, 19, 23, 32),
		Block.createCuboidShape(9, 31, -16, 19, 32, 32),
		Block.createCuboidShape(-3, 31, -16, 7, 32, 32),
		Block.createCuboidShape(9, 13, -16, 19, 14, 32),
		Block.createCuboidShape(9, 4, -16, 19, 5, 32),
		Block.createCuboidShape(4, 21, -16, 7, 22, 32),
		Block.createCuboidShape(4, 30, -16, 7, 31, 32),
		Block.createCuboidShape(9, 30, -16, 12, 31, 32),
		Block.createCuboidShape(9, 21, -16, 12, 22, 32),
		Block.createCuboidShape(9, 12, -16, 12, 13, 32),
		Block.createCuboidShape(9, 3, -16, 12, 4, 32),
		Block.createCuboidShape(9, -6, -16, 12, -5, 32),
		Block.createCuboidShape(4, 12, -16, 7, 13, 32),
		Block.createCuboidShape(4, 3, -16, 7, 4, 32),
		Block.createCuboidShape(4, -6, -16, 7, -5, 32),
		Block.createCuboidShape(10, 7, 9, 17, 9, 14),
		Block.createCuboidShape(0, -13, -8, 4, -7, 1),
		Block.createCuboidShape(0, -4, -11, 4, 2, -2),
		Block.createCuboidShape(-2, 16, 18, 4, 18, 22),
		Block.createCuboidShape(10, 23, 17, 12, 28, 21),
		Block.createCuboidShape(16, 23, 17, 18, 28, 21),
		Block.createCuboidShape(1, 23, -14, 5, 28, -12),
		Block.createCuboidShape(-2, 14, -2, 6, 19, 2),
		Block.createCuboidShape(2, 23, 23, 6, 28, 31),
		Block.createCuboidShape(-2, 23, 21, 2, 28, 29),
		Block.createCuboidShape(10, 14, -2, 18, 19, 2),
		Block.createCuboidShape(10, -13, 8, 18, -8, 12),
		Block.createCuboidShape(10, -13, 14, 13, -8, 24),
		Block.createCuboidShape(14, -13, 16, 17, -8, 26),
		Block.createCuboidShape(3, -4, 21, 6, 1, 31),
		Block.createCuboidShape(-1, -4, 20, 2, 1, 30),
		Block.createCuboidShape(-1, 23, -9, 2, 28, 1),
		Block.createCuboidShape(3, 23, -9, 6, 28, 1)
    );

    public Fcontainer_Data() {
    }

    public static VoxelShape getNORTH() {
        return NORTH;
    }

    public static VoxelShape getEAST() {
        return EAST;
    }

    public static VoxelShape getSOUTH() {
        return SOUTH;
    }

    public static VoxelShape getWEST() {
        return WEST;
    }
}
