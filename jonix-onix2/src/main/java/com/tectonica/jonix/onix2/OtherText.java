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
import com.tectonica.jonix.OnixComposite.OnixDataComposite;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.OtherTextTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TextLinkTypes;
import com.tectonica.jonix.codelist.TransliterationSchemes;
import com.tectonica.jonix.struct.JonixOtherText;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Other text composite</h1>
 * <p>
 * A repeatable group of data elements which together identify, and either include or provide pointers to, text related
 * to a content item. <strong>Please see Group&nbsp;PR.15 for details.</strong>
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;OtherText&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;othertext&gt;</td>
 * </tr>
 * </table>
 */
public class OtherText implements OnixDataComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "OtherText";
	public static final String shortname = "othertext";

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
	// MEMBERS
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * (this field is required)
	 */
	public TextTypeCode textTypeCode;

	/**
	 * (this field is optional)
	 */
	public TextFormat textFormat;

	/**
	 * (this field is optional)
	 */
	public Text text;

	/**
	 * (this field is required)
	 */
	public TextLinkType textLinkType;

	/**
	 * (this field is required)
	 */
	public TextLink textLink;

	/**
	 * (this field is optional)
	 */
	public TextAuthor textAuthor;

	/**
	 * (this field is optional)
	 */
	public TextSourceCorporate textSourceCorporate;

	/**
	 * (this field is optional)
	 */
	public TextSourceTitle textSourceTitle;

	/**
	 * (this field is optional)
	 */
	public TextPublicationDate textPublicationDate;

	/**
	 * (this field is optional)
	 */
	public StartDate startDate;

	/**
	 * (this field is optional)
	 */
	public EndDate endDate;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public OtherText()
	{}

	public OtherText(org.w3c.dom.Element element)
	{
		textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
		textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
		language = LanguageCodes.byCode(JPU.getAttribute(element, "language"));
		transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, new JPU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(TextTypeCode.refname) || name.equals(TextTypeCode.shortname))
					textTypeCode = new TextTypeCode(element);
				else if (name.equals(TextFormat.refname) || name.equals(TextFormat.shortname))
					textFormat = new TextFormat(element);
				else if (name.equals(Text.refname) || name.equals(Text.shortname))
					text = new Text(element);
				else if (name.equals(TextLinkType.refname) || name.equals(TextLinkType.shortname))
					textLinkType = new TextLinkType(element);
				else if (name.equals(TextLink.refname) || name.equals(TextLink.shortname))
					textLink = new TextLink(element);
				else if (name.equals(TextAuthor.refname) || name.equals(TextAuthor.shortname))
					textAuthor = new TextAuthor(element);
				else if (name.equals(TextSourceCorporate.refname) || name.equals(TextSourceCorporate.shortname))
					textSourceCorporate = new TextSourceCorporate(element);
				else if (name.equals(TextSourceTitle.refname) || name.equals(TextSourceTitle.shortname))
					textSourceTitle = new TextSourceTitle(element);
				else if (name.equals(TextPublicationDate.refname) || name.equals(TextPublicationDate.shortname))
					textPublicationDate = new TextPublicationDate(element);
				else if (name.equals(StartDate.refname) || name.equals(StartDate.shortname))
					startDate = new StartDate(element);
				else if (name.equals(EndDate.refname) || name.equals(EndDate.shortname))
					endDate = new EndDate(element);
			}
		});
	}

	public OtherTextTypes getTextTypeCodeValue()
	{
		return (textTypeCode == null) ? null : textTypeCode.value;
	}

	public TextFormats getTextFormatValue()
	{
		return (textFormat == null) ? null : textFormat.value;
	}

	/**
	 * Raw Format: Variable length text (XHTML is enabled in this element - see ONIX for Books - Product Information
	 * Message - XML Message Specification, Section 7)
	 */
	public String getTextValue()
	{
		return (text == null) ? null : text.value;
	}

	public TextLinkTypes getTextLinkTypeValue()
	{
		return (textLinkType == null) ? null : textLinkType.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 300 characters
	 */
	public String getTextLinkValue()
	{
		return (textLink == null) ? null : textLink.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 300 characters
	 */
	public String getTextAuthorValue()
	{
		return (textAuthor == null) ? null : textAuthor.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 200 characters
	 */
	public String getTextSourceCorporateValue()
	{
		return (textSourceCorporate == null) ? null : textSourceCorporate.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 100 characters
	 */
	public String getTextSourceTitleValue()
	{
		return (textSourceTitle == null) ? null : textSourceTitle.value;
	}

	/**
	 * Raw Format: Date as four, six or eight digits (YYYY, YYYYMM, YYYYMMDD)
	 */
	public String getTextPublicationDateValue()
	{
		return (textPublicationDate == null) ? null : textPublicationDate.value;
	}

	/**
	 * Raw Format: Fixed-length, 8 numeric digits, YYYYMMDD
	 */
	public String getStartDateValue()
	{
		return (startDate == null) ? null : startDate.value;
	}

	/**
	 * Raw Format: Fixed-length, 8 numeric digits, YYYYMMDD
	 */
	public String getEndDateValue()
	{
		return (endDate == null) ? null : endDate.value;
	}

	public JonixOtherText asJonixOtherText()
	{
		JonixOtherText x = new JonixOtherText();
		x.textTypeCode = getTextTypeCodeValue();
		x.textFormat = getTextFormatValue();
		x.text = getTextValue();
		x.textLinkType = getTextLinkTypeValue();
		x.textLink = getTextLinkValue();
		x.textAuthor = getTextAuthorValue();
		x.textSourceCorporate = getTextSourceCorporateValue();
		x.textSourceTitle = getTextSourceTitleValue();
		x.textPublicationDate = getTextPublicationDateValue();
		x.startDate = getStartDateValue();
		x.endDate = getEndDateValue();
		return x;
	}
}
