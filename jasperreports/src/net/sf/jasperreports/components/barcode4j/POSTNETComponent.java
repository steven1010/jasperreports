/*
 * ============================================================================
 * GNU Lesser General Public License
 * ============================================================================
 *
 * JasperReports - Free Java report-generating library.
 * Copyright (C) 2001-2009 JasperSoft Corporation http://www.jaspersoft.com
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307, USA.
 * 
 * JasperSoft Corporation
 * 539 Bryant Street, Suite 100
 * San Francisco, CA 94107
 * http://www.jaspersoft.com
 */
package net.sf.jasperreports.components.barcode4j;

import net.sf.jasperreports.engine.JRConstants;

/**
 * 
 * @author Lucian Chirita (lucianc@users.sourceforge.net)
 * @version $Id$
 */
public class POSTNETComponent extends BarcodeComponent
{

	private static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;

	public static final String PROPERTY_SHORT_BAR_HEIGHT = "shortBarHeight";
	public static final String PROPERTY_BASELINE_POSITION = "baselinePosition";
	public static final String PROPERTY_CHECKSUM_MODE = "checksumMode";
	public static final String PROPERTY_DISPLAY_CHECKSUM = "displayChecksum";
	public static final String PROPERTY_INTERCHAR_GAP_WIDTH = "intercharGapWidth";
	
	private Double shortBarHeight;
	private String baselinePosition;
	private String checksumMode;
	private Boolean displayChecksum;
	private Double intercharGapWidth;
	
	public void receive(BarcodeVisitor visitor)
	{
		visitor.visitPostnet(this);
	}

	public String getBaselinePosition()
	{
		return baselinePosition;
	}

	public void setBaselinePosition(String baselinePosition)
	{
		Object old = this.baselinePosition;
		this.baselinePosition = baselinePosition;
		getEventSupport().firePropertyChange(PROPERTY_BASELINE_POSITION, 
				old, this.baselinePosition);
	}

	public String getChecksumMode()
	{
		return checksumMode;
	}

	public void setChecksumMode(String checksumMode)
	{
		Object old = this.checksumMode;
		this.checksumMode = checksumMode;
		getEventSupport().firePropertyChange(PROPERTY_CHECKSUM_MODE, 
				old, this.checksumMode);
	}

	public Boolean getDisplayChecksum()
	{
		return displayChecksum;
	}

	public void setDisplayChecksum(Boolean displayChecksum)
	{
		Object old = this.displayChecksum;
		this.displayChecksum = displayChecksum;
		getEventSupport().firePropertyChange(PROPERTY_DISPLAY_CHECKSUM, 
				old, this.displayChecksum);
	}

	public Double getIntercharGapWidth()
	{
		return intercharGapWidth;
	}

	public void setIntercharGapWidth(Double intercharGapWidth)
	{
		Object old = this.intercharGapWidth;
		this.intercharGapWidth = intercharGapWidth;
		getEventSupport().firePropertyChange(PROPERTY_INTERCHAR_GAP_WIDTH, 
				old, this.intercharGapWidth);
	}

	public Double getShortBarHeight()
	{
		return shortBarHeight;
	}

	public void setShortBarHeight(Double shortBarHeight)
	{
		Object old = this.shortBarHeight;
		this.shortBarHeight = shortBarHeight;
		getEventSupport().firePropertyChange(PROPERTY_SHORT_BAR_HEIGHT, 
				old, this.shortBarHeight);
	}

}
