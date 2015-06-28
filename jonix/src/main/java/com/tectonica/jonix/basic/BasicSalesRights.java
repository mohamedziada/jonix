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

package com.tectonica.jonix.basic;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.tectonica.jonix.codelist.CountryCodes;
import com.tectonica.jonix.codelist.Regions;
import com.tectonica.jonix.codelist.RightsRegions;
import com.tectonica.jonix.codelist.SalesRightsTypes;
import com.tectonica.jonix.onix3.Territory;

/**
 * Contains the essential information included in ONIX &lt;SalesRights&gt;
 * <p>
 * NOTE: to access the information, read the (public final) fields directly. No getters() are included..
 * <p>
 * May be constructed from either a {@link com.tectonica.jonix.onix2.SalesRights} or a
 * {@link com.tectonica.jonix.onix3.SalesRights}.
 * 
 * @author Zach Melamed
 */
public class BasicSalesRights implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final SalesRightsTypes salesRightsType;
	public final List<Set<CountryCodes>> countries; // TODO: need to be contracted to merely a Set
	public final Set<Regions> regions;
	public final List<RightsRegions> rightRegions; // only in Onix2
	public final Set<CountryCodes> countriesExcluded; // only in Onix3
	public final Set<Regions> regionsExcluded; // only in Onix3

	public BasicSalesRights(com.tectonica.jonix.onix2.SalesRights salesRights)
	{
		salesRightsType = salesRights.getSalesRightsTypeValue();
		countries = salesRights.getRightsCountrySets();
		regions = salesRights.getRightsTerritorySet();
		rightRegions = salesRights.getRightsRegionValues();
		countriesExcluded = null;
		regionsExcluded = null;
	}

	public BasicSalesRights(com.tectonica.jonix.onix3.SalesRights salesRights)
	{
		Territory territory = salesRights.territory;
		salesRightsType = salesRights.getSalesRightsTypeValue();
		countries = Arrays.asList(territory.getCountriesIncludedSet());
		regions = territory.getRegionsIncludedSet();
		rightRegions = null;
		countriesExcluded = territory.getCountriesExcludedSet();
		regionsExcluded = territory.getRegionsExcludedSet();
	}
}