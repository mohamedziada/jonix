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

package com.tectonica.jonix.onix2;

import java.io.Serializable;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Product form feature value</h1>
 * <p>
 * A controlled value that describes a product form feature. Presence or absence of this element depends on the
 * &lt;ProductFormFeatureType&gt;, since some product form features (<em>eg</em> thumb index) do not require an
 * accompanying value, while others (<em>eg</em> text font) require free text in &lt;ProductFormFeatureDescription&gt;.
 * Non-repeating.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Dependent on the scheme specified in &lt;ProductFormFeatureType&gt;</td>
 * </tr>
 * <tr>
 * <td>Codelist</td>
 * <td>Dependent on the scheme specified in &lt;ProductFormFeatureType&gt;</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;ProductFormFeatureValue&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;b335&gt;</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td>&lt;ProductFormFeatureValue&gt;BLK&lt;/ProductFormFeatureValue&gt;&#160;&#160;&#160;&#160;Black (binding color)</td>
 * </tr>
 * </table>
 */
public class ProductFormFeatureValue implements OnixElement, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "ProductFormFeatureValue";
	public static final String shortname = "b335";

	// ///////////////////////////////////////////////////////////////////////////////
	// ATTRIBUTES
	// ///////////////////////////////////////////////////////////////////////////////

	public TextFormats textformat;

	public TextCaseFlags textcase;

	public LanguageCodes language;

	public TransliterationSchemes transliteration;

	/**
	 * (type: DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	// ///////////////////////////////////////////////////////////////////////////////
	// VALUE MEMBER
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * Raw Format: Dependent on the scheme specified in &lt;ProductFormFeatureType&gt;
	 * <p>
	 * (type: NonEmptyString)
	 */
	public String value;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public ProductFormFeatureValue()
	{}

	public ProductFormFeatureValue(org.w3c.dom.Element element)
	{
		textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
		textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
		language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
		transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		value = JPU.getContentAsString(element);
	}
}
