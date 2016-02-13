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

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 164</b>
 * <p>
 * Description: Work relation code
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">ONIX Codelists</a>
 */
public enum WorkRelations
{
	/**
	 * Product X is or includes a manifestation of work Y
	 */
	Manifestation_of("01", "Manifestation of"), //

	/**
	 * Product X is or includes a manifestation of a work derived (directly) from related work Y in one or more of the
	 * ways specified in ISTC rules. This relation type is intended to enable products with a common
	 * &#8216;parent&#8217; work to be linked without specifying the precise nature of their derivation
	 */
	Derived_from("02", "Derived from"), //

	/**
	 * Product X is a manifestation of a work from which related work Y is (directly) derived in one or more of the ways
	 * specified in ISTC rules (reciprocal of code 02)
	 */
	Related_work_is_derived_from_this("03", "Related work is derived from this"), //

	/**
	 * Product X is a manifestation of a work in the same collection as related work Y
	 */
	Other_work_in_same_collection("04", "Other work in same collection"), //

	/**
	 * Product X is a manifestation of a work by the same contributor(s) as related work Y
	 */
	Other_work_by_same_contributor("05", "Other work by same contributor");

	public final String value;
	public final String label;

	private WorkRelations(String value, String label)
	{
		this.value = value;
		this.label = label;
	}

	public static WorkRelations byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		for (WorkRelations e : values())
			if (e.value.equals(value))
				return e;
		return null;
	}
}
