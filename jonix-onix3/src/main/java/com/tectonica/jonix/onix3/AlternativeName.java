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

package com.tectonica.jonix.onix3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixComposite.OnixSuperComposite;
import com.tectonica.jonix.codelist.NameCodeTypes;
import com.tectonica.jonix.codelist.PersonOrganizationNameTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.struct.JonixNameIdentifier;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Alternative name composite</h1>
 * <p>
 * A repeatable group of data elements which together represent an alternative name of a contributor, and specify its
 * type. The &lt;AlternativeName&gt; composite is optional. It may be used to send a pseudonym as well as a real name,
 * where both names are on the product, <i>eg</i> to handle such cases as ‘Ian Rankin writing as Jack Harvey’; or to
 * send an authority-controlled form of a name; or to identify the real name of the contributor where the book is
 * written under a pseudonym (and the real identity need not be kept private). Note that in all cases, the primary name
 * is that used on the product, and the alternative name merely provides additional information.
 * </p>
 * <p>
 * Each instance of the composite must contain the &lt;NameType&gt; element with <em>either</em>:
 * </p>
 * <ul>
 * <li>one or more of the forms of representation of a person name, with or without an occurrence of the
 * &lt;NameIdentifier&gt; composite; <em>or</em></li>
 * <li>one or both of the forms of representation of a corporate name, with or without an occurrence of the
 * &lt;NameIdentifier&gt; composite; <em>or</em></li>
 * <li>an occurrence of the &lt;NameIdentifier&gt; composite without any accompanying name element(s).</li>
 * </ul>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;AlternativeName&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;alternativename&gt;</td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;n</td>
 * </tr>
 * </table>
 */
