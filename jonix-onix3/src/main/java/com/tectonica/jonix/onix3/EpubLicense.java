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
import com.tectonica.jonix.codelist.LicenseExpressionTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.struct.JonixEpubLicenseExpression;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Digital product license</h1>
 * <p>
 * An optional and non-repeatable composite carrying the name or title of the license governing use of the product, and
 * a link to the license terms in eye-readable or machine-readable form.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;EpubLicense&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;epublicense&gt;</td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;1</td>
 * </tr>
 * </table>
 */
public class EpubLicense implements OnixSuperComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "EpubLicense";
	public static final String shortname = "epublicense";

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
	 * (this list is required to contain at least one item)
	 */
	public List<EpubLicenseName> epubLicenseNames;

	/**
	 * (this list may be empty)
	 */
	public List<EpubLicenseExpression> epubLicenseExpressions;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public EpubLicense()
	{}

	public EpubLicense(org.w3c.dom.Element element)
	{
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, new JPU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(EpubLicenseName.refname) || name.equals(EpubLicenseName.shortname))
					epubLicenseNames = JPU.addToList(epubLicenseNames, new EpubLicenseName(element));
				else if (name.equals(EpubLicenseExpression.refname) || name.equals(EpubLicenseExpression.shortname))
					epubLicenseExpressions = JPU.addToList(epubLicenseExpressions, new EpubLicenseExpression(element));
			}
		});
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 100 characters
	 */
	public List<String> getEpubLicenseNameValues()
	{
		if (epubLicenseNames != null)
		{
			List<String> list = new ArrayList<>();
			for (EpubLicenseName i : epubLicenseNames)
				list.add(i.value);
			return list;
		}
		return null;
	}

	public JonixEpubLicenseExpression findEpubLicenseExpression(LicenseExpressionTypes epubLicenseExpressionType)
	{
		if (epubLicenseExpressions != null)
		{
			for (EpubLicenseExpression x : epubLicenseExpressions)
			{
				if (x.getEpubLicenseExpressionTypeValue() == epubLicenseExpressionType)
					return x.asJonixEpubLicenseExpression();
			}
		}
		return null;
	}

	public List<JonixEpubLicenseExpression> findEpubLicenseExpressions(
			java.util.Set<LicenseExpressionTypes> epubLicenseExpressionTypes)
	{
		if (epubLicenseExpressions != null)
		{
			List<JonixEpubLicenseExpression> matches = new ArrayList<>();
			for (EpubLicenseExpression x : epubLicenseExpressions)
			{
				if (epubLicenseExpressionTypes == null
						|| epubLicenseExpressionTypes.contains(x.getEpubLicenseExpressionTypeValue()))
					matches.add(x.asJonixEpubLicenseExpression());
			}
			return matches;
		}
		return null;
	}
}
