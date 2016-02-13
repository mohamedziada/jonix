/*
 * Copyright (C) 2012 Zach Melamed
 * 
 * Latest version available online at https://github.com/zach-m/jonix
 * Contact me at zach@tectonica.co.il
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tectonica.jonix.codelist;

import java.util.HashMap;
import java.util.Map;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 93</b>
 * <p>
 * Description: Supplier role
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">ONIX Codelists</a>
 */
public enum SupplierRoles
{
	/**
	 * Default
	 */
	Unspecified("00", "Unspecified"), //

	/**
	 * Publisher as supplier to retail trade outlets
	 */
	Publisher_to_retailers("01", "Publisher to retailers"), //

	Publisher_s_exclusive_distributor_to_retailers("02", "Publisher’s exclusive distributor to retailers"), //

	Publisher_s_non_exclusive_distributor_to_retailers("03", "Publisher’s non-exclusive distributor to retailers"), //

	/**
	 * Wholesaler supplying retail trade outlets
	 */
	Wholesaler("04", "Wholesaler"), //

	/**
	 * DEPRECATED &#8211; use &lt;MarketRepresentation&gt; (ONIX 2.1) or &lt;MarketPublishingDetail&gt; (ONIX 3.0) to
	 * specify a sales agent
	 */
	Sales_agent("05", "Sales agent"), //

	/**
	 * In a specified supply territory. Use only where exclusive/non-exclusive status is not known. Prefer 02 or 03 as
	 * appropriate, where possible
	 */
	Publisher_s_distributor_to_retailers("06", "Publisher’s distributor to retailers"), //

	/**
	 * Where a POD product is supplied to retailers and/or consumers direct from a POD source
	 */
	POD_supplier("07", "POD supplier"), //

	Retailer("08", "Retailer"), //

	/**
	 * Publisher as supplier direct to consumers and/or institutional customers
	 */
	Publisher_to_end_customers("09", "Publisher to end-customers"), //

	/**
	 * Intermediary as exclusive distributor direct to consumers and/or institutional customers
	 */
	Exclusive_distributor_to_end_customers("10", "Exclusive distributor to end-customers"), //

	/**
	 * Intermediary as non-exclusive distributor direct to consumers and/or institutional customers
	 */
	Non_exclusive_distributor_to_end_customers("11", "Non-exclusive distributor to end-customers"), //

	/**
	 * Use only where exclusive/non-exclusive status is not known. Prefer 10 or 11 as appropriate, where possible
	 */
	Distributor_to_end_customers("12", "Distributor to end-customers");

	public final String value;
	public final String label;

	private SupplierRoles(String value, String label)
	{
		this.value = value;
		this.label = label;
	}

	private static Map<String, SupplierRoles> map;

	private static Map<String, SupplierRoles> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (SupplierRoles e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static SupplierRoles byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}