public class AlternativeName implements OnixSuperComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "AlternativeName";
	public static final String shortname = "alternativename";

	// ///////////////////////////////////////////////////////////////////////////////
	// ATTRIBUTES
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * (type: dt.DateOrDateTime)
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
	public NameType nameType;

	/**
	 * (this list is required to contain at least one item)
	 */
	public List<NameIdentifier> nameIdentifiers;

	/**
	 * (this field is required)
	 */
	public PersonName personName;

	/**
	 * (this field is optional)
	 */
	public PersonNameInverted personNameInverted;

	/**
	 * (this field is optional)
	 */
	public TitlesBeforeNames titlesBeforeNames;

	/**
	 * (this field is optional)
	 */
	public NamesBeforeKey namesBeforeKey;

	/**
	 * (this field is optional)
	 */
	public PrefixToKey prefixToKey;

	/**
	 * (this field is required)
	 */
	public KeyNames keyNames;

	/**
	 * (this field is optional)
	 */
	public NamesAfterKey namesAfterKey;

	/**
	 * (this field is optional)
	 */
	public SuffixToKey suffixToKey;

	/**
	 * (this field is optional)
	 */
	public LettersAfterNames lettersAfterNames;

	/**
	 * (this field is optional)
	 */
	public TitlesAfterNames titlesAfterNames;

	/**
	 * (this field is required)
	 */
	public CorporateName corporateName;

	/**
	 * (this field is optional)
	 */
	public CorporateNameInverted corporateNameInverted;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public AlternativeName()
	{}

	public AlternativeName(org.w3c.dom.Element element)
	{
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byValue(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, new JPU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(NameType.refname) || name.equals(NameType.shortname))
					nameType = new NameType(element);
				else if (name.equals(NameIdentifier.refname) || name.equals(NameIdentifier.shortname))
					nameIdentifiers = JPU.addToList(nameIdentifiers, new NameIdentifier(element));
				else if (name.equals(PersonName.refname) || name.equals(PersonName.shortname))
					personName = new PersonName(element);
				else if (name.equals(PersonNameInverted.refname) || name.equals(PersonNameInverted.shortname))
					personNameInverted = new PersonNameInverted(element);
				else if (name.equals(TitlesBeforeNames.refname) || name.equals(TitlesBeforeNames.shortname))
					titlesBeforeNames = new TitlesBeforeNames(element);
				else if (name.equals(NamesBeforeKey.refname) || name.equals(NamesBeforeKey.shortname))
					namesBeforeKey = new NamesBeforeKey(element);
				else if (name.equals(PrefixToKey.refname) || name.equals(PrefixToKey.shortname))
					prefixToKey = new PrefixToKey(element);
				else if (name.equals(KeyNames.refname) || name.equals(KeyNames.shortname))
					keyNames = new KeyNames(element);
				else if (name.equals(NamesAfterKey.refname) || name.equals(NamesAfterKey.shortname))
					namesAfterKey = new NamesAfterKey(element);
				else if (name.equals(SuffixToKey.refname) || name.equals(SuffixToKey.shortname))
					suffixToKey = new SuffixToKey(element);
				else if (name.equals(LettersAfterNames.refname) || name.equals(LettersAfterNames.shortname))
					lettersAfterNames = new LettersAfterNames(element);
				else if (name.equals(TitlesAfterNames.refname) || name.equals(TitlesAfterNames.shortname))
					titlesAfterNames = new TitlesAfterNames(element);
				else if (name.equals(CorporateName.refname) || name.equals(CorporateName.shortname))
					corporateName = new CorporateName(element);
				else if (name.equals(CorporateNameInverted.refname) || name.equals(CorporateNameInverted.shortname))
					corporateNameInverted = new CorporateNameInverted(element);
			}
		});
	}

	public PersonOrganizationNameTypes getNameTypeValue()
	{
		return (nameType == null) ? null : nameType.value;
	}

	/**
	 * Format: Variable-length text, suggested maximum length 100 characters
	 */
	public String getPersonNameValue()
	{
		return (personName == null) ? null : personName.value;
	}

	/**
	 * Format: Variable-length text, suggested maximum length 100 characters
	 */
	public String getPersonNameInvertedValue()
	{
		return (personNameInverted == null) ? null : personNameInverted.value;
	}

	/**
	 * Format: Variable-length text, suggested maximum length 100 characters
	 */
	public String getTitlesBeforeNamesValue()
	{
		return (titlesBeforeNames == null) ? null : titlesBeforeNames.value;
	}

	/**
	 * Format: Variable-length text, suggested maximum length 100 characters
	 */
	public String getNamesBeforeKeyValue()
	{
		return (namesBeforeKey == null) ? null : namesBeforeKey.value;
	}

	/**
	 * Format: Variable-length text, suggested maximum length 100 characters
	 */
	public String getPrefixToKeyValue()
	{
		return (prefixToKey == null) ? null : prefixToKey.value;
	}

	/**
	 * Format: Variable-length text, suggested maximum length 100 characters
	 */
	public String getKeyNamesValue()
	{
		return (keyNames == null) ? null : keyNames.value;
	}

	/**
	 * Format: Variable-length text, suggested maximum length 100 characters
	 */
	public String getNamesAfterKeyValue()
	{
		return (namesAfterKey == null) ? null : namesAfterKey.value;
	}

	/**
	 * Format: Variable-length text, suggested maximum length 100 characters
	 */
	public String getSuffixToKeyValue()
	{
		return (suffixToKey == null) ? null : suffixToKey.value;
	}

	/**
	 * Format: Variable-length text, suggested maximum length 100 characters
	 */
	public String getLettersAfterNamesValue()
	{
		return (lettersAfterNames == null) ? null : lettersAfterNames.value;
	}

	/**
	 * Format: Variable-length text, suggested maximum length 100 characters
	 */
	public String getTitlesAfterNamesValue()
	{
		return (titlesAfterNames == null) ? null : titlesAfterNames.value;
	}

	/**
	 * Format: Variable-length text, suggested maximum length 200 characters
	 */
	public String getCorporateNameValue()
	{
		return (corporateName == null) ? null : corporateName.value;
	}

	/**
	 * Format: Variable-length text, suggested maximum length 200 characters
	 */
	public String getCorporateNameInvertedValue()
	{
		return (corporateNameInverted == null) ? null : corporateNameInverted.value;
	}

	public JonixNameIdentifier findNameIdentifier(NameCodeTypes nameIDType)
	{
		if (nameIdentifiers != null)
		{
			for (NameIdentifier x : nameIdentifiers)
			{
				if (x.getNameIDTypeValue() == nameIDType)
					return x.asJonixNameIdentifier();
			}
		}
		return null;
	}

	public List<JonixNameIdentifier> findNameIdentifiers(java.util.Set<NameCodeTypes> nameIDTypes)
	{
		if (nameIdentifiers != null)
		{
			List<JonixNameIdentifier> matches = new ArrayList<>();
			for (NameIdentifier x : nameIdentifiers)
			{
				if (nameIDTypes == null || nameIDTypes.contains(x.getNameIDTypeValue()))
					matches.add(x.asJonixNameIdentifier());
			}
			return matches;
		}
		return null;
	}
}
