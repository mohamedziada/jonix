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
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 82</b>
 * <p>
 * Description: Bible contents
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">ONIX Codelists</a>
 */
public enum BibleContentss
{
	/**
	 * The seven portions of the Apocrypha added to the Catholic canon at the Council of Trent in 1546: Tobit; Judith;
	 * Wisdom of Solomon; Sirach (Ecclesiasticus); Baruch, including the Letter of Jeremiah; I and II Maccabees; Extra
	 * portions of Esther and Daniel (Additions to Esther; the Prayer of Azariah; Song of the Three Jews; Susannah; Bel
	 * and the Dragon). These are not generally included in the Protestant canon
	 */
	Apocrypha_Catholic_canon("AP", "Apocrypha (Catholic canon)"), //

	/**
	 * A collection of Apocryphal texts, canon not specified
	 */
	Apocrypha_canon_unspecified("AQ", "Apocrypha (canon unspecified)"), //

	/**
	 * I Esdras; Prayer of Manasseh; Psalm 151; III Maccabees
	 */
	Additional_Apocryphal_texts_Greek_Orthodox_canon("AX", "Additional Apocryphal texts: Greek Orthodox canon"), //

	/**
	 * I and II Esdras; Prayer of Manasseh; Psalm 151; III and IV Maccabees
	 */
	Additional_Apocryphal_texts_Slavonic_Orthodox_canon("AY", "Additional Apocryphal texts: Slavonic Orthodox canon"), //

	/**
	 * Additional Apocryphal texts included in some Bible versions: I and II Esdras; Prayer of Manasseh
	 */
	Additional_Apocryphal_texts("AZ", "Additional Apocryphal texts"), //

	/**
	 * The 66 books included in the Protestant, Catholic and Orthodox canons, together with the seven portions of the
	 * Apocrypha included in the Catholic canon
	 */
	General_canon_with_Apocrypha_Catholic_canon("GA", "General canon with Apocrypha (Catholic canon)"), //

	/**
	 * The 66 books included in the Protestant, Catholic and Orthodox canons, together with Apocryphal texts, canon not
	 * specified
	 */
	General_canon_with_Apocryphal_texts_canon_unspecified("GC",
			"General canon with Apocryphal texts (canon unspecified)"), //

	/**
	 * The 66 books included in the Protestant, Catholic and Orthodox canons, 39 from the Old Testament and 27 from the
	 * New Testament. The sequence of books may differ in different canons
	 */
	General_canon("GE", "General canon"), //

	/**
	 * The books of Matthew, Mark, Luke and John
	 */
	Gospels("GS", "Gospels"), //

	/**
	 * Those 39 books which were included in the Jewish canon by the rabbinical academy established at Jamma in 90 CE.
	 * Also known as the Jewish or Hebrew scriptures
	 */
	Old_Testament("OT", "Old Testament"), //

	/**
	 * The 27 books included in the Christian canon through the Easter Letter of Athanasius, Bishop of Alexandria and
	 * also by a general council of the Christian church held near the end of the 4th century CE
	 */
	New_Testament("NT", "New Testament"), //

	/**
	 * Includes the 27 books of the New Testament plus Psalms and Proverbs from the Old Testament
	 */
	New_Testament_with_Psalms_and_Proverbs("NP", "New Testament with Psalms and Proverbs"), //

	/**
	 * The books containing the letters of Paul to the various early Christian churches
	 */
	Paul_s_Epistles("PE", "Paul’s Epistles"), //

	/**
	 * The book of Psalms and the book of Proverbs combined
	 */
	Psalms_and_Proverbs("PP", "Psalms and Proverbs"), //

	/**
	 * The book of Psalms
	 */
	Psalms("PS", "Psalms"), //

	/**
	 * The first five books of the Bible: Genesis, Exodus, Numbers, Leviticus, Deuteronomy. Also applied to the Torah
	 */
	Pentateuch("PT", "Pentateuch"), //

	/**
	 * Selected books of either the OT or NT not otherwise noted
	 */
	Other_portions("ZZ", "Other portions");

	public final String value;
	public final String label;

	private BibleContentss(String value, String label)
	{
		this.value = value;
		this.label = label;
	}

	private static Map<String, BibleContentss> map;

	private static Map<String, BibleContentss> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (BibleContentss e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static BibleContentss byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}
