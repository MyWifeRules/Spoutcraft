/*
 * This file is part of Spoutcraft (http://wiki.getspout.org/).
 * 
 * Spoutcraft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Spoutcraft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.spoutcraft.client.gui.minimap;

import org.spoutcraft.spoutcraftapi.event.screen.ButtonClickEvent;
import org.spoutcraft.spoutcraftapi.gui.GenericCheckBox;

public class ScaleToggleCheckBox extends GenericCheckBox{
	public ScaleToggleCheckBox() {
		super("Scale Minimap");
		setChecked(MinimapConfig.getInstance().isScale());
		setTooltip("Scale Minimap\nThe minimap will resize itself based on the \ndimensions of your screen.");
	}

	@Override
	public void onButtonClick(ButtonClickEvent event) {
		MinimapConfig.getInstance().setScale(isChecked());
	}
}
