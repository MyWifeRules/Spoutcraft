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
package org.spoutcraft.client.gui.minimap;

import java.util.ArrayList;
import java.util.List;

import org.spoutcraft.spoutcraftapi.gui.GenericComboBox;

public class ZoomModeButton extends GenericComboBox {
	public ZoomModeButton() {
		setTooltip("Changes the zoom level of the minimap.");
		List<String> names = new ArrayList<String>(3);
		names.add("Zoom: 0");
		names.add("Zoom: 1");
		names.add("Zoom: 2");
		names.add("Zoom: 3");
		setItems(names);
		setSelection(MinimapConfig.getInstance().getZoom());
	}

	@Override
	public void onSelectionChanged(int i, String text) {
		MinimapConfig.getInstance().setZoom(i);
		System.out.println("Set zoom to " + i);
	}

}