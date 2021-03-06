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
import com.tectonica.jonix.OnixComposite.OnixDataComposite;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.WebsiteRoles;
import com.tectonica.jonix.struct.JonixWebsite;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Website composite</h1>
 * <p>
 * An optional and repeatable group of data elements which together identify and provide pointers to a website which is
 * related to the organization identified in an occurrence of the &lt;Supplier&gt; composite.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;Website&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;website&gt;</td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;n</td>
 * </tr>
 * </table>
 */
public class Website implements OnixDataComposite, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "Website";
	public static final String shortname = "website";

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
	 * (this field is optional)
	 */
	public WebsiteRole websiteRole;

	/**
	 * (this list may be empty)
	 */
	public List<WebsiteDescription> websiteDescriptions;

	/**
	 * (this field is required)
	 */
	public WebsiteLink websiteLink;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public Website()
	{}

	public Website(org.w3c.dom.Element element)
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
				if (name.equals(WebsiteRole.refname) || name.equals(WebsiteRole.shortname))
					websiteRole = new WebsiteRole(element);
				else if (name.equals(WebsiteDescription.refname) || name.equals(WebsiteDescription.shortname))
					websiteDescriptions = JPU.addToList(websiteDescriptions, new WebsiteDescription(element));
				else if (name.equals(WebsiteLink.refname) || name.equals(WebsiteLink.shortname))
					websiteLink = new WebsiteLink(element);
			}
		});
	}

	public WebsiteRoles getWebsiteRoleValue()
	{
		return (websiteRole == null) ? null : websiteRole.value;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 300 characters. XHTML is enabled in this element - see
	 * Using XHTML, HTML or XML with ONIX text fields
	 */
	public List<String> getWebsiteDescriptionValues()
	{
		if (websiteDescriptions != null)
		{
			List<String> list = new ArrayList<>();
			for (WebsiteDescription i : websiteDescriptions)
				list.add(i.value);
			return list;
		}
		return null;
	}

	/**
	 * Raw Format: Variable-length text, suggested maximum length 300 characters
	 */
	public String getWebsiteLinkValue()
	{
		return (websiteLink == null) ? null : websiteLink.value;
	}

	public JonixWebsite asJonixWebsite()
	{
		JonixWebsite x = new JonixWebsite();
		x.websiteDescriptions = getWebsiteDescriptionValues();
		x.websiteLink = getWebsiteLinkValue();
		x.websiteRole = getWebsiteRoleValue();
		return x;
	}
}
