/*
 * This file is part of Spoutcraft (http://www.spout.org/).
 *
 * Spoutcraft is licensed under the SpoutDev License Version 1.
 *
 * Spoutcraft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * Spoutcraft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev license version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spoutcraft.client.player;

import net.minecraft.client.Minecraft;
import net.minecraft.src.EntityPlayer;

import org.spoutcraft.client.entity.CraftHumanEntity;
import org.spoutcraft.spoutcraftapi.entity.Player;

public class SpoutPlayer extends CraftHumanEntity implements Player{
	public SpoutPlayer(net.minecraft.src.EntityPlayer handle) {
		super(handle);
		this.handle = handle;
	}

	public EntityPlayer getMCPlayer() {
		return (EntityPlayer)handle;
	}

	public void setPlayer(EntityPlayer player) {
		this.handle = player;
	}

	public boolean isOnline() {
		return Minecraft.theMinecraft.isMultiplayerWorld();
	}

	public boolean isSneaking() {
		return getMCPlayer().isSneaking();
	}

	public void setSneaking(boolean sneak) {
		getMCPlayer().setFlag(1, sneak);
	}
}
