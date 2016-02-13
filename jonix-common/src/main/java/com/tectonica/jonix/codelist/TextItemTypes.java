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
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 42</b>
 * <p>
 * Description: Text item type code
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">ONIX Codelists</a>
 */
public enum TextItemTypes
{
	/**
	 * A complete work which is published as a content item in a product which carries two or more such works, eg when
	 * two or three novels are published in a single omnibus volume
	 */
	Textual_work("01", "Textual work"), //

	/**
	 * Text components such as Preface, Introduction etc which appear as preliminaries to the main body of text content
	 * in a product
	 */
	Front_matter("02", "Front matter"), //

	/**
	 * Text components such as Part, Chapter, Section etc which appear as part of the main body of text content in a
	 * product
	 */
	Body_matter("03", "Body matter"), //

	/**
	 * Text components such as Index which appear after the main body of text in a product
	 */
	Back_matter("04", "Back matter"), //

	/**
	 * For journals
	 */
	Serial_item_miscellaneous_or_unspecified("10", "Serial item, miscellaneous or unspecified"), //

	/**
	 * For journals
	 */
	Research_article("11", "Research article"), //

	/**
	 * For journals
	 */
	Review_article("12", "Review article"), //

	/**
	 * For journals
	 */
	Letter("13", "Letter"), //

	/**
	 * For journals
	 */
	Short_communication("14", "Short communication"), //

	/**
	 * For journals
	 */
	Erratum("15", "Erratum"), //

	/**
	 * For journals
	 */
	Abstract("16", "Abstract"), //

	/**
	 * For journals
	 */
	Book_review_or_review_of_other_publication("17", "Book review (or review of other publication)"), //

	/**
	 * For journals
	 */
	Editorial("18", "Editorial"), //

	/**
	 * For journals
	 */
	Product_review("19", "Product review"), //

	Index("20", "Index"), //

	/**
	 * For journals
	 */
	Obituary("21", "Obituary");

	public final String value;
	public final String label;

	private TextItemTypes(String value, String label)
	{
		this.value = value;
		this.label = label;
	}

	private static Map<String, TextItemTypes> map;

	private static Map<String, TextItemTypes> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (TextItemTypes e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static TextItemTypes byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}
