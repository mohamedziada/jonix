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
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 223</b>
 * <p>
 * Description: Status detail code type &lt;p&gt;NOTE: Introduced in Onix3
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">ONIX Codelists</a>
 */
public enum StatusDetailCodeTypes
{
	Proprietary("01", "Proprietary"), //

	/**
	 * Status detail code is taken from List 225
	 */
	ONIX_Status_detail_code("02", "ONIX Status detail code");

	public final String value;
	public final String label;

	private StatusDetailCodeTypes(String value, String label)
	{
		this.value = value;
		this.label = label;
	}

	public static StatusDetailCodeTypes byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		for (StatusDetailCodeTypes e : values())
			if (e.value.equals(value))
				return e;
		return null;
	}
}
