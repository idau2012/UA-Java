 /* Copyright (c) 1996-2015, OPC Foundation. All rights reserved.
   The source code in this file is covered under a dual-license scenario:
     - RCL: for OPC Foundation members in good-standing
     - GPL V2: everybody else
   RCL license terms accompanied with this source code. See http://opcfoundation.org/License/RCL/1.00/
   GNU General Public License as published by the Free Software Foundation;
   version 2 of the License are accompanied with this source code. See http://opcfoundation.org/License/GPLv2
   This source code is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
*/

package org.opcfoundation.ua.core;

import java.util.EnumSet;

import org.opcfoundation.ua.builtintypes.Enumeration; 
import org.opcfoundation.ua.builtintypes.NodeId;
import org.opcfoundation.ua.builtintypes.UnsignedInteger;
import org.opcfoundation.ua.core.Identifiers;



public enum FilterOperator implements Enumeration {

    Equals,
    IsNull,
    GreaterThan,
    LessThan,
    GreaterThanOrEqual,
    LessThanOrEqual,
    Like,
    Not,
    Between,
    InList,
    And,
    Or,
    Cast,
    InView,
    OfType,
    RelatedTo,
    BitwiseAnd,
    BitwiseOr;
	
	public static final NodeId ID = Identifiers.FilterOperator;
	public static EnumSet<FilterOperator> NONE = EnumSet.noneOf( FilterOperator.class );
	public static EnumSet<FilterOperator> ALL = EnumSet.allOf( FilterOperator.class );
	
	@Override
	public int getValue() {
		return ordinal();
	}

	public static FilterOperator valueOf(int value)
	{
		if (value<0 || value>=values().length) return null;
		return values()[value];
	}

	public static FilterOperator valueOf(Integer value)
	{
		return value == null ? null : valueOf(value.intValue());
	}

	public static FilterOperator valueOf(UnsignedInteger value)
	{
		return value == null ? null : valueOf(value.intValue());
	}

	public static FilterOperator[] valueOf(int[] value)
	{
		FilterOperator[] result = new FilterOperator[value.length];
		for(int i=0; i<value.length; i++)
		  result[i] = valueOf(value[i]);
		return result;
	}

	public static FilterOperator[] valueOf(Integer[] value)
	{
		FilterOperator[] result = new FilterOperator[value.length];
		for(int i=0; i<value.length; i++)
		  result[i] = valueOf(value[i]);
		return result;
	}
	
	public static FilterOperator[] valueOf(UnsignedInteger[] value)
	{
		FilterOperator[] result = new FilterOperator[value.length];
		for(int i=0; i<value.length; i++)
		  result[i] = valueOf(value[i]);
		return result;
	}

}